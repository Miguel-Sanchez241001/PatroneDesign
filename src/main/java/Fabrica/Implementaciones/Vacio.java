package Fabrica.Implementaciones;

import Fabrica.Interfaz.Profesiones;

public class Vacio implements Profesiones {
    @Override
    public Integer GetSueldo() {
        return 00000;
    }

    @Override
    public boolean Disponibilidad() {
        return false;
    }
}
