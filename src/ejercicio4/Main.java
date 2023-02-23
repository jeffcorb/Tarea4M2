package ejercicio4;

import ejercicio4.clases.VideoJuego;
import utilities.FileManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final var listaVidejuego = FileManager.leerFile("src/ejercicio4/input/informacionVideojuegos.txt");

        final var listaNintendo = new ArrayList<String>();
        final var listaXbox = new ArrayList<String>();
        final var listaPlayStation = new ArrayList<String>();

        generarData(listaVidejuego, listaNintendo, listaPlayStation, listaXbox);

        FileManager.escribirFile("src/ejercicio4/output/nintendo.txt", listaNintendo);
        FileManager.escribirFile("src/ejercicio4/output/playStation.txt", listaPlayStation);
        FileManager.escribirFile("src/ejercicio4/output/xbox.txt", listaXbox);
    }

    private static void generarData(List<String> listaVideojuegos, List<String> listaNintendo, List<String> listaPlayStation, List<String> listaXbox) {
        for (final var elemento : listaVideojuegos) {
            final var videojuego = crearVideojuego(elemento.split(","));
            llenarLista(videojuego, listaNintendo, listaPlayStation, listaXbox);
        }
    }

    private static VideoJuego crearVideojuego(String[] array) {
        return new VideoJuego(array[0], Integer.parseInt(array[1]), Double.parseDouble(array[2]), Integer.parseInt(array[3]),
                array[4], array[5]);
    }

    private static void llenarLista(VideoJuego videoJuego, List<String> listaNintendo, List<String> listaPlayStation,
                                    List<String> listaXbox) {
        switch (videoJuego.getEmpresa()) {
            case "NINTENDO":
                listaNintendo.add(videoJuego.toString());
                break;
            case "XBOX":
                listaPlayStation.add(videoJuego.toString());
                break;
            case "PLAY STATION":
                listaXbox.add(videoJuego.toString());
                break;
            default:
                System.out.printf("Empresa incorrecta para el videojuego %s%n", videoJuego.getNombre());
        }
    }
}
