package com.hellenic.beans;

public class Propriete {
    private String  ref;
    private float   prix;
    private String  libelle;
    private String  description;
    private float   surface;
    private float   prixMini;
    private String  region;
    private boolean isVendu;
    private String  dateVente;

    // TODO Voire les propriétés !
    // TODO faire FK

    Propriete() {
        super();
    }

    public String getRef() {
        return ref;
    }

    public void setRef( String ref ) {
        this.ref = ref;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix( float prix ) {
        this.prix = prix;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle( String libelle ) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription( String description ) {
        this.description = description;
    }

    public float getSurface() {
        return surface;
    }

    public void setSurface( float surface ) {
        this.surface = surface;
    }

    public float getPrixMini() {
        return prixMini;
    }

    public void setPrixMini( float prixMini ) {
        this.prixMini = prixMini;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion( String region ) {
        this.region = region;
    }

    public boolean isVendu() {
        return isVendu;
    }

    public void setVendu( boolean isVendu ) {
        this.isVendu = isVendu;
    }

    public String getDateVente() {
        return dateVente;
    }

    public void setDateVente( String dateVente ) {
        this.dateVente = dateVente;
    }

}
