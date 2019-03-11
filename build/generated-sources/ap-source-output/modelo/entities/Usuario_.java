package modelo.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entities.OrdenProduccion;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-03-11T00:38:22")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile ListAttribute<Usuario, OrdenProduccion> ordenProduccionList;
    public static volatile SingularAttribute<Usuario, Integer> sedeIdSede;
    public static volatile SingularAttribute<Usuario, Integer> idUsuario;
    public static volatile SingularAttribute<Usuario, String> direccion;
    public static volatile SingularAttribute<Usuario, String> nombre;
    public static volatile SingularAttribute<Usuario, Integer> almacenMaterialIdAlmacen;
    public static volatile SingularAttribute<Usuario, String> pais;
    public static volatile SingularAttribute<Usuario, String> apellido;
    public static volatile SingularAttribute<Usuario, String> usuario;
    public static volatile SingularAttribute<Usuario, String> contrasenia;
    public static volatile SingularAttribute<Usuario, Integer> telefono;
    public static volatile SingularAttribute<Usuario, Integer> rolIdRol;
    public static volatile SingularAttribute<Usuario, String> email;
    public static volatile SingularAttribute<Usuario, Integer> activo;

}