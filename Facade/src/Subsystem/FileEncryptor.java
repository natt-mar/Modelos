package subsystem;

public class FileEncryptor {
    
    public String encriptar(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }
    
    public String desencriptar(String textoEncriptado) {
        return new StringBuilder(textoEncriptado).reverse().toString();
    }
}