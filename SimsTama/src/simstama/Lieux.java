/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simstama;
import java.util.Scanner;
/**
 *
 * @author roumi
 */
public class Lieux {
   
    private String nom;
    
    
    //Methodes
    
    
    public static void menuJeu(Tamagoshi monTama){
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
    
         //On écrit le menu 
        Scanner entree = new Scanner(System.in);
        System.out.println("1- Aller vers\n2- Informations\n3- Objets\n4- Sauvegarder\n5- Charger\n6- Quitter");
        
       //Demande du choix
        int monEntree = entree.nextInt();

        //Action à effectuer selon le choix
        
        switch (monEntree) {
            case 1:
                 monTama.changerLieux();
                
                break;

            case 2:
                monTama.afficherInformations();
                break;

            case 3:
                //monTama.afficherObjets();
                
                break;

        
            default:
                
                menuJeu(monTama);
  
    }
    }

    public static Lieux[] creerListeLieux(){
    
        //Tableau des lieux
        Lieux[] tableau= new Lieux[1]; 
        
        //Creation des lieux
        Maison maMaison= new Maison();
        
        //Remplissage du tableau
        tableau[0]=maMaison;
    
    return tableau;
    
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
