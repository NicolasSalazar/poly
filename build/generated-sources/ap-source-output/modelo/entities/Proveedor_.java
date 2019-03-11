package modelo.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entities.MaterialProveedor;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-03-11T00:38:22")
@StaticMetamodel(Proveedor.class)
public class Proveedor_ { 

    public static volatile SingularAttribute<Proveedor, Integer> idProveedor;
    public static volatile SingularAttribute<Proveedor, String> direccion;
    public static volatile ListAttribute<Proveedor, MaterialProveedor> materialProveedorList;
    public static volatile SingularAttribute<Proveedor, String> empresa;
    public static volatile SingularAttribute<Proveedor, Integer> telefono;

}