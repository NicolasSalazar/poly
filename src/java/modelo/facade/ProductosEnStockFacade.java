/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.entities.ProductosEnStock;

/**
 * 
 * @author DU
 */
@Stateless
public class ProductosEnStockFacade extends AbstractFacade<ProductosEnStock> implements ProductosEnStockFacadeLocal {

    @PersistenceContext(unitName = "InventarioPolyhedraPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductosEnStockFacade() {
        super(ProductosEnStock.class);
    }

}
