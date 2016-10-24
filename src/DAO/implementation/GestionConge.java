/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.implementation;

import DAO.interfaces.IDAOConge;
import entites.Conge;
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
public class GestionConge implements IDAOConge {

    private Connection Connection;

    public GestionConge() {
        Connection = MyConnexion.getInstance();
    }

    @Override
    public boolean AjouteConge(Conge s) {


    String req ="INSERT INTO `conge` VALUES (?,?,?,?,?,?,?,?)";
         int test=0;
    try {
        PreparedStatement ps=Connection.prepareStatement(req);
           ps.setInt(1,s.getId_conge());
            ps.setString(2,s.getNom_user());
            ps.setString(3,s.getCin_user());
             ps.setString(4,s.getType_user());
             ps.setString(5,s.getDate_deb_conge());
             ps.setString(6,s.getDate_fin_conge());
             ps.setString(7,"Pas de reponse");
             ps.setString(8,s.getEmail());
              
           
             
              
   
      test=ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(GestionConge.class.getName()).log(Level.SEVERE, null, ex);
    }
      return (test == 1);
    
    }

    @Override
    public boolean Reponse_conge(Conge s) {

    String req ="UPDATE `conge` SET `date_deb_conge`=?,`date_fin_conge`=?,`Rep_directeur`=? where `id_conge`=?";
         
       
       
       int test=0;
    try {
        PreparedStatement ps=Connection.prepareStatement(req);
          
             ps.setString(1,s.getDate_deb_conge());
              ps.setString(2,s.getDate_fin_conge());
              ps.setString(3,s.getRep_directeur());
              ps.setInt(4,s.getId_conge());
           
      test=ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(GestionConge.class.getName()).log(Level.SEVERE, null, ex);
    }
      return (test == 1);
    }

    @Override
    public List<Conge> listerCongeSansRep() {

        List<Conge> mesConge = new ArrayList<Conge>();
        try {
            String req = "select * from conge where Rep_directeur = 'Pas de reponse'";
            Statement st = Connection.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                Conge d = new Conge(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
                mesConge.add(d);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return mesConge;

    }

    @Override
    public boolean SupprimerConge(String cin) {
Conge c = new Conge();
        String req ="delete from conge where cin_user =?";
         int test=0;
    try {
        PreparedStatement ps=Connection.prepareStatement(req);
           ps.setString(1,c.getCin_user());
          
      test=ps.executeUpdate();
      
    } catch (SQLException ex) {
        Logger.getLogger(GestionConge.class.getName()).log(Level.SEVERE, null, ex);
    }
      return (test == 1);
    
    
    }

    @Override
    public void RechercherCongeByCIN(String cin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Conge> listerCongeRefusee() {
        List<Conge> mesConge = new ArrayList<Conge>();
        try {
            String req = "select * from conge where Rep_directeur = 'non accepte'";
            Statement st = Connection.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                Conge d = new Conge(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
                mesConge.add(d);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return mesConge;

    }

    @Override
    public List<Conge> listerCongeAccepte() {
        List<Conge> mesConge = new ArrayList<Conge>();
        try {
            String req = "select * from conge where Rep_directeur = 'accepte'";
            Statement st = Connection.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                Conge d = new Conge(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
                mesConge.add(d);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return mesConge;

    }

    public boolean SupprimerDemandeConge(Conge u) {
String req ="DELETE FROM conge WHERE  id_conge =?";

         int test=0;
    try {
        PreparedStatement ps=Connection.prepareStatement(req);
           ps.setInt(1,u.getId_conge());
          
      test=ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(GestionConge.class.getName()).log(Level.SEVERE, null, ex);
    }
      return (test == 1);
    
    }

    @Override
    public Integer countCongeAccpte() {
int test=0;
        try{
        String req ="select count(Rep_directeur) from conge where Rep_directeur ='accepte' ";
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
    public Integer countCongeRefuse() {
int test=0;
        try{
        String req ="select count(Rep_directeur) from conge where Rep_directeur ='non accepte' ";
 Statement st=Connection.createStatement();

      ResultSet rs=  st.executeQuery(req);
 while(rs.next())
 { 
  test=(Integer)rs.getInt(1);
 }

     }
 catch(SQLException ex){ex.printStackTrace();}
      
return test;    }

    @Override
    public Integer countCongeSansRep() {

    int test=0;
        try{
        String req ="select count(Rep_directeur) from conge where Rep_directeur ='Pas de reponse' ";
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
