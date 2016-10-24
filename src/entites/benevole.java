/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entites;

/**
 *
 * @author Foued ben brahim
 */
public class benevole extends utilisateur {
private String activite;
private String experience;
private String type_benevolat;
private int montant_dons;

    public String getActivite() {
        return activite;
    }

    public void setActivite(String activite) {
        this.activite = activite;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public int getMontant_dons() {
        return montant_dons;
    }

    public void setMontant_dons(int montant_dons) {
        this.montant_dons = montant_dons;
    }

    public String getType_benevolat() {
        return type_benevolat;
    }

    public void setType_benevolat(String type_benevolat) {
        this.type_benevolat = type_benevolat;
    }

    public benevole(String cin, String nom, String prenom, String email, String motDePasse, String tel, String photo, String horaireDeTravail, String dateDebutConge, String dateretourConge, String type_user,String DateNaissance, String activite, String experience,int montant_dons, String type_benevolat) {
        super (cin,nom,prenom,email,motDePasse,tel,photo,horaireDeTravail,dateDebutConge,dateretourConge,type_user,DateNaissance);

        this.activite = activite;
        this.experience = experience;
        this.type_benevolat = type_benevolat;
        this.montant_dons = montant_dons;
    }

    @Override
    public String toString() {
        return super.toString()+"benevole{" + "activite=" + activite + ", experience=" + experience + ", type_benevolat=" + type_benevolat + ", montant_dons=" + montant_dons + '}';
    }
    
    




}
