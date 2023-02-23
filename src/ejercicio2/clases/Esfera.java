package ejercicio2.clases;

public class Esfera implements IFiguraEspacial {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return String.format("El cono cuenta con radio %.2f", radio);
    }

    @Override
    public double calcularVolumen() {
        return (4 * Math.pow(radio, 3) * Math.PI / 3);
    }

    @Override
    public double calcularArea() {
        return (4 * Math.PI * Math.pow(radio, 2));
    }
}
