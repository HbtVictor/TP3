package StrategyPattern;

public class InternationalStrategy implements LivraisonStrategy {

    @Override
    public double calculerFrais(Commande commande) {
        // International : 29.90€ fixe + 15% du montant HT de la commande
        double fraisFixes = 29.90;
        double pourcentage = commande.getMontantHT() * 0.15;
        return fraisFixes + pourcentage;
    }

    @Override
    public String toString() {
        return "Livraison Internationale (29.90€ + 15% du montant HT)";
    }
}