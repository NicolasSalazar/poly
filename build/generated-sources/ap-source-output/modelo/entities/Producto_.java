package modelo.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entities.Catalogo;
import modelo.entities.Disenio;
import modelo.entities.ProductoMaterial;
import modelo.entities.ProductoOrdenProduccion;
import modelo.entities.ProductosEnStock;
import modelo.entities.Stock;
import modelo.entities.TipoProducto;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-03-11T00:38:22")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, Double> costoProduccion;
    public static volatile SingularAttribute<Producto, String> tamaño;
    public static volatile SingularAttribute<Producto, Boolean> visible;
    public static volatile SingularAttribute<Producto, String> peso;
    public static volatile SingularAttribute<Producto, byte[]> imagen;
    public static volatile SingularAttribute<Producto, Stock> stockIdStock;
    public static volatile SingularAttribute<Producto, Double> tiempoProduccion;
    public static volatile SingularAttribute<Producto, String> nombre;
    public static volatile SingularAttribute<Producto, TipoProducto> tipoProductoIdTipoProducto;
    public static volatile ListAttribute<Producto, ProductoMaterial> productoMaterialList;
    public static volatile SingularAttribute<Producto, Integer> precioBase;
    public static volatile ListAttribute<Producto, ProductosEnStock> productosEnStockList;
    public static volatile SingularAttribute<Producto, Integer> idProducto;
    public static volatile SingularAttribute<Producto, Catalogo> catalogoIdCatalogo;
    public static volatile SingularAttribute<Producto, Disenio> disenioIdDisenio;
    public static volatile SingularAttribute<Producto, Integer> dificultad;
    public static volatile ListAttribute<Producto, ProductoOrdenProduccion> productoOrdenProduccionList;

}