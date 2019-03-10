package modelo.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entities.ProductoOrdenProduccion;
import modelo.entities.Sede;
import modelo.entities.Usuario;
import modelo.entities.Venta;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-03-10T16:58:34")
@StaticMetamodel(OrdenProduccion.class)
public class OrdenProduccion_ { 

    public static volatile SingularAttribute<OrdenProduccion, Date> fechaEntregaProduccion;
    public static volatile SingularAttribute<OrdenProduccion, Usuario> usuarioIdUsuario;
    public static volatile SingularAttribute<OrdenProduccion, String> estado;
    public static volatile SingularAttribute<OrdenProduccion, Sede> sedeIdSede;
    public static volatile SingularAttribute<OrdenProduccion, Venta> ventaIdVenta;
    public static volatile SingularAttribute<OrdenProduccion, Integer> noEmpleados;
    public static volatile SingularAttribute<OrdenProduccion, Integer> idOrden;
    public static volatile ListAttribute<OrdenProduccion, ProductoOrdenProduccion> productoOrdenProduccionList;

}