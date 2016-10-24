/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.implementation;

import DAO.interfaces.IGestionSalles;
import entites.Departement;
import entites.Salle;
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
 * @author Yahya
 */
public class GestionSalles implements IGestionSalles{
private Connection Connection;

    public GestionSalles() {
        Connection=MyConnexion.getInstance();
    }

    
    
    @Override
    public boolean ajouterSalle(Salle s) {
         String req ="insert into salles values (?,?,?,?,?)";
         int test=0;
    try {
        PreparedStatement ps=Connection.prepareStatement(req);
           ps.setString(1,s.getIdSalle());
           ps.setInt(2,s.getCapacite());
           ps.setString(3,s.getType());
           ps.setString(4,s.getDescription());
           ps.setString(5,"dep0");
      test=ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(GestionSalles.class.getName()).log(Level.SEVERE, null, ex);
    }
      return (test == 1);
    }

    @Override
    public boolean modifierSalle(Salle s) {
        String req ="update salles set capacite=?,type=?,description=? where idSalle=?";
         int test=0;
    try {
        PreparedStatement ps=Connection.prepareStatement(req);
           ps.setString(4,s.getIdSalle());
           ps.setInt(1,s.getCapacite());
           ps.setString(2,s.getType());
           ps.setString(3,s.getDescription());
      test=ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(GestionSalles.class.getName()).log(Level.SEVERE, null, ex);
    }
      return (test == 1);
    }

    @Override
    public boolean supprimerSalle(Salle s) {
        String req ="delete from salles where idSalle=?";
         int test=0;
    try {
        PreparedStatement ps=Connection.prepareStatement(req);
           ps.setString(1,s.getIdSalle());
          
      test=ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(GestionSalles.class.getName()).log(Level.SEVERE, null, ex);
    }
      return (test == 1);
    }

    @Override
    public List<Salle> listeSalle() {
      List<Salle> mesSalles= new ArrayList<Salle>();
        try{
        String req ="select * from salles";
 Statement st=Connection.createStatement();
      ResultSet rs=  st.executeQuery(req);
 while(rs.next())
 {
 Salle d=new Salle(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4));
   mesSalles.add(d);
 }
     }
 catch(SQLException ex){ex.printStackTrace();}
       return mesSalles;

    }

    @Override
    public boolean affecterSalleDepartement(Salle s, Departement d) {
         String req ="update salles set idDep=? where idSalle=?";
         int test=0;
    try {
        PreparedStatement ps=Connection.prepareStatement(req);
           ps.setString(2,s.getIdSalle());
         ps.setString(1,d.getIdDepartment());
           
      test=ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(GestionSalles.class.getName()).log(Level.SEVERE, null, ex);
    }
      return (test == 1);
    }

   
}
