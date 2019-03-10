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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")
    , @NamedQuery(name = "Producto.findByIdProducto", query = "SELECT p FROM Producto p WHERE p.idProducto = :idProducto")
    , @NamedQuery(name = "Producto.findByNombre", query = "SELECT p FROM Producto p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Producto.findByDificultad", query = "SELECT p FROM Producto p WHERE p.dificultad = :dificultad")
    , @NamedQuery(name = "Producto.findByCostoProduccion", query = "SELECT p FROM Producto p WHERE p.costoProduccion = :costoProduccion")
    , @NamedQuery(name = "Producto.findByTiempoProduccion", query = "SELECT p FROM Producto p WHERE p.tiempoProduccion = :tiempoProduccion")
    , @NamedQuery(name = "Producto.findByPrecioBase", query = "SELECT p FROM Producto p WHERE p.precioBase = :precioBase")
    , @NamedQuery(name = "Producto.findByPeso", query = "SELECT p FROM Producto p WHERE p.peso = :peso")
    , @NamedQuery(name = "Producto.findByTama\u00f1o", query = "SELECT p FROM Producto p WHERE p.tama\u00f1o = :tama\u00f1o")
    , @NamedQuery(name = "Producto.findByVisible", query = "SELECT p FROM Producto p WHERE p.visible = :visible")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_producto")
    private Integer idProducto;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "dificultad")
    private int dificultad;
    @Basic(optional = false)
    @Column(name = "costo_produccion")
    private double costoProduccion;
    @Basic(optional = false)
    @Column(name = "tiempo_produccion")
    private double tiempoProduccion;
    @Basic(optional = false)
    @Column(name = "precio_base")
    private int precioBase;
    @Basic(optional = false)
    @Column(name = "peso")
    private String peso;
    @Basic(optional = false)
    @Column(name = "tama\u00f1o")
    private String tamaño;
    @Column(name = "visible")
    private Boolean visible;
    @Lob
    @Column(name = "imagen")
    private byte[] imagen;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
    private List<ProductosEnStock> productosEnStockList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
    private List<ProductoOrdenProduccion> productoOrdenProduccionList;
    @JoinColumn(name = "catalogo_id_catalogo", referencedColumnName = "id_catalogo")
    @ManyToOne(optional = false)
    private Catalogo catalogoIdCatalogo;
    @JoinColumn(name = "disenio_id_disenio", referencedColumnName = "id_disenio")
    @ManyToOne(optional = false)
    private Disenio disenioIdDisenio;
    @JoinColumn(name = "stock_id_stock", referencedColumnName = "id_stock")
    @ManyToOne
    private Stock stockIdStock;
    @JoinColumn(name = "tipo_producto_id_tipo_producto", referencedColumnName = "id_tipo_producto")
    @ManyToOne(optional = false)
    private TipoProducto tipoProductoIdTipoProducto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
    private List<ProductoMaterial> productoMaterialList;

    public Producto() {
    }

    public Producto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Producto(Integer idProducto, String nombre, int dificultad, double costoProduccion, double tiempoProduccion, int precioBase, String peso, String tamaño) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.costoProduccion = costoProduccion;
        this.tiempoProduccion = tiempoProduccion;
        this.precioBase = precioBase;
        this.peso = peso;
        this.tamaño = tamaño;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public double getCostoProduccion() {
        return costoProduccion;
    }

    public void setCostoProduccion(double costoProduccion) {
        this.costoProduccion = costoProduccion;
    }

    public double getTiempoProduccion() {
        return tiempoProduccion;
    }

    public void setTiempoProduccion(double tiempoProduccion) {
        this.tiempoProduccion = tiempoProduccion;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    @XmlTransient
    public List<ProductosEnStock> getProductosEnStockList() {
        return productosEnStockList;
    }

    public void setProductosEnStockList(List<ProductosEnStock> productosEnStockList) {
        this.productosEnStockList = productosEnStockList;
    }

    @XmlTransient
    public List<ProductoOrdenProduccion> getProductoOrdenProduccionList() {
        return productoOrdenProduccionList;
    }

    public void setProductoOrdenProduccionList(List<ProductoOrdenProduccion> productoOrdenProduccionList) {
        this.productoOrdenProduccionList = productoOrdenProduccionList;
    }

    public Catalogo getCatalogoIdCatalogo() {
        return catalogoIdCatalogo;
    }

    public void setCatalogoIdCatalogo(Catalogo catalogoIdCatalogo) {
        this.catalogoIdCatalogo = catalogoIdCatalogo;
    }

    public Disenio getDisenioIdDisenio() {
        return disenioIdDisenio;
    }

    public void setDisenioIdDisenio(Disenio disenioIdDisenio) {
        this.disenioIdDisenio = disenioIdDisenio;
    }

    public Stock getStockIdStock() {
        return stockIdStock;
    }

    public void setStockIdStock(Stock stockIdStock) {
        this.stockIdStock = stockIdStock;
    }

    public TipoProducto getTipoProductoIdTipoProducto() {
        return tipoProductoIdTipoProducto;
    }

    public void setTipoProductoIdTipoProducto(TipoProducto tipoProductoIdTipoProducto) {
        this.tipoProductoIdTipoProducto = tipoProductoIdTipoProducto;
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
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entities.Producto[ idProducto=" + idProducto + " ]";
    }

}
