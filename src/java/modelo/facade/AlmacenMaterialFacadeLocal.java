/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.facade;

import java.util.List;
import javax.ejb.Local;
import modelo.entities.AlmacenMaterial;

/**
 *
 * @author DU
 */
@Local
public interface AlmacenMaterialFacadeLocal {

    void create(AlmacenMaterial almacenMaterial);

    void edit(AlmacenMaterial almacenMaterial);

    void remove(AlmacenMaterial almacenMaterial);

    AlmacenMaterial find(Object id);

    List<AlmacenMaterial> findAll();

    List<AlmacenMaterial> findRange(int[] range);

    int count();
    
}
