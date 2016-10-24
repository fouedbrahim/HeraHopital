/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yahya
 */
public class Departement {

    private String idDepartment;
    private String libelle;
    private String description;
    //private List<Salle> sallesDep= new ArrayList<Salle>();     
    public Departement() {
    }

    public Departement(String idDepartment, String libelle, String description) {
        this.idDepartment = idDepartment;
        this.libelle = libelle;
        this.description = description;
         
    }

    public String getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(String idDepartment) {
        this.idDepartment = idDepartment;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "departement{" + "idDepartment=" + idDepartment + ", libelle=" + libelle + ", description=" + description + '}';
    }
    
}
