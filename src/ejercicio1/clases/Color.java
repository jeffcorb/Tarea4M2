package ejercicio1.clases;

public class Color {
    private final String nombre;
    private final String hexadecimal;

    public Color(String nombre, String hexadecimal) {
        this.nombre = nombre;
        this.hexadecimal = hexadecimal;
    }

    @Override
    public String toString() {
        return (String.format("Color: %s, hexadecimal: %s", nombre, hexadecimal));
    }

    public String getNombre() {
        return nombre;
    }

    public String getHexadecimal() {
        return hexadecimal;
    }
}
