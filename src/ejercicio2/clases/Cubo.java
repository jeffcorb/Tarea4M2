package ejercicio2.clases;

public class Cubo implements IFiguraEspacial {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return ("El cubo cuenta con un lado: " + lado);
    }

    @Override
    public double calcularVolumen() {
        return (Math.pow(lado, 3));
    }

    @Override
    public double calcularArea() {
        return (6 * Math.pow(lado, 2));
    }
}
