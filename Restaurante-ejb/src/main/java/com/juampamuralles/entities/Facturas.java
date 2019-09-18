/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juampamuralles.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "facturas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facturas.findAll", query = "SELECT f FROM Facturas f")
    , @NamedQuery(name = "Facturas.findByIdfacturas", query = "SELECT f FROM Facturas f WHERE f.idfacturas = :idfacturas")
    , @NamedQuery(name = "Facturas.findByTotal", query = "SELECT f FROM Facturas f WHERE f.total = :total")})
public class Facturas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idfacturas")
    private Integer idfacturas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total")
    private int total;
    @JoinColumn(name = "idclientes", referencedColumnName = "idclientes")
    @ManyToOne(optional = false)
    private Clientes idclientes;
    @JoinColumn(name = "idpedido", referencedColumnName = "idpedido")
    @ManyToOne(optional = false)
    private Pedidos idpedido;

    public Facturas() {
    }

    public Facturas(Integer idfacturas) {
        this.idfacturas = idfacturas;
    }

    public Facturas(Integer idfacturas, int total) {
        this.idfacturas = idfacturas;
        this.total = total;
    }

    public Integer getIdfacturas() {
        return idfacturas;
    }

    public void setIdfacturas(Integer idfacturas) {
        this.idfacturas = idfacturas;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Clientes getIdclientes() {
        return idclientes;
    }

    public void setIdclientes(Clientes idclientes) {
        this.idclientes = idclientes;
    }

    public Pedidos getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(Pedidos idpedido) {
        this.idpedido = idpedido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfacturas != null ? idfacturas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facturas)) {
            return false;
        }
        Facturas other = (Facturas) object;
        if ((this.idfacturas == null && other.idfacturas != null) || (this.idfacturas != null && !this.idfacturas.equals(other.idfacturas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.juampamuralles.entities.Facturas[ idfacturas=" + idfacturas + " ]";
    }
    
}
