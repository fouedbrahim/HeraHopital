/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entites;

/**
 *
 * @author Foued ben brahim
 */
public class Medecin extends utilisateur {
    
    private String specalite ;

    public Medecin(String specalite, String cin, String nom, String prenom, String email, String motDePasse, String tel, String DateNaissance, String photo, String type_user) {
        super(cin, nom, prenom, email, motDePasse, tel, DateNaissance, photo, type_user);
        this.specalite = specalite;
    }

    public String getSpecalite() {
        return specalite;
    }

    public void setSpecalite(String specalite) {
        this.specalite = specalite;
    }

    

  


    

    
    
    





   
}
