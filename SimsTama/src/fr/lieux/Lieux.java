/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.lieux;

import java.util.Scanner;
import fr.personnage.Tamagoshi;

/**
 *Classe abstraite qui contient le menu commun à tous les lieux
 * @author roumi
 */
public abstract class Lieux {

    private String nom;

    //Methodes
    /**
         * Menu de toutes les pièces
         * 
         * @param Tamagoshi
         *          .
         */
    public void menuJeu(Tamagoshi monTama) {
    
        Scanner entree = new Scanner(System.in);

        //Affiche le nom et le nombre de jour du joueur
        System.out.println(monTama.getPrenom() + "\t\t"+monTama.position.getNom()+"\t\t"+ monTama.temps + " Jours");
        System.out.println("\n\n\n\n");
        //Affiche le bonhomme 
        System.out.println("\t \t o");
        System.out.println("\t \t/_\\  ");
        System.out.println("\n\n\n\n");
        //Affiche phrase etat 
        String monEtat=voirEtat(monTama);
        System.out.println(monEtat);
       
        //Affiche le menu 
        System.out.println("1/ Actions 2/ Jauges 3/ Aller vers 4/ Quitter");
        //Demande du choix
        int monChoix=0;
     try {
        monChoix = entree.nextInt();
    }
        catch(java.util.InputMismatchException e) {
        
            menuJeu(monTama);
        }
    
       
        //Action à effectuer selon le choix
        switch (monChoix) {
            case 1:
                monTama.position.faireAction(monTama);

                break;
            case 2:
                voirJauges(monTama);
                break;

            case 3:
              monTama.changerLieux(this);
                
                break;

            case 4:
                System.exit(0);

            default:
                System.out.println("\n\n\n\n");
                menuJeu(monTama);

        }
    }
/**
         * Actions disponibles dans la maison
         * 
         * @param Tamagoshi
         *           
         */
    public abstract void faireAction(Tamagoshi monTama);
/**
         * Créer une liste de lieux
         * 
         * 
         *           Lieux
         */
    public  Lieux[] creerListeLieux() {

        //Tableau des lieux
        Lieux[] tableau = new Lieux[2];

        //Creation des lieux
        Maison maMaison = new Maison();
        Place maPlace=new Place();

        //Remplissage du tableau
        tableau[0] = maMaison;
        tableau[1]=maPlace;

        return tableau;

    }

/**
         * Affiche l'etat du Tama
         * 
         * @param Tamagoshi
         *      String
         *           
         */
    public String voirEtat(Tamagoshi monTama){
    
        String etat=" ";
        
        if (monTama.getFaim().getValeur()<5) {
           
            etat= "BrrrrGRrr faim *.*";
        }
    
        else if (monTama.getFatigue().getValeur()<5){
            etat="Zzzzzzzzzzzz :'(";
        }
        
        else if (monTama.getProprete().getValeur()<5) {
            
            etat="Des mouches volent autours de votre Tama!";
            
        }
        
       else
            etat=" ";
    
        return etat;
    }

    public void voirJauges(Tamagoshi monTama) {
        Scanner entree = new Scanner(System.in);
        System.out.println("\n\n\n\n");
        monTama.afficherInformations();
        System.out.println("\n 1- retour ");
   int monChoix=0;
     try {
        monChoix = entree.nextInt();
    }
        catch(java.util.InputMismatchException e) {
        
            voirJauges(monTama);
        }
        if (monChoix == 1) {
            System.out.println("\n\n\n\n");
            menuJeu(monTama);
        } else {
            voirJauges(monTama);
        }

    }

    //************GET etSET *************//

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

}
