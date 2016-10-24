/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.implementation;

import DAO.interfaces.IDAOStatGrh;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import technique.MyConnexion;

/**
 *
 * @author Foued ben brahim
 */
public class StatGrhDAO implements IDAOStatGrh{

    private Connection Connection;

    public StatGrhDAO() {
        Connection = MyConnexion.getInstance();
    }
    
    @Override
    public Integer countMEd() {
int test=0;
        try{
        String req ="select count(type_user) from utlisateurs where type_user ='Medecin' ";
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
    public Integer countSEC() {
int test=0;
        try{
        String req ="select count(type_user) from utlisateurs where type_user ='Secretaire' ";
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
    public Integer countStag() {
int test=0;
        try{
        String req ="select count(type_user) from utlisateurs where type_user ='Stagiare' ";
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
    public Integer countResponsablesRelationEXT() {
int test=0;
        try{
        String req ="select count(type_user) from utlisateurs where type_user ='Responsable relations' ";
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
    public Integer countDirecteurs() {
int test=0;
        try{
        String req ="select count(type_user) from utlisateurs where type_user ='Directeur' ";
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
    public Integer countPatients() {
int test=0;
        try{
        String req ="select count(type_user) from utlisateurs where type_user = 'Patient' ";
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
