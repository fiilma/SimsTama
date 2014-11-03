/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simstama;

/**
 *
 * @author roumi
 */
public class Metier {
    
    
    
    /**** Variables *****/
    
    private String nomMetier;
    
    /**** Get/Set ******/
   public void setNom(String nom){
   
   this.nomMetier=nom;
   }
    
   public String getNom(){
   
   return this.nomMetier;
   }
   
   
    /***** Constructeur******/
   
   
   public Metier(String nom){
   this.nomMetier=nom;
   }
 
   public Metier(){};
   
}
