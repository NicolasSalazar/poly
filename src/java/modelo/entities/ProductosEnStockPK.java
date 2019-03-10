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
public class ProductosEnStockPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "producto_id_producto")
    private int productoIdProducto;
    @Basic(optional = false)
    @Column(name = "stock_id_stock")
    private int stockIdStock;

    public ProductosEnStockPK() {
    }

    public ProductosEnStockPK(int productoIdProducto, int stockIdStock) {
        this.productoIdProducto = productoIdProducto;
        this.stockIdStock = stockIdStock;
    }

    public int getProductoIdProducto() {
        return productoIdProducto;
    }

    public void setProductoIdProducto(int productoIdProducto) {
        this.productoIdProducto = productoIdProducto;
    }

    public int getStockIdStock() {
        return stockIdStock;
    }

    public void setStockIdStock(int stockIdStock) {
        this.stockIdStock = stockIdStock;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) productoIdProducto;
        hash += (int) stockIdStock;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductosEnStockPK)) {
            return false;
        }
        ProductosEnStockPK other = (ProductosEnStockPK) object;
        if (this.productoIdProducto != other.productoIdProducto) {
            return false;
        }
        if (this.stockIdStock != other.stockIdStock) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entities.ProductosEnStockPK[ productoIdProducto=" + productoIdProducto + ", stockIdStock=" + stockIdStock + " ]";
    }

}
