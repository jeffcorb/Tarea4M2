package ejercicio5;

import ejercicio5.clases.Abogado;
import ejercicio5.clases.Dentista;
import ejercicio5.clases.Ingeniero;
import utilities.FileManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final var fileProfesiones = FileManager.leerFile("src/ejercicio5/input/informacionAmigos.txt");
        final var listaAbogado = new ArrayList<String>();
        final var listaDentista = new ArrayList<String>();
        final var listaIngenieros = new ArrayList<String>();
        generarData(fileProfesiones, listaAbogado, listaDentista, listaIngenieros);
        FileManager.escribirFile("src/ejercicio5/output/abogados.txt", listaAbogado);
        FileManager.escribirFile("src/ejercicio5/output/dentistas.txt", listaDentista);
        FileManager.escribirFile("src/ejercicio5/output/ingenieros.txt", listaIngenieros);
    }

    private static void generarData(List<String> listaProfesiones, List<String> abogados,
                                    List<String> dentistas, List<String> ingenieros) {
        for (final var elemento : listaProfesiones) {
            final var array = elemento.split(",");
            final var profesion = array[6];
            switch (profesion) {
                case "ABOGADO":
                    final var abogado = crearAbogado(array);
                    abogados.add(abogado.toString());
                    break;
                case "DENTISTA":
                    final var dentista = crearDentista(array);
                    dentistas.add(dentista.toString());
                    break;
                case "INGENIERO":
                    final var ingeniero = crearIngeniero(array);
                    ingenieros.add(ingeniero.toString());
                    break;
                default:
                    System.out.println("No es una profesion aceptada");
            }

        }
    }

    private static Abogado crearAbogado(String[] array) {
        final var abogado = new Abogado(array[0], array[1], Integer.parseInt(array[2]), Integer.parseInt(array[3]),
                Integer.parseInt(array[4]), array[5]);
        return abogado;
    }

    private static Dentista crearDentista(String[] array) {
        final var dentista = new Dentista(array[0], array[1], Integer.parseInt(array[2]), Integer.parseInt(array[3]),
                Integer.parseInt(array[4]), array[5]);
        return dentista;
    }

    private static Ingeniero crearIngeniero(String[] array) {
        final var ingeniero = new Ingeniero(array[0], array[1], Integer.parseInt(array[2]), Integer.parseInt(array[3]),
                Integer.parseInt(array[4]), array[5]);
        return ingeniero;
    }
}
