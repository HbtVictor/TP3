package VisitorPattern;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private final List<DocumentElement> elements = new ArrayList<>();

    public void ajouter(DocumentElement element) {
        elements.add(element);
    }

    // Très important : le document propage le visiteur à tous ses éléments
    public void accept(Visitor visitor) {
        for (DocumentElement element : elements) {
            element.accept(visitor);
        }
    }
}
