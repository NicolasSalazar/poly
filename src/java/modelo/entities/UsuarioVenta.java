/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author DU
 */
@Entity
@Table(name = "usuario_venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioVenta.findAll", query = "SELECT u FROM UsuarioVenta u")
    , @NamedQuery(name = "UsuarioVenta.findByUsuarioIdUsuario", query = "SELECT u FROM UsuarioVenta u WHERE u.usuarioVentaPK.usuarioIdUsuario = :usuarioIdUsuario")
    , @NamedQuery(name = "UsuarioVenta.findByVentaIdVenta", query = "SELECT u FROM UsuarioVenta u WHERE u.usuarioVentaPK.ventaIdVenta = :ventaIdVenta")})
public class UsuarioVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsuarioVentaPK usuarioVentaPK;

    public UsuarioVenta() {
    }

    public UsuarioVenta(UsuarioVentaPK usuarioVentaPK) {
        this.usuarioVentaPK = usuarioVentaPK;
    }

    public UsuarioVenta(int usuarioIdUsuario, int ventaIdVenta) {
        this.usuarioVentaPK = new UsuarioVentaPK(usuarioIdUsuario, ventaIdVenta);
    }

    public UsuarioVentaPK getUsuarioVentaPK() {
        return usuarioVentaPK;
    }

    public void setUsuarioVentaPK(UsuarioVentaPK usuarioVentaPK) {
        this.usuarioVentaPK = usuarioVentaPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuarioVentaPK != null ? usuarioVentaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioVenta)) {
            return false;
        }
        UsuarioVenta other = (UsuarioVenta) object;
        if ((this.usuarioVentaPK == null && other.usuarioVentaPK != null) || (this.usuarioVentaPK != null && !this.usuarioVentaPK.equals(other.usuarioVentaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entities.UsuarioVenta[ usuarioVentaPK=" + usuarioVentaPK + " ]";
    }

}
