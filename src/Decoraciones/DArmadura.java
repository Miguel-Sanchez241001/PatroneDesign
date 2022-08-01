package Decoraciones;

import Interfaz.DecoradorAbstracto;
import Interfaz.IPersonaje;

public class DArmadura extends DecoradorAbstracto {
	String armadura;

	public DArmadura(IPersonaje personajeDecorado, String armadura) {
		super(personajeDecorado);
		this.armadura = armadura;
	}

	@Override
	public Integer VerArmadura() {
		return personajeDecorado.VerArmadura() + AgregarArmadura(armadura);
	}

	public Integer AgregarArmadura(String armadura) {
		return armadura.equalsIgnoreCase("Chaleco") ? 18 : 5;
	}

	

}
