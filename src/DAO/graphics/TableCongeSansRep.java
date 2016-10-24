/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.graphics;
   import DAO.implementation.GestionConge;
import entites.Conge;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Foued ben brahim
 */

    
  
public class TableCongeSansRep extends AbstractTableModel{
    List<Conge>conge;
    
    String [] entete= {"id_conge","Cin personnel","Email","Reponse Directeur"};
   
   GestionConge congeDAO = new GestionConge();
    
    public  TableCongeSansRep()
    {
    conge =congeDAO.listerCongeSansRep();}
    
    @Override
    public int getRowCount() {
return conge.size();}

    @Override
    public int getColumnCount() {
return entete.length;
    
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

    switch(columnIndex){
        case 0 : 
            return conge.get(rowIndex).getId_conge();
             case 1 : 
            return conge.get(rowIndex).getCin_user();
                 case 2 : 
            return conge.get(rowIndex).getEmail();
                     case 3 : 
            return conge.get(rowIndex).getRep_directeur();
                         case 4 : 
            return conge.get(rowIndex).getDate_deb_conge();
                             case 5 : 
            return conge.get(rowIndex).getDate_fin_conge();
                                 case 6 : 
            return conge.get(rowIndex).getRep_directeur();
                 default:
                     
                     return null;
    }
    
    
    

    }
public  String getColumnName(int colum){

return entete[colum];
}

}
    
