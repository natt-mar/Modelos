package factory_method_restaurant;

public class Postre implements Vegetariano, Gourmet, Saludable, Bebida {

    private String nombre;
    private double precio;

    public Postre(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando postre: " + nombre);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
