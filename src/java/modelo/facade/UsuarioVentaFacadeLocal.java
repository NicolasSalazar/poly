/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.facade;

import java.util.List;
import javax.ejb.Local;
import modelo.entities.UsuarioVenta;

/**
 *
 * @author DU
 */
@Local
public interface UsuarioVentaFacadeLocal {

    void create(UsuarioVenta usuarioVenta);

    void edit(UsuarioVenta usuarioVenta);

    void remove(UsuarioVenta usuarioVenta);

    UsuarioVenta find(Object id);

    List<UsuarioVenta> findAll();

    List<UsuarioVenta> findRange(int[] range);

    int count();
    
}
