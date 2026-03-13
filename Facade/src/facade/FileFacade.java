package facade;

import subsystem.FileReader;
import subsystem.FileWriter;
import subsystem.FileEncryptor;

public class FileFacade {
    
    private static FileFacade instancia;
    private FileReader lector;
    private FileWriter escritor;
    private FileEncryptor cifrador;
    
    private FileFacade() {
        lector = new FileReader();
        escritor = new FileWriter();
        cifrador = new FileEncryptor();
    }
    
    public static FileFacade getInstancia() {
        if (instancia == null) {
            instancia = new FileFacade();
        }
        return instancia;
    }
    
    public void escribirArchivoEncriptado(String rutaOriginal, String rutaDestino) {
        String contenido = lector.leer(rutaOriginal);
        String encriptado = cifrador.encriptar(contenido);
        escritor.escribir(rutaDestino, encriptado);
        System.out.println("🔐 Archivo encriptado correctamente");
    }
    
    public void leerArchivoDesencriptado(String rutaEncriptada, String rutaDestino) {
        String contenido = lector.leer(rutaEncriptada);
        String desencriptado = cifrador.desencriptar(contenido);
        escritor.escribir(rutaDestino, desencriptado);
        System.out.println("🔓 Archivo desencriptado correctamente");
    }
}