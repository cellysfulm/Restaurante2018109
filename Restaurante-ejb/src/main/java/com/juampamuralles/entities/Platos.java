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
@Table(name = "platos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Platos.findAll", query = "SELECT p FROM Platos p")
    , @NamedQuery(name = "Platos.findByIdplatos", query = "SELECT p FROM Platos p WHERE p.idplatos = :idplatos")
    , @NamedQuery(name = "Platos.findByNombre", query = "SELECT p FROM Platos p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Platos.findByPrecio", query = "SELECT p FROM Platos p WHERE p.precio = :precio")})
public class Platos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idplatos")
    private Integer idplatos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private double precio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idplatos")
    private List<Pedidos> pedidosList;

    public Platos() {
    }

    public Platos(Integer idplatos) {
        this.idplatos = idplatos;
    }

    public Platos(Integer idplatos, String nombre, double precio) {
        this.idplatos = idplatos;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Integer getIdplatos() {
        return idplatos;
    }

    public void setIdplatos(Integer idplatos) {
        this.idplatos = idplatos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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
        hash += (idplatos != null ? idplatos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Platos)) {
            return false;
        }
        Platos other = (Platos) object;
        if ((this.idplatos == null && other.idplatos != null) || (this.idplatos != null && !this.idplatos.equals(other.idplatos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.juampamuralles.entities.Platos[ idplatos=" + idplatos + " ]";
    }
    
}
