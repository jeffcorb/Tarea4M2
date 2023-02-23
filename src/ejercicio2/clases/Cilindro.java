package ejercicio2.clases;

public class Cilindro implements IFiguraEspacial {

    private double altura;
    private double radio;

    public Cilindro(double altura, double radio) {
        this.altura = altura;
        this.radio = radio;
    }

    @Override
    public String toString() {
        return String.format("El cilindro cuenta con altura %.2f y radio %.2f", altura, radio);
    }

    @Override

    public double calcularVolumen() {
        return (Math.pow(radio, 2) * Math.PI * altura);
    }

    @Override
    public double calcularArea() {
        return (2 * radio * Math.PI * (altura + radio));
    }
}
