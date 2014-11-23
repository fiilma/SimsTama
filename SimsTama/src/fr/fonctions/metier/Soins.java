/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.fonctions.metier;
import fr.personnage.EtreVivant;
/**
 *
 * @author roumi
 */
public interface Soins {
    
    
    
    
    
    //Methodes
    public void soigner(EtreVivant monEtre);
    public void secourir(EtreVivant monEtre);
    public void examiner(EtreVivant monEtre);
    
}
