/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.interfaces;

import entites.Conge;
import java.util.List;

/**
 *
 * @author Foued ben brahim
 */
public interface IDAOConge {
    
    public boolean AjouteConge(Conge c);
     public boolean Reponse_conge(Conge c);
      public List<Conge>listerCongeSansRep();
       public List<Conge>listerCongeRefusee();
        public List<Conge>listerCongeAccepte();
  public boolean SupprimerConge(String cin);
      public void RechercherCongeByCIN(String cin);
      public boolean SupprimerDemandeConge(Conge u);
      public Integer countCongeAccpte();
      public Integer countCongeRefuse();
      public Integer countCongeSansRep();
}
