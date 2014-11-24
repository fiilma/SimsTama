
/* Classe qui gère le jeu */
package fr.gestion.jeu;

import java.util.Scanner;
import fr.lieux.Lieux;
import fr.lieux.Maison;
import fr.personnage.Tamagoshi;

/**
 *Cette classe gère les liens entre les classes.
 * @author roumi
 * 
 */
public class MonJeu {

    //***************Variables******************//
    //***************Methodes*******************// 
    // Menu 
    /**
         * Menu début de jeu
         * 
         * 
         *           
         */
    public void Menu() {

        //On écrit le menu 
        Scanner monEntree = new Scanner(System.in);

        System.out.println("1- Jouer \n2- Quitter");

        //Demande du choix
        int entree = monEntree.nextInt();

        //Action à effectuer selon le choix
        switch (entree) {
            case 1:

                jeu();
                break;

            case 2:

                System.exit(0);
                break;

            default:

                Menu();

        }

    }

    //Methode qui va lancer le jeu et le diriger
    /**
         * Création du Tama, lieux et univers
         * 
         * 
         *           
         */
    public void jeu() {
        Tamagoshi monTama = creationTama();
        Lieux monLieu= new Maison();
        creationUnivers(monTama,monLieu);
        monLieu.menuJeu(monTama);
      
    }

    public void creationUnivers(Tamagoshi monTama, Lieux monLieu) {

        //Creation d'une liste de lieux 
        monTama.mesLieux = monLieu.creerListeLieux();
        monTama.position=monTama.mesLieux[0];
   
      
    }
/**
         * Création du Tama
         * 
         *
         *           
         */
    //Création d'un tama 
    public Tamagoshi creationTama() {

        Scanner monEntree = new Scanner(System.in);

        Tamagoshi monTama = new Tamagoshi();
        //On nettoie la console 
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Bonjour, vous êtes chez les SimsTama !");
        System.out.println("Vous allez créer votre Tama maintenant ! ");
        
        System.out.println("\n\n");
        System.out.println("Quel nom souhaitez vous lui donner ?");
        monTama.setNom(monEntree.nextLine());
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        System.out.println("Quel prénom souhaitez vous lui donner ? ");
        String prenom = monEntree.nextLine();
        monTama.setPrenom(prenom);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        
        choixSexe(monTama);
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        return monTama;
    }

    public void choixSexe(Tamagoshi monTama){
    
        
        Scanner monEntree = new Scanner(System.in);

    System.out.println("Est ce une femelle (1) ou un mâle (2) ? ");
        //Placer une exception pour les string 
       int monChoix=0; 
    try {
        monChoix = monEntree.nextInt();
    }
        catch(java.util.InputMismatchException e) {
        
            choixSexe(monTama);
        }
    
       
        switch(monChoix){
            case 1: monTama.setSexe("f");
                break;
                
            case 2: monTama.setSexe("m");
                break;        
                
            default: choixSexe(monTama);
        }
        
    }
}
