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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "mesas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mesas.findAll", query = "SELECT m FROM Mesas m")
    , @NamedQuery(name = "Mesas.findByIdmesa", query = "SELECT m FROM Mesas m WHERE m.idmesa = :idmesa")
    , @NamedQuery(name = "Mesas.findByTipo", query = "SELECT m FROM Mesas m WHERE m.tipo = :tipo")})
public class Mesas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idmesa")
    private Integer idmesa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "tipo")
    private String tipo;
    @JoinColumn(name = "idclientes", referencedColumnName = "idclientes")
    @ManyToOne(optional = false)
    private Clientes idclientes;
    @JoinColumn(name = "idpedidos", referencedColumnName = "idpedido")
    @ManyToOne(optional = false)
    private Pedidos idpedidos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmesa")
    private List<Meseros> meserosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmesas")
    private List<Areas> areasList;

    public Mesas() {
    }

    public Mesas(Integer idmesa) {
        this.idmesa = idmesa;
    }

    public Mesas(Integer idmesa, String tipo) {
        this.idmesa = idmesa;
        this.tipo = tipo;
    }

    public Integer getIdmesa() {
        return idmesa;
    }

    public void setIdmesa(Integer idmesa) {
        this.idmesa = idmesa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Clientes getIdclientes() {
        return idclientes;
    }

    public void setIdclientes(Clientes idclientes) {
        this.idclientes = idclientes;
    }

    public Pedidos getIdpedidos() {
        return idpedidos;
    }

    public void setIdpedidos(Pedidos idpedidos) {
        this.idpedidos = idpedidos;
    }

    @XmlTransient
    public List<Meseros> getMeserosList() {
        return meserosList;
    }

    public void setMeserosList(List<Meseros> meserosList) {
        this.meserosList = meserosList;
    }

    @XmlTransient
    public List<Areas> getAreasList() {
        return areasList;
    }

    public void setAreasList(List<Areas> areasList) {
        this.areasList = areasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmesa != null ? idmesa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mesas)) {
            return false;
        }
        Mesas other = (Mesas) object;
        if ((this.idmesa == null && other.idmesa != null) || (this.idmesa != null && !this.idmesa.equals(other.idmesa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.juampamuralles.entities.Mesas[ idmesa=" + idmesa + " ]";
    }
    
}
