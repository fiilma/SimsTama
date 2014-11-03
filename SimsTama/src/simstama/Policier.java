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
public class Policier extends Metier {
    
    
    
    //***** constructeurs *******//
    public Policier(String nom){
    super(nom);
    
    }
    
    public Policier(){}
    
    //***** Methode*****//
    
    private void arreterPersonne(EtreVivant personne){
    
    personne.setStatutLiberte(1);
    
    }
    
}