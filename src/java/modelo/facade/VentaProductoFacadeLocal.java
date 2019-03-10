/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.facade;

import java.util.List;
import javax.ejb.Local;
import modelo.entities.VentaProducto;

/**
 *
 * @author DU
 */
@Local
public interface VentaProductoFacadeLocal {

    void create(VentaProducto ventaProducto);

    void edit(VentaProducto ventaProducto);

    void remove(VentaProducto ventaProducto);

    VentaProducto find(Object id);

    List<VentaProducto> findAll();

    List<VentaProducto> findRange(int[] range);

    int count();
    
}
