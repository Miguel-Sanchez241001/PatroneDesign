package Personajes;

import Interfaz.IPersonaje;

public class Aliado implements IPersonaje {
    private Integer puntosAtaque ;
    private  Integer puntosArmadura;
   public  String nombre;
    public  Aliado(String nombre){
        puntosAtaque = 8;
        puntosArmadura = 3;
        this.nombre = nombre;
    }
    @Override
	public String VerNombre() {
		return nombre;
	}
	@Override
    public Integer atacar() {

        return puntosAtaque;
    }

    @Override
    public Integer VerArmadura() {
        return puntosArmadura;
    }
    
}
