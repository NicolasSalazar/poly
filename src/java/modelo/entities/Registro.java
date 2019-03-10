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
@Table(name = "registro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Registro.findAll", query = "SELECT r FROM Registro r")
    , @NamedQuery(name = "Registro.findByIdRegistro", query = "SELECT r FROM Registro r WHERE r.idRegistro = :idRegistro")
    , @NamedQuery(name = "Registro.findByDestino", query = "SELECT r FROM Registro r WHERE r.destino = :destino")
    , @NamedQuery(name = "Registro.findByMaterialIdMaterial", query = "SELECT r FROM Registro r WHERE r.materialIdMaterial = :materialIdMaterial")
    , @NamedQuery(name = "Registro.findByCantidadProducto", query = "SELECT r FROM Registro r WHERE r.cantidadProducto = :cantidadProducto")
    , @NamedQuery(name = "Registro.findByCaducidadProducto", query = "SELECT r FROM Registro r WHERE r.caducidadProducto = :caducidadProducto")
    , @NamedQuery(name = "Registro.findByOrdenMaterialIdordenMaterial", query = "SELECT r FROM Registro r WHERE r.ordenMaterialIdordenMaterial = :ordenMaterialIdordenMaterial")
    , @NamedQuery(name = "Registro.findByStockIdStock", query = "SELECT r FROM Registro r WHERE r.stockIdStock = :stockIdStock")
    , @NamedQuery(name = "Registro.findByUnidadMedida", query = "SELECT r FROM Registro r WHERE r.unidadMedida = :unidadMedida")})
public class Registro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_registro")
    private Integer idRegistro;
    @Basic(optional = false)
    @Column(name = "destino")
    private String destino;
    @Basic(optional = false)
    @Column(name = "material_id_material")
    private int materialIdMaterial;
    @Basic(optional = false)
    @Column(name = "cantidad_producto")
    private String cantidadProducto;
    @Basic(optional = false)
    @Column(name = "caducidad_producto")
    private String caducidadProducto;
    @Basic(optional = false)
    @Column(name = "orden_material_idorden_material")
    private int ordenMaterialIdordenMaterial;
    @Basic(optional = false)
    @Column(name = "stock_id_stock")
    private int stockIdStock;
    @Basic(optional = false)
    @Column(name = "unidad_medida")
    private String unidadMedida;

    public Registro() {
    }

    public Registro(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Registro(Integer idRegistro, String destino, int materialIdMaterial, String cantidadProducto, String caducidadProducto, int ordenMaterialIdordenMaterial, int stockIdStock, String unidadMedida) {
        this.idRegistro = idRegistro;
        this.destino = destino;
        this.materialIdMaterial = materialIdMaterial;
        this.cantidadProducto = cantidadProducto;
        this.caducidadProducto = caducidadProducto;
        this.ordenMaterialIdordenMaterial = ordenMaterialIdordenMaterial;
        this.stockIdStock = stockIdStock;
        this.unidadMedida = unidadMedida;
    }

    public Integer getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getMaterialIdMaterial() {
        return materialIdMaterial;
    }

    public void setMaterialIdMaterial(int materialIdMaterial) {
        this.materialIdMaterial = materialIdMaterial;
    }

    public String getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(String cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getCaducidadProducto() {
        return caducidadProducto;
    }

    public void setCaducidadProducto(String caducidadProducto) {
        this.caducidadProducto = caducidadProducto;
    }

    public int getOrdenMaterialIdordenMaterial() {
        return ordenMaterialIdordenMaterial;
    }

    public void setOrdenMaterialIdordenMaterial(int ordenMaterialIdordenMaterial) {
        this.ordenMaterialIdordenMaterial = ordenMaterialIdordenMaterial;
    }

    public int getStockIdStock() {
        return stockIdStock;
    }

    public void setStockIdStock(int stockIdStock) {
        this.stockIdStock = stockIdStock;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegistro != null ? idRegistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registro)) {
            return false;
        }
        Registro other = (Registro) object;
        if ((this.idRegistro == null && other.idRegistro != null) || (this.idRegistro != null && !this.idRegistro.equals(other.idRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entities.Registro[ idRegistro=" + idRegistro + " ]";
    }

}
