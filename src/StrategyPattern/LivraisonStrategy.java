package StrategyPattern;

/**
 * Interface Strategy
 * Définit le contrat pour toutes les stratégies de calcul des frais de livraison
 */
public interface LivraisonStrategy {

    /**
     * Calcule les frais de livraison pour une commande donnée
     * @param commande la commande concernée
     * @return les frais de livraison en euros
     */
    double calculerFrais(Commande commande);
}
