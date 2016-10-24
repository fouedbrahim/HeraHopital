/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

/**
 *
 * @author Foued ben brahim
 */
public class Conge {
   private  int id_conge;
    private String nom_user;
    private String  cin_user;
    private String  type_user;
    private String  date_deb_conge;
    private String  date_fin_conge;
    private String  Rep_directeur;
     private String  email;
    

    public Conge() {
    }

    public Conge(int id_conge, String nom_user, String cin_user, String type_user, String date_deb_conge, String date_fin_conge, String Rep_directeur, String email) {
        this.id_conge = id_conge;
        this.nom_user = nom_user;
        this.cin_user = cin_user;
        this.type_user = type_user;
        this.date_deb_conge = date_deb_conge;
        this.date_fin_conge = date_fin_conge;
        this.Rep_directeur = Rep_directeur;
        this.email = email;
    }

    public int getId_conge() {
        return id_conge;
    }

    public void setId_conge(int id_conge) {
        this.id_conge = id_conge;
    }

    public String getNom_user() {
        return nom_user;
    }

    public void setNom_user(String nom_user) {
        this.nom_user = nom_user;
    }

    public String getCin_user() {
        return cin_user;
    }

    public void setCin_user(String cin_user) {
        this.cin_user = cin_user;
    }

    public String getType_user() {
        return type_user;
    }

    public void setType_user(String type_user) {
        this.type_user = type_user;
    }

    public String getDate_deb_conge() {
        return date_deb_conge;
    }

    public void setDate_deb_conge(String date_deb_conge) {
        this.date_deb_conge = date_deb_conge;
    }

    public String getDate_fin_conge() {
        return date_fin_conge;
    }

    public void setDate_fin_conge(String date_fin_conge) {
        this.date_fin_conge = date_fin_conge;
    }

    public String getRep_directeur() {
        return Rep_directeur;
    }

    public void setRep_directeur(String Rep_directeur) {
        this.Rep_directeur = Rep_directeur;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
   
}
