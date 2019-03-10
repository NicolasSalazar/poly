/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 
 * @author DU
 */
@Entity
@Table(name = "material")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Material.findAll", query = "SELECT m FROM Material m")
    , @NamedQuery(name = "Material.findByIdMaterial", query = "SELECT m FROM Material m WHERE m.idMaterial = :idMaterial")
    , @NamedQuery(name = "Material.findByTipoMaterial", query = "SELECT m FROM Material m WHERE m.tipoMaterial = :tipoMaterial")
    , @NamedQuery(name = "Material.findByDescripcion", query = "SELECT m FROM Material m WHERE m.descripcion = :descripcion")
    , @NamedQuery(name = "Material.findByCosto", query = "SELECT m FROM Material m WHERE m.costo = :costo")
    , @NamedQuery(name = "Material.findByLotes", query = "SELECT m FROM Material m WHERE m.lotes = :lotes")
    , @NamedQuery(name = "Material.findByContenido", query = "SELECT m FROM Material m WHERE m.contenido = :contenido")})
public class Material implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_material")
    private Integer idMaterial;
    @Basic(optional = false)
    @Column(name = "tipo_material")
    private String tipoMaterial;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "costo")
    private double costo;
    @Basic(optional = false)
    @Column(name = "lotes")
    private int lotes;
    @Basic(optional = false)
    @Column(name = "contenido")
    private String contenido;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "material")
    private List<MaterialProveedor> materialProveedorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "material")
    private List<ProductoMaterial> productoMaterialList;

    public Material() {
    }

    public Material(Integer idMaterial) {
        this.idMaterial = idMaterial;
    }

    public Material(Integer idMaterial, String tipoMaterial, String descripcion, double costo, int lotes, String contenido) {
        this.idMaterial = idMaterial;
        this.tipoMaterial = tipoMaterial;
        this.descripcion = descripcion;
        this.costo = costo;
        this.lotes = lotes;
        this.contenido = contenido;
    }

    public Integer getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Integer idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getLotes() {
        return lotes;
    }

    public void setLotes(int lotes) {
        this.lotes = lotes;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @XmlTransient
    public List<MaterialProveedor> getMaterialProveedorList() {
        return materialProveedorList;
    }

    public void setMaterialProveedorList(List<MaterialProveedor> materialProveedorList) {
        this.materialProveedorList = materialProveedorList;
    }

    @XmlTransient
    public List<ProductoMaterial> getProductoMaterialList() {
        return productoMaterialList;
    }

    public void setProductoMaterialList(List<ProductoMaterial> productoMaterialList) {
        this.productoMaterialList = productoMaterialList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMaterial != null ? idMaterial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Material)) {
            return false;
        }
        Material other = (Material) object;
        if ((this.idMaterial == null && other.idMaterial != null) || (this.idMaterial != null && !this.idMaterial.equals(other.idMaterial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entities.Material[ idMaterial=" + idMaterial + " ]";
    }

}
