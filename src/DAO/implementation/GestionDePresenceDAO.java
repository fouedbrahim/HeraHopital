/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.implementation;

import DAO.interfaces.IDAOPresence;
import static com.lowagie.text.html.HtmlTags.I;
import entites.Presence;
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
public class GestionDePresenceDAO implements IDAOPresence{
private Connection Connection;

    public GestionDePresenceDAO() {
        Connection=MyConnexion.getInstance();
    }
    @Override
    public boolean enregistrerPresence(Presence s) {
String req ="INSERT INTO `presence` values (?,?,?,?,?,?,?)";
         int test=0;
    try {
        PreparedStatement ps=Connection.prepareStatement(req);
        ps.setInt(1,s.getId_salaire());
           ps.setString(2,s.getNom());
            ps.setString(3,s.getCin());
            ps.setString(4,s.getDate_abs());
             ps.setString(5,s.getType_user());
             ps.setString(6,s.getEtat_pres());
              ps.setString(7,s.getType_abs());
             
         

      test=ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(GestionDeEmploiDuTemps.class.getName()).log(Level.SEVERE, null, ex);
    }
      return (test == 1);
    
    
    
    }

    @Override
    public boolean ModifierPresence(Presence s) {
String req ="UPDATE `presence` SET `etat_pres`=?,`type_abs`=? where `Id_presence`=?";
         
       
       
       int test=0;
    try {
        PreparedStatement ps=Connection.prepareStatement(req);
          
             ps.setString(1,s.getEtat_pres());
              ps.setString(2,s.getType_abs());
              ps.setInt(3,s.getId_salaire());
           
      test=ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(GestionDePresenceDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
      return (test == 1);
    
    }

    @Override
    public List<Presence> listerPresence() {
List<Presence> messale= new ArrayList<Presence>();
        try{
        String req ="select * from Presence ";
 Statement st=Connection.createStatement();
      ResultSet rs=  st.executeQuery(req);
 while(rs.next())
 {
Presence d=new Presence(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
   messale.add(d);
 }   
        
        }
        
        catch(SQLException ex){ex.printStackTrace();}
       return messale;
    
    }

    @Override
    public boolean SupprimerPresence(Presence u) {
String req ="delete from presence where Id_presence =?";

         int test=0;
    try {
        PreparedStatement ps=Connection.prepareStatement(req);
           ps.setInt(1,u.getId_salaire());
          
      test=ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(GestionDePresenceDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
      return (test == 1);
    
    }

    @Override
    public Integer countAbsent() {
int test=0;
        try{
        String req ="select count(etat_pres) from presence where etat_pres='Absent'";
 Statement st=Connection.createStatement();

      ResultSet rs=  st.executeQuery(req);
 while(rs.next())
 { 
  test=(Integer)rs.getInt(1);
 }
     }
 catch(SQLException ex){ex.printStackTrace();}
      
return test;
    }
   
 
  

    @Override
    public Integer countPresent() {
  
       int test=0;
        try{
        String req ="select count(etat_pres) from presence where (etat_pres='Present')";
 Statement st=Connection.createStatement();

      ResultSet rs=  st.executeQuery(req);
 while(rs.next())
 { 
  test=(Integer)rs.getInt(1);
 }

     }
 catch(SQLException ex){ex.printStackTrace();}
      
return test;
    }
    

    
         

 
    
}
