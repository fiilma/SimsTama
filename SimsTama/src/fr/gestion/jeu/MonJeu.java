/* Classe qui gère le jeu */
package fr.gestion.jeu;

import java.util.Scanner;
import fr.lieux.Lieux;
import fr.lieux.Maison;
import fr.personnage.Tamagoshi;

/**
 *
 * @author roumi
 */
public class MonJeu {

    //***************Variables******************//
    //***************Methodes*******************// 
    // Menu 
    public void Menu() {

        //On écrit le menu 
        Scanner monEntree = new Scanner(System.in);

        System.out.println("1- Jouer \n2- Continuer\n3- Quitter");

        //Demande du choix
        int entree = monEntree.nextInt();

        //Action à effectuer selon le choix
        switch (entree) {
            case 1:

                jeu();
                break;

            case 2:
                //Ouvre fichiers sauvegardes
                break;

            case 3:

                System.exit(0);
                break;

            default:

                Menu();

        }

    }

    //Methode qui va lancer le jeu et le diriger
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

    //Création d'un tama 
    public Tamagoshi creationTama() {

        Scanner monEntree = new Scanner(System.in);

        Tamagoshi monTama = new Tamagoshi();
        //On nettoie la console 
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Bonjour, vous êtes chez les SimsTama !");
        System.out.println("Vous allez créer votre Tama maintenant ! ");
        
        //On attend un appuie 
        monEntree.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
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
        int monChoix = monEntree.nextInt();
        
       
        switch(monChoix){
            case 1: monTama.setSexe("f");
                break;
                
            case 2: monTama.setSexe("m");
                break;        
                
            default: choixSexe(monTama);
        }
        
    }
}
