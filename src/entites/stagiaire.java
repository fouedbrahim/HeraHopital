/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entites;

/**
 *
 * @author Foued ben brahim
 */
public class stagiaire extends utilisateur {
    private String universite ;
    private String specialite;
    private String date_debut_stage;
    private String date_fin_stage;

    public String getDate_debut_stage() {
        return date_debut_stage;
    }

    public void setDate_debut_stage(String date_debut_stage) {
        this.date_debut_stage = date_debut_stage;
    }

    public String getDate_fin_stage() {
        return date_fin_stage;
    }

    public void setDate_fin_stage(String date_fin_stage) {
        this.date_fin_stage = date_fin_stage;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getUniversite() {
        return universite;
    }

    public void setUniversite(String universite) {
        this.universite = universite;
    }

    public stagiaire(String cin, String nom, String prenom, String email, String motDePasse, 
            String tel, String photo, String horaireDeTravail, String dateDebutConge, String dateretourConge,
            String type_user,String DateNaissance, 
            String date_debut_stage, String date_fin_stage,String specialite,String universite) {
                       super (cin,nom,prenom,email,motDePasse,tel,photo,horaireDeTravail,dateDebutConge,dateretourConge,type_user,DateNaissance);

        this.universite = universite;
        this.specialite = specialite;
        this.date_debut_stage = date_debut_stage;
        this.date_fin_stage = date_fin_stage;
    }





}
