/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simstama;
import java.util.LinkedList;

/**
 *
 * @author isen
 */
public class EtreVivant {

    private String nom;
    private String prenom;
    private String sexe;
    private int age;
    private String couleur;
    private String statutMatrimonial = "célibataire";

    private EtreVivant pere;
    private EtreVivant mere;
    private int statutEtat;
<<<<<<< HEAD
    private Lieux position;
    public LinkedList<Relationnelle> ListContact = new LinkedList<Relationnelle>();
=======
    public Lieux position;
    private LinkedList<Relationnelle> ListContact = new LinkedList<Relationnelle>();
>>>>>>> dab0caa908c3880b213a159d93306614376e9f39
    public static int id = 0;
    private int monId;

    private int jaugeGentillesse;
    private int jaugeProprete;
    private int jaugeFaim;
    private int jaugeHumeur;
    private int jaugeFatigue;
    private int jaugeIntelligence;
    private int jaugeForce;
    private int jaugeCharme;
    private int jaugeAbilite;
    private int statutLiberte;
    private int random;

    private EtreVivant compagnon;

    //********* Constructeurs *********//
    public EtreVivant(String nom, String prenom, String sexe) {
        this.prenom = prenom;
        this.nom = nom;
        this.sexe = sexe;
        this.statutLiberte = 0;
        jaugeGentillesse = 5;
        jaugeProprete = 10;
        jaugeFaim = 10;
        jaugeHumeur = 5;
        jaugeFatigue = 10;
        jaugeIntelligence = 0;
        jaugeForce = 0;
        jaugeCharme = 5;
        jaugeAbilite = 0;
        this.statutEtat = 1;
        this.age = 0;
<<<<<<< HEAD
       // position = "maison";
=======
        
>>>>>>> dab0caa908c3880b213a159d93306614376e9f39
        this.monId = id;
        id++;
        

    }

    public EtreVivant(String nom, String prenom) {
        this.prenom = prenom;
        this.nom = nom;
        jaugeGentillesse = 5;
        jaugeProprete = 10;
        jaugeFaim = 10;
        jaugeHumeur = 5;
        jaugeFatigue = 10;
        jaugeIntelligence = 0;
        jaugeForce = 0;
        jaugeCharme = 5;
        jaugeAbilite = 0;
        this.statutLiberte = 0;
        this.statutEtat = 1;
        this.age = 0;
<<<<<<< HEAD
        //position = "maison";
=======
    
>>>>>>> dab0caa908c3880b213a159d93306614376e9f39
        this.monId = id;
        id++;
    }

    public EtreVivant() {
    }

    //******** Methodes de la classe *******//
    public void feterSonAnniversaire() {
        this.age++;
        System.out.println("joyeux anniversaire " + prenom);
    }

    public void manger() {

        //Pour plus tard proposer differents trucs et augmenter de differents points la jauge
        jaugeFaim = 10;
    }

    public void boire() {
        if (jaugeFaim < 10) {
            jaugeFaim++;
        }

    }

    public void seLaver() {
        jaugeProprete = 10;
    }

    public void seMarier(EtreVivant personne) {
        if (personne != null) {

            if (sexe.equals("male") && personne.sexe.equals("femele")) {
                System.out.println("Félicitation monsieur et madame" + nom);
            } else if (personne.sexe.equals("male") && sexe.equals("femele")) {
                System.out.println("Félicitation monsieur et madame" + personne.nom);
            } else if (personne.sexe.equals("male") && sexe.equals("male")) {
                System.out.println("Felicitation aux jeunes mariés");
            } else {
                System.out.println("Felicitation aux jeunes mariées");
            }
            statutMatrimonial = "en couple";
            personne.statutMatrimonial = "en couple";
            compagnon = personne;
            personne.compagnon = this;
        } else {
            System.out.println("Votre comopagnon n'existe pas !");
        }
    }

    public EtreVivant faireUnBebe() {

        String prenom = donnerNom();
        if (sexe.equals("male")) {
            EtreVivant bebe = new EtreVivant(this.nom, prenom);
            bebe.age = 0;
            bebe.pere = this;
            bebe.mere = this.compagnon;
<<<<<<< HEAD
            //position = mere.position;
=======

            position = mere.position;
>>>>>>> dab0caa908c3880b213a159d93306614376e9f39
            random = (int)(Math.random()*2);
            if (random == 0){
               bebe.sexe="male"; 
            }
            else{
                bebe.sexe="femelle";

            }
            return bebe;
        } else {
            EtreVivant bebe = new EtreVivant(this.compagnon.nom, prenom);
            bebe.pere = this.compagnon;
            bebe.mere = this;
            bebe.age = 0;
<<<<<<< HEAD
            //position = mere.position;
=======

            position = mere.position;
>>>>>>> dab0caa908c3880b213a159d93306614376e9f39
            random = (int)(Math.random()*2);
            if (random == 0){
               bebe.sexe="male"; 
            }
            else{
                bebe.sexe="femelle";
            }
            return bebe;
        }     

    }

    public String donnerNom() {

<<<<<<< HEAD
        String prenom = "buby";
       //Ici on entre un nom et on le donne à la personne
=======
        String prenom = "";
        //Ici on entre un nom et on le donne à la personne
>>>>>>> dab0caa908c3880b213a159d93306614376e9f39

        return prenom;
    }

    public void mourir() {
        statutEtat = 0;
        System.out.println("repose en paix " + prenom + " " + nom);
        if (this.compagnon.sexe.equals("femelle")) {
            this.compagnon.statutMatrimonial = "veuve";
        } else {
            this.compagnon.statutMatrimonial = "veuf";
        }

    }


    public void seDeplacer( Lieux lieu) { // a modifier String lieu en Lieu lieu quand la classe existera
        if (lieu != null){
            position = lieu;
        }

    }

<<<<<<< HEAD
    public void seduire( EtreVivant personne) {
       
        int monCounter = 0;
        int personneCounter = 0;
        int i = 0;
        int j = 0;
        //for(int i = 0; i < ListContact.size(); i++){
        if(ListContact.size()!=0){
            while(i < ListContact.size() +1 || ListContact.get(i).getId()!=personne.monId){
                System.out.println("i="+i);
                if(ListContact.get(i) != null){
                if(ListContact.get(i).getId() == personne.monId){
                    ListContact.get(i).setJaugeRelationnelle(ListContact.get(i).getJaugeRelationnelle()+1);
                    
                    
                    if(personne.ListContact.size()!=0){
                    //for(int j = 0; j< personne.ListContact.size();j++){
                        while(j < personne.ListContact.size() +1 || personne.ListContact.get(i).getId()!=monId){
                            if ( personne.ListContact.get(j) != null){
                            if(personne.ListContact.get(j).getId() == monId){
                                personne.ListContact.get(j).setJaugeRelationnelle(personne.ListContact.get(j).getJaugeRelationnelle()+1);
                                
                            }
                            }
                            j++;
                            personneCounter++;
                        }
                    }
                    else{
                         personne.ListContact.add(new Relationnelle(monId));
                    }
                    
                }
                }
                i++;
                monCounter++;
=======
    /*public void seduire(EtreVivant personne) {
        // plus compliqué car faut que se soit une jauge par personne
        for(int i = 0; i < ListContact.size(); i++){
            if(ListContact.get(i).id == personne.monId){
                
>>>>>>> dab0caa908c3880b213a159d93306614376e9f39
            }
            
        }
        else{
           ListContact.add(new Relationnelle(personne.monId)); 
        }
        if(ListContact.get(monCounter).equals(null)){
            
            ListContact.add(new Relationnelle(personne.monId));
            
                    
        }
        if(personne.ListContact.size() == 0 ){
            personne.ListContact.add(new Relationnelle(monId));
        }
        else if(personne.ListContact.get(personneCounter).equals(null)){
            personne.ListContact.add(new Relationnelle(monId));
        }
        
        
    }
*/

    public void communiquer( EtreVivant personne) {
        if (jaugeHumeur < 10){
             jaugeHumeur++;
        }
       

    }

    public void apprendre() {
        if (jaugeIntelligence < 10){
            jaugeIntelligence++;
        }
        

    }

    public void seFaireBeau() {
        if (jaugeHumeur < 10){
            jaugeHumeur++;
        }
        
    }

    public void acheter(String objet) {  // remplacer String par Objet quand la classe existera

    }

    public void divorcer(EtreVivant personne) {
        this.compagnon.statutMatrimonial = "célibataire";
        statutMatrimonial = "célibataire";
    }

    public void seBattre(EtreVivant personne) {

    }

    public void allerAuxToilettes() {
        this.jaugeProprete += 2;
    }

    public void afficherInformations() {

        System.out.println("nom : " + this.nom);
        System.out.println("prénom : " + this.prenom);
        System.out.println("age : " + this.age);

        System.out.println("Abilité "+this.jaugeAbilite+" /10");
        System.out.println("Charme "+this.jaugeCharme+" /10");
        System.out.println("Force "+this.jaugeForce+" /10");
        System.out.println("Intelligence "+this.jaugeIntelligence+" /10");
        System.out.println("Gentillesse "+this.jaugeGentillesse+" /10");

        System.out.println("Fatigue "+this.jaugeFatigue+" /10");
        System.out.println("Humeur "+this.jaugeHumeur+" /10");
        System.out.println("Propreté "+this.jaugeProprete+" /10");
        System.out.println("Faim "+this.jaugeFaim+" /10");

    }

    //************ GET et SET ***************//
    public int getStatutLiberte() {

        return this.statutLiberte;

    }

    public void setStatutLiberte(int statut) {
        this.statutLiberte = statut;

    }

    public int getAge() {
        return age;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getJaugeGentillesse() {
        return jaugeGentillesse;
    }

    public void setJaugeGentillesse(int jaugeGentillesse) {
        this.jaugeGentillesse = jaugeGentillesse;
    }

    public int getJaugeProprete() {
        return jaugeProprete;
    }

    public void setJaugeProprete(int jaugeProprete) {
        this.jaugeProprete = jaugeProprete;
    }

    public int getJaugeFaim() {
        return jaugeFaim;
    }

    public void setJaugeFaim(int jaugeFaim) {
        this.jaugeFaim = jaugeFaim;
    }

    public int getJaugeHumeur() {
        return jaugeHumeur;
    }

    public void setJaugeHumeur(int jaugeHumeur) {
        this.jaugeHumeur = jaugeHumeur;
    }

    public int getJaugeFatigue() {
        return jaugeFatigue;
    }

    public void setJaugeFatigue(int jaugeFatigue) {
        this.jaugeFatigue = jaugeFatigue;
    }

    public int getJaugeIntelligence() {
        return jaugeIntelligence;
    }

    public void setJaugeIntelligence(int jaugeIntelligence) {
        this.jaugeIntelligence = jaugeIntelligence;
    }

    public int getJaugeForce() {
        return jaugeForce;
    }

    public void setJaugeForce(int jaugeForce) {
        this.jaugeForce = jaugeForce;
    }

    public int getJaugeCharme() {
        return jaugeCharme;
    }

    public void setJaugeCharme(int jaugeCharme) {
        this.jaugeCharme = jaugeCharme;
    }

    public int getJaugeAbilite() {
        return jaugeAbilite;
    }

    public void setJaugeAbilite(int jaugeAbilite) {
        this.jaugeAbilite = jaugeAbilite;
    }

    public String getStatusMatrimonial() {
        return statutMatrimonial;
    }

    public void setStatusMatrimonial(String status) {
        this.statutMatrimonial = status;
    }

    public EtreVivant getPere() {
        return pere;
    }

    public EtreVivant getMere() {
        return mere;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;

    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;

    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public EtreVivant getCompagnon() {
        return compagnon;
    }

    public void setCompagnon(EtreVivant compagnon) {
        this.compagnon = compagnon;
    }

}
