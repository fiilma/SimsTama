/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.personnage;

/**
 *classe qui est utilisée pour former la liste de contact d'une personne ainsi que sa jauge relationnelle avec cette personne
 * @author isen
 */
public class Relationnelle {
    
    
    private int id;
    private int jaugeRelationnelle = 1;
    
    public Relationnelle(int id){
        this.id = id;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the jaugeRelationnelle
     */
    public int getJaugeRelationnelle() {
        return jaugeRelationnelle;
    }

    /**
     * @param jaugeRelationnelle the jaugeRelationnelle to set
     */
    public void setJaugeRelationnelle(int jaugeRelationnelle) {
        this.jaugeRelationnelle = jaugeRelationnelle;
    }
    
}
