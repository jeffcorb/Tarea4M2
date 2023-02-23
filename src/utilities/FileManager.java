package utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {
    public static List<String> leerFile(String path) {
        final var listaItems = new ArrayList<String>();
        final var fileMenu = new File(path);

        try {
            final var scanner = new Scanner(fileMenu);
            while (scanner.hasNextLine()) {
                listaItems.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("FIle no encontrado");
            System.out.println(fileNotFoundException.getLocalizedMessage());
        }
        return listaItems;
    }

    public static void escribirFile(String path, List<String> listaItems) {
        try {
            final var fileWriter = new FileWriter(path);
            for (var item : listaItems) {
                fileWriter.write(item);
                fileWriter.write("\n");
            }
            fileWriter.close();
        } catch (IOException ioException) {
            System.out.println(ioException.getLocalizedMessage());
        }
    }
}
