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
@Table(name = "stock")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stock.findAll", query = "SELECT s FROM Stock s")
    , @NamedQuery(name = "Stock.findByIdStock", query = "SELECT s FROM Stock s WHERE s.idStock = :idStock")
    , @NamedQuery(name = "Stock.findBySedeIdSede", query = "SELECT s FROM Stock s WHERE s.sedeIdSede = :sedeIdSede")
    , @NamedQuery(name = "Stock.findByDireccion", query = "SELECT s FROM Stock s WHERE s.direccion = :direccion")})
public class Stock implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_stock")
    private Integer idStock;
    @Basic(optional = false)
    @Column(name = "sede_id_sede")
    private int sedeIdSede;
    @Basic(optional = false)
    @Column(name = "direccion")
    private String direccion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "stock")
    private List<ProductosEnStock> productosEnStockList;
    @OneToMany(mappedBy = "stockIdStock")
    private List<Producto> productoList;

    public Stock() {
    }

    public Stock(Integer idStock) {
        this.idStock = idStock;
    }

    public Stock(Integer idStock, int sedeIdSede, String direccion) {
        this.idStock = idStock;
        this.sedeIdSede = sedeIdSede;
        this.direccion = direccion;
    }

    public Integer getIdStock() {
        return idStock;
    }

    public void setIdStock(Integer idStock) {
        this.idStock = idStock;
    }

    public int getSedeIdSede() {
        return sedeIdSede;
    }

    public void setSedeIdSede(int sedeIdSede) {
        this.sedeIdSede = sedeIdSede;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @XmlTransient
    public List<ProductosEnStock> getProductosEnStockList() {
        return productosEnStockList;
    }

    public void setProductosEnStockList(List<ProductosEnStock> productosEnStockList) {
        this.productosEnStockList = productosEnStockList;
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
        hash += (idStock != null ? idStock.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stock)) {
            return false;
        }
        Stock other = (Stock) object;
        if ((this.idStock == null && other.idStock != null) || (this.idStock != null && !this.idStock.equals(other.idStock))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entities.Stock[ idStock=" + idStock + " ]";
    }

}
