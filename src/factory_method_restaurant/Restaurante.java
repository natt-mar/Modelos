package factory_method_restaurant;

import java.util.*;

public abstract class Restaurante {

    protected String nombre;
    protected List<MenuItem> menu;
    protected List<MenuItem> pedido;

    public Restaurante(String nombre) {
        this.nombre = nombre;
        this.menu = crearMenu();
        this.pedido = new ArrayList<>();
    }

    protected abstract List<MenuItem> crearMenu();

    public void mostrarMenu() {
        System.out.println("\n--- " + nombre + " ---");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ". "
                    + menu.get(i).getNombre()
                    + " - $" + menu.get(i).getPrecio());
        }
    }

    public void agregarPedido(int opcion) {
        if (opcion > 0 && opcion <= menu.size()) {
            MenuItem item = menu.get(opcion - 1);
            pedido.add(item);
            item.preparar();
        }
    }

    public void mostrarCuenta() {
        double total = 0;
        for (MenuItem item : pedido)
            total += item.getPrecio();

        System.out.println("Total en " + nombre + ": $" + total);
    }

    public double getTotal() {
        double total = 0;
        for (MenuItem item : pedido)
            total += item.getPrecio();
        return total;
    }
}
