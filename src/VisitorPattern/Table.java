package VisitorPattern;

public class Table implements DocumentElement {
    private final int lignes;
    private final int colonnes;
    private final String[][] donnees;

    public Table(int lignes, int colonnes) {
        this.lignes = lignes;
        this.colonnes = colonnes;
        this.donnees = new String[lignes][colonnes];
    }

    public void setCellule(int ligne, int col, String valeur) {
        if (ligne >= 0 && ligne < lignes && col >= 0 && col < colonnes) {
            donnees[ligne][col] = valeur;
        }
    }

    public int getLignes() { return lignes; }
    public int getColonnes() { return colonnes; }
    public String getCellule(int l, int c) { return donnees[l][c]; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }
}