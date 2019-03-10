/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author DU
 */
@Entity
@Table(name = "almacen_material")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AlmacenMaterial.findAll", query = "SELECT a FROM AlmacenMaterial a")
    , @NamedQuery(name = "AlmacenMaterial.findByIdAlmacen", query = "SELECT a FROM AlmacenMaterial a WHERE a.idAlmacen = :idAlmacen")
    , @NamedQuery(name = "AlmacenMaterial.findByCiudad", query = "SELECT a FROM AlmacenMaterial a WHERE a.ciudad = :ciudad")
    , @NamedQuery(name = "AlmacenMaterial.findByTelefono", query = "SELECT a FROM AlmacenMaterial a WHERE a.telefono = :telefono")
    , @NamedQuery(name = "AlmacenMaterial.findByTotalElementos", query = "SELECT a FROM AlmacenMaterial a WHERE a.totalElementos = :totalElementos")})
public class AlmacenMaterial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_almacen")
    private Integer idAlmacen;
    @Basic(optional = false)
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "telefono")
    private Integer telefono;
    @Column(name = "total_elementos")
    private String totalElementos;

    public AlmacenMaterial() {
    }

    public AlmacenMaterial(Integer idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public AlmacenMaterial(Integer idAlmacen, String ciudad) {
        this.idAlmacen = idAlmacen;
        this.ciudad = ciudad;
    }

    public Integer getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(Integer idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getTotalElementos() {
        return totalElementos;
    }

    public void setTotalElementos(String totalElementos) {
        this.totalElementos = totalElementos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlmacen != null ? idAlmacen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlmacenMaterial)) {
            return false;
        }
        AlmacenMaterial other = (AlmacenMaterial) object;
        if ((this.idAlmacen == null && other.idAlmacen != null) || (this.idAlmacen != null && !this.idAlmacen.equals(other.idAlmacen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entities.AlmacenMaterial[ idAlmacen=" + idAlmacen + " ]";
    }

}
