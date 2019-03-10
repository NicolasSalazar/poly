/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.facade;

import java.util.List;
import javax.ejb.Local;
import modelo.entities.TipoProducto;

/**
 *
 * @author DU
 */
@Local
public interface TipoProductoFacadeLocal {

    void create(TipoProducto tipoProducto);

    void edit(TipoProducto tipoProducto);

    void remove(TipoProducto tipoProducto);

    TipoProducto find(Object id);

    List<TipoProducto> findAll();

    List<TipoProducto> findRange(int[] range);

    int count();
    
}
