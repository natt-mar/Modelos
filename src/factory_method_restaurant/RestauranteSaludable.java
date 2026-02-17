package factory_method_restaurant;

import java.util.*;

public class RestauranteSaludable extends Restaurante {

    public RestauranteSaludable() {
        super("Restaurante Saludable");
    }

    protected List<MenuItem> crearMenu() {
        List<MenuItem> menu = new ArrayList<>();
        menu.add(new Entrada("Wrap Integral", 15));
        menu.add(new PlatoPrincipal("Pollo Light", 28));
        menu.add(new Postre("Yogurt Natural", 12));
        return menu;
    }
}
