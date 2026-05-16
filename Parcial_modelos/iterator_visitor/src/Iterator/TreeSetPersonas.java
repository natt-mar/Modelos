package iterator;

import java.util.Set;
import java.util.TreeSet;

import modelo.Persona;

public class TreeSetPersonas
        implements ColeccionPersonas<Persona> {

    private Set<Persona> personas;

    public TreeSetPersonas() {

        personas = new TreeSet<>();
    }

    @Override
    public void agregar(Persona persona) {

        personas.add(persona);
    }

    @Override
    public Iterador<Persona> crearIterador() {

        return new TreeSetIterator(personas);
    }
}