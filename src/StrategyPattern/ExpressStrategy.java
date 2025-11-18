package StrategyPattern;

public class ExpressStrategy implements LivraisonStrategy {

    @Override
    public double calculerFrais(Commande commande) {
        // Express : 14.90€ fixe + 1.20€ par kg
        return 14.90 + (commande.getPoidsKg() * 1.20);
    }

    @Override
    public String toString() {
        return "Livraison Express (14.90€ + 1.20€/kg)";
    }
}