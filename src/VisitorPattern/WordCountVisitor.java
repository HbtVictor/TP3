package VisitorPattern;

public class WordCountVisitor implements Visitor {
    private int compteurMots = 0;

    @Override
    public void visitText(Text text) {
        // Compte les mots (simplifié : split sur espaces)
        String[] mots = text.getContenu().trim().split("\\s+");
        if (!text.getContenu().trim().isEmpty()) {
            compteurMots += mots.length;
        }
    }

    @Override
    public void visitImage(Image image) {
        // Les images ne contiennent pas de mots
    }

    @Override
    public void visitTable(Table table) {
        // On compte aussi les mots dans les cellules du tableau
        for (int i = 0; i < table.getLignes(); i++) {
            for (int j = 0; j < table.getColonnes(); j++) {
                String cell = table.getCellule(i, j);
                if (cell != null && !cell.trim().isEmpty()) {
                    compteurMots += cell.trim().split("\\s+").length;
                }
            }
        }
    }

    public int getNombreDeMots() {
        return compteurMots;
    }
}
