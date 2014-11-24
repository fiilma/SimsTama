/*
Classe Etre humain.

 */
package fr.personnage;

/**
 *
 * @author roumi
 */
public class EtreHumain extends EtreVivant {
    
    private String couleurPeau;
    private String couleurCheveux;
    private String sonMetier;
    
    
   //****** Accesseurs ******//

    public String getCouleurPeau() {
        return couleurPeau;
    }

    public String getCouleurCheveux() {
        return couleurCheveux;
    }

    public String getSonMetier() {
        return sonMetier;
    }

   
    
    //****** Constructeurs ******//
    
    public EtreHumain(String nom, String prenom,String sexe,String couleurPeau,String CouleurCheveux,String metier){
        super(nom,prenom,sexe);
        this.couleurCheveux=CouleurCheveux;
        this.couleurPeau=couleurPeau;
        this.sonMetier=metier;
        

    }
    public EtreHumain(){}
    
    
    //****** Methodes des êtres humain ******//
    
    public void travailler(){
    
    System.out.print(("Hello"));
    
    }

   
}
