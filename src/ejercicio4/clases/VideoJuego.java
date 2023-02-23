package ejercicio4.clases;

public class VideoJuego {
    private final String nombre;
    private final int epoca;
    private final double precio;
    private final int duracion;
    private final String genero;
    private final String empresa;

    public VideoJuego(String nombre, int epoca, double precio, int duracion, String genero, String empresa) {
        this.nombre = nombre;
        this.epoca = epoca;
        this.precio = precio;
        this.duracion = duracion;
        this.genero = genero;
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s%nEpoca: %d%nPrecio: %.2f%nDuracion: %d%nGenero: %s%nEmpresa: %s%n",
                nombre, epoca, precio, duracion, genero, empresa);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEpoca() {
        return epoca;
    }

    public double getPrecio() {
        return precio;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    public String getEmpresa() {
        return empresa;
    }
}
