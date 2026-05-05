package iterator;

import java.util.Arrays;

public class GestionEstudiantes {
    public static void main(String[] args) {
        ListaEstudiantes curso = new ListaEstudiantes();
        
        curso.agregar(new Estudiante("001", "Juan Perez", "Calle 10", Arrays.asList("123-456")));
        curso.agregar(new Estudiante("002", "Maria Lopez", "Carrera 5", Arrays.asList("789-012")));

        IteradorEstudiante it = curso.crearIterador();

        System.out.println("=== EXPOSICIÓN PATRÓN ITERATOR ===");
        while (it.hasMore()) {
            Estudiante e = it.getNext();
            System.out.println("Estudiante: " + e.getNombre() + " (Código: " + e.getCodigo() + ")");
        }
    }
}