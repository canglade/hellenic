package com.hellenic.beans;

public class Habitable extends Propriete {
    private String ref;
    private int    nbrPieceHabitable;
    private String etat;
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
