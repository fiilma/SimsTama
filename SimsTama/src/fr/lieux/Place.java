/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.lieux;

import fr.personnage.Tamagoshi;
import java.util.Scanner;

/**
 *
 * @author roumi
 */
public class Place extends Lieux {

    //Variables
    //Création liste de lieux accessibles depuis la place
    Lieux[] lieuxPlace = new Lieux[3];

    //Constructeurs
    public Place() {
        super.setNom("La place");

        lieuxPlace[0] = new CentreCommercial();
        lieuxPlace[1] = new Jardin();
        lieuxPlace[2] = new Cafe();
    }

    //Methodes
    public void faireAction(Tamagoshi monTama) {

        Scanner entree = new Scanner(System.in);
        System.out.println("\n\n\n");
        System.out.println("1- Discuter 2- Explorer 3- Retour");
        int monChoix = 0;
        try {
            monChoix = entree.nextInt();
        } catch (java.util.InputMismatchException e) {

            faireAction(monTama);
        }

        switch (monChoix) {
            case 1:

                discuter(monTama);
                break;

            case 2:
                explorer(monTama);
                break;

            case 3:
                this.menuJeu(monTama);
                break;

            default:
                faireAction(monTama);

        }
    }

    public void explorer(Tamagoshi monTama) {

        Scanner entree = new Scanner(System.in);

        System.out.println("\n\n\n\n\n");
        System.out.println("Où voulez vous allez ?");
        //Liste les lieux
        for (int i = 0; i < this.lieuxPlace.length; i++) {
            System.out.println(i + 1 + "- " + this.lieuxPlace[i].getNom());
        }

        System.out.println(this.lieuxPlace.length + 1 + "- Retour");
 
        int monChoix = 0;
        try {
            monChoix = entree.nextInt();
        } catch (java.util.InputMismatchException e) {

            explorer(monTama);
        }

        //Pour cette version du jeu tout est fermé
        if(monChoix-1<this.lieuxPlace.length){
        System.out.println("Nous sommes désolés mais le " + this.lieuxPlace[monChoix - 1].getNom() + " est fermé");
        faireAction(monTama);}
        
        else if(monChoix==4){
         this.faireAction(monTama);
        }
        
        else {
        this.explorer(monTama);
        }
        } 

    

    public void discuter(Tamagoshi monTama) {
//Un personnage uniquement dans cette version
        Tamagoshi ben = new Tamagoshi("burger", "ben");
        
        Scanner entree = new Scanner(System.in);

        System.out.println("\n\n\n");
        System.out.println("Ben est là ");
        System.out.println("Bonjour !");
        System.out.println("1- Discuter 2- Séduire 3- Se battre 4- Retour");

        int monChoix = 0;
        try {
            monChoix = entree.nextInt();
        } catch (java.util.InputMismatchException e) {

            discuter(monTama);
        }

        switch (monChoix) {
            case 1:
                monTama.communiquer(ben);
                System.out.println("Vous avez parlé avec ben !");
                discuter(monTama);
                break;

            case 2:
                monTama.seduire(ben);
                discuter(monTama);
                break;

            case 3:
                monTama.seBattre(ben);
                discuter(monTama);
                break;
            case 4:
                this.faireAction(monTama);
                break;

            default:
                discuter(monTama);

        }

    }
}
