package VisitorPattern;

public class Image implements DocumentElement {
    private final String chemin;
    private final int largeur;
    private final int hauteur;

    public Image(String chemin, int largeur, int hauteur) {
        this.chemin = chemin;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public String getChemin() { return chemin; }
    public int getLargeur() { return largeur; }
    public int getHauteur() { return hauteur; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImage(this);
    }
}
