package modelo.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entities.Producto;
import modelo.entities.ProductosEnStock;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-03-10T16:58:34")
@StaticMetamodel(Stock.class)
public class Stock_ { 

    public static volatile SingularAttribute<Stock, Integer> idStock;
    public static volatile SingularAttribute<Stock, Integer> sedeIdSede;
    public static volatile ListAttribute<Stock, Producto> productoList;
    public static volatile SingularAttribute<Stock, String> direccion;
    public static volatile ListAttribute<Stock, ProductosEnStock> productosEnStockList;

}