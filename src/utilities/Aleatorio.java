package utilities;

import java.util.Random;

public class Aleatorio {
    private final Random random;

    public Aleatorio() {
        random = new Random();
    }

    public int generarRandomInteger(int maximo, int minimo) {
        return random.nextInt(maximo - minimo + 1) + minimo;
    }

    public double generarRandomDouble(int maximo, int minimo) {
        return (maximo - minimo + 1) * random.nextDouble() + minimo;
    }
}
