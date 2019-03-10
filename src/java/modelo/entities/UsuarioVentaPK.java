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
public class UsuarioVentaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "usuario_id_usuario")
    private int usuarioIdUsuario;
    @Basic(optional = false)
    @Column(name = "venta_id_venta")
    private int ventaIdVenta;

    public UsuarioVentaPK() {
    }

    public UsuarioVentaPK(int usuarioIdUsuario, int ventaIdVenta) {
        this.usuarioIdUsuario = usuarioIdUsuario;
        this.ventaIdVenta = ventaIdVenta;
    }

    public int getUsuarioIdUsuario() {
        return usuarioIdUsuario;
    }

    public void setUsuarioIdUsuario(int usuarioIdUsuario) {
        this.usuarioIdUsuario = usuarioIdUsuario;
    }

    public int getVentaIdVenta() {
        return ventaIdVenta;
    }

    public void setVentaIdVenta(int ventaIdVenta) {
        this.ventaIdVenta = ventaIdVenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) usuarioIdUsuario;
        hash += (int) ventaIdVenta;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioVentaPK)) {
            return false;
        }
        UsuarioVentaPK other = (UsuarioVentaPK) object;
        if (this.usuarioIdUsuario != other.usuarioIdUsuario) {
            return false;
        }
        if (this.ventaIdVenta != other.ventaIdVenta) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entities.UsuarioVentaPK[ usuarioIdUsuario=" + usuarioIdUsuario + ", ventaIdVenta=" + ventaIdVenta + " ]";
    }

}
