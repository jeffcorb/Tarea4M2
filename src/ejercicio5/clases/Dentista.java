package ejercicio5.clases;

public class Dentista extends Persona {
    private final int numPacientesSinCaries;
    private final int numPacientesTotales;
    private final String nombreConsultorio;

    public Dentista(String nombre, String apellido, int edad, int numPacientesSinCaries, int numPacientesTotales, String nombreConsultorio) {
        super(nombre, apellido, edad);
        this.numPacientesSinCaries = numPacientesSinCaries;
        this.numPacientesTotales = numPacientesTotales;
        this.nombreConsultorio = nombreConsultorio;
    }

    public int getNumPacientesSinCaries() {
        return numPacientesSinCaries;
    }

    public int getNumPacientesTotales() {
        return numPacientesTotales;
    }

    public String getNombreConsultorio() {
        return nombreConsultorio;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s%n Apellido: %s%n Edad: %d%n Pacientes sin caries: %d%n " +
                "Pacientes Totales: %d%n Consultorio: %s%n", nombre, apellido, edad, numPacientesSinCaries, numPacientesTotales, nombreConsultorio);
    }

    @Override
    public void calcularExito() {
        exito = numPacientesSinCaries * 100 / numPacientesTotales;
    }
}

