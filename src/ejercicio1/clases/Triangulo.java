package ejercicio1.clases;

public class Triangulo extends FiguraGeometrica {
    private final double lado1;
    private final double lado2;
    private final double lado3;

    public Triangulo(Color colorRelleno, Color colorBorde, int grosorLinea, double lado1, double lado2, double lado3) {
        super(colorRelleno, colorBorde, grosorLinea);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public void calcularPerimetro() {
        perimetro = lado1 * lado2 * lado3;
    }

    @Override
    public void calcularArea() {
        final var s = (lado1 + lado2 + lado3) / 2;
        area = Math.pow(s * (s - lado1) * (s - lado2) * (s - lado3), 0.5);
    }
}
