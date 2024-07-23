package patron.creacional.AbstracFactory;

import patron.creacional.AbstracFactory.impl.FabricaAntigua;
import patron.creacional.AbstracFactory.impl.FabricaModerna;
import patron.creacional.AbstracFactory.interfaz.FabricMuebles;
import patron.creacional.AbstracFactory.interfaz.Mesa;
import patron.creacional.AbstracFactory.interfaz.Silla;

public class Main {
    public static void main(String[] args) {
        FabricMuebles moderna = new FabricaModerna();
        Silla sillaModerna = moderna.crearSilla();
        Mesa mesaModerna = moderna.crearMesa();
        sillaModerna.sentar();
        mesaModerna.usar();

        FabricMuebles antigua = new FabricaAntigua();
        Silla sillaAntigua = antigua.crearSilla();
        Mesa mesaAntigua = antigua.crearMesa();
        sillaAntigua.sentar();
        mesaAntigua.usar();
    }
}
