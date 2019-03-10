package modelo.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entities.TipoEnvio;
import modelo.entities.Venta;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-03-10T16:58:34")
@StaticMetamodel(Envio.class)
public class Envio_ { 

    public static volatile SingularAttribute<Envio, Date> fechaAsignacion;
    public static volatile SingularAttribute<Envio, Venta> ventaIdVenta;
    public static volatile SingularAttribute<Envio, Double> costoAproxEnvio;
    public static volatile SingularAttribute<Envio, Date> fechaEntrega;
    public static volatile SingularAttribute<Envio, String> direccion;
    public static volatile SingularAttribute<Envio, Integer> idEnvio;
    public static volatile SingularAttribute<Envio, TipoEnvio> tipoEnvioIdTipo;
    public static volatile SingularAttribute<Envio, String> pais;

}