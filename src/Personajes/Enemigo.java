package Personajes;

import Interfaz.IPersonaje;

public class Enemigo implements IPersonaje {
    private Integer puntosAtaque ;
   private  Integer puntosArmadura;
   public String nombre;
    public  Enemigo(String nombre){
        puntosAtaque = 10;
        puntosArmadura = 5;
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