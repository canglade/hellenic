package com.hellenic.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "terre" )
public class Terre extends Propriete {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "ref" )
    private String  ref;

    @Column( name = "isContructible" )
    private boolean isContructible;

    // TODO voir les attribus

    Terre() {
        super();
    }

    public String getRef() {
        return ref;
    }

    public void setRef( String ref ) {
        this.ref = ref;
    }

    public boolean isContructible() {
        return isContructible;
    }

    public void setContructible( boolean isContructible ) {
        this.isContructible = isContructible;
    }

}
