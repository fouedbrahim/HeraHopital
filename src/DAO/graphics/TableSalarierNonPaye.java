/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.graphics;

import DAO.implementation.GestionDePaieDAO;
import entites.Salaire;
import entites.utilisateur;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Foued ben brahim
 */
public class TableSalarierNonPaye extends AbstractTableModel{
    




      List<utilisateur>sal;
    String [] entete= {"nom_salarier","cin_salarier","type_salarier","Email"};
   
   
  GestionDePaieDAO salDAO = new GestionDePaieDAO ();
    
    public  TableSalarierNonPaye()
    {
    sal =salDAO.listerUtilisateursNonPaye();}
    
    public int getRowCount() {
return sal.size();}

    @Override
    public int getColumnCount() {
return entete.length;
    
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

    switch(columnIndex){
        case 0 : 
            return sal.get(rowIndex).getNom();
             case 1 : 
            return sal.get(rowIndex).getCin();
                 case 2 : 
            return sal.get(rowIndex).getType_user();
                     case 3 : 
            return sal.get(rowIndex).getEmail();
                      
                    
                 default:
                     
                     return null;
    }
    
    
    

    }
public  String getColumnName(int colum){

return entete[colum];
}
}
