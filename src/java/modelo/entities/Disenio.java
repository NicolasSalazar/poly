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
@Table(name = "disenio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Disenio.findAll", query = "SELECT d FROM Disenio d")
    , @NamedQuery(name = "Disenio.findByIdDisenio", query = "SELECT d FROM Disenio d WHERE d.idDisenio = :idDisenio")
    , @NamedQuery(name = "Disenio.findByNombre", query = "SELECT d FROM Disenio d WHERE d.nombre = :nombre")})
public class Disenio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_disenio")
    private Integer idDisenio;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "disenioIdDisenio")
    private List<Producto> productoList;

    public Disenio() {
    }

    public Disenio(Integer idDisenio) {
        this.idDisenio = idDisenio;
    }

    public Disenio(Integer idDisenio, String nombre) {
        this.idDisenio = idDisenio;
        this.nombre = nombre;
    }

    public Integer getIdDisenio() {
        return idDisenio;
    }

    public void setIdDisenio(Integer idDisenio) {
        this.idDisenio = idDisenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDisenio != null ? idDisenio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Disenio)) {
            return false;
        }
        Disenio other = (Disenio) object;
        if ((this.idDisenio == null && other.idDisenio != null) || (this.idDisenio != null && !this.idDisenio.equals(other.idDisenio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entities.Disenio[ idDisenio=" + idDisenio + " ]";
    }

}
