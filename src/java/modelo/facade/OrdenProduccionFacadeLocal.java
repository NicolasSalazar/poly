/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.facade;

import java.util.List;
import javax.ejb.Local;
import modelo.entities.OrdenProduccion;

/**
 *
 * @author DU
 */
@Local
public interface OrdenProduccionFacadeLocal {

    void create(OrdenProduccion ordenProduccion);

    void edit(OrdenProduccion ordenProduccion);

    void remove(OrdenProduccion ordenProduccion);

    OrdenProduccion find(Object id);

    List<OrdenProduccion> findAll();

    List<OrdenProduccion> findRange(int[] range);

    int count();
    
    List<OrdenProduccion> lista(String estado);
    
    List<OrdenProduccion> findRange1(int start, int cant);
    
    List<Object[]> ventasPorFecha();
}
