package patron.creacional.AbstracFactory.model;

import patron.creacional.AbstracFactory.interfaz.Silla;

public class SillaAntigua implements Silla {
    @Override
    public void sentar() {
        System.out.println("Sentandome en  Silla Antigua  .");
    }
}
