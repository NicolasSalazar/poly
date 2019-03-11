/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.controllers;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import modelo.entities.OrdenProduccion;
import modelo.facade.OrdenProduccionFacadeLocal;

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

    //Implementacion de las listas
    private List<OrdenProduccion> listaOrden;
    private List<Object[]> listaDeVentasPorFecha;
    
    //Variables
    private String estado = "";

    //Constructor
    public ControllerOrdenProduccion() {
    }

    //Metodos
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public void ordenFiltrada(){
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


    
    
}
