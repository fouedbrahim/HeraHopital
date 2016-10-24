/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.interfaces;

import entites.Salaire;
import entites.utilisateur;
import java.util.List;

/**
 *
 * @author Foued ben brahim
 */
public interface IDAOSalaire {
    
    public boolean Payer_salarier(Salaire m);
      public List<Salaire>listerSAlaire();
    public List<utilisateur>listerUtilisateursNonPaye();
    public Integer CalucleTotalSalaire(String cin, String mois, String annee) ;
    
   
    
}
