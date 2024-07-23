package patron.creacional.AbstracFactory.impl;

import patron.creacional.AbstracFactory.interfaz.FabricMuebles;
import patron.creacional.AbstracFactory.interfaz.Mesa;
import patron.creacional.AbstracFactory.interfaz.Silla;
import patron.creacional.AbstracFactory.model.MesaAntigua;
import patron.creacional.AbstracFactory.model.SillaAntigua;

public class FabricaAntigua implements FabricMuebles {
    @Override
    public Silla crearSilla() {
        return new SillaAntigua();
    }

    @Override
    public Mesa crearMesa() {
        return new MesaAntigua();
    }
}
