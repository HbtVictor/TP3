package StrategyPattern;

public class StandardStrategy implements LivraisonStrategy {


    @Override
    public double calculerFrais(Commande commande) {
        //Livraison standard : 5.90€ fixe + 0.50€ par kg au-dessus de 5kg
        double fraisBase = 5.90;
        if(commande.getPoidsKg() > 5) {
            double supplement = (commande.getPoidsKg() - 5) * 0.50;
            return fraisBase + supplement;
        }
        return fraisBase;
    }


    @Override
    public String toString() {
        return "Livraison Standard (5.90€ + 0.50€/kg au-dessus de 5kg)";
    }
}
