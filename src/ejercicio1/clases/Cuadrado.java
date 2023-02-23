package ejercicio1.clases;

public class Cuadrado extends FiguraGeometrica {
    private final double lado;

    public Cuadrado(Color colorRelleno, Color colorBorde, int grosorLinea, double lado) {
        super(colorRelleno, colorBorde, grosorLinea);
        this.lado = lado;
    }

    @Override
    public void calcularPerimetro() {
        perimetro = 4 * lado;
    }

    @Override
    public void calcularArea() {
        area = Math.pow(lado, 2);
    }

    public double getLado() {
        return lado;
    }
}
