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
@Table(name = "material_proveedor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MaterialProveedor.findAll", query = "SELECT m FROM MaterialProveedor m")
    , @NamedQuery(name = "MaterialProveedor.findByMaterialIdMaterial", query = "SELECT m FROM MaterialProveedor m WHERE m.materialProveedorPK.materialIdMaterial = :materialIdMaterial")
    , @NamedQuery(name = "MaterialProveedor.findByProveedorIdProveedor", query = "SELECT m FROM MaterialProveedor m WHERE m.materialProveedorPK.proveedorIdProveedor = :proveedorIdProveedor")
    , @NamedQuery(name = "MaterialProveedor.findByCostoMaterial", query = "SELECT m FROM MaterialProveedor m WHERE m.costoMaterial = :costoMaterial")})
public class MaterialProveedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MaterialProveedorPK materialProveedorPK;
    @Basic(optional = false)
    @Column(name = "costo_material")
    private int costoMaterial;
    @JoinColumn(name = "material_id_material", referencedColumnName = "id_material", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Material material;
    @JoinColumn(name = "proveedor_id_proveedor", referencedColumnName = "id_proveedor", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Proveedor proveedor;

    public MaterialProveedor() {
    }

    public MaterialProveedor(MaterialProveedorPK materialProveedorPK) {
        this.materialProveedorPK = materialProveedorPK;
    }

    public MaterialProveedor(MaterialProveedorPK materialProveedorPK, int costoMaterial) {
        this.materialProveedorPK = materialProveedorPK;
        this.costoMaterial = costoMaterial;
    }

    public MaterialProveedor(int materialIdMaterial, int proveedorIdProveedor) {
        this.materialProveedorPK = new MaterialProveedorPK(materialIdMaterial, proveedorIdProveedor);
    }

    public MaterialProveedorPK getMaterialProveedorPK() {
        return materialProveedorPK;
    }

    public void setMaterialProveedorPK(MaterialProveedorPK materialProveedorPK) {
        this.materialProveedorPK = materialProveedorPK;
    }

    public int getCostoMaterial() {
        return costoMaterial;
    }

    public void setCostoMaterial(int costoMaterial) {
        this.costoMaterial = costoMaterial;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (materialProveedorPK != null ? materialProveedorPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MaterialProveedor)) {
            return false;
        }
        MaterialProveedor other = (MaterialProveedor) object;
        if ((this.materialProveedorPK == null && other.materialProveedorPK != null) || (this.materialProveedorPK != null && !this.materialProveedorPK.equals(other.materialProveedorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entities.MaterialProveedor[ materialProveedorPK=" + materialProveedorPK + " ]";
    }

}
