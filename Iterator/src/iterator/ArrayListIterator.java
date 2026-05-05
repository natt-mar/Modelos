package iterator;

import java.util.List;

class ArrayListIterator implements IteradorEstudiante {
    private List<Estudiante> lista;
    private int posicion = 0;

    public ArrayListIterator(List<Estudiante> lista) {
        this.lista = lista;
    }

  
    public boolean hasMore() {
        return posicion < lista.size();
    }

    public Estudiante getNext() {
        if (!hasMore()) return null;
        return lista.get(posicion++);
    }
}