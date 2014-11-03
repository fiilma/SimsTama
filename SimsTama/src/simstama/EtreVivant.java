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
    private String statutMatrimonial = "célibataire";
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
    private int statutLiberte;

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
    }

    public EtreVivant() {
    }

    ;
    
    //******** Methodes de la classe *******//
    public void feterSonAnniversaire(EtreVivant personne) {
        personne.age++;
        System.out.println("joyeux anniversaire " + personne.prenom);
    }

    public void manger(EtreVivant personne) {
        jaugeFaim = 10;
    }

    public void boire(EtreVivant personne) {
        if (jaugeFaim < 10) {
            jaugeFaim++;
        }

    }

    public void seLaver(EtreVivant personne) {
        jaugeProprete = 10;
    }

    public void seMarier(EtreVivant personne1, EtreVivant personne2) {
        if (personne1.sexe.equals("male") && personne2.sexe.equals("femele")) {
            System.out.println("Félicitation monsieur et madame" + personne1.nom);
        } else if (personne2.sexe.equals("male") && personne1.sexe.equals("femele")) {
            System.out.println("Félicitation monsieur et madame" + personne2.nom);
        } else if (personne2.sexe.equals("male") && personne1.sexe.equals("male")) {
            System.out.println("Felicitation aux jeunes mariés");
        } else {
            System.out.println("Felicitation aux jeunes mariées");
        }
        personne1.statutMatrimonial = "en couple avec " + personne2.prenom + " " + personne2.nom;
        personne2.statutMatrimonial = "en couple avec " + personne1.prenom + " " + personne1.nom;

    }

    public EtreVivant faireUnBebe(EtreVivant papa, EtreVivant maman, String prenom) {

        EtreVivant bebe = new EtreVivant(nom, papa.nom);
        age = 0;

        return bebe;
    }

    public void mourir(EtreVivant personne) {
        personne.statutMatrimonial = "mort";
    }

    public void seDeplacer(EtreVivant personne, String lieu) { // a modifier String lieu en Lieu lieu quand la classe existera

    }

    public void seduire(EtreVivant personne1, EtreVivant personne2) {

    }

    public void communiquer(EtreVivant personne1, EtreVivant personne2) {

    }

    public void apprendre(EtreVivant personne) {

    }

    public void seFaireBeau(EtreVivant personne) {

    }

    public void acheter(EtreVivant personne, String objet) {  // remplacer String par Objet quand la classe existera

    }

    public void divorcer(EtreVivant personne1, EtreVivant personne2) {

    }

    public void seBattre(EtreVivant personne1, EtreVivant personne2) {

    }

    public void allerAuxToilettes(EtreVivant personne) {

    }

    //**************** getter et setter ***************
    <<<<<<< HEAD //************ GET et SET ***************//


    public int getStatutLiberte() {

        return this.statutLiberte;

    }

    public void setStatutLiberte(int statut) {
        this.statutLiberte = statut;

    }

    =======

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setAge(int age) {
        this.age = age;
    }
    >>>>>>> ee8e13cbaed6f34b7bc1b13634776c470ec6a1f0

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
        return statutMatrimonial;
    }

    public void setStatus(String status) {
        this.statutMatrimonial = status;
    }

    public String getPere() {
        return pere;
    }

    public String getMere() {
        return mere;
    }

    <<<<<<< HEAD

    =======
    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;

    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    public void setPreom(String prenom) {
        this.prenom = prenom;

    }

    /**
     * @return the sexe
     */
    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;

    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    >>>>>>> a4ab2885b594c0199fd17d7c26e9af06014b8598


            
}
