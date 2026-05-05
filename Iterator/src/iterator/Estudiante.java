package iterator;

import java.util.*;

class Estudiante implements Comparable<Estudiante> {
    private String codigo;
    private String nombre;
    private String direccion;
    private List<String> telefonos;

    public Estudiante(String codigo, String nombre, String direccion, List<String> telefonos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefonos = telefonos;
    }

    public String getNombre() { return nombre; }
    public String getCodigo() { return codigo; }

    @Override
    public int compareTo(Estudiante otro) {
        return this.codigo.compareTo(otro.getCodigo());
    }
}