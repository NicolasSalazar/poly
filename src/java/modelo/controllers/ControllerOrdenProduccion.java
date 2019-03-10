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
    private List<OrdenProduccion> listaOrdenProduccion;
    private List<OrdenProduccion> listaFiltrada;

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

    public List<OrdenProduccion> getListaOrdenProduccion() {
        if (listaOrdenProduccion == null || listaOrdenProduccion.isEmpty()) {
            listaOrdenProduccion = OPFL.findAll();
        }
        return listaOrdenProduccion;
    }

    public void setListaOrdenProduccion(List<OrdenProduccion> listaOrdenProduccion) {
        this.listaOrdenProduccion = listaOrdenProduccion;
    }

    
    public List<OrdenProduccion> getListaFiltrada() {
        System.out.println(estado);
            if (listaFiltrada == null || listaFiltrada.isEmpty()) {
                listaFiltrada = OPFL.lista(estado);
            }

        return listaFiltrada;
    }

    public void setListaFiltrada(List<OrdenProduccion> listaFiltrada) {
        this.listaFiltrada = listaFiltrada;
    }

}
