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
public class Maison extends Lieux {

    //Constructeurs 
    public Maison() {

        this.setNom("maison");
    }

    //Methodes
    public void menuMaison(Tamagoshi monTama) {

    }

    public void faireAction(Tamagoshi monTama) {

        Scanner entree = new Scanner(System.in);

        System.out.println("\n\n\n\n\n");
        System.out.println("1-Manger 2-Boire 3-Se laver 4-Se faire beau 5-Dormir 6-Aller aux toilettes 7-Retour");

            //Entre le choix 
        //Exception string aussi 
        int choix = entree.nextInt();

        switch (choix) {

            case 1:
                monTama.manger();
                System.out.println("Miam!");
           
                faireAction(monTama);
                break;
            case 2:
                monTama.boire();
                System.out.println("Gloup!");
               
                faireAction(monTama);
                break;
            case 3:
                monTama.seLaver();
                System.out.println(monTama.getPrenom() + " est tout propre");
                
                faireAction(monTama);
                break;
            case 4:
                monTama.seFaireBeau();
                System.out.println(monTama.getPrenom() + " est magnifique!");
         
                faireAction(monTama);

                break;
            case 5:
                monTama.seReposer();
                System.out.println("Rrrrrrrrrrrrr");
         
                faireAction(monTama);

                break;
            case 6:
                monTama.allerAuxToilettes();
                System.out.println(monTama.getPrenom() + " est plus légé!");
           
                faireAction(monTama);
                break;

            case 7:
                this.menuJeu(monTama);
                break;
            default:
                faireAction(monTama);

        }

    }

    
    

}
