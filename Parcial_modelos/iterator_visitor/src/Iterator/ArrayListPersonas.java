package iterator;

import java.util.ArrayList;
import java.util.List;

import modelo.Persona;

public class ArrayListPersonas
        implements ColeccionPersonas<Persona> {

    private List<Persona> personas;

    public ArrayListPersonas() {

        personas = new ArrayList<>();
    }

    @Override
    public void agregar(Persona persona) {

        personas.add(persona);
    }

    public List<Persona> getPersonas() {

        return personas;
    }

    @Override
    public Iterador<Persona> crearIterador() {

        return new ArrayListIterator(personas);
    }
}