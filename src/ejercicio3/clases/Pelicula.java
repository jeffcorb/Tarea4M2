package ejercicio3.clases;

public class Pelicula {
    private final String nombre;
    private final int epoca;
    private final int duracion;
    private final String genero;
    private final double precioTicket;

    public Pelicula(String nombre, int epoca, int duracion, String genero, double precioTicket) {
        this.nombre = nombre;
        this.epoca = epoca;
        this.duracion = duracion;
        this.genero = genero;
        this.precioTicket = precioTicket;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s%nEpoca: %d%nDuracion: %d%nGenero: %s%nPrecio: %.2f%n"
                , nombre, epoca, duracion, genero, precioTicket);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEpoca() {
        return epoca;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    public double getPrecioTicket() {
        return precioTicket;
    }
}
