package modelo;

import java.util.List;

import visitor.Visitor;

public class Estudiante
        extends Persona {

    public Estudiante(String codigo,
                      String nombres,
                      String direccion,
                      List<String> telefonos) {

        super(codigo,
              nombres,
              direccion,
              telefonos);
    }

    @Override
    public void aceptar(Visitor visitor) {

        visitor.visitar(this);
    }
}