/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entites;

/**
 *
 * @author Foued ben brahim
 */
public class Presence {
    private int id_salaire;
     private String nom;
     private String cin;
     private String date_abs;
     private String type_user;
     private String etat_pres;
     private String type_abs;

    public Presence() {
    }

    public Presence(int id_salaire, String nom, String cin, String date_abs, String type_user, String etat_pres, String type_abs) {
        this.id_salaire = id_salaire;
        this.nom = nom;
        this.cin = cin;
        this.date_abs = date_abs;
        this.type_user = type_user;
        this.etat_pres = etat_pres;
        this.type_abs = type_abs;
    }

    public int getId_salaire() {
        return id_salaire;
    }

    public void setId_salaire(int id_salaire) {
        this.id_salaire = id_salaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getDate_abs() {
        return date_abs;
    }

    public void setDate_abs(String date_abs) {
        this.date_abs = date_abs;
    }

    public String getType_user() {
        return type_user;
    }

    public void setType_user(String type_user) {
        this.type_user = type_user;
    }

    public String getEtat_pres() {
        return etat_pres;
    }

    public void setEtat_pres(String etat_pres) {
        this.etat_pres = etat_pres;
    }

    public String getType_abs() {
        return type_abs;
    }

    public void setType_abs(String type_abs) {
        this.type_abs = type_abs;
    }

    @Override
    public String toString() {
        return "Presence{" + "id_salaire=" + id_salaire + ", nom=" + nom + ", cin=" + cin + ", date_abs=" + date_abs + ", type_user=" + type_user + ", etat_pres=" + etat_pres + ", type_abs=" + type_abs + '}';
    }
     
     
    

}
