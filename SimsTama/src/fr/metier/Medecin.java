/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.metier;
import fr.fonctions.metier.Soins;
import fr.personnage.EtreVivant;
/**
 *Medecins
 * @author roumi
 */
public class Medecin extends Metier implements Soins {
    
    
    
    
     //Methodes
    public void soigner(EtreVivant monEtre){
    System.out.println(monEtre.getPrenom()+" a été soigné !");
    };
    public void secourir(EtreVivant monEtre){
     System.out.println(monEtre.getPrenom()+" a été secouru !");
    };
    public void examiner(EtreVivant monEtre){
     System.out.println(monEtre.getPrenom()+" a été examiné !");
    };
    
}
