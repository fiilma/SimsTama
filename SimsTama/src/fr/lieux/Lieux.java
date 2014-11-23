/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.lieux;

import java.util.Scanner;
import fr.personnage.Tamagoshi;

/**
 *
 * @author roumi
 */
public abstract class Lieux {

    private String nom;

    //Methodes
    public void menuJeu(Tamagoshi monTama) {
        /*
         * Switch
         * 1/ Quitter 
         * 2/ Aller vers => Afficher les autres lieux 
         * 3/ Sauvegarder 
         4/ Charger une autre partie 
         * 5/ Les jauges 
         6/ Voir objets
         * 
         */

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
        int monEntree = entree.nextInt();

        //Action à effectuer selon le choix
        switch (monEntree) {
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

    public abstract void faireAction(Tamagoshi monTama);

    ;
    public  Lieux[] creerListeLieux() {

        //Tableau des lieux
        Lieux[] tableau = new Lieux[1];

        //Creation des lieux
        Maison maMaison = new Maison();
        

        //Remplissage du tableau
        tableau[0] = maMaison;

        return tableau;

    }


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
   //Exception aussi pour les string entres
        int monChoix =entree.nextInt();
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
