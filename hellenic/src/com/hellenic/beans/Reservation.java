package com.hellenic.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table( name = "reservation" )
public class Reservation {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "idreservation" )
    private String    id;

    @Column( name = "nomclient" )
    private String    nom;

    @Column( name = "prenomclient" )
    private String    prenom;

    @Column( name = "emailclient" )
    private String    email;

    @Column( name = "paysclient" )
    private String    pays;

    @Column( name = "telclient" )
    private String    telephone;

    @Column( name = "datereservation" )
    private String    date;

    @OneToOne( cascade = CascadeType.ALL )
    @PrimaryKeyJoinColumn
    private Propriete propriete;

    Reservation() {

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

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public String getPays() {
        return pays;
    }

    public void setPays( String pays ) {
        this.pays = pays;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone( String telephone ) {
        this.telephone = telephone;
    }

    public String getDate() {
        return date;
    }

    public void setDate( String date ) {
        this.date = date;
    }

    public Propriete propriete() {
        return propriete;
    }
}
