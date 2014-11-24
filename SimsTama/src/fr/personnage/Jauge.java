/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.personnage;

/**
 *classe qui va contenir toutes les jauges de chaque etreVivant
 * @author isen
 */
public class Jauge {


    private String nom;
    private int max;
    private int valeur;
    
    public Jauge(String nom, int max, int valeur) {
       
        this.setNom(nom);
        this.setMax(max);
        this.setValeur(valeur);

    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the max
     */
    public int getMax() {
        return max;
    }

    /**
     * @param max the max to set
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * @return the valeur
     */
    public int getValeur() {
        return valeur;
    }

    /**
     * @param valeur the valeur to set
     */
    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    


}
