package com.juampamuralles.entities;

import com.juampamuralles.entities.Areas;
import com.juampamuralles.entities.Clientes;
import com.juampamuralles.entities.Meseros;
import com.juampamuralles.entities.Pedidos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-17T11:12:39")
@StaticMetamodel(Mesas.class)
public class Mesas_ { 

    public static volatile SingularAttribute<Mesas, Integer> idmesa;
    public static volatile SingularAttribute<Mesas, String> tipo;
    public static volatile SingularAttribute<Mesas, Clientes> idclientes;
    public static volatile ListAttribute<Mesas, Areas> areasList;
    public static volatile ListAttribute<Mesas, Meseros> meserosList;
    public static volatile SingularAttribute<Mesas, Pedidos> idpedidos;

}