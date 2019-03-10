/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author DU
 */
@Entity
@Table(name = "venta_producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VentaProducto.findAll", query = "SELECT v FROM VentaProducto v")
    , @NamedQuery(name = "VentaProducto.findByVentaIdVenta", query = "SELECT v FROM VentaProducto v WHERE v.ventaProductoPK.ventaIdVenta = :ventaIdVenta")
    , @NamedQuery(name = "VentaProducto.findByProductoIdProducto", query = "SELECT v FROM VentaProducto v WHERE v.ventaProductoPK.productoIdProducto = :productoIdProducto")
    , @NamedQuery(name = "VentaProducto.findByCantidad", query = "SELECT v FROM VentaProducto v WHERE v.cantidad = :cantidad")})
public class VentaProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VentaProductoPK ventaProductoPK;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;

    public VentaProducto() {
    }

    public VentaProducto(VentaProductoPK ventaProductoPK) {
        this.ventaProductoPK = ventaProductoPK;
    }

    public VentaProducto(VentaProductoPK ventaProductoPK, int cantidad) {
        this.ventaProductoPK = ventaProductoPK;
        this.cantidad = cantidad;
    }

    public VentaProducto(int ventaIdVenta, int productoIdProducto) {
        this.ventaProductoPK = new VentaProductoPK(ventaIdVenta, productoIdProducto);
    }

    public VentaProductoPK getVentaProductoPK() {
        return ventaProductoPK;
    }

    public void setVentaProductoPK(VentaProductoPK ventaProductoPK) {
        this.ventaProductoPK = ventaProductoPK;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ventaProductoPK != null ? ventaProductoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VentaProducto)) {
            return false;
        }
        VentaProducto other = (VentaProducto) object;
        if ((this.ventaProductoPK == null && other.ventaProductoPK != null) || (this.ventaProductoPK != null && !this.ventaProductoPK.equals(other.ventaProductoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entities.VentaProducto[ ventaProductoPK=" + ventaProductoPK + " ]";
    }

}
