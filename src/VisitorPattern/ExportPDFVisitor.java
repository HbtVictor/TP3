package VisitorPattern;

public class ExportPDFVisitor implements Visitor {
    private final StringBuilder pdf = new StringBuilder();

    @Override
    public void visitText(Text text) {
        pdf.append("<p>").append(text.getContenu()).append("</p>\n");
    }

    @Override
    public void visitImage(Image image) {
        pdf.append(String.format("<img src=\"%s\" width=\"%d\" height=\"%d\"/>\n",
                image.getChemin(), image.getLargeur(), image.getHauteur()));
    }

    @Override
    public void visitTable(Table table) {
        pdf.append("<table border=\"1\">\n");
        for (int i = 0; i < table.getLignes(); i++) {
            pdf.append("  <tr>\n");
            for (int j = 0; j < table.getColonnes(); j++) {
                String cell = table.getCellule(i, j) != null ? table.getCellule(i, j) : "";
                pdf.append("    <td>").append(cell).append("</td>\n");
            }
            pdf.append("  </tr>\n");
        }
        pdf.append("</table>\n");
    }

    public String getResultatPDF() {
        return pdf.toString();
    }
}
