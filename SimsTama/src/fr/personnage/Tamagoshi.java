package fr.personnage;

import fr.lieux.Lieux;

/**
 *
 * @author roumi
 */
public class Tamagoshi extends EtreVivant{ 


//Propriétés
 public Lieux[] mesLieux=new Lieux[1];

 
 //Constructeurs 
 public Tamagoshi(){
 super();
 
 }
 
 public Tamagoshi(String nom, String prenom, String sexe){
 
     super(nom,prenom,sexe);
 }
 
 public Tamagoshi(String nom, String prenom){
 super(nom,prenom);
 
 }
 
 
 //Methodes 
 
 public void changerLieux(){
 
     System.out.println("Lieu actuel: "+this.position);
     System.out.println("Où voulez vous allez ?");
     
     //Switch avec liste des lieux
 
 
 }

    
}
