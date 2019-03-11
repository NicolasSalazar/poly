package modelo.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entities.Producto;
import modelo.entities.ProductosEnStockPK;
import modelo.entities.Stock;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-03-11T00:38:22")
@StaticMetamodel(ProductosEnStock.class)
public class ProductosEnStock_ { 

    public static volatile SingularAttribute<ProductosEnStock, ProductosEnStockPK> productosEnStockPK;
    public static volatile SingularAttribute<ProductosEnStock, Integer> cantidad;
    public static volatile SingularAttribute<ProductosEnStock, Producto> producto;
    public static volatile SingularAttribute<ProductosEnStock, Stock> stock;

}