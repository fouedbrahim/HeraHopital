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
public class Salle {

    private String idSalle;
    private int capacite;
    private String type;
       private String description;
    public Salle() {
    }

    public Salle(String idSalle, int capacite, String type,String description) {
        this.idSalle = idSalle;
        this.capacite = capacite;
        this.description = description;
        this.type = type;
    }

    public String getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(String idSalle) {
        this.idSalle = idSalle;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Salle{" + "idSalle=" + idSalle + ", capacite=" + capacite + ", type=" + type + ", description=" + description + '}';
    }

  
}
