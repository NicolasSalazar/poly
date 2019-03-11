package modelo.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entities.Material;
import modelo.entities.MaterialProveedorPK;
import modelo.entities.Proveedor;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-03-11T00:38:22")
@StaticMetamodel(MaterialProveedor.class)
public class MaterialProveedor_ { 

    public static volatile SingularAttribute<MaterialProveedor, MaterialProveedorPK> materialProveedorPK;
    public static volatile SingularAttribute<MaterialProveedor, Material> material;
    public static volatile SingularAttribute<MaterialProveedor, Integer> costoMaterial;
    public static volatile SingularAttribute<MaterialProveedor, Proveedor> proveedor;

}