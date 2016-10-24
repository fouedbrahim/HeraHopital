/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.graphics;

import DAO.implementation.GestionConge;
import DAO.implementation.GestionDePaieDAO;

import entites.Salaire;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Foued ben brahim
 */
public class TableSalaire extends AbstractTableModel{
      List<Salaire>sal;
    String [] entete= {"id_salaire","cin_salarier","nom_salarier","nbr_h_travail_Norm","nbr_h_travail_Extra","salaire_Net","Prime_Rendement","num_compte_bank","type_salarier","mois","annee"};
   
  GestionDePaieDAO salDAO = new GestionDePaieDAO ();
    
    public  TableSalaire()
    {
    sal =salDAO.listerSAlaire();}
    
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
            return sal.get(rowIndex).getId_salaire();
             case 1 : 
            return sal.get(rowIndex).getCin_salarier();
                 case 2 : 
            return sal.get(rowIndex).getNom_salarier();
                     case 3 : 
            return sal.get(rowIndex).getNbr_h_travail_Norm();
                         case 4 : 
            return sal.get(rowIndex).getNbr_h_travail_Extra();
                             case 5 : 
            return sal.get(rowIndex).getSalaire_Net();// a completer !!!!!!!!
                                 case 6 : 
            return sal.get(rowIndex).getPrime_Rendement();
                                     case 7 : 
            return sal.get(rowIndex).getNum_compte_bank();
                                         case 8 : 
            return sal.get(rowIndex).getType_sal();
                                                case 9 : 
            return sal.get(rowIndex).getMois();
                                                       case 10 : 
            return sal.get(rowIndex).getAnnee();
                 default:
                     
                     return null;
    }
    
    
    

    }
public  String getColumnName(int colum){

return entete[colum];
}
}
