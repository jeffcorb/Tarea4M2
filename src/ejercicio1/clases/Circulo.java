package ejercicio1.clases;

public class Circulo extends FiguraGeometrica {
    private final double radio;

    public Circulo(Color colorRelleno, Color colorBorde, int grosorLinea, double radio) {
        super(colorRelleno, colorBorde, grosorLinea);
        this.radio = radio;
    }

    @Override
    public void calcularPerimetro() {
        perimetro = 2 * Math.PI * radio;
    }

    @Override
    public void calcularArea() {
        area = Math.PI * Math.pow(radio, 2);
    }

    public double getRadio() {
        return radio;
    }
}
