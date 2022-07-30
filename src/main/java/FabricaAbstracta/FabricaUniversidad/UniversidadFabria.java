package FabricaAbstracta.FabricaUniversidad;

import Fabrica.Interfaz.Profesiones;
import FabricaAbstracta.FabricaFusion.FabricaAbstracta;
import FabricaAbstracta.Implementaciones.Autonoma;
import FabricaAbstracta.Implementaciones.UTP;
import FabricaAbstracta.Interfaz.Universidad;

public class UniversidadFabria implements FabricaAbstracta {
    public Universidad getUniversidad(String uni){
        if (uni.equalsIgnoreCase("autonoma")) return new Autonoma();
        if (uni.equalsIgnoreCase("UTP"))return  new UTP();
        return null;
    }

    @Override
    public Profesiones getProfesion(String profesion) {
        return null;
    }
}
