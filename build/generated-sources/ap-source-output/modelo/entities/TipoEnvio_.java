package modelo.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entities.Envio;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-03-11T00:38:22")
@StaticMetamodel(TipoEnvio.class)
public class TipoEnvio_ { 

    public static volatile SingularAttribute<TipoEnvio, Integer> idTipo;
    public static volatile ListAttribute<TipoEnvio, Envio> envioList;
    public static volatile SingularAttribute<TipoEnvio, String> nombre;

}