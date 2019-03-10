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
import modelo.entities.Venta;

/**
 * 
 * @author DU
 */
@Stateless
public class VentaFacade extends AbstractFacade<Venta> implements VentaFacadeLocal {

    @PersistenceContext(unitName = "InventarioPolyhedraPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VentaFacade() {
        super(Venta.class);
    }

    @Override
    public List<Venta> listaPorEstadoVendido() {
        List<Venta> venta;
        Query q = getEntityManager().createQuery("SELECT v FROM Venta v WHERE v.estado= 'Vendida'");
        venta = q.getResultList();
        return venta;
    }

    @Override
    public List<Venta> listaPorEstadoEntregable() {
        List<Venta> venta;
        Query q = getEntityManager().createQuery("SELECT v FROM Venta v WHERE v.estado= 'Entregado'");
        venta = q.getResultList();
        return venta;
    }




}
