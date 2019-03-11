package modelo.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entities.OrdenProduccion;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-03-11T00:38:22")
@StaticMetamodel(Sede.class)
public class Sede_ { 

    public static volatile ListAttribute<Sede, OrdenProduccion> ordenProduccionList;
    public static volatile SingularAttribute<Sede, String> ciudad;
    public static volatile SingularAttribute<Sede, String> direccion;
    public static volatile SingularAttribute<Sede, Integer> idSede;
    public static volatile SingularAttribute<Sede, String> nombre;
    public static volatile SingularAttribute<Sede, Integer> almacenMaterialIdAlmacen;

}