/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import DAO.implementation.DAO_utlisateur;
import DAO.implementation.GestionDeEmploiDuTemps;
import DAO.implementation.GestionDePaieDAO;
import entites.Emploi;
import entites.Medecin;
import entites.administrateurs;
import entites.benevole;
import entites.patient;
import entites.stagiaire;
import entites.visiteurs;


/**
 *
 * @author Foued ben brahim
 */
public class test 
{
    public static void main(String[] args) {
      

        Medecin med1 = new Medecin("09773351","brahim","foued","foued@esprit.tn","1234","22207556","foued.jpg","9h a 18h","01/02/2015", "01/03/2015","medecin","13/06/1991","cardiologue");
        Medecin med2 = new Medecin("09773351","brahim","asma","foued@esprit.tn","1234","22207556","foued.jpg","9h a 18h","01/02/2015", "01/03/2015","medecin","13/06/1991","cardiologue");

        administrateurs admin1 = new administrateurs("09773352","alya","issam","issam@esprit.tn","1235","22207532","issam.jpg","9h a 18h","01/02/2015", "01/03/2015","admin","13/06/1991","admin finance");
        administrateurs admin2 = new administrateurs("09773352","ines","issam","issam@esprit.tn","1235","22207532","issam.jpg","9h a 18h","01/02/2015", "01/03/2015","admin","13/06/1991","admin finance");

        benevole benev1 = new benevole("09773000","kamel","med","kamel@esprit.tn","1215","98207532","kamel.jpg","13h a 15h",null,null,"benevole","13/06/1991","aide malades","4 ans ",500,"tous les types");
        benevole benev2 = new benevole("09773000","mehdi","med","kamel@esprit.tn","1215","98207532","kamel.jpg","13h a 15h",null,null,"benevole","13/06/1991","aide malades","4 ans ",500,"tous les types");

        stagiaire stg1 = new stagiaire("09443005","mourad","ali","mourad@esprit.tn","1515","98207442","mourad.jpg","13h a 15h",null,null,"stagiaire","13/06/1991","15/07/2014","15/08/2104","cardio","medecine Tunis");
         patient pat1 = new patient("35023005","bilel","bolbol","bilel@esprit.tn","12344","33207442","bilel.jpg",null,null,null,"patient","11/06/1995","jambe cassé","cheque","non payé");
         visiteurs vis1 = new visiteurs("35023795","khalil","othmen","khalil@esprit.tn","11344","22407442","khalil.jpg",null,null,null,"visiteur","11/07/1995","15/04/2104","ali msallem");
       //  Emploi empl1 = new Emploi("test1", "a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a",null);
        
        DAO_utlisateur gu = new DAO_utlisateur();
        GestionDeEmploiDuTemps em = new GestionDeEmploiDuTemps();
        try {
            
// gu.AjouterMedecin(med1);
//            for(Medecin ss :gu.listerMedecin()){System.out.println(ss);}
//           gu.AjouterAdmins(admin1);
//            for(administrateurs ss :gu.listerAdministrateurs()){System.out.println(ss);}
//           gu.AjouterBenevole(benev1);
//            for(benevole ss :gu.listerBenevoles()){System.out.println(ss);}
//            gu.AjouterStagiaire(stg1);
//            gu.AjouterPatient(pat1);
            //gu.AjouterVisiteurs(vis1);
            //System.out.println(gu.SupprimerUtilsateur(med1));
                  //  System.out.println(gu.ModifierMedecin(med2));
              // System.out.println(gu.ModifierAdmins(admin2));
            // System.out.println(gu.ModifierBenevole(benev2));
           //  gu.RechercherUtilisateurByCIN("09773351");

//em.Ajouteremploi(empl1);
         GestionDePaieDAO gp =new GestionDePaieDAO();  
            System.out.println(gp.CalucleTotalSalaire("12345678","Mars","2015"));
            
            
            
            
        } catch (Exception e) {
            System.out.println("pb");
            System.out.println(e);
        }
        
       //System.out.println(gu.AjouterMedecin(m1));
      
        
    }
    
    
    
    
    }
    

