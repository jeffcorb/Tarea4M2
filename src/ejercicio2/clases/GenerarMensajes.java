package ejercicio2.clases;

public class GenerarMensajes {
    public static String crearMensaje(Cubo cubo) {
        return String.format("Figura: Cubo%nInformacion: %s%nArea: %.2f%nVolumen: %.2f %n",
                cubo.toString(), cubo.calcularArea(), cubo.calcularVolumen());
    }

    public static String crearMensaje(Cilindro cilindro) {
        return String.format("Figura: Cilindro%nInformacion: %s %nArea: %.2f%nVolumen: %.2f %n",
                cilindro.toString(), cilindro.calcularArea(), cilindro.calcularVolumen());
    }

    public static String crearMensaje(Cono cono) {
        return String.format("Figura: Cono %nInformacion: %s%nArea: %.2f%nVolumen: %.2f %n",
                cono.toString(), cono.calcularArea(), cono.calcularVolumen());
    }

    public static String crearMensaje(Esfera esfera) {
        return String.format("Figura: esfera %nInformacion: %s%nArea: %.2f%nVolumen: %.2f %n",
                esfera.toString(), esfera.calcularArea(), esfera.calcularVolumen());
    }
}
