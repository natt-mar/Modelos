package iterator;

public interface ColeccionPersonas<E> {

    void agregar(E elemento);

    Iterador<E> crearIterador();
}