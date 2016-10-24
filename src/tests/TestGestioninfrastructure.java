/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import DAO.implementation.GestionDepartements;
import DAO.implementation.GestionSalles;
import entites.Departement;
import entites.Salle;

/**
 *
 * @author Yahya
 */
public class TestGestioninfrastructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Salle s1=new Salle("ch5", 3, "urgence", "controle modifie");
               Salle s2=new Salle("ch1", 4, "churigie", "controle");

        GestionSalles gs=new GestionSalles();
      //  System.out.println(gs.ajouterSalle(s1));
       // System.out.println(gs.ajouterSalle(s2));
        //System.out.println(gs.modifierSalle(s1));
       //System.out.println(gs.supprimerSalle(s1));
        //for(Salle s :gs.listeSalle()){System.out.println(s);}
                GestionDepartements gd=new GestionDepartements();
               Departement d1=new Departement("adm1", "Administraition Fincanc", "Gestion Factures");
               Departement d2=new Departement("adm2", "Administraition medicaments", "Gestion medicamenet");
   // gd.ajouterDep(d1);
    //    gd.ajouterDep(d2);
       //gs.affecterSalleDepartement(s2, d1);
             //  gs.affecterSalleDepartement(s1, d1);
               //gd.lesSallesLesDepartements();
              // gd.modifierDep(d2);
//for(Departement d:gd.listeDepartements()){System.out.println(d);}
   //for(Salle x:gd.listeSalle(d1)){System.out.println(x);}
gd.lesSallesLesDepartements();
}
}