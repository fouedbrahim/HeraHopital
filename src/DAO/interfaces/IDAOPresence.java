/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO.interfaces;

import entites.Presence;
import entites.Salaire;
import java.util.List;

/**
 *
 * @author Foued ben brahim
 */
public interface IDAOPresence {
    
    
      public boolean enregistrerPresence(Presence m);
    public boolean ModifierPresence(Presence p);
     public List<Presence>listerPresence();
 public boolean SupprimerPresence(Presence p);
public Integer countAbsent();
public Integer countPresent();
 

}
