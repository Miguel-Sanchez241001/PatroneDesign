package Fabrica.Implementaciones;

import Fabrica.Interfaz.Profesiones;

public class Medico implements Profesiones {
    private boolean estado = true;
    public  Integer sueldo = 14782;
    @Override
    public Integer GetSueldo() {
        return sueldo;
    }

    @Override
    public boolean Disponibilidad() {
        return estado;
    }
}
