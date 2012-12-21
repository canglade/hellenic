package com.hellenic.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "habitable" )
public class Habitable extends ProprieteBean {

    @Id
    @Column( name = "refpropriete" )
    private String ref;

    @Column( name = "nbchambrehabitable" )
    private int    nbrPieceHabitable;

    @Column( name = "etathabitable" )
    private String etat;

    @Column( name = "typehabitable" )
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
