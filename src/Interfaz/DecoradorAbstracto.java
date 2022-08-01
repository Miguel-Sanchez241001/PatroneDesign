package Interfaz;

/**
 * @author pc
 *
 */
public abstract class DecoradorAbstracto implements IPersonaje{
	protected IPersonaje personajeDecorado;

	public DecoradorAbstracto(IPersonaje personajeDecorado) {
		this.personajeDecorado = personajeDecorado;
	}

	@Override
	public Integer atacar() {
		return personajeDecorado.atacar();
	}

	@Override
	public String VerNombre() {
		// TODO Auto-generated method stub
		return personajeDecorado.VerNombre();
	}

	@Override
	public Integer VerArmadura() {
		return personajeDecorado.VerArmadura();
	}
	
	

}
