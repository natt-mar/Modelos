package factory_method_restaurant;

import java.util.*;

public class RestauranteBebidas extends Restaurante {

    public RestauranteBebidas() {
        super("Restaurante Bebidas");
    }

    protected List<MenuItem> crearMenu() {
        List<MenuItem> menu = new ArrayList<>();
        menu.add(new Entrada("Jugo Natural", 8));
        menu.add(new PlatoPrincipal("Café", 5));
        menu.add(new Postre("Malteada", 10));
        return menu;
    }
}
