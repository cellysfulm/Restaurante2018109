package com.juampamuralles.entities;

import com.juampamuralles.entities.Cocineros;
import com.juampamuralles.entities.Facturas;
import com.juampamuralles.entities.Mesas;
import com.juampamuralles.entities.Meseros;
import com.juampamuralles.entities.Platos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-17T11:12:39")
@StaticMetamodel(Pedidos.class)
public class Pedidos_ { 

    public static volatile SingularAttribute<Pedidos, Integer> total;
    public static volatile SingularAttribute<Pedidos, Integer> subtotal;
    public static volatile SingularAttribute<Pedidos, Integer> idpedido;
    public static volatile SingularAttribute<Pedidos, Platos> idplatos;
    public static volatile SingularAttribute<Pedidos, Cocineros> idcocineros;
    public static volatile SingularAttribute<Pedidos, Integer> cantidad;
    public static volatile ListAttribute<Pedidos, Meseros> meserosList;
    public static volatile ListAttribute<Pedidos, Mesas> mesasList;
    public static volatile ListAttribute<Pedidos, Facturas> facturasList;

}