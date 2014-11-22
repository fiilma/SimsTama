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
    /*jaugeGentillesse = 5;
     jaugeProprete = 10;
     jaugeFaim = 10;
     jaugeHumeur = 5;
     jaugeFatigue = 10;
     jaugeIntelligence = 0;
     jaugeForce = 0;
     jaugeCharme = 5;
     jaugeAbilite = 0;*/
    private Jauge gentillesse = new Jauge("gentillesse", 10, 5);
    private Jauge proprete = new Jauge("proprete", 10, 5);
    private Jauge faim = new Jauge("faim", 10, 5);
    private Jauge humeur = new Jauge("humeur", 10, 5);
    private Jauge fatigue = new Jauge("fatigue", 10, 5);
    private Jauge intelligence = new Jauge("intellgigence", 10, 5);
    private Jauge force = new Jauge("force", 10, 5);
    private Jauge charme = new Jauge("charme", 10, 5);
    private Jauge abilite = new Jauge("ablite", 10, 5);

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
        System.out.println("joyeux anniversaire " + prenom);
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
        } else {
            System.out.println("Votre comopagnon n'existe pas !");
        }
    }

    public EtreVivant faireUnBebe() {

        String prenom = donnerNom();
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
            return bebe;
        }

    }

    public String donnerNom() {


        String prenom = "";
        //Ici on entre un nom et on le donne à la personne


        return prenom;
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

    public void seDeplacer(Lieux lieu) { // a modifier String lieu en Lieu lieu quand la classe existera
        if (lieu != null) {
            position = lieu;
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



    }

    public void acheter(String objet) {  // remplacer String par Objet quand la classe existera
    }

    public void divorcer(EtreVivant personne) {
        this.compagnon.statutMatrimonial = "célibataire";
        statutMatrimonial = "célibataire";
    }

    public void seBattre(EtreVivant personne) {
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
        if (proprete.getValeur() < proprete.getMax() - 1) {
            proprete.setValeur(proprete.getValeur() + 2);
        } else {

            proprete.setValeur(proprete.getMax());

        }
    }

    public void manger() {

        //Pour plus tard proposer differents trucs et augmenter de differents points la jauge
        faim.setValeur(faim.getMax());
    }

    public void boire() {
        if (faim.getValeur() < faim.getMax()) {
            faim.setValeur(faim.getValeur() + 1);
        }

    }

    public void seLaver() {
        proprete.setValeur(proprete.getMax());

    }

    public void communiquer(EtreVivant personne) {
        if (humeur.getValeur() < humeur.getMax()) {
            humeur.setValeur(humeur.getValeur() + 1);
        }


    }

    public void apprendre() {
        if (intelligence.getValeur() < intelligence.getMax()) {
            intelligence.setValeur(intelligence.getValeur() + 1);
        }


    }

    public void seFaireBeau() {
        if (humeur.getValeur() < humeur.getMax()) {
            humeur.setValeur(humeur.getValeur() + 1) ;
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
}
