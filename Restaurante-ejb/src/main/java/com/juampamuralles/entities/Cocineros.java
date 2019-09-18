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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "cocineros")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cocineros.findAll", query = "SELECT c FROM Cocineros c")
    , @NamedQuery(name = "Cocineros.findByIdcocineros", query = "SELECT c FROM Cocineros c WHERE c.idcocineros = :idcocineros")
    , @NamedQuery(name = "Cocineros.findByNombre", query = "SELECT c FROM Cocineros c WHERE c.nombre = :nombre")})
public class Cocineros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcocineros")
    private Integer idcocineros;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcocineros")
    private List<Pedidos> pedidosList;

    public Cocineros() {
    }

    public Cocineros(Integer idcocineros) {
        this.idcocineros = idcocineros;
    }

    public Cocineros(Integer idcocineros, String nombre) {
        this.idcocineros = idcocineros;
        this.nombre = nombre;
    }

    public Integer getIdcocineros() {
        return idcocineros;
    }

    public void setIdcocineros(Integer idcocineros) {
        this.idcocineros = idcocineros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<Pedidos> getPedidosList() {
        return pedidosList;
    }

    public void setPedidosList(List<Pedidos> pedidosList) {
        this.pedidosList = pedidosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcocineros != null ? idcocineros.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cocineros)) {
            return false;
        }
        Cocineros other = (Cocineros) object;
        if ((this.idcocineros == null && other.idcocineros != null) || (this.idcocineros != null && !this.idcocineros.equals(other.idcocineros))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.juampamuralles.entities.Cocineros[ idcocineros=" + idcocineros + " ]";
    }
    
}
