package FabricaAbstracta.FabricaFusion;

import Fabrica.ProfesionesFabrica;
import FabricaAbstracta.FabricaUniversidad.UniversidadFabria;

public class FabricaProductor {
    public static FabricaAbstracta GetFabricaAbstracta(String fab){
        if (fab.equalsIgnoreCase("profesiones")) return new ProfesionesFabrica();
        if (fab.equalsIgnoreCase("Universidad")) return new UniversidadFabria();
        return null;
    }
}
