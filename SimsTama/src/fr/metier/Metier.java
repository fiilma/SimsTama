/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.metier;

/**
 *
 * @author roumi
 */
public class Metier {
    
    
    
    /**** Variables *****/
    
   protected String nomMetier;
    
    /**** Get/Set ******/
   protected void setNom(String nom){
   
   this.nomMetier=nom;
   }
    
   protected String getNom(){
   
   return this.nomMetier;
   }
   
   
    /***** Constructeur******/
   
   
   public Metier(String nom){
   this.nomMetier=nom;
   }
 
   public Metier(){
   
   };
   
    
   //***** Methode ******//
   
   
}
