/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entites;

/**
 *
 * @author Foued ben brahim
 */
public class administrateurs extends utilisateur {
private String type_admin;

    public administrateurs(String type_admin, String cin, String nom, String prenom, String email, String motDePasse, String tel, String DateNaissance, String photo, String type_user) {
        super(cin, nom, prenom, email, motDePasse, tel, DateNaissance, photo, type_user);
        this.type_admin = type_admin;
    }

    public String getType_admin() {
        return type_admin;
    }

    public void setType_admin(String type_admin) {
        this.type_admin = type_admin;
    }

   
    

}
