/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.facade;

import java.util.List;
import javax.ejb.Local;
import modelo.entities.ProductoMaterial;

/**
 *
 * @author DU
 */
@Local
public interface ProductoMaterialFacadeLocal {

    void create(ProductoMaterial productoMaterial);

    void edit(ProductoMaterial productoMaterial);

    void remove(ProductoMaterial productoMaterial);

    ProductoMaterial find(Object id);

    List<ProductoMaterial> findAll();

    List<ProductoMaterial> findRange(int[] range);

    int count();
    
}
