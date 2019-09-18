package com.juampamuralles.entities;

import com.juampamuralles.entities.Clientes;
import com.juampamuralles.entities.Pedidos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-17T11:12:39")
@StaticMetamodel(Facturas.class)
public class Facturas_ { 

    public static volatile SingularAttribute<Facturas, Integer> total;
    public static volatile SingularAttribute<Facturas, Pedidos> idpedido;
    public static volatile SingularAttribute<Facturas, Clientes> idclientes;
    public static volatile SingularAttribute<Facturas, Integer> idfacturas;

}