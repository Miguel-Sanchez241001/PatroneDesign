package Fabrica;

import Fabrica.Implementaciones.Ingeniero;
import Fabrica.Implementaciones.Medico;
import Fabrica.Implementaciones.Vacio;
import Fabrica.Interfaz.Profesiones;
import FabricaAbstracta.FabricaFusion.FabricaAbstracta;
import FabricaAbstracta.Interfaz.Universidad;

public class ProfesionesFabrica implements FabricaAbstracta {

    @Override
    public Universidad getUniversidad(String uni) {
        return null;
    }

    public Profesiones getProfesion(String profesion){
        if (profesion.equalsIgnoreCase("medico")) return new Medico();
        if (profesion.equalsIgnoreCase("ingeniero")) return new Ingeniero();
        return new Vacio();
    }

}
