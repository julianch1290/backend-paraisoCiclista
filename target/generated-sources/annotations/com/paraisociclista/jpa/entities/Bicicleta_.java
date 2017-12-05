package com.paraisociclista.jpa.entities;

import com.paraisociclista.jpa.entities.Marca;
import com.paraisociclista.jpa.entities.Parqueo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T07:59:01")
@StaticMetamodel(Bicicleta.class)
public class Bicicleta_ { 

    public static volatile SingularAttribute<Bicicleta, String> matricula;
    public static volatile SingularAttribute<Bicicleta, Marca> idMarca;
    public static volatile SingularAttribute<Bicicleta, String> modelo;
    public static volatile ListAttribute<Bicicleta, Parqueo> parqueoList;

}