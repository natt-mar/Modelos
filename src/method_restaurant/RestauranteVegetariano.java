package method_restaurant;

import java.util.*;

public class RestauranteVegetariano extends Restaurante {

    public RestauranteVegetariano() {
        super("Restaurante Vegetariano");
    }

    protected List<MenuItem> crearMenu() {
        List<MenuItem> menu = new ArrayList<>();
        menu.add(new Entrada("Ensalada Verde", 12));
        menu.add(new PlatoPrincipal("Lasaña Vegetariana", 25));
        menu.add(new Postre("Tarta Vegana", 10));
        return menu;
    }
}
