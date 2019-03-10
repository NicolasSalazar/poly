package modelo.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entities.Material;
import modelo.entities.Producto;
import modelo.entities.ProductoMaterialPK;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-03-10T16:58:34")
@StaticMetamodel(ProductoMaterial.class)
public class ProductoMaterial_ { 

    public static volatile SingularAttribute<ProductoMaterial, Material> material;
    public static volatile SingularAttribute<ProductoMaterial, Integer> cantidad;
    public static volatile SingularAttribute<ProductoMaterial, Producto> producto;
    public static volatile SingularAttribute<ProductoMaterial, ProductoMaterialPK> productoMaterialPK;

}