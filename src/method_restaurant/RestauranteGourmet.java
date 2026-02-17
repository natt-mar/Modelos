package method_restaurant;

import java.util.*;

public class RestauranteGourmet extends Restaurante {

    public RestauranteGourmet() {
        super("Restaurante Gourmet");
    }

    protected List<MenuItem> crearMenu() {
        List<MenuItem> menu = new ArrayList<>();
        menu.add(new Entrada("Carpaccio", 30));
        menu.add(new PlatoPrincipal("Filete Mignon", 60));
        menu.add(new Postre("Soufflé", 25));
        return menu;
    }
}
