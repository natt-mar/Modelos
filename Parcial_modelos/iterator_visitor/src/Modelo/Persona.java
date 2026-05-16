package modelo;

import java.util.List;

import visitor.Visitor;

public abstract class Persona
        implements Comparable<Persona> {

    protected String codigo;
    protected String nombres;
    protected String direccion;
    protected List<String> telefonos;

    public Persona(String codigo,
                   String nombres,
                   String direccion,
                   List<String> telefonos) {

        this.codigo = codigo;
        this.nombres = nombres;
        this.direccion = direccion;
        this.telefonos = telefonos;
    }

    public String getCodigo() {

        return codigo;
    }

    public String getNombres() {

        return nombres;
    }

    public String getDireccion() {

        return direccion;
    }

    public List<String> getTelefonos() {

        return telefonos;
    }

    @Override
    public int compareTo(Persona otra) {

        return codigo.compareTo(otra.codigo);
    }

    public abstract void aceptar(Visitor visitor);
}