package modelo.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entities.OrdenProduccion;
import modelo.entities.Producto;
import modelo.entities.ProductoOrdenProduccionPK;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-03-11T00:38:22")
@StaticMetamodel(ProductoOrdenProduccion.class)
public class ProductoOrdenProduccion_ { 

    public static volatile SingularAttribute<ProductoOrdenProduccion, OrdenProduccion> ordenProduccion;
    public static volatile SingularAttribute<ProductoOrdenProduccion, ProductoOrdenProduccionPK> productoOrdenProduccionPK;
    public static volatile SingularAttribute<ProductoOrdenProduccion, Integer> cantidad;
    public static volatile SingularAttribute<ProductoOrdenProduccion, Producto> producto;

}