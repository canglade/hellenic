package com.hellenic.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )
@Table( name = "Propriete" )
public class ProprieteBean {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "refpropriete" )
    private String      ref;

    @Column( name = "prixpropriete" )
    private float       prix;

    @Column( name = "libpropriete" )
    private String      libelle;

    @Column( name = "descriptionpropriete" )
    private String      description;

    @Column( name = "surfterrainpropriete" )
    private float       surface;

    @Column( name = "prixminipropriete" )
    private float       prixMini;

    @Column( name = "regionpropriete" )
    private String      region;

    @Column( name = "vendupropriete" )
    private boolean     isVendu;

    @Column( name = "dateventepropriete" )
    private String      dateVente;

    @OneToOne( cascade = CascadeType.ALL )
    @PrimaryKeyJoinColumn
    @JoinColumn( name = "idreservation" )
    private Reservation reservation;

    @ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, targetEntity = Vendeur.class )
    @JoinColumn( name = "idproprio" )
    private Vendeur     vendeur;

    // TODO Voire les propriétés !
    // TODO faire FK

    ProprieteBean() {
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

    public Reservation getReservation() {
        return reservation;
    }

    public Vendeur getVendeur() {
        return vendeur;
    }
}
