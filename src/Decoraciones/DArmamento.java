package Decoraciones;

import Interfaz.DecoradorAbstracto;
import Interfaz.IPersonaje;

public class DArmamento extends DecoradorAbstracto {
	String arma;

	public DArmamento(IPersonaje personajeDecorado, String arma) {
		super(personajeDecorado);
		this.arma = arma;

	}

	@Override
	public Integer atacar() {
		return personajeDecorado.atacar() + AgregarArmmamento(arma);
	}

	public Integer AgregarArmmamento(String armadura) {
		return armadura.equalsIgnoreCase("Lanza") ? 17 : 10;
	}
}
