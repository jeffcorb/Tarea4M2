package ejercicio2.clases;

public class Cono implements IFiguraEspacial {

    private final double altura;
    private final double radio;
    private final double generatriz;

    public Cono(double altura, double radio, double generatriz) {
        this.altura = altura;
        this.radio = radio;
        this.generatriz = generatriz;
    }

    @Override
    public String toString() {
        return String.format("El cono cuenta con altura %.2f, radio %.2f y generatriz %.2f", altura, radio, generatriz);
    }

    @Override
    public double calcularVolumen() {
        return ((Math.PI * Math.pow(radio, 2)) * altura / 3);
    }

    @Override
    public double calcularArea() {
        return (Math.PI * Math.pow(radio, 2) + Math.PI * radio * generatriz);
    }
}
