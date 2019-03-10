/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.facade;

import java.util.List;
import javax.ejb.Local;
import modelo.entities.ProductoOrdenProduccion;

/**
 *
 * @author DU
 */
@Local
public interface ProductoOrdenProduccionFacadeLocal {

    void create(ProductoOrdenProduccion productoOrdenProduccion);

    void edit(ProductoOrdenProduccion productoOrdenProduccion);

    void remove(ProductoOrdenProduccion productoOrdenProduccion);

    ProductoOrdenProduccion find(Object id);

    List<ProductoOrdenProduccion> findAll();

    List<ProductoOrdenProduccion> findRange(int[] range);

    int count();
    
}
