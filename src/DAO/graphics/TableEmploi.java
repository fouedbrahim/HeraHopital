/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.graphics;

import DAO.implementation.GestionDeEmploiDuTemps;
import DAO.implementation.GestionDePresenceDAO;
import entites.Emploi;
import entites.Presence;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Foued ben brahim
 */
public class TableEmploi extends AbstractTableModel {
    

 List<Emploi>conge;
    
    String [] entete= {"id_emloi","nom_user", "date_deb_sem","date_fin_sem", "type_user"};

    GestionDeEmploiDuTemps congeDAO = new GestionDeEmploiDuTemps();
    
    public  TableEmploi()
    {
    conge =congeDAO.listerEmploi();}

   
    
 @Override
    public int getRowCount() {
return conge.size();}

 @Override
    public int getColumnCount() {
return entete.length;
    
    }

 @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
//    Strin "mardi", "mardiSoire", "mercredi","mercrediSoire", "jeudi", "jeudiSoire", "vendredi", "vendrediSoire", "samedi", "samediSoire", "dimanche", "dimancheSoire"};

    switch(columnIndex){
        case 0 : 
            return conge.get(rowIndex).getId_emploi();
             case 1 : 
            return conge.get(rowIndex).getNom_user();
                 case 2 : 
            return conge.get(rowIndex).getDate_deb_sem();
                     case 3 : 
            return conge.get(rowIndex).getDate_fin_sem();
                            case 4 : 
            return conge.get(rowIndex).getType_user();
                         case 5 : 
                             
            return conge.get(rowIndex).getLundi();
                             case 6 : 
            return conge.get(rowIndex).getLundiSoire();
                                 case 7 : 
            return conge.get(rowIndex).getMardi();
                                       
                                 case 8 : 
            return conge.get(rowIndex).getMardiSoire();
                                      case 9 : 
            return conge.get(rowIndex).getMercredi();
                                               case 10 : 
            return conge.get(rowIndex).getMercrediSoire();
                                 case 11  : 
            return conge.get(rowIndex).getJeudi();
                                                case 12 : 
            return conge.get(rowIndex).getJeudiSoire();
                                                    case 13 : 
            return conge.get(rowIndex).getVendredi();
                                                     case 14 : 
            return conge.get(rowIndex).getVendrediSoire();
                                                          case 15 : 
            return conge.get(rowIndex).getSamedi();
                                                               case 16 : 
            return conge.get(rowIndex).getSamediSoire();
                                                                    case 17 : 
            return conge.get(rowIndex).getDimanche();
                                                                         case 18 : 
            return conge.get(rowIndex).getDimancheSoire();
                 default:
                     
                     return null;
    }
    
    
    

    }
 @Override
 public  String getColumnName(int colum){

return entete[colum];
}
}