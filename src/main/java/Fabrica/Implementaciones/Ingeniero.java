package Fabrica.Implementaciones;

import Fabrica.Interfaz.Profesiones;

public class Ingeniero implements Profesiones {

    private Integer sueldo = 3000;

    private boolean estado = false;
    @Override
    public Integer GetSueldo() {
        return sueldo;
    }

    @Override
    public boolean Disponibilidad() {
        return estado;
    }
}
