/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

/**
 *
 * @author Foued ben brahim
 */
public class utilisateur {

    protected String cin;
    protected String nom;
    protected String prenom;
    protected String email;
    protected String motDePasse;
    protected String tel;
    protected String DateNaissance;
    protected String photo;
    
    protected String type_user;

    public utilisateur(String cin, String nom, String prenom, String email, String motDePasse, String tel, String DateNaissance, String photo, String type_user) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.tel = tel;
        this.DateNaissance = DateNaissance;
        this.photo = photo;
        this.type_user = type_user;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDateNaissance() {
        return DateNaissance;
    }

    public void setDateNaissance(String DateNaissance) {
        this.DateNaissance = DateNaissance;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getType_user() {
        return type_user;
    }

    public void setType_user(String type_user) {
        this.type_user = type_user;
    }

    
    
    
    
}
