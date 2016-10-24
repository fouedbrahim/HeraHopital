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
public class Emploi {
    private int id_emploi ;
    private String nom_user ;
     private String date_deb_sem ;
     private String date_fin_sem ;
      private String type_user ;
    private String lundi ;
     private String mardi ;
      private String mercredi ;
       private String jeudi ;
        private String vendredi ;
         private String samedi ;
          private String dimanche ;
           private String lundiSoire ;
     private String mardiSoire ;
      private String mercrediSoire ;
       private String jeudiSoire ;
        private String vendrediSoire ;
         private String samediSoire ;
          private String dimancheSoire ;

    public Emploi(int id_emploi, String nom_user, String date_deb_sem, String date_fin_sem, String type_user, String lundi, String mardi, String mercredi, String jeudi, String vendredi, String samedi, String dimanche, String lundiSoire, String mardiSoire, String mercrediSoire, String jeudiSoire, String vendrediSoire, String samediSoire, String dimancheSoire) {
        this.id_emploi = id_emploi;
        this.nom_user = nom_user;
        this.date_deb_sem = date_deb_sem;
        this.date_fin_sem = date_fin_sem;
        this.type_user = type_user;
        this.lundi = lundi;
        this.mardi = mardi;
        this.mercredi = mercredi;
        this.jeudi = jeudi;
        this.vendredi = vendredi;
        this.samedi = samedi;
        this.dimanche = dimanche;
        this.lundiSoire = lundiSoire;
        this.mardiSoire = mardiSoire;
        this.mercrediSoire = mercrediSoire;
        this.jeudiSoire = jeudiSoire;
        this.vendrediSoire = vendrediSoire;
        this.samediSoire = samediSoire;
        this.dimancheSoire = dimancheSoire;
    }

    public int getId_emploi() {
        return id_emploi;
    }

    public void setId_emploi(int id_emploi) {
        this.id_emploi = id_emploi;
    }

    public String getNom_user() {
        return nom_user;
    }

    public void setNom_user(String nom_user) {
        this.nom_user = nom_user;
    }

    public String getDate_deb_sem() {
        return date_deb_sem;
    }

    public void setDate_deb_sem(String date_deb_sem) {
        this.date_deb_sem = date_deb_sem;
    }

    public String getDate_fin_sem() {
        return date_fin_sem;
    }

    public void setDate_fin_sem(String date_fin_sem) {
        this.date_fin_sem = date_fin_sem;
    }

    public String getType_user() {
        return type_user;
    }

    public void setType_user(String type_user) {
        this.type_user = type_user;
    }

    public String getLundi() {
        return lundi;
    }

    public void setLundi(String lundi) {
        this.lundi = lundi;
    }

    public String getMardi() {
        return mardi;
    }

    public void setMardi(String mardi) {
        this.mardi = mardi;
    }

    public String getMercredi() {
        return mercredi;
    }

    public void setMercredi(String mercredi) {
        this.mercredi = mercredi;
    }

    public String getJeudi() {
        return jeudi;
    }

    public void setJeudi(String jeudi) {
        this.jeudi = jeudi;
    }

    public String getVendredi() {
        return vendredi;
    }

    public void setVendredi(String vendredi) {
        this.vendredi = vendredi;
    }

    public String getSamedi() {
        return samedi;
    }

    public void setSamedi(String samedi) {
        this.samedi = samedi;
    }

    public String getDimanche() {
        return dimanche;
    }

    public void setDimanche(String dimanche) {
        this.dimanche = dimanche;
    }

    public String getLundiSoire() {
        return lundiSoire;
    }

    public void setLundiSoire(String lundiSoire) {
        this.lundiSoire = lundiSoire;
    }

    public String getMardiSoire() {
        return mardiSoire;
    }

    public void setMardiSoire(String mardiSoire) {
        this.mardiSoire = mardiSoire;
    }

    public String getMercrediSoire() {
        return mercrediSoire;
    }

    public void setMercrediSoire(String mercrediSoire) {
        this.mercrediSoire = mercrediSoire;
    }

    public String getJeudiSoire() {
        return jeudiSoire;
    }

    public void setJeudiSoire(String jeudiSoire) {
        this.jeudiSoire = jeudiSoire;
    }

    public String getVendrediSoire() {
        return vendrediSoire;
    }

    public void setVendrediSoire(String vendrediSoire) {
        this.vendrediSoire = vendrediSoire;
    }

    public String getSamediSoire() {
        return samediSoire;
    }

    public void setSamediSoire(String samediSoire) {
        this.samediSoire = samediSoire;
    }

    public String getDimancheSoire() {
        return dimancheSoire;
    }

    public void setDimancheSoire(String dimancheSoire) {
        this.dimancheSoire = dimancheSoire;
    }

   

    public Emploi() {
    }
          
          
          
         
    
    
    
}
