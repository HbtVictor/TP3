package StrategyPattern;
import StrategyPattern.ExpressStrategy;
import StrategyPattern.InternationalStrategy;
import StrategyPattern.Commande;

public class Main {
    public static void main(String[] args) {

        // Création d'une commande type
        Commande commande = new Commande(89.99, 8.5); // 89.99€ HT, 8.5 kg

        System.out.println("=== Démonstration du Strategy Pattern ===\n");

        // 1. Livraison Standard (par défaut)
        commande.afficherRecapitulatif();

        // 2. Le client change d'avis → Express
        System.out.println("Le client passe en livraison Express...\n");
        commande.setStrategieLivraison(new ExpressStrategy());
        commande.afficherRecapitulatif();

        // 3. Le client veut envoyer à l'étranger → International
        System.out.println("Le client choisit la livraison Internationale...\n");
        commande.setStrategieLivraison(new InternationalStrategy());
        commande.afficherRecapitulatif();

        // Bonus : on peut même tester une autre commande
        Commande grosseCommande = new Commande(450.00, 2.0);
        grosseCommande.setStrategieLivraison(new InternationalStrategy());
        System.out.println("Exemple avec une commande plus chère (450€ HT, 2kg) :");
        grosseCommande.afficherRecapitulatif();
    }
}