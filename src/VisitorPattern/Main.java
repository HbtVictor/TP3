package VisitorPattern;

public class Main {
    public static void main(String[] args) {
        // Création du document
        Document doc = new Document();

        doc.ajouter(new Text("Bienvenue dans mon document !"));
        doc.ajouter(new Text("Ceci est un paragraphe avec plusieurs mots pour tester le compteur."));
        doc.ajouter(new Image("photos/vacances.jpg", 800, 600));
        doc.ajouter(new Text("Voici un tableau des ventes :"));

        Table table = new Table(3, 3);
        table.setCellule(0, 0, "Produit");
        table.setCellule(0, 1, "Quantité");
        table.setCellule(0, 2, "Prix");
        table.setCellule(1, 0, "Ordinateur");
        table.setCellule(1, 1, "15");
        table.setCellule(1, 2, "1200€");
        table.setCellule(2, 0, "Souris");
        table.setCellule(2, 1, "150");
        table.setCellule(2, 2, "25€");
        doc.ajouter(table);

        doc.ajouter(new Text("Fin du document."));

        System.out.println("=== Démonstration du Visitor Pattern ===\n");

        // 1. Export PDF (simulation HTML → PDF)
        ExportPDFVisitor pdfVisitor = new ExportPDFVisitor();
        doc.accept(pdfVisitor);
        System.out.println("--- Export PDF généré ---\n");
        System.out.println(pdfVisitor.getResultatPDF());

        // 2. Comptage de mots (nouvelle fonctionnalité sans toucher aux classes élément !)
        WordCountVisitor wordVisitor = new WordCountVisitor();
        doc.accept(wordVisitor);
        System.out.println("\n--- Statistiques ---");
        System.out.println("Nombre total de mots dans le document : " + wordVisitor.getNombreDeMots());
    }
}
