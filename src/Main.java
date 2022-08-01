import Decoraciones.DArmadura;
import Decoraciones.DArmamento;
import Interfaz.IPersonaje;
import Personajes.Aliado;
import Personajes.Enemigo;

public class Main {

	public static void main(String[] args) {
		IPersonaje Villano1 = new Enemigo("Melfico");
		IPersonaje Aliado1 = new Aliado("Bondoso");
		System.out.println(Villano1.atacar() + " " + Villano1.VerArmadura());
		System.out.println(Aliado1.atacar() + " " + Aliado1.VerArmadura());
		IPersonaje Villano1Reforzado = new DArmamento(Villano1, "lanza");
		IPersonaje Aliado1Reforzado = new DArmadura(Aliado1, "Chaleco");
		System.out.println("soy  " +Villano1.VerNombre() +" con ataque de " + Villano1Reforzado.atacar() + " y aramadura de " + Villano1Reforzado.VerArmadura());
		System.out.println("soy  " +Aliado1Reforzado.VerNombre() +" con ataque de "  + Aliado1Reforzado.atacar() + " y aramadura de " + Aliado1Reforzado.VerArmadura());
	}

}
