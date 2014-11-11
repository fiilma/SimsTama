/* Classe qui gère le jeu */
package fr.gestion.jeu;

import java.util.Scanner;
import fr.lieux.Lieux;
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
        creationUnivers(monTama);

        //Test 
        monTama.afficherInformations();
        //Appel maison
    }

    public void creationUnivers(Tamagoshi monTama) {

        monTama.mesLieux = Lieux.creerListeLieux();
        monTama.position=monTama.mesLieux[0];
        //Creation d'une liste de lieux 
        //Plus tard creation des autres perso ...
    }

    //Création d'un tama 
    public Tamagoshi creationTama() {

        Scanner monEntree = new Scanner(System.in);

        Tamagoshi monTama = new Tamagoshi();

        System.out.println("Bonjour, vous êtes chez les SimsTama !");
        System.out.println("Vous allez créer votre Tama maintenant ! ");

        System.out.println("Nom:");

        monTama.setNom(monEntree.nextLine());

        System.out.println("Prénom:");
        String prenom = monEntree.nextLine();
        monTama.setPrenom(prenom);

        System.out.println("Sexe:");
        monTama.setSexe(monEntree.nextLine());

        
        
      //Faire un test pour savoir si on a rentrer un bon s
        //Répartition des caractéristiques. 
        //Demande si on souhaite sauvegarder 
        //  -> Oui on crée un fichier et on continue
        //  -> Non on continue
        return monTama;
    }

}
