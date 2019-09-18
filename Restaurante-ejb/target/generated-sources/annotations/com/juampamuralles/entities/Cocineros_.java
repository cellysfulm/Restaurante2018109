package com.juampamuralles.entities;

import com.juampamuralles.entities.Pedidos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-17T11:12:39")
@StaticMetamodel(Cocineros.class)
public class Cocineros_ { 

    public static volatile SingularAttribute<Cocineros, Integer> idcocineros;
    public static volatile ListAttribute<Cocineros, Pedidos> pedidosList;
    public static volatile SingularAttribute<Cocineros, String> nombre;

}