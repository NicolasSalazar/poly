/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.entities;

import java.io.Serializable;
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
@Table(name = "productos_en_stock")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductosEnStock.findAll", query = "SELECT p FROM ProductosEnStock p")
    , @NamedQuery(name = "ProductosEnStock.findByProductoIdProducto", query = "SELECT p FROM ProductosEnStock p WHERE p.productosEnStockPK.productoIdProducto = :productoIdProducto")
    , @NamedQuery(name = "ProductosEnStock.findByStockIdStock", query = "SELECT p FROM ProductosEnStock p WHERE p.productosEnStockPK.stockIdStock = :stockIdStock")
    , @NamedQuery(name = "ProductosEnStock.findByCantidad", query = "SELECT p FROM ProductosEnStock p WHERE p.cantidad = :cantidad")})
public class ProductosEnStock implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductosEnStockPK productosEnStockPK;
    @Column(name = "cantidad")
    private Integer cantidad;
    @JoinColumn(name = "producto_id_producto", referencedColumnName = "id_producto", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Producto producto;
    @JoinColumn(name = "stock_id_stock", referencedColumnName = "id_stock", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Stock stock;

    public ProductosEnStock() {
    }

    public ProductosEnStock(ProductosEnStockPK productosEnStockPK) {
        this.productosEnStockPK = productosEnStockPK;
    }

    public ProductosEnStock(int productoIdProducto, int stockIdStock) {
        this.productosEnStockPK = new ProductosEnStockPK(productoIdProducto, stockIdStock);
    }

    public ProductosEnStockPK getProductosEnStockPK() {
        return productosEnStockPK;
    }

    public void setProductosEnStockPK(ProductosEnStockPK productosEnStockPK) {
        this.productosEnStockPK = productosEnStockPK;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productosEnStockPK != null ? productosEnStockPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductosEnStock)) {
            return false;
        }
        ProductosEnStock other = (ProductosEnStock) object;
        if ((this.productosEnStockPK == null && other.productosEnStockPK != null) || (this.productosEnStockPK != null && !this.productosEnStockPK.equals(other.productosEnStockPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entities.ProductosEnStock[ productosEnStockPK=" + productosEnStockPK + " ]";
    }

}
