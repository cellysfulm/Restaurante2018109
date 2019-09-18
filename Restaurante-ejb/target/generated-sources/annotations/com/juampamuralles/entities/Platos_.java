package com.juampamuralles.entities;

import com.juampamuralles.entities.Pedidos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-17T11:12:39")
@StaticMetamodel(Platos.class)
public class Platos_ { 

    public static volatile SingularAttribute<Platos, Double> precio;
    public static volatile SingularAttribute<Platos, Integer> idplatos;
    public static volatile ListAttribute<Platos, Pedidos> pedidosList;
    public static volatile SingularAttribute<Platos, String> nombre;

}