package ejercicio3;

import ejercicio3.clases.Pelicula;
import utilities.FileManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final var listaPelicula = FileManager.leerFile("src/ejercicio3/input/informacionPeliculas.txt");

        final var listaPeliculasAccion = new ArrayList<String>();
        final var listaPeliculasComedia = new ArrayList<String>();
        final var listaPeliculasTerror = new ArrayList<String>();

        generarData(listaPelicula, listaPeliculasAccion, listaPeliculasComedia, listaPeliculasTerror);

        FileManager.escribirFile("src/ejercicio3/output/accion.txt", listaPeliculasAccion);
        FileManager.escribirFile("src/ejercicio3/output/comedia.txt", listaPeliculasComedia);
        FileManager.escribirFile("src/ejercicio3/output/terror.txt", listaPeliculasTerror);
    }

    private static void generarData(List<String> listaPelicula, List<String> listaPeliculasAccion, List<String> listaPeliculasComedia,
                                    List<String> listaPeliculasTerror) {
        for (final var elemento : listaPelicula) {
            final var pelicula = crearPelicula(elemento.split(","));
            llenarLista(pelicula, listaPeliculasAccion, listaPeliculasComedia, listaPeliculasTerror);
        }
    }

    private static Pelicula crearPelicula(String[] array) {
        return new Pelicula(array[0], Integer.parseInt(array[1]), Integer.parseInt(array[2])
                , array[3], Double.parseDouble(array[4]));
    }

    private static void llenarLista(Pelicula pelicula, List<String> listaPeliculasAccion, List<String> listaPeliculasComedia,
                                    List<String> listaPeliculasTerror) {
        switch (pelicula.getGenero()) {
            case "TERROR":
                listaPeliculasTerror.add(pelicula.toString());
                break;
            case "ACCION":
                listaPeliculasAccion.add(pelicula.toString());
                break;
            case "COMEDIA":
                listaPeliculasComedia.add(pelicula.toString());
                break;
            default:
                System.out.printf("Genero Incorrecto para la pelicula %s%n", pelicula.getNombre());
        }
    }
}
