/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.view.utils;

import java.util.List;
import modelo.facade.OrdenProduccionFacadeLocal;

/**
 * 
 * @author DU
 */
public class Pager {

    private OrdenProduccionFacadeLocal OPFL;
        private List elementos;
    private int canPorPagina;
    private int paginaActual;
    private int cantTotal;

    public Pager(OrdenProduccionFacadeLocal OPFL, int canPorPagina) {
        this.OPFL = OPFL;
        this.canPorPagina = canPorPagina;
        paginaActual = 0;
        cantTotal = OPFL.count();
    }

    public List getElementos() {
        if (elementos == null || elementos.isEmpty()) {
            elementos = OPFL.findRange1(getInicial(), canPorPagina);
        }
        return elementos;
    }

    public int getCanPorPagina() {
        return canPorPagina;
    }

    public void setCanPorPagina(int canPorPagina) {
        elementos = null;
        paginaActual = 0;
        this.canPorPagina = canPorPagina;
    }

    public int getPaginaActual() {
        return paginaActual;
    }

    public void setPaginaActual(int paginaActual) {
        this.paginaActual = paginaActual;
    }

    public void nextPage(){
        if (paginaActual < lastPage()) {
            elementos = null;
            paginaActual++;
        }
    }
    
    public void previousPage(){
        if (paginaActual > 0) {
            elementos = null;
            paginaActual--;
        }
    }
    public int getInicial(){
        return paginaActual*canPorPagina;
    }
    
    public int getFinal(){
        return getInicial() + (canPorPagina-1);
    }
    
    public int lastPage(){
        return  cantTotal/canPorPagina;
    }
   
   
}
