package client;

import facade.FileFacade;

public class Client {
    
    public static void main(String[] args) {
        
        String filePath = "test.txt";
        String encryptedPath = "test_encriptado.txt";
        String decryptedPath = "test_descifrado.txt";
        
        String originalContent = "¡Hola, patrón Facade en Java!";
        
        // Crear archivo original
        try {
            java.nio.file.Files.write(
                java.nio.file.Paths.get(filePath), 
                originalContent.getBytes()
            );
            System.out.println("📄 Archivo original creado");
        } catch (Exception e) {
            System.err.println("Error creando archivo original");
        }
        
        // Usar la fachada
        FileFacade facade = FileFacade.getInstancia();
        
        // Encriptar
        facade.escribirArchivoEncriptado(filePath, encryptedPath);
        
        // Desencriptar
        facade.leerArchivoDesencriptado(encryptedPath, decryptedPath);
        
        System.out.println("\n✨ Proceso completado exitosamente");
    }
}