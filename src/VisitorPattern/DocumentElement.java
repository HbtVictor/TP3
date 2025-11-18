package VisitorPattern;

/**
 * Interface Element
 * Tous les éléments du document (Text, Image, Table) implémentent cette méthode
 * qui permet l'acceptation d'un Visitor → Double Dispatch
 */
public interface DocumentElement {
    void accept(Visitor visitor);
}
