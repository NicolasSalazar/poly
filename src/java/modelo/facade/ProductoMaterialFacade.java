/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.entities.ProductoMaterial;

/**
 * 
 * @author DU
 */
@Stateless
public class ProductoMaterialFacade extends AbstractFacade<ProductoMaterial> implements ProductoMaterialFacadeLocal {

    @PersistenceContext(unitName = "InventarioPolyhedraPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductoMaterialFacade() {
        super(ProductoMaterial.class);
    }

}
