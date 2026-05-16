package iterator_visitor;

import iterator.ArrayListPersonas;
import iterator.Iterador;
import iterator.TreeSetPersonas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Docente;
import modelo.Estudiante;
import modelo.Persona;

import visitor.MostrarVisitor;
import visitor.ValidacionVisitor;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayListPersonas lista
                = new ArrayListPersonas();

        TreeSetPersonas tree
                = new TreeSetPersonas();

        int opcion;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Agregar docente");
            System.out.println("3. Recorrer ArrayList");
            System.out.println("4. Recorrer TreeSet");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    Persona estudiante
                            = crearEstudiante(sc);

                    lista.agregar(estudiante);
                    tree.agregar(estudiante);

                    break;

                case 2:

                    Persona docente
                            = crearDocente(sc);

                    lista.agregar(docente);
                    tree.agregar(docente);

                    break;

                case 3:

                    System.out.println(
                            "\n===== RECORRIDO ARRAYLIST ====="
                    );

                    recorrer(lista.crearIterador());

                    break;

                case 4:

                    System.out.println(
                            "\n===== RECORRIDO TREESET ====="
                    );

                    recorrer(tree.crearIterador());

                    break;
            }

        } while (opcion != 0);
    }

    public static Estudiante crearEstudiante(
            Scanner sc) {

        System.out.println("Codigo:");
        String codigo = sc.nextLine();

        System.out.println("Nombre:");
        String nombre = sc.nextLine();

        System.out.println("Direccion:");
        String direccion = sc.nextLine();

        List<String> telefonos
                = leerTelefonos(sc);

        return new Estudiante(
                codigo,
                nombre,
                direccion,
                telefonos
        );
    }

    public static Docente crearDocente(
            Scanner sc) {

        System.out.println("Codigo:");
        String codigo = sc.nextLine();

        System.out.println("Nombre:");
        String nombre = sc.nextLine();

        System.out.println("Direccion:");
        String direccion = sc.nextLine();

        List<String> telefonos
                = leerTelefonos(sc);

        return new Docente(
                codigo,
                nombre,
                direccion,
                telefonos
        );
    }

    public static List<String> leerTelefonos(
            Scanner sc) {

        List<String> telefonos
                = new ArrayList<>();

        int cantidad;

        System.out.println(
                "Cantidad de telefonos:"
        );

        cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0;
             i < cantidad;
             i++) {

            System.out.println(
                    "Telefono " + (i + 1)
            );

            telefonos.add(sc.nextLine());
        }

        return telefonos;
    }

    public static void recorrer(
            Iterador<Persona> iterador) {

        MostrarVisitor mostrar
                = new MostrarVisitor();

        ValidacionVisitor validar
                = new ValidacionVisitor();

        while (iterador.hasNext()) {

            Persona persona
                    = iterador.next();

            persona.aceptar(mostrar);

            persona.aceptar(validar);

            System.out.println();
        }
    }
}