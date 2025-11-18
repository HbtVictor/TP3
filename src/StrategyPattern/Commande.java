package StrategyPattern;

public class Commande {

    private double montantHT;      // Montant hors taxes de la commande
    private double poidsKg;        // Poids total en kilogrammes
    private LivraisonStrategy strategieLivraison;  // Stratégie courante

    // Constructeur
    public Commande(double montantHT, double poidsKg) {
        this.montantHT = montantHT;
        this.poidsKg = poidsKg;
        // Par défaut : livraison standard
        this.strategieLivraison = new StandardStrategy();
    }

    // === Getters & Setters ===
    public double getMontantHT() {
        return montantHT;
    }

    public double getPoidsKg() {
        return poidsKg;
    }

    // Changer de stratégie à la volée (très important pour le pattern !)
    public void setStrategieLivraison(LivraisonStrategy strategie) {
        this.strategieLivraison = strategie;
    }

    // Méthode qui utilise la stratégie courante
    public double calculerFraisLivraison() {
        return strategieLivraison.calculerFrais(this);
    }

    // Affichage complet pour la démo
    public void afficherRecapitulatif() {
        System.out.printf("Commande : %.2f€ HT | Poids : %.2f kg%n", montantHT, poidsKg);
        System.out.println("Mode de livraison : " + strategieLivraison);
        System.out.printf("→ Frais de livraison : %.2f€%n", calculerFraisLivraison());
        System.out.printf("→ Total TTC estimé (TVA 20%%) : %.2f€%n",
                montantHT * 1.20 + calculerFraisLivraison());
        System.out.println("-".repeat(50));
    }
}