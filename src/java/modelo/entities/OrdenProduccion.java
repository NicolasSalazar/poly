/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 
 * @author DU
 */
@Entity
@Table(name = "orden_produccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdenProduccion.findAll", query = "SELECT o FROM OrdenProduccion o")
    , @NamedQuery(name = "OrdenProduccion.findByIdOrden", query = "SELECT o FROM OrdenProduccion o WHERE o.idOrden = :idOrden")
    , @NamedQuery(name = "OrdenProduccion.findByFechaEntregaProduccion", query = "SELECT o FROM OrdenProduccion o WHERE o.fechaEntregaProduccion = :fechaEntregaProduccion")
    , @NamedQuery(name = "OrdenProduccion.findByNoEmpleados", query = "SELECT o FROM OrdenProduccion o WHERE o.noEmpleados = :noEmpleados")
    , @NamedQuery(name = "OrdenProduccion.findByEstado", query = "SELECT o FROM OrdenProduccion o WHERE o.estado = :estado")})
public class OrdenProduccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_orden")
    private Integer idOrden;
    @Basic(optional = false)
    @Column(name = "fecha_entrega_produccion")
    @Temporal(TemporalType.DATE)
    private Date fechaEntregaProduccion;
    @Column(name = "no_empleados")
    private Integer noEmpleados;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ordenProduccion")
    private List<ProductoOrdenProduccion> productoOrdenProduccionList;
    @JoinColumn(name = "sede_id_sede", referencedColumnName = "id_sede")
    @ManyToOne(optional = false)
    private Sede sedeIdSede;
    @JoinColumn(name = "usuario_id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Usuario usuarioIdUsuario;
    @JoinColumn(name = "venta_id_venta", referencedColumnName = "id_venta")
    @ManyToOne(optional = false)
    private Venta ventaIdVenta;

    public OrdenProduccion() {
    }

    public OrdenProduccion(Integer idOrden) {
        this.idOrden = idOrden;
    }

    public OrdenProduccion(Integer idOrden, Date fechaEntregaProduccion, String estado) {
        this.idOrden = idOrden;
        this.fechaEntregaProduccion = fechaEntregaProduccion;
        this.estado = estado;
    }

    public Integer getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Integer idOrden) {
        this.idOrden = idOrden;
    }

    public Date getFechaEntregaProduccion() {
        return fechaEntregaProduccion;
    }

    public void setFechaEntregaProduccion(Date fechaEntregaProduccion) {
        this.fechaEntregaProduccion = fechaEntregaProduccion;
    }

    public Integer getNoEmpleados() {
        return noEmpleados;
    }

    public void setNoEmpleados(Integer noEmpleados) {
        this.noEmpleados = noEmpleados;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<ProductoOrdenProduccion> getProductoOrdenProduccionList() {
        return productoOrdenProduccionList;
    }

    public void setProductoOrdenProduccionList(List<ProductoOrdenProduccion> productoOrdenProduccionList) {
        this.productoOrdenProduccionList = productoOrdenProduccionList;
    }

    public Sede getSedeIdSede() {
        return sedeIdSede;
    }

    public void setSedeIdSede(Sede sedeIdSede) {
        this.sedeIdSede = sedeIdSede;
    }

    public Usuario getUsuarioIdUsuario() {
        return usuarioIdUsuario;
    }

    public void setUsuarioIdUsuario(Usuario usuarioIdUsuario) {
        this.usuarioIdUsuario = usuarioIdUsuario;
    }

    public Venta getVentaIdVenta() {
        return ventaIdVenta;
    }

    public void setVentaIdVenta(Venta ventaIdVenta) {
        this.ventaIdVenta = ventaIdVenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrden != null ? idOrden.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenProduccion)) {
            return false;
        }
        OrdenProduccion other = (OrdenProduccion) object;
        if ((this.idOrden == null && other.idOrden != null) || (this.idOrden != null && !this.idOrden.equals(other.idOrden))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entities.OrdenProduccion[ idOrden=" + idOrden + " ]";
    }

}
