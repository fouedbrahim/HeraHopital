/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.implementation;

import DAO.interfaces.IDAOEmploi;
import entites.Emploi;
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
public class GestionDeEmploiDuTemps implements IDAOEmploi{
private Connection Connection;

    public GestionDeEmploiDuTemps() {
        Connection=MyConnexion.getInstance();
    }
    @Override
    public boolean Ajouteremploi(Emploi s) {
 String req ="INSERT INTO `emploi` values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
         int test=0;
    try {
        PreparedStatement ps=Connection.prepareStatement(req);
        ps.setInt(1,s.getId_emploi());
           ps.setString(2,s.getNom_user());
            ps.setString(3,s.getDate_deb_sem());
            ps.setString(4,s.getDate_fin_sem());
             ps.setString(5,s.getType_user());
             ps.setString(6,s.getLundi());
              ps.setString(7,s.getLundiSoire());
              ps.setString(8,s.getMardi());
               ps.setString(9,s.getMardiSoire());
               ps.setString(10,s.getMercredi());
                ps.setString(11,s.getMercrediSoire());
              
                ps.setString(12,s.getJeudi());
                 ps.setString(13,s.getJeudiSoire());
                 ps.setString(14,s.getVendredi());
                  ps.setString(15,s.getVendrediSoire());
                  ps.setString(16,s.getSamedi());
                  ps.setString(17, s.getSamediSoire());
                   ps.setString(18,s.getDimanche());
                    ps.setString(19,s.getDimancheSoire());

      test=ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(GestionDeEmploiDuTemps.class.getName()).log(Level.SEVERE, null, ex);
    }
      return (test == 1);
    
    
    }

    @Override
    public boolean ModifierEmploi(Emploi s) {
 String req ="UPDATE `emploi` SET `nom_user`=?,`date_deb_sem`=?,`date_fin_sem`=?,`type_user`=?,`lundi`=?,`lundiSoire`=?,`mardi`=?,`mardiSoire`=?,`mercredi`=?,`mercrediSoire`=?,`jeudi`=?,`jeudiSoire`=?,`vendredi`=?,`vendrediSoire`=?,`samedi`=?,`samediSoire`=?,`dimanche`=?,`dimancheSoire`=?  where id_emloi=?";
       
       
       
       int test=0;
    try {
        PreparedStatement ps=Connection.prepareStatement(req);
          
           
      

           ps.setString(1,s.getNom_user());
            ps.setString(2,s.getDate_deb_sem());
            ps.setString(3,s.getDate_fin_sem());
             ps.setString(4,s.getType_user());
             ps.setString(5,s.getLundi());
              ps.setString(6,s.getLundiSoire());
              ps.setString(7,s.getMardi());
               ps.setString(8,s.getMardiSoire());
               ps.setString(9,s.getMercredi());
                ps.setString(10,s.getMercrediSoire());
              
                ps.setString(11,s.getJeudi());
                 ps.setString(12,s.getJeudiSoire());
                 ps.setString(13,s.getVendredi());
                  ps.setString(14,s.getVendrediSoire());
                  ps.setString(15,s.getSamedi());
                  ps.setString(16, s.getSamediSoire());
                   ps.setString(17,s.getDimanche());
                    ps.setString(18,s.getDimancheSoire());
                    ps.setInt(19,s.getId_emploi());
                    
      test=ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(DAO_utlisateur.class.getName()).log(Level.SEVERE, null, ex);
    }
      return (test == 1);
    
    
    }

    @Override
    public List<Emploi> listerEmploi() {
 List<Emploi> mesConge = new ArrayList<Emploi>();
        try {
            String req = "select * from emploi";
            Statement st = Connection.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                Emploi d = new Emploi(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13),rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19));
                mesConge.add(d);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return mesConge;

    }

    @Override
    public boolean SupprimerEmploi(Emploi u) {
String req ="delete from emploi where id_emloi =?";

         int test=0;
    try {
        PreparedStatement ps=Connection.prepareStatement(req);
           ps.setInt(1,u.getId_emploi());
          
      test=ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(GestionDeEmploiDuTemps.class.getName()).log(Level.SEVERE, null, ex);
    }
      return (test == 1);
        }
    
    }


//    public boolean SupprimerEmploi(int id) {
//
//}
    

