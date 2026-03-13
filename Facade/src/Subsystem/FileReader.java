package subsystem;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {
    
    public String leer(String ruta) {
        try {
            return new String(Files.readAllBytes(Paths.get(ruta)));
        } catch (Exception e) {
            System.err.println("Error leyendo archivo: " + e.getMessage());
            return "";
        }
    }
}