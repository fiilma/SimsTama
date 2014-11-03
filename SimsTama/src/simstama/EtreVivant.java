/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simstama;

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
    private String status;
    private String pere;
    private String mere;
    private int jaugeGentillesse;
    private int jaugeProprete;
    private int jaugeFaim;
    private int jaugeHumeur;
    private int jaugeFatigue;
    private int jaugeIntelligence;
    private int jaugeForce;
    private int jaugeCharme;
    private int jaugeAbilite;

    

    //********* Constructeurs *********//
    
    public EtreVivant(String nom, String prenom,String sexe){
        this.prenom = prenom;
        this.nom = nom;
        this.sexe = sexe;
        
    }
    public EtreVivant(String nom, String prenom){
        this.prenom = prenom;
        this.nom = nom;
        
    }
    public EtreVivant(){};
    
    //******** Methodes de la classe *******//
    public void feterSonAnniversaire(EtreVivant personne){
        
    }
    
    public void manger(EtreVivant personne){
        
    }
    
    public void boire(EtreVivant personne){
        
    }
    
    public void seLaver(EtreVivant personne){
        
    }
    
    public void seMarier(EtreVivant personne1,EtreVivant personne2){
        
    }
    
    public EtreVivant faireUnBebe(EtreVivant personne){
        
        EtreVivant bebe = new EtreVivant("bob", "marley");
        
        
        return bebe;
    }
    
    public void mourir(EtreVivant personne){
        
    }
    
    public void seDeplacer(EtreVivant personne, String lieu){ // a modifier String lieu en Lieu lieu quand la classe existera
        
    }
    
    public void seduire(EtreVivant personne1,EtreVivant personne2){
        
    }
    
    public void communiquer(EtreVivant personne1,EtreVivant personne2){
        
    }
    
    public void apprendre(EtreVivant personne){
        
    }
    
    public void seFaireBeau(EtreVivant personne){
        
    }
    
    public void acheter(EtreVivant personne, String objet){  // remplacer String par Objet quand la classe existera
        
    }
    
    public void divorcer(EtreVivant personne1,EtreVivant personne2){
        
    }
    
    public void seBattre(EtreVivant personne1,EtreVivant personne2){
        
    }
    
    public void allerAuxToilettes(EtreVivant personne){
        
    }

    
    
    
    
    
    
    
    // getter et setter
    
    
    
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


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }

 
    public String getPere() {
        return pere;
    }

   
    public String getMere() {
        return mere;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }
    
    public void setPreom(String prenom){
        this.prenom=prenom;
    
    }

    /**
     * @return the sexe
     */
    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe){
        this.sexe=sexe;
        
    }
    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }


            
}
