/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.implementation;

import DAO.interfaces.IGestionDepartements;
import entites.Departement;
import entites.Salle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import technique.MyConnexion;

/**
 *
 * @author Yahya
 */
public class GestionDepartements implements IGestionDepartements{
private Connection Connection;

    public GestionDepartements() {
        Connection=MyConnexion.getInstance();
    }

    @Override
    public boolean ajouterDep(Departement s) {
        
        String req ="insert into departement values (?,?,?,'bloc0')";
         int test=0;
    try {
        PreparedStatement ps=Connection.prepareStatement(req);
           ps.setString(1,s.getIdDepartment());
            ps.setString(2,s.getLibelle());
            ps.setString(3,s.getDescription());

      test=ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(GestionSalles.class.getName()).log(Level.SEVERE, null, ex);
    }
      return (test == 1);
    }

    

    @Override
    public boolean modifierDep(Departement s) {
       
         String req ="update departement set libelle=?,description=? where id=?";
         int test=0;
    try {
        PreparedStatement ps=Connection.prepareStatement(req);
           ps.setString(3,s.getIdDepartment());
           ps.setString(1,s.getLibelle());
           ps.setString(2,s.getDescription());
      test=ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(GestionSalles.class.getName()).log(Level.SEVERE, null, ex);
    }
      return (test == 1);
        
    }

    @Override
    public boolean supprimerDep(Departement s) {
       
          String req ="update salles set idDep=? where idDep=?";
          String req1 ="delete departement where id=?";

         int test=0;
    try {
        PreparedStatement ps=Connection.prepareStatement(req);
           ps.setString(1,"dep0");
           ps.setString(2,s.getIdDepartment());
           ps.executeUpdate();
         PreparedStatement ps1=Connection.prepareStatement(req1);
           ps1.setString(1,s.getIdDepartment());
      test=ps1.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(GestionSalles.class.getName()).log(Level.SEVERE, null, ex);
    }
      return (test == 1);
        
        
    }

   
    

    @Override
    public List<Departement> listeDepartements() {
         List<Departement> mesDep= new ArrayList<Departement>();
        try{
        String req ="select * from departement";
 Statement st=Connection.createStatement();
      ResultSet rs=  st.executeQuery(req);
 while(rs.next())
 {
 Departement d=new Departement(rs.getString(1),rs.getString(2),rs.getString(3));
   mesDep.add(d);
 }
     }
 catch(SQLException ex){ex.printStackTrace();}
       return mesDep;
    }

     @Override
    public List<Salle> listeSalle(Departement d) {
         List<Salle> mesSalles= new ArrayList<Salle>();
       String req ="select idSalle,capacite,type,description from salles where idDep='"+d.getIdDepartment()+"'";
         try{
        
Statement st=Connection.createStatement();
      ResultSet rs= st.executeQuery(req);
          
 while(rs.next())
 {
 Salle s=new Salle(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4));
   mesSalles.add(s);
 }
     }
 catch(SQLException ex){ex.printStackTrace();}
       return mesSalles;

    }
    
    
    
    @Override
    public Map<Departement, List<Salle>> lesSallesDepartement() {
        Map<Departement, List<Salle>> listeSalDepComplete=new HashMap<Departement, List<Salle>>() ;
         
        for(Departement x :listeDepartements()){
 listeSalDepComplete.put(x,listeSalle(x));
 
         }
        
        
        return listeSalDepComplete;
    }

    @Override
    public void lesSallesLesDepartements() {
      // Map<Departement, List<Salle>> monMap=new TreeMap<Departement, List<Salle>>();
       
        //System.out.println("dsds");
       for(Map.Entry mp:lesSallesDepartement().entrySet()){
    System.out.println(mp.getKey()+" ==> ");
   for(Salle s :(List<Salle>) mp.getValue()){System.out.println(s);}
        
        }
    }
    
}
