package ejercicio1.clases;

public abstract class FiguraGeometrica {
    private final Color colorRelleno;
    private final Color colorBorde;
    private final int grosorLinea;
    protected double perimetro;
    protected double area;

    public FiguraGeometrica(Color colorRelleno, Color colorBorde, int grosorLinea) {
        this.colorRelleno = colorRelleno;
        this.colorBorde = colorBorde;
        this.grosorLinea = grosorLinea;
    }

    public String colorearFigura() {
        return String.format("Colore el relleno de color %s en un perimetro de %.2f." +
                "Coloreo el borde de color %s en un area de %.2f. Para esto" +
                "he usado un pincel de %d px %n", colorRelleno, perimetro, colorBorde, area, grosorLinea);
    }

    public abstract void calcularPerimetro();

    public abstract void calcularArea();

    public Color getColorRelleno() {
        return colorRelleno;
    }

    public Color getColorBorde() {
        return colorBorde;
    }

    public int getGrosorLinea() {
        return grosorLinea;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }
}
