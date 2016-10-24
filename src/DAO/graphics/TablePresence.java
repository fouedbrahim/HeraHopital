/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.graphics;

import DAO.implementation.GestionDePresenceDAO;
import entites.Presence;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Foued ben brahim
 */

public class  TablePresence extends AbstractTableModel{
    List<Presence>conge;
    
    String [] entete= {"Id_presence","nom","cin","date_abs","type_user","etat_pres","type_abs"};
   
    GestionDePresenceDAO congeDAO = new GestionDePresenceDAO();
    
    public  TablePresence()
    {
    conge =congeDAO.listerPresence();}
    
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
            return conge.get(rowIndex).getId_salaire();
             case 1 : 
            return conge.get(rowIndex).getNom();
                 case 2 : 
            return conge.get(rowIndex).getCin();
                     case 3 : 
            return conge.get(rowIndex).getDate_abs();
                         case 4 : 
            return conge.get(rowIndex).getType_user();
                             case 5 : 
            return conge.get(rowIndex).getEtat_pres();
                                 case 6 : 
            return conge.get(rowIndex).getType_abs();
                 default:
                     
                     return null;
    }
    
    
    

    }
public  String getColumnName(int colum){

return entete[colum];
}

}
    
