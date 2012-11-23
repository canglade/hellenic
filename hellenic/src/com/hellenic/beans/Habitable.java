package com.hellenic.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "habitable" )
public class Habitable extends Propriete {

    @Id
    @Column( name = "ref" )
    private String ref;

    @Column( name = "nbrPieceHabitable" )
    private int    nbrPieceHabitable;

    @Column( name = "etat" )
    private String etat;

    @Column( name = "type" )
    private String type;

    // TODO voir proprietés !
    Habitable() {
        super();
    }

    public String getRef() {
        return ref;
    }

    public void setRef( String ref ) {
        this.ref = ref;
    }

    public int getNbrPieceHabitable() {
        return nbrPieceHabitable;
    }

    public void setNbrPieceHabitable( int nbrPieceHabitable ) {
        this.nbrPieceHabitable = nbrPieceHabitable;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat( String etat ) {
        this.etat = etat;
    }

    public String getType() {
        return type;
    }

    public void setType( String type ) {
        this.type = type;
    }

}
