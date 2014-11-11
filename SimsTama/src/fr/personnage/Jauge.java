/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.personnage;

/**
 *
 * @author isen
 */
public class Jauge {

    private int jaugeGentillesse;
    private int jaugeProprete;
    private int jaugeFaim;
    private int jaugeHumeur;
    private int jaugeFatigue;
    private int jaugeIntelligence;
    private int jaugeForce;
    private int jaugeCharme;
    private int jaugeAbilite;

    public void Jauge() {
        jaugeGentillesse = 5;
        jaugeProprete = 10;
        jaugeFaim = 10;
        jaugeHumeur = 5;
        jaugeFatigue = 10;
        jaugeIntelligence = 0;
        jaugeForce = 0;
        jaugeCharme = 5;
        jaugeAbilite = 0;
    }

    

    public void allerAuxToilettes() {
        this.jaugeProprete += 2;
    }

    public int getJaugeGentillesse() {
        return jaugeGentillesse;
    }

    public void setJaugeGentillesse(int jaugeGentillesse) {
        this.jaugeGentillesse = jaugeGentillesse;
    }

    public int getJaugeProprete() {
        return jaugeProprete;
    }

    public void setJaugeProprete(int jaugeProprete) {
        this.jaugeProprete = jaugeProprete;
    }

    public int getJaugeFaim() {
        return jaugeFaim;
    }

    public void setJaugeFaim(int jaugeFaim) {
        this.jaugeFaim = jaugeFaim;
    }

    public int getJaugeHumeur() {
        return jaugeHumeur;
    }

    public void setJaugeHumeur(int jaugeHumeur) {
        this.jaugeHumeur = jaugeHumeur;
    }

    public int getJaugeFatigue() {
        return jaugeFatigue;
    }

    public void setJaugeFatigue(int jaugeFatigue) {
        this.jaugeFatigue = jaugeFatigue;
    }

    public int getJaugeIntelligence() {
        return jaugeIntelligence;
    }

    public void setJaugeIntelligence(int jaugeIntelligence) {
        this.jaugeIntelligence = jaugeIntelligence;
    }

    public int getJaugeForce() {
        return jaugeForce;
    }

    public void setJaugeForce(int jaugeForce) {
        this.jaugeForce = jaugeForce;
    }

    public int getJaugeCharme() {
        return jaugeCharme;
    }

    public void setJaugeCharme(int jaugeCharme) {
        this.jaugeCharme = jaugeCharme;
    }

    public int getJaugeAbilite() {
        return jaugeAbilite;
    }

    public void setJaugeAbilite(int jaugeAbilite) {
        this.jaugeAbilite = jaugeAbilite;
    }
}
