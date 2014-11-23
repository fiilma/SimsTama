package fr.personnage;

import fr.lieux.Lieux;
import java.util.Scanner;

/**
 *
 * @author roumi
 */
public class Tamagoshi extends EtreVivant {

//Propriétés
    public Lieux[] mesLieux = new Lieux[1];

    //Constructeurs 
    public Tamagoshi() {
        super();

    }

    public Tamagoshi(String nom, String prenom, String sexe) {

        super(nom, prenom, sexe);
    }

    public Tamagoshi(String nom, String prenom) {
        super(nom, prenom);

    }

 //Methodes 
    public void changerLieux(Lieux monLieu) {

        Scanner entree = new Scanner(System.in);

        System.out.println("\n\n\n\n\n");
        System.out.println("Où voulez vous allez ?");
        //Affiche la liste des lieux
        for (int i = 0; i < this.mesLieux.length; i++) {
            System.out.println(i + 1 + "-" + this.mesLieux[i].getNom());

        }
        System.out.println(this.mesLieux.length + 1 + "-Retour");
       int monChoix=0;
     try {
        monChoix = entree.nextInt();
    }
        catch(java.util.InputMismatchException e) {
        
            changerLieux(monLieu);
        }
    
       
     
        //Vérifie qu'on rentre un bon numero 
        if (monChoix < this.mesLieux.length+2) {
              if(monChoix==this.mesLieux.length+1){
            monLieu.menuJeu(this);
            }
              else if(monChoix-1<this.mesLieux.length)
              {if (this.mesLieux[monChoix - 1].getNom().equals(this.position.getNom())) {
                   System.out.println("\n\n\n\n\n");
                System.out.println("Tu es déjà là !");
                changerLieux(monLieu);
            }
          
            else{
            this.position = this.mesLieux[monChoix - 1];
            this.mesLieux[monChoix - 1].menuJeu(this);
              }
              }

        } else {
            changerLieux(monLieu);
        }

    }

}
