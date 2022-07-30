package FabricaAbstracta.Implementaciones;

import FabricaAbstracta.Interfaz.Universidad;

public class Autonoma implements Universidad {

    @Override
    public Integer Pension(String Carrera) {
        if (Carrera.equalsIgnoreCase("medicina")) return 1500;
        if (Carrera.equalsIgnoreCase("ingenieria")) return 1000;
        return 0;
    }
}
