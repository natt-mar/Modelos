package method_restaurant;

import java.util.*;

public class Main {

    private static List<Restaurante> restaurantesVisitados = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Vegetariano");
            System.out.println("2. Gourmet");
            System.out.println("3. Saludable");
            System.out.println("4. Bebidas");
            System.out.println("5. Cuenta general");
            System.out.println("0. Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> abrirRestaurante(new RestauranteVegetariano(), sc);
                case 2 -> abrirRestaurante(new RestauranteGourmet(), sc);
                case 3 -> abrirRestaurante(new RestauranteSaludable(), sc);
                case 4 -> abrirRestaurante(new RestauranteBebidas(), sc);
                case 5 -> mostrarCuentaGeneral();
            }

        } while (opcion != 0);
    }

    private static void abrirRestaurante(Restaurante restaurante, Scanner sc) {
        restaurantesVisitados.add(restaurante);
        int opcion;
        do {
            restaurante.mostrarMenu();
            System.out.println("0. Volver");
            opcion = sc.nextInt();
            if (opcion != 0)
                restaurante.agregarPedido(opcion);
        } while (opcion != 0);

        restaurante.mostrarCuenta();
    }

    private static void mostrarCuentaGeneral() {
        double total = 0;
        for (Restaurante r : restaurantesVisitados)
            total += r.getTotal();

        System.out.println("TOTAL GENERAL: $" + total);
    }
}
