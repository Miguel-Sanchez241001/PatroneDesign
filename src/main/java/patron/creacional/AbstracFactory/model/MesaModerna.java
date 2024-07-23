package patron.creacional.AbstracFactory.model;

import patron.creacional.AbstracFactory.interfaz.Mesa;

public class MesaModerna implements Mesa {
    @Override
    public void usar() {
        System.out.println("Usando una Mesa Moderna.");
    }
}
