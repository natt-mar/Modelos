package method_restaurant;

public class PlatoPrincipal implements Vegetariano, Gourmet, Saludable, Bebida {

    private String nombre;
    private double precio;

    public PlatoPrincipal(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando plato principal: " + nombre);
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
