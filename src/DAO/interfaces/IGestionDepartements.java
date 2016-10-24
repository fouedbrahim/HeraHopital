/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.interfaces;

import entites.Departement;
import entites.Salle;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Yahya
 */
public interface IGestionDepartements {
   public boolean ajouterDep(Departement s);
   public boolean modifierDep(Departement s);
   public boolean supprimerDep(Departement s);
   
public List<Departement> listeDepartements();
   public Map<Departement, List<Salle>> lesSallesDepartement();//=new TreeMap<Departement, List<Salle>>();
    public void lesSallesLesDepartements();
        public List<Salle> listeSalle(Departement d);

}
