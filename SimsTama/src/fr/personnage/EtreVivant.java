/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.personnage;

import fr.lieux.Lieux;
import java.util.LinkedList;

/**
 *
 * @author isen
 */
public class EtreVivant {

    private String nom;
    private String prenom;
    private String sexe;
    private int age;
    private String couleur;
    private String statutMatrimonial = "célibataire";
    private EtreVivant pere;
    private EtreVivant mere;
    private int statutEtat;
    public LinkedList<Relationnelle> ListContact = new LinkedList<Relationnelle>();
    public Lieux position;
    public static int id = 0;
    private int monId;
    private int statutLiberte;
    private int random;
    private EtreVivant compagnon;
    private Jauge gentillesse = new Jauge("gentillesse", 10, 5);
    private Jauge proprete = new Jauge("proprete", 10, 5);
    private Jauge faim = new Jauge("faim", 10, 5);
    private Jauge humeur = new Jauge("humeur", 10, 5);
    private Jauge fatigue = new Jauge("fatigue", 10, 5);
    private Jauge intelligence = new Jauge("intellgigence", 10, 5);
    private Jauge force = new Jauge("force", 10, 5);
    private Jauge charme = new Jauge("charme", 10, 5);
    private Jauge abilite = new Jauge("ablite", 10, 5);
    public int temps = 0;
    private int coeff = 1;
    private int nbAnniv =1;

    //********* Constructeurs *********//
    public EtreVivant(String nom, String prenom, String sexe) {
        this.prenom = prenom;
        this.nom = nom;
        this.sexe = sexe;
        this.statutLiberte = 0;
        this.statutEtat = 1;
        this.age = 0;
        this.monId = id;
        id++;


    }

    public EtreVivant(String nom, String prenom) {
        this.prenom = prenom;
        this.nom = nom;
        this.statutLiberte = 0;
        this.statutEtat = 1;
        this.age = 0;
        this.monId = id;
        id++;
    }

    public EtreVivant() {
        this.statutLiberte = 0;
        this.statutEtat = 1;
        this.age = 0;

        // position = "maison";

        this.monId = id;
        id++;


    }

    //******** Methodes de la classe *******//
    public void feterSonAnniversaire() {
        this.age++;
        System.out.println("joyeux anniversaire " + prenom + " tu as maintenant " + this.age + " ans!!");
    }

    public void seMarier(EtreVivant personne) {
        if (personne != null) {

            if (sexe.equals("male") && personne.sexe.equals("femele")) {
                System.out.println("Félicitation monsieur et madame" + nom);
            } else if (personne.sexe.equals("male") && sexe.equals("femele")) {
                System.out.println("Félicitation monsieur et madame" + personne.nom);
            } else if (personne.sexe.equals("male") && sexe.equals("male")) {
                System.out.println("Felicitation aux jeunes mariés");
            } else {
                System.out.println("Felicitation aux jeunes mariées");
            }
            statutMatrimonial = "en couple";
            personne.statutMatrimonial = "en couple";
            compagnon = personne;
            personne.compagnon = this;
            leTempsPasse(1);
        } else {
            System.out.println("Votre comopagnon n'existe pas !");
        }
    }

    public EtreVivant faireUnBebe() {

     ;
        if (sexe.equals("male")) {
            EtreVivant bebe = new EtreVivant(this.nom, prenom);
            bebe.age = 0;
            bebe.pere = this;
            bebe.mere = this.compagnon;


            //   position = mere.position;

            random = (int) (Math.random() * 2);
            if (random == 0) {
                bebe.sexe = "male";
            } else {
                bebe.sexe = "femelle";
            leTempsPasse(2);
            }
            
            return bebe;
        } else {
            EtreVivant bebe = new EtreVivant(this.compagnon.nom, prenom);
            bebe.pere = this.compagnon;
            bebe.mere = this;
            bebe.age = 0;

            // position = mere.position;

            random = (int) (Math.random() * 2);
            if (random == 0) {
                bebe.sexe = "male";
            } else {
                bebe.sexe = "femelle";
            }
            leTempsPasse(2);
            return bebe;
        }

    }

    public void leTempsPasse(int duree){
       
   
        temps += duree;
        if (temps > coeff * 5) {
            getProprete().setValeur(getProprete().getValeur() - 1);
            getFaim().setValeur(getFaim().getValeur() - 1);
            getFatigue().setValeur(getFatigue().getValeur() - 1);
            getCharme().setValeur(getCharme().getValeur() - 1);
            coeff ++ ;
        }
        if (temps > 5 * nbAnniv){
            this.feterSonAnniversaire();
            nbAnniv ++;
        }
        if (this.age == 80){
            this.mourir();
            System.out.println("toute nos condoléances à la famille de "+prenom+" "+nom+".");
        }
    }
    
    

    public void mourir() {
        statutEtat = 0;
        System.out.println("repose en paix " + prenom + " " + nom);
        if (this.compagnon.sexe.equals("femelle")) {
            this.compagnon.statutMatrimonial = "veuve";
        } else {
            this.compagnon.statutMatrimonial = "veuf";
        }

    }


    public void seduire(EtreVivant personne) {


        int i = 0;
        int j = 0;
        boolean testMaList = false;
        boolean testListPersonne = false;


        if (ListContact.size() != 0) {
            while (i < ListContact.size()) {

                if (ListContact.get(i) != null) {
                    if (ListContact.get(i).getId() == personne.monId) {
                        ListContact.get(i).setJaugeRelationnelle(ListContact.get(i).getJaugeRelationnelle() + 1);
                        testMaList = true;

                        if (personne.ListContact.size() != 0) {
                            while (j < personne.ListContact.size()) {
                                if (personne.ListContact.get(j) != null) {
                                    if (personne.ListContact.get(j).getId() == monId) {
                                        personne.ListContact.get(j).setJaugeRelationnelle(personne.ListContact.get(j).getJaugeRelationnelle() + 1);
                                        testListPersonne = true;
                                    }
                                }
                                j++;
                            }
                        } else {
                            personne.ListContact.add(new Relationnelle(monId));
                        }

                    }
                }
                i++;
                // monCounter++;
            }
            if (testMaList == false) {
                ListContact.add(new Relationnelle(personne.monId));
            }
            if (testListPersonne == false) {
                personne.ListContact.add(new Relationnelle(monId));
            }
        } else {
            ListContact.add(new Relationnelle(personne.monId));
            personne.ListContact.add(new Relationnelle(monId));
        }


    leTempsPasse(2);
    }

    public void acheter(String objet) {  // remplacer String par Objet quand la classe existera
        leTempsPasse(2);
    }

    public void divorcer(EtreVivant personne) {
        this.compagnon.statutMatrimonial = "célibataire";
        statutMatrimonial = "célibataire";
        leTempsPasse(1);
    }

    public void seBattre(EtreVivant personne) {
        leTempsPasse(1);
    }

    public void afficherInformations() {

        System.out.println("nom : " + this.nom);
        System.out.println("prénom : " + this.prenom);
        System.out.println("age : " + this.age);
        System.out.println("sexe : " + this.sexe);
        System.out.println("Position :" + this.position.getNom());
        /*
         System.out.println("Abilité " + mesJauges.getJaugeAbilite() + " /10");
         System.out.println("Charme " + mesJauges.getJaugeCharme() + " /10");
         System.out.println("Force " + mesJauges.getJaugeForce() + " /10");
         System.out.println("Intelligence " + mesJauges.getJaugeIntelligence() + " /10");
         System.out.println("Gentillesse " + mesJauges.getJaugeGentillesse() + " /10");

         System.out.println("Fatigue " + mesJauges.getJaugeFatigue() + " /10");
         System.out.println("Humeur " + mesJauges.getJaugeProprete() + " /10");
         System.out.println("Faim " + mesJauges.getJaugeFaim() + " /10");
         */

    }

    public void allerAuxToilettes() {
        if (getProprete().getValeur() < getProprete().getMax() - 1) {
            getProprete().setValeur(getProprete().getValeur() + 2);
            leTempsPasse(1);
        } else {

            getProprete().setValeur(getProprete().getMax());
            leTempsPasse(1);
        }
    }

    public void manger() {

        //Pour plus tard proposer differents trucs et augmenter de differents points la jauge
        getFaim().setValeur(getFaim().getMax());
        leTempsPasse(2);
    }

    public void boire() {
        if (getFaim().getValeur() < getFaim().getMax()) {
            getFaim().setValeur(getFaim().getValeur() + 1);
            leTempsPasse(1);
        }

    }

    public void seLaver() {
        getProprete().setValeur(getProprete().getMax());
        leTempsPasse(2);

    }

    public void communiquer(EtreVivant personne) {
        if (getHumeur().getValeur() < getHumeur().getMax()) {
            getHumeur().setValeur(getHumeur().getValeur() + 1);
            leTempsPasse(2);
        }


    }

    public void apprendre() {
        if (getIntelligence().getValeur() < getIntelligence().getMax()) {
            getIntelligence().setValeur(getIntelligence().getValeur() + 1);
            leTempsPasse(3);
        }


    }

    public void seFaireBeau() {
        if (getHumeur().getValeur() < getHumeur().getMax()) {
            getHumeur().setValeur(getHumeur().getValeur() + 1) ;
            if(this.sexe == "Male"){
                leTempsPasse(1);
            }
            else {
                leTempsPasse(3);
            }
        }

    }
    
    public void seReposer() {
        if (getFatigue().getValeur() < getFatigue().getMax()){
            getFatigue().setValeur(getFatigue().getMax());
            leTempsPasse(3);
        }
    }

    //************ GET et SET ***************//
    public int getStatutLiberte() {

        return this.statutLiberte;

    }

    public void setStatutLiberte(int statut) {
        this.statutLiberte = statut;

    }

    public int getAge() {
        return age;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getStatusMatrimonial() {
        return statutMatrimonial;
    }

    public void setStatusMatrimonial(String status) {
        this.statutMatrimonial = status;
    }

    public EtreVivant getPere() {
        return pere;
    }

    public EtreVivant getMere() {
        return mere;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;

    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;

    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public EtreVivant getCompagnon() {
        return compagnon;
    }

    public void setCompagnon(EtreVivant compagnon) {
        this.compagnon = compagnon;
    }

    /**
     * @return the proprete
     */
    public Jauge getProprete() {
        return proprete;
    }

    /**
     * @param proprete the proprete to set
     */
    public void setProprete(Jauge proprete) {
        this.proprete = proprete;
    }

    /**
     * @return the faim
     */
    public Jauge getFaim() {
        return faim;
    }

    /**
     * @return the humeur
     */
    public Jauge getHumeur() {
        return humeur;
    }

    /**
     * @return the fatigue
     */
    public Jauge getFatigue() {
        return fatigue;
    }

    /**
     * @return the intelligence
     */
    public Jauge getIntelligence() {
        return intelligence;
    }

    /**
     * @return the force
     */
    public Jauge getForce() {
        return force;
    }

    /**
     * @return the charme
     */
    public Jauge getCharme() {
        return charme;
    }

    /**
     * @return the abilite
     */
    public Jauge getAbilite() {
        return abilite;
    }
}
