package FabricaAbstracta.Implementaciones;

import FabricaAbstracta.Interfaz.Universidad;

public class UTP implements Universidad {


    @Override
    public Integer Pension(String Carrera) {
        if (Carrera.equalsIgnoreCase("medicina")) return 2800;
        if (Carrera.equalsIgnoreCase("ingenieria")) return 1500;
        return 0;
    }
}
