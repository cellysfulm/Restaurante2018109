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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "meseros")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Meseros.findAll", query = "SELECT m FROM Meseros m")
    , @NamedQuery(name = "Meseros.findByIdmeseros", query = "SELECT m FROM Meseros m WHERE m.idmeseros = :idmeseros")
    , @NamedQuery(name = "Meseros.findByNombre", query = "SELECT m FROM Meseros m WHERE m.nombre = :nombre")})
public class Meseros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idmeseros")
    private Integer idmeseros;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @JoinColumn(name = "idmesa", referencedColumnName = "idmesa")
    @ManyToOne(optional = false)
    private Mesas idmesa;
    @JoinColumn(name = "idpedido", referencedColumnName = "idpedido")
    @ManyToOne(optional = false)
    private Pedidos idpedido;

    public Meseros() {
    }

    public Meseros(Integer idmeseros) {
        this.idmeseros = idmeseros;
    }

    public Meseros(Integer idmeseros, String nombre) {
        this.idmeseros = idmeseros;
        this.nombre = nombre;
    }

    public Integer getIdmeseros() {
        return idmeseros;
    }

    public void setIdmeseros(Integer idmeseros) {
        this.idmeseros = idmeseros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Mesas getIdmesa() {
        return idmesa;
    }

    public void setIdmesa(Mesas idmesa) {
        this.idmesa = idmesa;
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
        hash += (idmeseros != null ? idmeseros.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Meseros)) {
            return false;
        }
        Meseros other = (Meseros) object;
        if ((this.idmeseros == null && other.idmeseros != null) || (this.idmeseros != null && !this.idmeseros.equals(other.idmeseros))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.juampamuralles.entities.Meseros[ idmeseros=" + idmeseros + " ]";
    }
    
}
