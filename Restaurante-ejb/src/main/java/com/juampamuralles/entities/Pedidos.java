/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juampamuralles.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "pedidos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedidos.findAll", query = "SELECT p FROM Pedidos p")
    , @NamedQuery(name = "Pedidos.findByIdpedido", query = "SELECT p FROM Pedidos p WHERE p.idpedido = :idpedido")
    , @NamedQuery(name = "Pedidos.findByCantidad", query = "SELECT p FROM Pedidos p WHERE p.cantidad = :cantidad")
    , @NamedQuery(name = "Pedidos.findBySubtotal", query = "SELECT p FROM Pedidos p WHERE p.subtotal = :subtotal")
    , @NamedQuery(name = "Pedidos.findByTotal", query = "SELECT p FROM Pedidos p WHERE p.total = :total")})
public class Pedidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idpedido")
    private Integer idpedido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "subtotal")
    private int subtotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total")
    private int total;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpedidos")
    private List<Mesas> mesasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpedido")
    private List<Facturas> facturasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpedido")
    private List<Meseros> meserosList;
    @JoinColumn(name = "idcocineros", referencedColumnName = "idcocineros")
    @ManyToOne(optional = false)
    private Cocineros idcocineros;
    @JoinColumn(name = "idplatos", referencedColumnName = "idplatos")
    @ManyToOne(optional = false)
    private Platos idplatos;

    public Pedidos() {
    }

    public Pedidos(Integer idpedido) {
        this.idpedido = idpedido;
    }

    public Pedidos(Integer idpedido, int cantidad, int subtotal, int total) {
        this.idpedido = idpedido;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.total = total;
    }

    public Integer getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(Integer idpedido) {
        this.idpedido = idpedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @XmlTransient
    public List<Mesas> getMesasList() {
        return mesasList;
    }

    public void setMesasList(List<Mesas> mesasList) {
        this.mesasList = mesasList;
    }

    @XmlTransient
    public List<Facturas> getFacturasList() {
        return facturasList;
    }

    public void setFacturasList(List<Facturas> facturasList) {
        this.facturasList = facturasList;
    }

    @XmlTransient
    public List<Meseros> getMeserosList() {
        return meserosList;
    }

    public void setMeserosList(List<Meseros> meserosList) {
        this.meserosList = meserosList;
    }

    public Cocineros getIdcocineros() {
        return idcocineros;
    }

    public void setIdcocineros(Cocineros idcocineros) {
        this.idcocineros = idcocineros;
    }

    public Platos getIdplatos() {
        return idplatos;
    }

    public void setIdplatos(Platos idplatos) {
        this.idplatos = idplatos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpedido != null ? idpedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedidos)) {
            return false;
        }
        Pedidos other = (Pedidos) object;
        if ((this.idpedido == null && other.idpedido != null) || (this.idpedido != null && !this.idpedido.equals(other.idpedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.juampamuralles.entities.Pedidos[ idpedido=" + idpedido + " ]";
    }
    
}
