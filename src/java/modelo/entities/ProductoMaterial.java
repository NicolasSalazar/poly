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
@Table(name = "producto_material")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductoMaterial.findAll", query = "SELECT p FROM ProductoMaterial p")
    , @NamedQuery(name = "ProductoMaterial.findByProductoIdProducto", query = "SELECT p FROM ProductoMaterial p WHERE p.productoMaterialPK.productoIdProducto = :productoIdProducto")
    , @NamedQuery(name = "ProductoMaterial.findByMaterialIdMaterial", query = "SELECT p FROM ProductoMaterial p WHERE p.productoMaterialPK.materialIdMaterial = :materialIdMaterial")
    , @NamedQuery(name = "ProductoMaterial.findByCantidad", query = "SELECT p FROM ProductoMaterial p WHERE p.cantidad = :cantidad")})
public class ProductoMaterial implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductoMaterialPK productoMaterialPK;
    @Column(name = "cantidad")
    private Integer cantidad;
    @JoinColumn(name = "material_id_material", referencedColumnName = "id_material", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Material material;
    @JoinColumn(name = "producto_id_producto", referencedColumnName = "id_producto", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Producto producto;

    public ProductoMaterial() {
    }

    public ProductoMaterial(ProductoMaterialPK productoMaterialPK) {
        this.productoMaterialPK = productoMaterialPK;
    }

    public ProductoMaterial(int productoIdProducto, int materialIdMaterial) {
        this.productoMaterialPK = new ProductoMaterialPK(productoIdProducto, materialIdMaterial);
    }

    public ProductoMaterialPK getProductoMaterialPK() {
        return productoMaterialPK;
    }

    public void setProductoMaterialPK(ProductoMaterialPK productoMaterialPK) {
        this.productoMaterialPK = productoMaterialPK;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
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
        hash += (productoMaterialPK != null ? productoMaterialPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoMaterial)) {
            return false;
        }
        ProductoMaterial other = (ProductoMaterial) object;
        if ((this.productoMaterialPK == null && other.productoMaterialPK != null) || (this.productoMaterialPK != null && !this.productoMaterialPK.equals(other.productoMaterialPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entities.ProductoMaterial[ productoMaterialPK=" + productoMaterialPK + " ]";
    }

}
