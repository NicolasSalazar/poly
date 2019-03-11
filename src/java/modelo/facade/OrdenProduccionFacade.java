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

    @Override
    public List<OrdenProduccion> findRange1(int start, int cant) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(OrdenProduccion.class));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(cant);
        q.setFirstResult(start);
        return q.getResultList();
    }

    @Override
    public List<Object[]> ventasPorFecha() {
        List<Object[]> lista; 
        Query q = getEntityManager().createNativeQuery("Select MONTHNAME(orden_produccion.fecha_entrega_produccion) ,COUNT(orden_produccion.fecha_entrega_produccion) from orden_produccion WHERE  YEAR(orden_produccion.fecha_entrega_produccion) = YEAR(now()) AND orden_produccion.fecha_entrega_produccion <= now() GROUP BY(MONTH(orden_produccion.fecha_entrega_produccion));");
        lista = q.getResultList();
        return lista;
    }

}
