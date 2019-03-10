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
import modelo.entities.Venta;
import modelo.facade.VentaFacadeLocal;

/**
 *
 * @author DU
 */
@Named(value = "controllerVentas")
@ViewScoped
public class ControllerVentas implements Serializable{

    //Implementaion del facade
    @EJB
    private VentaFacadeLocal ventaFacade;
    
    //Implemetacion de la entidad
    private Venta venta;
    
    //Implementacion de as listas
    private List<Venta> listaVentasEntregado;
        private List<Venta> listaVentasVendidas;

    
        //Controller
    public ControllerVentas() {
    }

    //Metodos
    
    
    public List<Venta> getListaVentasEntregado() {
        if (listaVentasEntregado == null || listaVentasEntregado.isEmpty()) {
            listaVentasEntregado = ventaFacade.listaPorEstadoEntregable();
        }
        return listaVentasEntregado;
    }

    public void setListaVentasEntregado(List<Venta> listaVentasEntregado) {
        this.listaVentasEntregado = listaVentasEntregado;
    }

    public List<Venta> getListaVentasVendidas() {
        if (listaVentasVendidas==null || listaVentasVendidas.isEmpty()) {
            listaVentasVendidas = ventaFacade.listaPorEstadoVendido();
        }
        return listaVentasVendidas;
    }

    public void setListaVentasVendidas(List<Venta> listaVentasVendidas) {
        this.listaVentasVendidas = listaVentasVendidas;
    }


    
    
    
    
    
}
