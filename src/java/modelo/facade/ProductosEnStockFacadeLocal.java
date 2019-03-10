/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.facade;

import java.util.List;
import javax.ejb.Local;
import modelo.entities.ProductosEnStock;

/**
 *
 * @author DU
 */
@Local
public interface ProductosEnStockFacadeLocal {

    void create(ProductosEnStock productosEnStock);

    void edit(ProductosEnStock productosEnStock);

    void remove(ProductosEnStock productosEnStock);

    ProductosEnStock find(Object id);

    List<ProductosEnStock> findAll();

    List<ProductosEnStock> findRange(int[] range);

    int count();
    
}
