package VisitorPattern;

public interface Visitor {
    void visitText(Text text);
    void visitImage(Image image);
    void visitTable(Table table);
}
