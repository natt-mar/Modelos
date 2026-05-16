package modelo;

import java.util.List;

import visitor.Visitor;

public class Docente
        extends Persona {

    public Docente(String codigo,
                   String nombres,
                   String direccion,
                   List<String> telefonos) {

        super(codigo,
              nombres,
              direccion,
              telefonos);
    }

    public boolean codigoValido() {

        return codigo.length() <= 4;
    }

    @Override
    public void aceptar(Visitor visitor) {

        visitor.visitar(this);
    }
}