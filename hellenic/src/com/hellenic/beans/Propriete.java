package com.hellenic.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "Propriete" )
public class Propriete {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "ref" )
    private String  ref;

    @Column( name = "prix" )
    private float   prix;

    @Column( name = "libelle" )
    private String  libelle;

    @Column( name = "description" )
    private String  description;

    @Column( name = "surface" )
    private float   surface;

    @Column( name = "prixMini" )
    private float   prixMini;

    @Column( name = "region" )
    private String  region;

    @Column( name = "isVendu" )
    private boolean isVendu;

    @Column( name = "dateVente" )
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
