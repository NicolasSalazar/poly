/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * 
 * @author DU
 */
@Embeddable
public class VentaProductoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "venta_id_venta")
    private int ventaIdVenta;
    @Basic(optional = false)
    @Column(name = "producto_id_producto")
    private int productoIdProducto;

    public VentaProductoPK() {
    }

    public VentaProductoPK(int ventaIdVenta, int productoIdProducto) {
        this.ventaIdVenta = ventaIdVenta;
        this.productoIdProducto = productoIdProducto;
    }

    public int getVentaIdVenta() {
        return ventaIdVenta;
    }

    public void setVentaIdVenta(int ventaIdVenta) {
        this.ventaIdVenta = ventaIdVenta;
    }

    public int getProductoIdProducto() {
        return productoIdProducto;
    }

    public void setProductoIdProducto(int productoIdProducto) {
        this.productoIdProducto = productoIdProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) ventaIdVenta;
        hash += (int) productoIdProducto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VentaProductoPK)) {
            return false;
        }
        VentaProductoPK other = (VentaProductoPK) object;
        if (this.ventaIdVenta != other.ventaIdVenta) {
            return false;
        }
        if (this.productoIdProducto != other.productoIdProducto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entities.VentaProductoPK[ ventaIdVenta=" + ventaIdVenta + ", productoIdProducto=" + productoIdProducto + " ]";
    }

}
