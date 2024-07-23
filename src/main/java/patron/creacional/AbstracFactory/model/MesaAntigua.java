package patron.creacional.AbstracFactory.model;

import patron.creacional.AbstracFactory.interfaz.Mesa;

public class MesaAntigua implements Mesa {
    @Override
    public void usar() {
        System.out.println("Usando una Mesa Antigua.");
    }
}
