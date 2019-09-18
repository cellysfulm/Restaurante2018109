package com.juampamuralles.entities;

import com.juampamuralles.entities.Facturas;
import com.juampamuralles.entities.Mesas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-17T11:12:39")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, String> apellido;
    public static volatile SingularAttribute<Clientes, String> direccion;
    public static volatile SingularAttribute<Clientes, Integer> idclientes;
    public static volatile SingularAttribute<Clientes, String> nombre;
    public static volatile ListAttribute<Clientes, Mesas> mesasList;
    public static volatile ListAttribute<Clientes, Facturas> facturasList;

}