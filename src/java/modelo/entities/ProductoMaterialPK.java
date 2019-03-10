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
public class ProductoMaterialPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "producto_id_producto")
    private int productoIdProducto;
    @Basic(optional = false)
    @Column(name = "material_id_material")
    private int materialIdMaterial;

    public ProductoMaterialPK() {
    }

    public ProductoMaterialPK(int productoIdProducto, int materialIdMaterial) {
        this.productoIdProducto = productoIdProducto;
        this.materialIdMaterial = materialIdMaterial;
    }

    public int getProductoIdProducto() {
        return productoIdProducto;
    }

    public void setProductoIdProducto(int productoIdProducto) {
        this.productoIdProducto = productoIdProducto;
    }

    public int getMaterialIdMaterial() {
        return materialIdMaterial;
    }

    public void setMaterialIdMaterial(int materialIdMaterial) {
        this.materialIdMaterial = materialIdMaterial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) productoIdProducto;
        hash += (int) materialIdMaterial;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoMaterialPK)) {
            return false;
        }
        ProductoMaterialPK other = (ProductoMaterialPK) object;
        if (this.productoIdProducto != other.productoIdProducto) {
            return false;
        }
        if (this.materialIdMaterial != other.materialIdMaterial) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entities.ProductoMaterialPK[ productoIdProducto=" + productoIdProducto + ", materialIdMaterial=" + materialIdMaterial + " ]";
    }

}
