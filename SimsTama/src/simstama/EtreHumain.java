/*
Classe Etre humain.

 */
package simstama;

/**
 *
 * @author roumi
 */
public class EtreHumain {
    
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
    
    public EtreHumain(String peau,String cheveux, String metier){
    
    this.couleurCheveux=cheveux;
    this.couleurPeau=peau;
    this.sonMetier=metier;
    }
    public EtreHumain(){};
    
    
    //****** Methodes des êtres humain ******//
    
    public void travailler(EtreHumain humain){
    
    System.out.print(("Hello"));
    
    }

   
}
