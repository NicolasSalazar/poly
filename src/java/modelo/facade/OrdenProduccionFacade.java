/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.facade;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import modelo.entities.OrdenProduccion;

/**
 * 
 * @author DU
 */
@Stateless
public class OrdenProduccionFacade extends AbstractFacade<OrdenProduccion> implements OrdenProduccionFacadeLocal {

    @PersistenceContext(unitName = "InventarioPolyhedraPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrdenProduccionFacade() {
        super(OrdenProduccion.class);
    }

    @Override
    public List<OrdenProduccion> lista(String estado) {
        List<OrdenProduccion> Orden;
        Query q = getEntityManager().createQuery("SELECT o FROM OrdenProduccion o WHERE o.ventaIdVenta.estado =:estado");
        //Query q = getEntityManager().createNativeQuery("SELECT sede.nombre ,venta.* FROM orden_produccion INNER JOIN venta ON orden_produccion.venta_id_venta = venta.id_venta INNER JOIN sede ON orden_produccion.sede_id_sede =sede.id_sede WHERE venta.estado = ?");
        q.setParameter("estado", estado);
        Orden = q.getResultList();
        return Orden;
    }

}
