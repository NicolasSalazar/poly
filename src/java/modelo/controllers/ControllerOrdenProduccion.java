/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.controllers;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import modelo.entities.OrdenProduccion;
import modelo.facade.OrdenProduccionFacadeLocal;
import modelo.view.utils.Pager;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.BarChartSeries;
import org.primefaces.model.chart.ChartSeries;


/**
 *
 * @author DU
 */
@Named(value = "controllerOrdenProduccion")
@ViewScoped
public class ControllerOrdenProduccion implements Serializable {

    // implementacion del facade
    @EJB
    private OrdenProduccionFacadeLocal OPFL;

    //Implementacion de la entidad
    private OrdenProduccion ordenProduccion;
    
    //Implementacion de la clase Paginado
    private Pager paginador;

    //Implementacion de las listas
    private List<OrdenProduccion> listaOrden;
    private List<OrdenProduccion> listaPag;
    private List<Object[]> listaDeVentasPorFecha;
    private List<Object[]> listaGrafica;
    private BarChartModel barra;

    //Variables
    private String estado = "";

    //Constructor
    public ControllerOrdenProduccion() {
    }
    
    //Inicializador de variables PostContructor
    @PostConstruct
    public void init(){
        paginador = new Pager(OPFL, 6);
    }

    //Metodos
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<OrdenProduccion> getListaPag() {
        return paginador.getElementos();
    }

    public void setListaPag(List<OrdenProduccion> listaPag) {
        this.listaPag = listaPag;
    }

    public List<OrdenProduccion> getListaOrden() {
        if (listaOrden == null || listaOrden.isEmpty()) {
            listaOrden = OPFL.findAll();
        }
        return listaOrden;
    }

    public void setListaOrden(List<OrdenProduccion> listaOrden) {
        this.listaOrden = listaOrden;
    }

    public void ordenFiltrada() {
        listaOrden = OPFL.lista(estado);
    }

    public List<Object[]> getListaDeVentasPorFecha() {
        if (listaDeVentasPorFecha == null || listaDeVentasPorFecha.isEmpty()) {
            listaDeVentasPorFecha = OPFL.ventasPorFecha();
        }
        return listaDeVentasPorFecha;
    }

    public void setListaDeVentasPorFecha(List<Object[]> listaDeVentasPorFecha) {
        this.listaDeVentasPorFecha = listaDeVentasPorFecha;
    }
    
    public void listar(){
        listaGrafica = OPFL.ventasPorFecha();
    }
    
    public void graficar(){
        barra = new BarChartModel();
        
        for (int i = 0; i < OPFL.ventasPorFecha().size(); i++) {
            ChartSeries serie = new BarChartSeries();
            
            serie.setLabel(OPFL.ventasPorFecha().get(i)[0].toString());
            serie.set(i,(Long) OPFL.ventasPorFecha().get(i)[1]);
            barra.addSeries(serie);
        }
            barra.setTitle("Ventas por mes");
            barra.setAnimate(true);
    }

    public List<Object[]> getListaGrafica() {
        return listaGrafica;
    }

    public void setListaGrafica(List<Object[]> listaGrafica) {
        this.listaGrafica = listaGrafica;
    }

    public BarChartModel getBarra() {
        return barra;
    }

    public void setBarra(BarChartModel barra) {
        this.barra = barra;
    }

    public Pager getPaginador() {
        return paginador;
    }

    public void setPaginador(Pager paginador) {
        this.paginador = paginador;
    }

    
    
}
