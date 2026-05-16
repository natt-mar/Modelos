package visitor;

import modelo.Docente;
import modelo.Estudiante;

public class ValidacionVisitor
        implements Visitor {

    @Override
    public void visitar(Estudiante estudiante) {

        System.out.println(
                "Estudiante validado"
        );
    }

    @Override
    public void visitar(Docente docente) {

        if (docente.codigoValido()) {

            System.out.println(
                    "Docente valido"
            );

        } else {

            System.out.println(
                    "Codigo docente invalido"
            );
        }
    }
}