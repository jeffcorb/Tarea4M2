package ejercicio5.clases;

public class Abogado extends Persona {
    private final int numJuiciosGanados;
    private final int numJuiciosParticipados;
    private final String nombreNotaria;

    public Abogado(String nombre, String apellido, int edad, int numJuiciosGanados, int numJuiciosParticipados, String nombreNotaria) {
        super(nombre, apellido, edad);
        this.numJuiciosGanados = numJuiciosGanados;
        this.numJuiciosParticipados = numJuiciosParticipados;
        this.nombreNotaria = nombreNotaria;
    }

    @Override
    public void calcularExito() {
        exito = (numJuiciosGanados * 100) / numJuiciosParticipados;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s%n Apellido: %s%n Edad: %d%n Juicios Ganados: %d%n " +
                "Juicios Participados: %d%n Notaria: %s%n", nombre, apellido, edad, numJuiciosGanados, numJuiciosParticipados, nombreNotaria);
    }
}
