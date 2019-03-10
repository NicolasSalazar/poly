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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author DU
 */
@Entity
@Table(name = "producto_orden_produccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductoOrdenProduccion.findAll", query = "SELECT p FROM ProductoOrdenProduccion p")
    , @NamedQuery(name = "ProductoOrdenProduccion.findByProductoIdProducto", query = "SELECT p FROM ProductoOrdenProduccion p WHERE p.productoOrdenProduccionPK.productoIdProducto = :productoIdProducto")
    , @NamedQuery(name = "ProductoOrdenProduccion.findByOrdenProduccionIdOrden", query = "SELECT p FROM ProductoOrdenProduccion p WHERE p.productoOrdenProduccionPK.ordenProduccionIdOrden = :ordenProduccionIdOrden")
    , @NamedQuery(name = "ProductoOrdenProduccion.findByCantidad", query = "SELECT p FROM ProductoOrdenProduccion p WHERE p.cantidad = :cantidad")})
public class ProductoOrdenProduccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductoOrdenProduccionPK productoOrdenProduccionPK;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @JoinColumn(name = "orden_produccion_id_orden", referencedColumnName = "id_orden", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private OrdenProduccion ordenProduccion;
    @JoinColumn(name = "producto_id_producto", referencedColumnName = "id_producto", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Producto producto;

    public ProductoOrdenProduccion() {
    }

    public ProductoOrdenProduccion(ProductoOrdenProduccionPK productoOrdenProduccionPK) {
        this.productoOrdenProduccionPK = productoOrdenProduccionPK;
    }

    public ProductoOrdenProduccion(ProductoOrdenProduccionPK productoOrdenProduccionPK, int cantidad) {
        this.productoOrdenProduccionPK = productoOrdenProduccionPK;
        this.cantidad = cantidad;
    }

    public ProductoOrdenProduccion(int productoIdProducto, int ordenProduccionIdOrden) {
        this.productoOrdenProduccionPK = new ProductoOrdenProduccionPK(productoIdProducto, ordenProduccionIdOrden);
    }

    public ProductoOrdenProduccionPK getProductoOrdenProduccionPK() {
        return productoOrdenProduccionPK;
    }

    public void setProductoOrdenProduccionPK(ProductoOrdenProduccionPK productoOrdenProduccionPK) {
        this.productoOrdenProduccionPK = productoOrdenProduccionPK;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public OrdenProduccion getOrdenProduccion() {
        return ordenProduccion;
    }

    public void setOrdenProduccion(OrdenProduccion ordenProduccion) {
        this.ordenProduccion = ordenProduccion;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productoOrdenProduccionPK != null ? productoOrdenProduccionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoOrdenProduccion)) {
            return false;
        }
        ProductoOrdenProduccion other = (ProductoOrdenProduccion) object;
        if ((this.productoOrdenProduccionPK == null && other.productoOrdenProduccionPK != null) || (this.productoOrdenProduccionPK != null && !this.productoOrdenProduccionPK.equals(other.productoOrdenProduccionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entities.ProductoOrdenProduccion[ productoOrdenProduccionPK=" + productoOrdenProduccionPK + " ]";
    }

}
