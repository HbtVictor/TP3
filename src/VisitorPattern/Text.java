package VisitorPattern;

public class Text implements DocumentElement {
    private final String contenu;

    public Text(String contenu) {
        this.contenu = contenu;
    }

    public String getContenu() {
        return contenu;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitText(this);
    }
}
