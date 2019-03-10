/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author DU
 */
@Entity
@Table(name = "envio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Envio.findAll", query = "SELECT e FROM Envio e")
    , @NamedQuery(name = "Envio.findByIdEnvio", query = "SELECT e FROM Envio e WHERE e.idEnvio = :idEnvio")
    , @NamedQuery(name = "Envio.findByFechaAsignacion", query = "SELECT e FROM Envio e WHERE e.fechaAsignacion = :fechaAsignacion")
    , @NamedQuery(name = "Envio.findByFechaEntrega", query = "SELECT e FROM Envio e WHERE e.fechaEntrega = :fechaEntrega")
    , @NamedQuery(name = "Envio.findByCostoAproxEnvio", query = "SELECT e FROM Envio e WHERE e.costoAproxEnvio = :costoAproxEnvio")
    , @NamedQuery(name = "Envio.findByPais", query = "SELECT e FROM Envio e WHERE e.pais = :pais")
    , @NamedQuery(name = "Envio.findByDireccion", query = "SELECT e FROM Envio e WHERE e.direccion = :direccion")})
public class Envio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_envio")
    private Integer idEnvio;
    @Basic(optional = false)
    @Column(name = "fecha_asignacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAsignacion;
    @Basic(optional = false)
    @Column(name = "fecha_entrega")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEntrega;
    @Basic(optional = false)
    @Column(name = "costo_aprox_envio")
    private double costoAproxEnvio;
    @Basic(optional = false)
    @Column(name = "pais")
    private String pais;
    @Basic(optional = false)
    @Column(name = "direccion")
    private String direccion;
    @JoinColumn(name = "tipo_envio_id_tipo", referencedColumnName = "id_tipo")
    @ManyToOne(optional = false)
    private TipoEnvio tipoEnvioIdTipo;
    @JoinColumn(name = "venta_id_venta", referencedColumnName = "id_venta")
    @ManyToOne(optional = false)
    private Venta ventaIdVenta;

    public Envio() {
    }

    public Envio(Integer idEnvio) {
        this.idEnvio = idEnvio;
    }

    public Envio(Integer idEnvio, Date fechaAsignacion, Date fechaEntrega, double costoAproxEnvio, String pais, String direccion) {
        this.idEnvio = idEnvio;
        this.fechaAsignacion = fechaAsignacion;
        this.fechaEntrega = fechaEntrega;
        this.costoAproxEnvio = costoAproxEnvio;
        this.pais = pais;
        this.direccion = direccion;
    }

    public Integer getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(Integer idEnvio) {
        this.idEnvio = idEnvio;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public double getCostoAproxEnvio() {
        return costoAproxEnvio;
    }

    public void setCostoAproxEnvio(double costoAproxEnvio) {
        this.costoAproxEnvio = costoAproxEnvio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public TipoEnvio getTipoEnvioIdTipo() {
        return tipoEnvioIdTipo;
    }

    public void setTipoEnvioIdTipo(TipoEnvio tipoEnvioIdTipo) {
        this.tipoEnvioIdTipo = tipoEnvioIdTipo;
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
        hash += (idEnvio != null ? idEnvio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Envio)) {
            return false;
        }
        Envio other = (Envio) object;
        if ((this.idEnvio == null && other.idEnvio != null) || (this.idEnvio != null && !this.idEnvio.equals(other.idEnvio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entities.Envio[ idEnvio=" + idEnvio + " ]";
    }

}
