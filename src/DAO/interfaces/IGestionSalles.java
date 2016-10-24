/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.interfaces;

import entites.Departement;
import entites.Salle;
import java.util.List;


/**
 *
 * @author Yahya
 */
public interface IGestionSalles {
   public boolean ajouterSalle(Salle s);
   public boolean modifierSalle(Salle s);
   public boolean supprimerSalle(Salle s);
   public boolean affecterSalleDepartement(Salle s, Departement d);
   public List<Salle> listeSalle();

}
