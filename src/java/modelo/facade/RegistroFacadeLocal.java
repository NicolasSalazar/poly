/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.facade;

import java.util.List;
import javax.ejb.Local;
import modelo.entities.Registro;

/**
 *
 * @author DU
 */
@Local
public interface RegistroFacadeLocal {

    void create(Registro registro);

    void edit(Registro registro);

    void remove(Registro registro);

    Registro find(Object id);

    List<Registro> findAll();

    List<Registro> findRange(int[] range);

    int count();
    
}
