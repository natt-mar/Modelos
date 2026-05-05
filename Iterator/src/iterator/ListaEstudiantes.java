package iterator;

import java.util.ArrayList;
import java.util.List;

class ListaEstudiantes implements ColeccionEstudiantes {
    private List<Estudiante> estudiantes = new ArrayList<>();

    public void agregar(Estudiante e) { estudiantes.add(e); }

    public IteradorEstudiante crearIterador() {
        return new ArrayListIterator(this.estudiantes);
    }

}