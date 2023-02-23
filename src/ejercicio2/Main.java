package ejercicio2;

import ejercicio2.clases.Cilindro;
import ejercicio2.clases.Cono;
import ejercicio2.clases.Cubo;
import ejercicio2.clases.Esfera;
import ejercicio2.clases.GenerarMensajes;
import utilities.Aleatorio;
import utilities.FileManager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final var aleatorio = new Aleatorio();
        final var cubo = new Cubo(aleatorio.generarRandomDouble(2, 3));
        final var cilindro = new Cilindro(aleatorio.generarRandomDouble(2, 8), aleatorio.generarRandomDouble(3, 5));
        final var cono = new Cono(aleatorio.generarRandomDouble(2, 6),
                aleatorio.generarRandomDouble(3, 6), aleatorio.generarRandomDouble(3, 7));
        final var esfera = new Esfera(aleatorio.generarRandomDouble(3, 9));

        final var lista = new ArrayList<String>();
        lista.add(GenerarMensajes.crearMensaje(cono));
        lista.add(GenerarMensajes.crearMensaje(cubo));
        lista.add(GenerarMensajes.crearMensaje(cilindro));
        lista.add(GenerarMensajes.crearMensaje(esfera));

        FileManager.escribirFile("src/ejercicio2/output/output.txt", lista);
    }
}
