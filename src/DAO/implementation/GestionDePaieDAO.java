/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.implementation;

import DAO.interfaces.IDAOSalaire;
import entites.Salaire;
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
public class GestionDePaieDAO implements IDAOSalaire {
private Connection Connection;

    public GestionDePaieDAO() {
        Connection=MyConnexion.getInstance();
    }
    
    public boolean Payer_salarier(Salaire s) {
String req ="INSERT INTO `salaire`(`id_salaire`, `cin_salarier`, `nom_salarier`, `nbr_h_travail_Norm`, `nbr_h_travail_Extra`, `salaire_Net`, `Prime_Rendement`, `num_compte_bank`, `Type_sal`, `Mois`, `annee`) Values (?,?,?,?,?,?,?,?,?,?,?)";
         int test=0;
    try {//(`id_salaire`, `cin_salarier`, `nom_salarier`, `nbr_h_travail_Norm`, `nbr_h_travail_Extra`, `salaire_Net`, `Prime_Rendement`, `num_compte_bank`)
        PreparedStatement ps=Connection.prepareStatement(req);
           ps.setInt(1,s.getId_salaire());
            ps.setString(2,s.getCin_salarier());
            ps.setString(3,s.getNom_salarier());
             ps.setInt(4,s.getNbr_h_travail_Norm());
             ps.setInt(5,s.getNbr_h_travail_Extra());
             ps.setInt(6,s.getSalaire_Net());
           
              ps.setInt(7,s.getPrime_Rendement());
              ps.setInt(8,s.getNum_compte_bank());
              
            ps.setString(9,s.getType_sal());
            ps.setString(10,s.getMois());
            ps.setString(11,s.getAnnee());
              
            
              
               
      test=ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(GestionDePaieDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
      return (test == 1);
    
    
    }

    @Override
    public List<Salaire> listerSAlaire() {

    List<Salaire> messale= new ArrayList<Salaire>();
        try{
        String req ="select * from salaire ";
 Statement st=Connection.createStatement();
      ResultSet rs=  st.executeQuery(req);
 while(rs.next())
 {
Salaire d=new Salaire(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getString(9),rs.getString(10),rs.getString(11));
   messale.add(d);
 }   
        
        }
        
        catch(SQLException ex){ex.printStackTrace();}
       return messale;
    }

    @Override
    public List<utilisateur> listerUtilisateursNonPaye() {
    List<utilisateur> mesmed= new ArrayList<utilisateur>();
        try{ 
        String req ="select * from utlisateurs where Type_user in('Medecin','Secretaire','Directeur','Reponsable Relation avc ext','Inferimier')   ";
 Statement st=Connection.createStatement();
      ResultSet rs=  st.executeQuery(req);
 while(rs.next())
 {
 utilisateur d=new utilisateur(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
   mesmed.add(d);
   
 }
        }
        
        
         
        catch(SQLException ex){ex.printStackTrace();}
                  System.out.println(mesmed.toString());
                  return mesmed;

    }

    @Override
    public Integer CalucleTotalSalaire(String cin, String mois, String annee) {
int test=0;

        try{
      String req ="SELECT `salaire_Net` +  `Prime_Rendement` + (`nbr_h_travail_Extra` *5) FROM salaire WHERE  `cin_salarier` =  '"+cin+"' AND  `Mois` = '"+mois+"' AND  `annee` =  '"+annee+"'";

            Statement st=Connection.createStatement();

      ResultSet rs=  st.executeQuery(req);
 while(rs.next())
 { 
  test=(Integer)rs.getInt(1);
 // d=rs.getString(1);
  
 }

     }
 catch(SQLException ex){ex.printStackTrace();}
      
return test;
           
      //  return Integer.parseInt(d);
        
      
        }
    
    

    
}
