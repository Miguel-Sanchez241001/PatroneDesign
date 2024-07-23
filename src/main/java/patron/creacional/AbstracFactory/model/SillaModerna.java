package patron.creacional.AbstracFactory.model;

import patron.creacional.AbstracFactory.interfaz.Silla;

public class SillaModerna implements Silla {
    @Override
    public void sentar() {
        System.out.println("Sentandome en  Silla Moderna .");
    }
}
