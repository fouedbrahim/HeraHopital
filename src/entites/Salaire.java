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
public class Salaire {
     private int id_salaire;
       private String cin_salarier;
          private String nom_salarier ;
             private int nbr_h_travail_Norm ;
                 private int  nbr_h_travail_Extra ;
               private int  salaire_Net;
                  private int Prime_Rendement;
                 private int  num_compte_bank;
               private String  Type_sal ;
               private String Mois ;
               private String Annee ;
            

    public Salaire(int id_salaire, String cin_salarier, String nom_salarier, int nbr_h_travail_Norm, int nbr_h_travail_Extra, int salaire_Net, int Prime_Rendement, int num_compte_bank, String Type_sal, String Mois, String Annee ) {
        this.id_salaire = id_salaire;
        this.cin_salarier = cin_salarier;
        this.nom_salarier = nom_salarier;
        this.nbr_h_travail_Norm = nbr_h_travail_Norm;
        this.nbr_h_travail_Extra = nbr_h_travail_Extra;
        this.salaire_Net = salaire_Net;
        this.Prime_Rendement = Prime_Rendement;
        this.num_compte_bank = num_compte_bank;
        this.Type_sal = Type_sal;
        this.Mois = Mois;
        this.Annee = Annee;
        
    }

    public Salaire() {}

    public int getId_salaire() {
        return id_salaire;
    }

    public void setId_salaire(int id_salaire) {
        this.id_salaire = id_salaire;
    }

    public String getCin_salarier() {
        return cin_salarier;
    }

    public void setCin_salarier(String cin_salarier) {
        this.cin_salarier = cin_salarier;
    }

    public String getNom_salarier() {
        return nom_salarier;
    }

    public void setNom_salarier(String nom_salarier) {
        this.nom_salarier = nom_salarier;
    }

    public int getNbr_h_travail_Norm() {
        return nbr_h_travail_Norm;
    }

    public void setNbr_h_travail_Norm(int nbr_h_travail_Norm) {
        this.nbr_h_travail_Norm = nbr_h_travail_Norm;
    }

    public int getNbr_h_travail_Extra() {
        return nbr_h_travail_Extra;
    }

    public void setNbr_h_travail_Extra(int nbr_h_travail_Extra) {
        this.nbr_h_travail_Extra = nbr_h_travail_Extra;
    }

    public int getSalaire_Net() {
        return salaire_Net;
    }

    public void setSalaire_Net(int salaire_Net) {
        this.salaire_Net = salaire_Net;
    }

    public int getPrime_Rendement() {
        return Prime_Rendement;
    }

    public void setPrime_Rendement(int Prime_Rendement) {
        this.Prime_Rendement = Prime_Rendement;
    }

    public int getNum_compte_bank() {
        return num_compte_bank;
    }

    public void setNum_compte_bank(int num_compte_bank) {
        this.num_compte_bank = num_compte_bank;
    }

    public String getType_sal() {
        return Type_sal;
    }

    public void setType_sal(String Type_sal) {
        this.Type_sal = Type_sal;
    }

    public String getMois() {
        return Mois;
    }

    public void setMois(String Mois) {
        this.Mois = Mois;
    }

    public String getAnnee() {
        return Annee;
    }

    public void setAnnee(String Annee) {
        this.Annee = Annee;
    }

    
   

   

   
                 
}
