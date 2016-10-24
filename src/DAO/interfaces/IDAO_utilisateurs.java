/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO.interfaces;

import entites.Medecin;
import entites.administrateurs;
import entites.benevole;
import entites.patient;
import entites.stagiaire;
import entites.utilisateur;

import java.util.List;

/**
 *
 * @author Foued ben brahim
 */
public interface IDAO_utilisateurs {
 
    public boolean AjouterMedecin(Medecin m);
    public boolean AjouterAdmins(administrateurs a);
    public boolean AjouterBenevole(benevole b);
   public boolean AjouterPatient(patient p);
    public boolean AjouterStagiaire(stagiaire s);
  //  public boolean AjouterVisiteurs(visiteurs v);

    public boolean ModifierMedecin(Medecin m);
    public boolean ModifierAdmins(administrateurs m);
    public boolean ModifierBenevole(benevole m);
    public boolean ModifierPatient(patient p);
    public boolean ModifierStagiaire(stagiaire m);
   // public boolean ModifierVisiteurs(visiteurs m);
    
 
    public boolean SupprimerUtilsateur(utilisateur u);

   
    public List<Medecin>listerMedecin();
    public List<administrateurs>listerAdministrateurs() ;
    public List<benevole>listerBenevoles() ;
    public List<patient>listerPateints() ;
    public List<stagiaire>listerStagiaires() ;
   // public List<visiteurs>listerVisiteurs() ;
    public List<utilisateur>listerUtilisateurs() ;
    


    public void RechercherUtilisateurByCIN(String cin);
    


}
