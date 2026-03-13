package client;

import facade.FileFacade;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Client {
    
    public static void main(String[] args) {
        
        String filePath = "test.txt";
        String encryptedPath = "test_encriptado.txt";
        String decryptedPath = "test_descifrado.txt";
        
        String originalContent = "¡Hola, patrón Facade en Java!";
        
        try {

            System.out.println("📄 Creando archivo: " + filePath);
            Files.write(Paths.get(filePath), originalContent.getBytes());
            System.out.println("✅ Archivo creado con contenido: \"" + originalContent + "\"");
            System.out.println("📍 Ubicación: " + Paths.get(filePath).toAbsolutePath());
            System.out.println();
            
            FileFacade facade = FileFacade.getInstancia();

            System.out.println("🔐 Iniciando encriptación...");
            facade.escribirArchivoEncriptado(filePath, encryptedPath);

            System.out.println("\n🔓 Iniciando desencriptación...");
            facade.leerArchivoDesencriptado(encryptedPath, decryptedPath);

            System.out.println("\n📋 VERIFICACIÓN DE ARCHIVOS CREADOS:");

            if (Files.exists(Paths.get(filePath))) {
                System.out.println("   ✅ " + filePath + " - CREADO");
            }

            if (Files.exists(Paths.get(encryptedPath))) {
                System.out.println("   ✅ " + encryptedPath + " - CREADO");
                String contenidoEncriptado = new String(Files.readAllBytes(Paths.get(encryptedPath)));
                System.out.println("      Contenido: \"" + contenidoEncriptado + "\"");
            }

            if (Files.exists(Paths.get(decryptedPath))) {
                System.out.println("   ✅ " + decryptedPath + " - CREADO");
                String contenidoDesencriptado = new String(Files.readAllBytes(Paths.get(decryptedPath)));
                System.out.println("      Contenido: \"" + contenidoDesencriptado + "\"");
            }
            
            System.out.println("\n✨ PROCESO COMPLETADO - Todos los archivos se crearon físicamente");
            System.out.println("📂 Revisa la carpeta del proyecto para ver los archivos generados");
            
        } catch (Exception e) {
            System.err.println("❌ Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}