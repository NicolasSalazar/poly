package modelo.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entities.MaterialProveedor;
import modelo.entities.ProductoMaterial;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-03-10T16:58:34")
@StaticMetamodel(Material.class)
public class Material_ { 

    public static volatile SingularAttribute<Material, String> descripcion;
    public static volatile SingularAttribute<Material, String> contenido;
    public static volatile SingularAttribute<Material, Double> costo;
    public static volatile ListAttribute<Material, MaterialProveedor> materialProveedorList;
    public static volatile SingularAttribute<Material, Integer> lotes;
    public static volatile SingularAttribute<Material, Integer> idMaterial;
    public static volatile SingularAttribute<Material, String> tipoMaterial;
    public static volatile ListAttribute<Material, ProductoMaterial> productoMaterialList;

}