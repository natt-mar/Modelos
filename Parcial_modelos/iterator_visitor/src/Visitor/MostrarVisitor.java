package visitor;

import modelo.Docente;
import modelo.Estudiante;

public class MostrarVisitor
        implements Visitor {

    @Override
    public void visitar(Estudiante estudiante) {

        System.out.println(
                "\n===== ESTUDIANTE ====="
        );

        System.out.println(
                "Codigo: "
                + estudiante.getCodigo()
        );

        System.out.println(
                "Nombre: "
                + estudiante.getNombres()
        );

        System.out.println(
                "Direccion: "
                + estudiante.getDireccion()
        );

        System.out.println(
                "Telefonos: "
                + estudiante.getTelefonos()
        );
    }

    @Override
    public void visitar(Docente docente) {

        System.out.println(
                "\n===== DOCENTE ====="
        );

        System.out.println(
                "Codigo: "
                + docente.getCodigo()
        );

        System.out.println(
                "Nombre: "
                + docente.getNombres()
        );

        System.out.println(
                "Direccion: "
                + docente.getDireccion()
        );

        System.out.println(
                "Telefonos: "
                + docente.getTelefonos()
        );

        System.out.println(
                "Codigo valido: "
                + docente.codigoValido()
        );
    }
}