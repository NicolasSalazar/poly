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
public class ProductoOrdenProduccionPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "producto_id_producto")
    private int productoIdProducto;
    @Basic(optional = false)
    @Column(name = "orden_produccion_id_orden")
    private int ordenProduccionIdOrden;

    public ProductoOrdenProduccionPK() {
    }

    public ProductoOrdenProduccionPK(int productoIdProducto, int ordenProduccionIdOrden) {
        this.productoIdProducto = productoIdProducto;
        this.ordenProduccionIdOrden = ordenProduccionIdOrden;
    }

    public int getProductoIdProducto() {
        return productoIdProducto;
    }

    public void setProductoIdProducto(int productoIdProducto) {
        this.productoIdProducto = productoIdProducto;
    }

    public int getOrdenProduccionIdOrden() {
        return ordenProduccionIdOrden;
    }

    public void setOrdenProduccionIdOrden(int ordenProduccionIdOrden) {
        this.ordenProduccionIdOrden = ordenProduccionIdOrden;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) productoIdProducto;
        hash += (int) ordenProduccionIdOrden;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoOrdenProduccionPK)) {
            return false;
        }
        ProductoOrdenProduccionPK other = (ProductoOrdenProduccionPK) object;
        if (this.productoIdProducto != other.productoIdProducto) {
            return false;
        }
        if (this.ordenProduccionIdOrden != other.ordenProduccionIdOrden) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entities.ProductoOrdenProduccionPK[ productoIdProducto=" + productoIdProducto + ", ordenProduccionIdOrden=" + ordenProduccionIdOrden + " ]";
    }

}
