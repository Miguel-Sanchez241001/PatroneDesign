package patron.creacional.AbstracFactory.impl;

import patron.creacional.AbstracFactory.interfaz.FabricMuebles;
import patron.creacional.AbstracFactory.interfaz.Mesa;
import patron.creacional.AbstracFactory.interfaz.Silla;
import patron.creacional.AbstracFactory.model.MesaModerna;
import patron.creacional.AbstracFactory.model.SillaModerna;

public class FabricaModerna implements FabricMuebles {
    @Override
    public Silla crearSilla() {
        return new SillaModerna();
    }

    @Override
    public Mesa crearMesa() {
        return new MesaModerna();
    }
}
