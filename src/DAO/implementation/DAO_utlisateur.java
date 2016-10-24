/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO.implementation;

import entites.Medecin;
import entites.administrateurs;
import entites.benevole;
import entites.patient;
import entites.stagiaire;
//import entites.visiteurs;
import DAO.interfaces.IDAO_utilisateurs;
import entites.utilisateur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import technique.MyConnexion;

/**
 *
 * @author Foued ben brahim
 */
public class DAO_utlisateur implements IDAO_utilisateurs {



private Connection Connection;

    public DAO_utlisateur() {
        Connection=MyConnexion.getInstance();
    }

//    public void AjouterMedecin(Medecin m) {
//        String requet= "INSERT INTO `personnels`(`cin`, `nom`, `prenom`, `email`, `motDePasse`, `DateNaissance`, `tel`, `photo`, `type_user`, `date_debut_conge`, `date_retour_conge`, `horaire_de_travail`, `specialite`) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
//        try {PreparedStatement ps = connection.prepareStatement(requet);
//       ps.setString(0,m.getCin());
//       ps.setString(1,m.getNom());
//       ps.setString(2,m.getPrenom());
//       ps.setString(3,m.getEmail());
//       ps.setString(4,m.getMotDePasse());
//       ps.setString(5,m.getDateNaissance());
//       ps.setString(6,m.getTel());
//       ps.setString(7,m.getPhoto());
//       ps.setString(8,m.getType_user());
//       ps.setString(9,m.getDateDebutConge());
//       ps.setString(10,m.getDateretourConge());
//       ps.setString(11,m.getHoraireDeTravail());
//
//       ps.setString(12,m.getSpecalite());
//
//
//        ps.executeUpdate();
//        }
//        catch(SQLException ex)
//        {Logger.getLogger(DAO_utlisateur.class.getName()).log(Level.SEVERE,null,ex);}
//    }
//
// 

    @Override
    public boolean AjouterMedecin(Medecin m) {
               
      String req= "INSERT INTO `utlisateurs`(`cin`, `nom`, `prenom`, `email`, `motDePasse`, `tel`, `photo`, `type_user`, `DateNaissance`, `specialite`) values (?,?,?,?,?,?,?,?,?,?)";

       
         int test=0;
    try {
        PreparedStatement ps=Connection.prepareStatement(req);
       ps.setString(1,m.getCin());
       ps.setString(2,m.getNom());
       ps.setString(3,m.getPrenom());
       ps.setString(4,m.getEmail());
       ps.setString(5,m.getMotDePasse());
         
       ps.setString(6,m.getTel());
       ps.setString(7,m.getPhoto());
     
       ps.setString(8,m.getType_user());
       ps.setString(9,m.getDateNaissance());
       ps.setString(10,m.getSpecalite());
      test=ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(DAO_utlisateur.class.getName()).log(Level.SEVERE, null, ex);
    }
      return (test == 1);
    

    }

    @Override
    public boolean AjouterAdmins(administrateurs m) {

    String req= "INSERT INTO `utlisateurs`(`cin`, `nom`, `prenom`, `email`, `motDePasse`, `tel`, `photo`, `horaire_de_travail`, `date_debut_conge`, `date_retour_conge`, `type_user`, `DateNaissance`, `type_admin`) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";

       
         int test=0;
    try {
        PreparedStatement ps=Connection.prepareStatement(req);
       ps.setString(1,m.getCin());
       ps.setString(2,m.getNom());
       ps.setString(3,m.getPrenom());
       ps.setString(4,m.getEmail());
       ps.setString(5,m.getMotDePasse());
         
       ps.setString(6,m.getTel());
       ps.setString(7,m.getPhoto());
       ps.setString(8,m.getHoraireDeTravail());
       
       ps.setString(9,m.getDateDebutConge());
       ps.setString(10,m.getDateretourConge());
       ps.setString(11,m.getType_user());
       ps.setString(12,m.getDateNaissance());
       ps.setString(13,m.getType_admin());
      test=ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(DAO_utlisateur.class.getName()).log(Level.SEVERE, null, ex);
    }
      return (test == 1);
    }

    @Override
    public boolean AjouterBenevole(benevole m) {

    String req= "INSERT INTO `utlisateurs`(`cin`, `nom`, `prenom`, `email`, `motDePasse`, `tel`, `photo`, `horaire_de_travail`, `type_user`, `DateNaissance`,`activite`, `experience`, `montant_dons`, `type_benevolat`) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

       
         int test=0;
    try {
        PreparedStatement ps=Connection.prepareStatement(req);
       ps.setString(1,m.getCin());
       ps.setString(2,m.getNom());
       ps.setString(3,m.getPrenom());
       ps.setString(4,m.getEmail());
       ps.setString(5,m.getMotDePasse());
         
       ps.setString(6,m.getTel());
       ps.setString(7,m.getPhoto());
       ps.setString(8,m.getHoraireDeTravail());
       
   
       ps.setString(9,m.getType_user());
       ps.setString(10,m.getDateNaissance());
       ps.setString(11,m.getActivite());
        ps.setString(12,m.getExperience());
         ps.setInt(13,m.getMontant_dons());
          ps.setString(14,m.getType_benevolat());
      test=ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(DAO_utlisateur.class.getName()).log(Level.SEVERE, null, ex);
    }
      return (test == 1);
    }

    @Override
    public boolean AjouterPatient(patient m) {
String req= "INSERT INTO `utlisateurs`(`cin`, `nom`, `prenom`, `email`, `motDePasse`, `tel`, `photo`, `type_user`, `DateNaissance`,`etat_patient`, `etat_facture_patient`, `type_paiment`) values (?,?,?,?,?,?,?,?,?,?,?,?)";

       
         int test=0;
    try {
        PreparedStatement ps=Connection.prepareStatement(req);
       ps.setString(1,m.getCin());
       ps.setString(2,m.getNom());
       ps.setString(3,m.getPrenom());
       ps.setString(4,m.getEmail());
       ps.setString(5,m.getMotDePasse());
         
       ps.setString(6,m.getTel());
       ps.setString(7,m.getPhoto());
       
       
        ps.setString(8,m.getType_user());
       ps.setString(9,m.getDateNaissance());
       ps.setString(10,m.getEtat_patient());
        ps.setString(11,m.getEtat_facture_patient());
         ps.setString(12,m.getType_paiment());
          
         
          
       
      test=ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(DAO_utlisateur.class.getName()).log(Level.SEVERE, null, ex);
    }
      return (test == 1);
        }

    @Override
    public boolean AjouterStagiaire(stagiaire m) {
String req= "INSERT INTO `utlisateurs`(`cin`, `nom`, `prenom`, `email`, `motDePasse`, `tel`, `photo`, `horaire_de_travail`,`type_user`, `DateNaissance`,`date_debut_stage`, `date_fin_stage`, `specialite_stagaire`, `universite_stagaire`) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

       
         int test=0;
    try {
        PreparedStatement ps=Connection.prepareStatement(req);
       ps.setString(1,m.getCin());
       ps.setString(2,m.getNom());
       ps.setString(3,m.getPrenom());
       ps.setString(4,m.getEmail());
       ps.setString(5,m.getMotDePasse());
         
       ps.setString(6,m.getTel());
       ps.setString(7,m.getPhoto());
       ps.setString(8,m.getHoraireDeTravail());
       
        ps.setString(9,m.getType_user());
       ps.setString(10,m.getDateNaissance());
       ps.setString(11,m.getDate_debut_stage());
        ps.setString(12,m.getDate_fin_stage());
         ps.setString(13,m.getSpecialite());
          ps.setString(14,m.getUniversite());
       
      test=ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(DAO_utlisateur.class.getName()).log(Level.SEVERE, null, ex);
    }
      return (test == 1);
    
    }

  

   
    @Override
    public boolean SupprimerUtilsateur(utilisateur u) {
String req ="delete from utlisateurs where cin =?";
         int test=0;
    try {
        PreparedStatement ps=Connection.prepareStatement(req);
           ps.setString(1,u.getCin());
          
      test=ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(DAO_utlisateur.class.getName()).log(Level.SEVERE, null, ex);
    }
      return (test == 1);
    
    }

    @Override
    public List<Medecin> listerMedecin() {
 List<Medecin> mesMedecins= new ArrayList<Medecin>();
        try{
        String req ="select * from utlisateurs where type_user= 'Medecin'";
 Statement st=Connection.createStatement();
      ResultSet rs=  st.executeQuery(req);
 while(rs.next())
 {
 Medecin d=new Medecin(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13));
   mesMedecins.add(d);
 }
     }
 catch(SQLException ex){ex.printStackTrace();}
       return mesMedecins;
    }

    @Override
    
    public List<administrateurs> listerAdministrateurs() {
 List<administrateurs> mesAdmins= new ArrayList<administrateurs>();
        try{
        String req ="select * from utlisateurs where type_user= 'Admin'";
 Statement st=Connection.createStatement();
      ResultSet rs=  st.executeQuery(req);
 while(rs.next())
 {
 administrateurs d=new administrateurs(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(14));
   mesAdmins.add(d);
 }   
        
        }
        
        catch(SQLException ex){ex.printStackTrace();}
       return mesAdmins;
    }

    @Override
    public List<benevole> listerBenevoles() {
 List<benevole> mesbenevoles= new ArrayList<benevole>();
        try{
        String req ="select * from utlisateurs";
 Statement st=Connection.createStatement();
      ResultSet rs=  st.executeQuery(req);
 while(rs.next())
 {//verifier lordre 
 benevole d=new benevole(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(15),rs.getString(16),rs.getInt(17),rs.getString(18));
   mesbenevoles.add(d);
 }   
        
        }
        
        catch(SQLException ex){ex.printStackTrace();}
       return mesbenevoles;
    }    

    @Override
    public List<patient> listerPateints() {
        List<patient> mesPatients= new ArrayList<patient>();
        try{
        String req ="select * from utlisateurs";
 Statement st=Connection.createStatement();
      ResultSet rs=  st.executeQuery(req);
 while(rs.next())
 {
 patient d=new patient(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15));
   mesPatients.add(d);
 }
     }
 catch(SQLException ex){ex.printStackTrace();}
       return mesPatients;
    
    }

    @Override
    public List<stagiaire> listerStagiaires() {
List<stagiaire> mesStagiaires= new ArrayList<stagiaire>();
        try{
        String req ="select * from utlisateurs";
 Statement st=Connection.createStatement();
      ResultSet rs=  st.executeQuery(req);
 while(rs.next())
 {
 stagiaire d=new stagiaire(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18));
   mesStagiaires.add(d);
 }
     }
 catch(SQLException ex){ex.printStackTrace();}
       return mesStagiaires;
    
    }

  
        
      
    public void RechercherUtilisateurByCIN(String cin) {
List<utilisateur> mesmed= new ArrayList<utilisateur>();
        try{ 
        String req ="select * from utlisateurs where cin ='" + cin + "' ";
 Statement st=Connection.createStatement();
      ResultSet rs=  st.executeQuery(req);
 while(rs.next())
 {
 utilisateur d=new utilisateur(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12));
   mesmed.add(d);
   
 }
        }
        
        
         
        catch(SQLException ex){ex.printStackTrace();}
                  System.out.println(mesmed.toString());

    }    

        
    
    @Override
    public boolean ModifierMedecin(Medecin m) {
       String req ="UPDATE `utlisateurs` SET `nom`=?,`prenom`=?,`email`=?,`motDePasse`=?,`tel`=?,`photo`=?,`horaire_de_travail`=?,`date_debut_conge`=?,`date_retour_conge`=?,`type_user`=?,`DateNaissance`=?,`specialite`=? where cin=?";
         
       
       
       int test=0;
    try {
        PreparedStatement ps=Connection.prepareStatement(req);
          
           
      
       ps.setString(1,m.getNom());
       ps.setString(2,m.getPrenom());
       ps.setString(3,m.getEmail());
       ps.setString(4,m.getMotDePasse());
         
       ps.setString(5,m.getTel());
       ps.setString(6,m.getPhoto());
       ps.setString(7,m.getHoraireDeTravail());
       
       ps.setString(8,m.getDateDebutConge());
       ps.setString(9,m.getDateretourConge());
       ps.setString(10,m.getType_user());
       ps.setString(11,m.getDateNaissance());
       ps.setString(12,m.getSpecalite());
       ps.setString(13,m.getCin());
       
           
      test=ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(DAO_utlisateur.class.getName()).log(Level.SEVERE, null, ex);
    }
      return (test == 1);
    }

    @Override
    public boolean ModifierAdmins(administrateurs m) {
String req ="UPDATE `utlisateurs` SET `nom`=?,`prenom`=?,`email`=?,`motDePasse`=?,`tel`=?,`photo`=?,`horaire_de_travail`=?,`date_debut_conge`=?,`date_retour_conge`=?,`type_user`=?,`DateNaissance`=?,`type_admin`=? where cin=?";
         
       
       
       int test=0;
    try {
        PreparedStatement ps=Connection.prepareStatement(req);
          
           
      
       ps.setString(1,m.getNom());
       ps.setString(2,m.getPrenom());
       ps.setString(3,m.getEmail());
       ps.setString(4,m.getMotDePasse());
         
       ps.setString(5,m.getTel());
       ps.setString(6,m.getPhoto());
       ps.setString(7,m.getHoraireDeTravail());
       
       ps.setString(8,m.getDateDebutConge());
       ps.setString(9,m.getDateretourConge());
       ps.setString(10,m.getType_user());
       ps.setString(11,m.getDateNaissance());
       ps.setString(12,m.getType_admin());
       ps.setString(13,m.getCin());
       
           
      test=ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(DAO_utlisateur.class.getName()).log(Level.SEVERE, null, ex);
    }
      return (test == 1);
    }

    @Override
    public boolean ModifierBenevole(benevole m) {

    String req ="UPDATE `utlisateurs` SET `nom`=?,`prenom`=?,`email`=?,`motDePasse`=?,`tel`=?,`photo`=?,`horaire_de_travail`=?,`type_user`=?,`activite`=?, `experience`=?, `montant_dons`=?, `type_benevolat`=?,`DateNaissance`=? where cin=?";
         
       
       
       int test=0;
    try {
        PreparedStatement ps=Connection.prepareStatement(req);
          
           
      
        
       ps.setString(1,m.getNom());
       ps.setString(2,m.getPrenom());
       ps.setString(3,m.getEmail());
       ps.setString(4,m.getMotDePasse());
         
       ps.setString(5,m.getTel());
       ps.setString(6,m.getPhoto());
       ps.setString(7,m.getHoraireDeTravail());
       
   
       ps.setString(8,m.getType_user());
       ps.setString(9,m.getDateNaissance());
       ps.setString(10,m.getActivite());
        ps.setString(11,m.getExperience());
         ps.setInt(12,m.getMontant_dons());
          ps.setString(13,m.getType_benevolat());
         ps.setString(14,m.getCin());

          
       
           
      test=ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(DAO_utlisateur.class.getName()).log(Level.SEVERE, null, ex);
    }
      return (test == 1);
    
    }

    @Override
    public boolean ModifierPatient(patient p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ModifierStagiaire(stagiaire m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    @Override
    public List<utilisateur> listerUtilisateurs() {
List<utilisateur> mesUsers= new ArrayList<utilisateur>();
        try{
        String req ="select * from utlisateurs";
 Statement st=Connection.createStatement();
      ResultSet rs=  st.executeQuery(req);
 while(rs.next())
 {
 utilisateur d=new utilisateur(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12));
   mesUsers.add(d);
 }
     }
 catch(SQLException ex){ex.printStackTrace();}
       return mesUsers;
    
    }


 


}
