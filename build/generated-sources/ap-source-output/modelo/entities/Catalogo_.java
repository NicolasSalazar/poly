package modelo.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entities.Producto;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-03-10T16:58:34")
@StaticMetamodel(Catalogo.class)
public class Catalogo_ { 

    public static volatile SingularAttribute<Catalogo, Integer> idCatalogo;
    public static volatile SingularAttribute<Catalogo, String> descripcion;
    public static volatile ListAttribute<Catalogo, Producto> productoList;
    public static volatile SingularAttribute<Catalogo, String> nombre;

}