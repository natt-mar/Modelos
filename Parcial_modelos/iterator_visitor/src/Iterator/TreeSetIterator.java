package iterator;

import java.util.Iterator;
import java.util.Set;

import modelo.Persona;

public class TreeSetIterator
        implements Iterador<Persona> {

    private Iterator<Persona> iterator;

    public TreeSetIterator(Set<Persona> personas) {

        iterator = personas.iterator();
    }

    @Override
    public boolean hasNext() {

        return iterator.hasNext();
    }

    @Override
    public Persona next() {

        return iterator.next();
    }
}