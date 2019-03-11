package modelo.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entities.Producto;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-03-11T00:38:22")
@StaticMetamodel(Catalogo.class)
public class Catalogo_ { 

    public static volatile SingularAttribute<Catalogo, Integer> idCatalogo;
    public static volatile SingularAttribute<Catalogo, String> descripcion;
    public static volatile ListAttribute<Catalogo, Producto> productoList;
    public static volatile SingularAttribute<Catalogo, String> nombre;

}