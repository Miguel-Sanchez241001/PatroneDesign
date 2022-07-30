package MainFabricas;

import Fabrica.Interfaz.Profesiones;
import FabricaAbstracta.FabricaFusion.FabricaAbstracta;
import FabricaAbstracta.FabricaFusion.FabricaProductor;
import FabricaAbstracta.Interfaz.Universidad;

public class MainFabrica
{
    public static void main(String[] args) {

        FabricaAbstracta fab = FabricaProductor.GetFabricaAbstracta("Profesiones");
        Profesiones medico = fab.getProfesion("medico");
        System.out.println(medico.GetSueldo());
        FabricaAbstracta fab2 = FabricaProductor.GetFabricaAbstracta("Universidad");
        Universidad auto = fab2.getUniversidad("autonoma");
        Universidad  Utp = fab2.getUniversidad("utp");
        System.out.println(auto.Pension("medicina"));
        System.out.println(Utp.Pension("ingenieria"));
    }
}
