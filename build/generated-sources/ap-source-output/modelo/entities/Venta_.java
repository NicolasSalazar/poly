package modelo.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entities.Envio;
import modelo.entities.OrdenProduccion;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-03-10T16:58:34")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Integer> sedeIdSedeProduccion;
    public static volatile SingularAttribute<Venta, String> estado;
    public static volatile ListAttribute<Venta, OrdenProduccion> ordenProduccionList;
    public static volatile SingularAttribute<Venta, Integer> totalVenta;
    public static volatile SingularAttribute<Venta, Integer> costoTotal;
    public static volatile SingularAttribute<Venta, Boolean> deposito;
    public static volatile ListAttribute<Venta, Envio> envioList;
    public static volatile SingularAttribute<Venta, Integer> idVenta;
    public static volatile SingularAttribute<Venta, Date> fechaVenta;

}