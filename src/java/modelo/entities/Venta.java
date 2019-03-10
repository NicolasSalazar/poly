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
@Table(name = "venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Venta.findAll", query = "SELECT v FROM Venta v")
    , @NamedQuery(name = "Venta.findByIdVenta", query = "SELECT v FROM Venta v WHERE v.idVenta = :idVenta")
    , @NamedQuery(name = "Venta.findBySedeIdSedeProduccion", query = "SELECT v FROM Venta v WHERE v.sedeIdSedeProduccion = :sedeIdSedeProduccion")
    , @NamedQuery(name = "Venta.findByDeposito", query = "SELECT v FROM Venta v WHERE v.deposito = :deposito")
    , @NamedQuery(name = "Venta.findByFechaVenta", query = "SELECT v FROM Venta v WHERE v.fechaVenta = :fechaVenta")
    , @NamedQuery(name = "Venta.findByEstado", query = "SELECT v FROM Venta v WHERE v.estado = :estado")
    , @NamedQuery(name = "Venta.findByCostoTotal", query = "SELECT v FROM Venta v WHERE v.costoTotal = :costoTotal")
    , @NamedQuery(name = "Venta.findByTotalVenta", query = "SELECT v FROM Venta v WHERE v.totalVenta = :totalVenta")})
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_venta")
    private Integer idVenta;
    @Basic(optional = false)
    @Column(name = "sede_id_sede_produccion")
    private int sedeIdSedeProduccion;
    @Basic(optional = false)
    @Column(name = "deposito")
    private boolean deposito;
    @Basic(optional = false)
    @Column(name = "fecha_venta")
    @Temporal(TemporalType.DATE)
    private Date fechaVenta;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @Column(name = "costo_total")
    private Integer costoTotal;
    @Basic(optional = false)
    @Column(name = "total_venta")
    private int totalVenta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ventaIdVenta")
    private List<OrdenProduccion> ordenProduccionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ventaIdVenta")
    private List<Envio> envioList;

    public Venta() {
    }

    public Venta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Venta(Integer idVenta, int sedeIdSedeProduccion, boolean deposito, Date fechaVenta, String estado, int totalVenta) {
        this.idVenta = idVenta;
        this.sedeIdSedeProduccion = sedeIdSedeProduccion;
        this.deposito = deposito;
        this.fechaVenta = fechaVenta;
        this.estado = estado;
        this.totalVenta = totalVenta;
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public int getSedeIdSedeProduccion() {
        return sedeIdSedeProduccion;
    }

    public void setSedeIdSedeProduccion(int sedeIdSedeProduccion) {
        this.sedeIdSedeProduccion = sedeIdSedeProduccion;
    }

    public boolean getDeposito() {
        return deposito;
    }

    public void setDeposito(boolean deposito) {
        this.deposito = deposito;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Integer costoTotal) {
        this.costoTotal = costoTotal;
    }

    public int getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(int totalVenta) {
        this.totalVenta = totalVenta;
    }

    @XmlTransient
    public List<OrdenProduccion> getOrdenProduccionList() {
        return ordenProduccionList;
    }

    public void setOrdenProduccionList(List<OrdenProduccion> ordenProduccionList) {
        this.ordenProduccionList = ordenProduccionList;
    }

    @XmlTransient
    public List<Envio> getEnvioList() {
        return envioList;
    }

    public void setEnvioList(List<Envio> envioList) {
        this.envioList = envioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVenta != null ? idVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.idVenta == null && other.idVenta != null) || (this.idVenta != null && !this.idVenta.equals(other.idVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entities.Venta[ idVenta=" + idVenta + " ]";
    }

}
