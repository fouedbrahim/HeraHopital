/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

/**
 *
 * @author Yahya
 */
public class Bloc {
     private String idbloc;
    private String libelle;
    private String dateConstruction; 
    private String description;

    public Bloc() {
    }

    public Bloc(String idbloc, String libelle, String dateConstruction, String description) {
        this.idbloc = idbloc;
        this.libelle = libelle;
        this.dateConstruction = dateConstruction;
        this.description = description;
    }

    public String getIdbloc() {
        return idbloc;
    }

    public void setIdbloc(String idbloc) {
        this.idbloc = idbloc;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDateConstruction() {
        return dateConstruction;
    }

    public void setDateConstruction(String dateConstruction) {
        this.dateConstruction = dateConstruction;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "bloc{" + "idbloc=" + idbloc + ", libelle=" + libelle + ", dateConstruction=" + dateConstruction + ", description=" + description + '}';
    }
    
}
