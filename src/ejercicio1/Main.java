package ejercicio1;

import ejercicio1.clases.Circulo;
import ejercicio1.clases.Color;
import ejercicio1.clases.Cuadrado;
import ejercicio1.clases.Triangulo;
import utilities.FileManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        final var listaFiguras = FileManager.leerFile("src/ejercicio1/input/figuras.txt");
        final var listColores = FileManager.leerFile("src/ejercicio1/input/colores.txt");
        final var output = new ArrayList<String>();
        final var mapColores = crearColoresMap(listColores);
        generarData(listaFiguras, output, mapColores);
        FileManager.escribirFile("src/ejercicio1/output/output.txt", output);

    }

    private static Map<String, String> crearColoresMap(List<String> lista) {
        final var mapColores = new HashMap<String, String>();
        for (var elemento : lista) {
            final var array = elemento.split(",");
            mapColores.put(array[0], array[1]);
        }
        return mapColores;
    }

    private static void generarData(List<String> listaInput, List<String> listaOutput, Map<String, String> mapColores) {
        for (var elemento : listaInput) {
            final var array = elemento.split(",");
            final var colorRelleno = new Color(array[0], mapColores.get(array[0]));
            final var colorBorde = new Color(array[1], mapColores.get(array[1]));
            final var tipoFigura = array[array.length - 1];
            final var grosorLinea = Integer.parseInt(array[2]);

            switch (tipoFigura) {
                case "CIRCULO":
                    final var circulo = generarCirculo(Double.parseDouble(array[3]), colorBorde, colorRelleno, grosorLinea);
                    listaOutput.add(circulo.colorearFigura());
                    break;

                case "TRIANGULO":
                    final var triangulo = generarTriangulo(Double.parseDouble(array[3]), Double.parseDouble(array[4]), Double.parseDouble(array[5]),
                            colorRelleno, colorBorde, grosorLinea);
                    listaOutput.add(triangulo.colorearFigura());

                    break;

                case "CUADRADO":
                    final var cuadrado = generarCuadrado(Double.parseDouble(array[3]), colorBorde, colorRelleno, grosorLinea);
                    listaOutput.add(cuadrado.colorearFigura());
                    break;
                default:
                    System.out.println("Figura incorrecta");
            }
        }
    }

    private static Circulo generarCirculo(double radio, Color colorBorde, Color colorRelleno, int grosorLinea) {
        final var circulo = new Circulo(colorRelleno, colorBorde, grosorLinea, radio);
        circulo.calcularPerimetro();
        circulo.calcularArea();
        return circulo;
    }

    private static Cuadrado generarCuadrado(double lado, Color colorBorde, Color colorRelleno, int grosorLinea) {
        final var cuadrado = new Cuadrado(colorRelleno, colorBorde, grosorLinea, lado);
        cuadrado.calcularArea();
        cuadrado.calcularPerimetro();
        return cuadrado;
    }

    private static Triangulo generarTriangulo(double lado1, double lado2, double lado3,
                                              Color colorRelleno, Color colorBorde, int grosorLinea) {
        final var triangulo = new Triangulo(colorRelleno, colorBorde, grosorLinea, lado1, lado2, lado3);
        triangulo.calcularArea();
        triangulo.calcularPerimetro();
        return triangulo;
    }
}
