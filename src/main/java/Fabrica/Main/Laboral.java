package Fabrica.Main;

import Fabrica.Implementaciones.Ingeniero;
import Fabrica.Implementaciones.Medico;
import Fabrica.Interfaz.Profesiones;
import Fabrica.ProfesionesFabrica;

public class Laboral {
    public static void main(String[] args)
    {

        // el tipo de la variable a recibir la instancia de la fabrica debee de ser del tipo de la interfaz
        // de lo contrario aplicar un casteo
        // ejemplos obtenidos de mitocode
        ProfesionesFabrica fab = new ProfesionesFabrica();
        Profesiones medico = fab.getProfesion("medico");
        System.out.println(medico.GetSueldo());
        System.out.println(medico.Disponibilidad());
        Profesiones inge = fab.getProfesion("Ingeniero");
        System.out.println(inge.GetSueldo());
        System.out.println(inge.Disponibilidad());
    }
}
