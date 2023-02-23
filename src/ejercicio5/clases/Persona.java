package ejercicio5.clases;

public abstract class Persona {
    protected final String nombre;
    protected final String apellido;
    protected final int edad;
    protected double exito;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public abstract void calcularExito();

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public double getExito() {
        return exito;
    }
}
