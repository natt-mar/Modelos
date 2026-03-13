package subsystem;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriter {
    
    public void escribir(String ruta, String contenido) {
        try {
            Files.write(Paths.get(ruta), contenido.getBytes());
            System.out.println("   💾 Archivo guardado: " + ruta);
            System.out.println("   📍 Ruta absoluta: " + Paths.get(ruta).toAbsolutePath());
        } catch (Exception e) {
            System.err.println("❌ Error escribiendo archivo: " + e.getMessage());
        }
    }
}