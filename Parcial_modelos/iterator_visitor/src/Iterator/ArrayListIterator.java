package iterator;

import java.util.List;
import modelo.Persona;

public class ArrayListIterator
        implements Iterador<Persona> {

    private List<Persona> personas;

    private int posicion;

    public ArrayListIterator(List<Persona> personas) {

        this.personas = personas;
        this.posicion = 0;
    }

    @Override
    public boolean hasNext() {

        return posicion < personas.size();
    }

    @Override
    public Persona next() {

        Persona persona = personas.get(posicion);

        posicion++;

        return persona;
    }
}