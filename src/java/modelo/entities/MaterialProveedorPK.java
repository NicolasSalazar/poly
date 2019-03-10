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
public class MaterialProveedorPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "material_id_material")
    private int materialIdMaterial;
    @Basic(optional = false)
    @Column(name = "proveedor_id_proveedor")
    private int proveedorIdProveedor;

    public MaterialProveedorPK() {
    }

    public MaterialProveedorPK(int materialIdMaterial, int proveedorIdProveedor) {
        this.materialIdMaterial = materialIdMaterial;
        this.proveedorIdProveedor = proveedorIdProveedor;
    }

    public int getMaterialIdMaterial() {
        return materialIdMaterial;
    }

    public void setMaterialIdMaterial(int materialIdMaterial) {
        this.materialIdMaterial = materialIdMaterial;
    }

    public int getProveedorIdProveedor() {
        return proveedorIdProveedor;
    }

    public void setProveedorIdProveedor(int proveedorIdProveedor) {
        this.proveedorIdProveedor = proveedorIdProveedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) materialIdMaterial;
        hash += (int) proveedorIdProveedor;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MaterialProveedorPK)) {
            return false;
        }
        MaterialProveedorPK other = (MaterialProveedorPK) object;
        if (this.materialIdMaterial != other.materialIdMaterial) {
            return false;
        }
        if (this.proveedorIdProveedor != other.proveedorIdProveedor) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entities.MaterialProveedorPK[ materialIdMaterial=" + materialIdMaterial + ", proveedorIdProveedor=" + proveedorIdProveedor + " ]";
    }

}
