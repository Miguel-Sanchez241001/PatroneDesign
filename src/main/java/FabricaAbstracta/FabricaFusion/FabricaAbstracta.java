package FabricaAbstracta.FabricaFusion;

import Fabrica.Interfaz.Profesiones;
import FabricaAbstracta.Interfaz.Universidad;

public interface FabricaAbstracta {
    Universidad getUniversidad(String uni);
    Profesiones getProfesion(String profesion);
}
