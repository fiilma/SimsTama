/*
 Projet Java 1 p1- Octobre 2014
 SimsTama

 */
package simstama;

import fr.personnage.EtreVivant;
import fr.gestion.jeu.MonJeu;


/**
 *
 * @authors Nicolas Blaise Roumaissa Boussellaoui
 */
public class SimsTama {

    public static void main(String[] args) {
/*
        // EtreHumain monHumain= new EtreHumain("roumi","seb","truc","Bleu","Noir","Magicien");

        // System.out.println(monHumain.getNom()+monHumain.getPrenom());

        EtreVivant boby = new EtreVivant("blaise", "boby", "male");
        //EtreVivant biby = new EtreVivant("booo", "biby", "femelle");
        boby.feterSonAnniversaire();
       // biby.feterSonAnniversaire();
        System.out.println(boby.getPrenom() + " a " + boby.getAge() + " ans.");
       // System.out.println(biby.getPrenom() + " a " + biby.getAge() + " ans.");
        //boby.mesJauges.setJaugeFaim(5);
       // System.out.println(boby.mesJauges.getJaugeFaim());
        boby.boire();
        //System.out.println(boby.mesJauges.getJaugeFaim());
        boby.manger();
        //System.out.println(boby.mesJauges.getJaugeFaim());
        //boby.mesJauges.setJaugeProprete(5);
        //System.out.println(boby.mesJauges.getJaugeProprete());
        boby.seLaver();
        //System.out.println(boby.mesJauges.getJaugeProprete());
       // System.out.println(biby.getStatusMatrimonial());
        //boby.seMarier(biby);
        System.out.println(boby.getNom());
        //System.out.println(biby.getNom());
      //  System.out.println(boby.getCompagnon().getPrenom());
        //System.out.println(biby.getStatusMatrimonial());
        //biby.setStatusMatrimonial("célibataire");
        boby.setStatusMatrimonial("célibataire");
       // biby.seMarier(boby);
        System.out.println(boby.getNom());
        //System.out.println(biby.getNom());
     //   System.out.println(boby.getCompagnon().getPrenom());
        //System.out.println(biby.getStatusMatrimonial());
     //   EtreVivant buby = boby.faireUnBebe();
     //   System.out.println(buby.getAge());
      //  System.out.println(buby.getPrenom());
      //  System.out.println(buby.getNom());
      //  System.out.println(buby.getSexe());
        // biby.mourir();
        System.out.println(boby.getStatusMatrimonial());
        for (int i = 0; i < boby.ListContact.size(); i++) {
            System.out.println(boby.ListContact.get(i).getId());
            System.out.println(boby.ListContact.get(i).getJaugeRelationnelle());
        }
       // boby.seduire(biby);
      //  boby.seduire(buby);
      //  boby.seduire(biby);
      //  buby.seduire(biby);
      //  biby.seduire(boby);

        for (int i = 0; i < boby.ListContact.size(); i++) {
            System.out.println(boby.ListContact.get(i).getId());
            System.out.println(boby.ListContact.get(i).getJaugeRelationnelle());
            

        }
        System.out.println("\n");
        for (int i = 0; i < boby.ListContact.size(); i++) {
         //   System.out.println(biby.ListContact.get(i).getId());
         //   System.out.println(biby.ListContact.get(i).getJaugeRelationnelle());
            
        }
        System.out.println("\n");
        for (int i = 0; i < boby.ListContact.size(); i++) {
       //    System.out.println(buby.ListContact.get(i).getId());
        //    System.out.println(buby.ListContact.get(i).getJaugeRelationnelle());
            
        }
        System.out.println("le temsps est : "+boby.temps);
        System.out.println(boby.getAge()); 
        boby.seReposer();
        boby.manger();
        boby.seFaireBeau();
        System.out.println(boby.getProprete());
        boby.seLaver();
        
        boby.allerAuxToilettes();
        System.out.println("le temsps est : "+boby.temps);
        System.out.println(boby.getAge()); 
        
        */
         MonJeu jeu=new MonJeu();

        
         jeu.Menu();

    }
}
/*
 ****************** TESTER ET FONTIONNEL ****************** 
 -Création d'un etre humain avec nom, prenom, couleur ect ..
 - création d'un être vivant avec nom prénom et genre
 -fonctions opérationnelles de l'être vivant:
 * fêter son anniversaire
 * manger/boire
 * se laver
 * se marier
 * faire un bebe
 * mourir
 * *seduire


-Classe métier = classe abtraite
-création de différents packages








 */
