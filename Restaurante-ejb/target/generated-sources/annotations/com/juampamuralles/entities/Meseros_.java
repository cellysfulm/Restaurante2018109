package com.juampamuralles.entities;

import com.juampamuralles.entities.Mesas;
import com.juampamuralles.entities.Pedidos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-17T11:12:39")
@StaticMetamodel(Meseros.class)
public class Meseros_ { 

    public static volatile SingularAttribute<Meseros, Mesas> idmesa;
    public static volatile SingularAttribute<Meseros, Pedidos> idpedido;
    public static volatile SingularAttribute<Meseros, Integer> idmeseros;
    public static volatile SingularAttribute<Meseros, String> nombre;

}