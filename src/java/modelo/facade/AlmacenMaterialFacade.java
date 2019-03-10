/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.entities.AlmacenMaterial;

/**
 * 
 * @author DU
 */
@Stateless
public class AlmacenMaterialFacade extends AbstractFacade<AlmacenMaterial> implements AlmacenMaterialFacadeLocal {

    @PersistenceContext(unitName = "InventarioPolyhedraPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AlmacenMaterialFacade() {
        super(AlmacenMaterial.class);
    }

}
