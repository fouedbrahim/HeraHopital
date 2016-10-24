/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entites;

/**
 *
 * @author Foued ben brahim
 */
public class patient extends utilisateur {
    private String etat_patient ;
    private String type_paiment ;
    private String etat_facture_patient;
    //private String date_entree;
    //private String date_sortie;

    

    public String getEtat_facture_patient() {
        return etat_facture_patient;
    }

    public void setEtat_facture_patient(String etat_facture_patient) {
        this.etat_facture_patient = etat_facture_patient;
    }

    public String getEtat_patient() {
        return etat_patient;
    }

    public void setEtat_patient(String etat_patient) {
        this.etat_patient = etat_patient;
    }

    public String getType_paiment() {
        return type_paiment;
    }

    public void setType_paiment(String type_paiment) {
        this.type_paiment = type_paiment;
    }

    public patient(String cin, String nom, String prenom, String email, 
            String motDePasse, String tel, String photo, String horaireDeTravail,
            String dateDebutConge, String dateretourConge, String type_user,String DateNaissance,
            String etat_patient, String type_paiment, String etat_facture_patient) {
                super (cin,nom,prenom,email,motDePasse,tel,photo,horaireDeTravail,dateDebutConge,dateretourConge,type_user,DateNaissance);

        this.etat_patient = etat_patient;
        this.type_paiment = type_paiment;
        this.etat_facture_patient = etat_facture_patient;
        
    }



}
