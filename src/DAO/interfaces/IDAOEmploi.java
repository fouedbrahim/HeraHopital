/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.interfaces;

import entites.Emploi;
import java.util.List;


/**
 *
 * @author Foued ben brahim
 */
public interface IDAOEmploi {
    public boolean Ajouteremploi(Emploi m);
    public boolean ModifierEmploi(Emploi m);
     public List<Emploi>listerEmploi();
 // public boolean SupprimerEmploi(int id );
      public boolean SupprimerEmploi(Emploi p);
}
