/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.entities.VentaProducto;

/**
 * 
 * @author DU
 */
@Stateless
public class VentaProductoFacade extends AbstractFacade<VentaProducto> implements VentaProductoFacadeLocal {

    @PersistenceContext(unitName = "InventarioPolyhedraPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VentaProductoFacade() {
        super(VentaProducto.class);
    }

}
