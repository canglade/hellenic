package com.hellenic.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "vendeur" )
public class Vendeur {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "idproprio" )
    private String id;

    @Column( name = "nomproprio" )
    private String nom;

    @Column( name = "prenomproprio" )
    private String prenom;

    @Column( name = "telproprio" )
    private String telephone;

    @Column( name = "adresseproprio" )
    private String adresse;

    Vendeur() {

    }

    public String getId() {
        return id;
    }

    public void setId( String id ) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom( String nom ) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom( String prenom ) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone( String telephone ) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse( String adresse ) {
        this.adresse = adresse;
    }

}
