import java.util.Scanner;

class posicion{
	
}

class Peon{
	static int cantidad=8;
	static void descripcion(){
		System.out.println("Hay un total de " + cantidad + " peones por cada jugador.");
		System.out.println("Los peones se mueven de así: ");
		Ajedrez.main(Piezas.nombre[0]);
	}
}

class Dama{
	static int cantidad=1;
	static void descripcion(){
		System.out.println("Hay un total de " + cantidad + " damas por cada jugador.");
		System.out.println("Las damas se mueven de así: ");
		Ajedrez.main(Piezas.nombre[4]);			
	}
}

class Rey{
	static int cantidad=1;
	static void descripcion(){
		System.out.println("Hay un total de " + cantidad + " reyes por cada jugador.");
		System.out.println("Los Reyes se mueven de así: ");
		Ajedrez.main(Piezas.nombre[5]);			
	}
}
class Torre{
	static int cantidad=2;
	static void descripcion(){
		System.out.println("Hay un total de " + cantidad + " Torres por cada jugador.");
		System.out.println("Las Torres se mueven de así: ");
		Ajedrez.main(Piezas.nombre[3]);			
	}
}
class Alfil{
	static int cantidad=2;
	static void descripcion(){
		System.out.println("Hay un total de " + cantidad + " Alfiles por cada jugador.");
		System.out.println("Los Alfiles se mueven de así: ");
		Ajedrez.main(Piezas.nombre[2]);			
	}
}

class Caballo{
	static int cantidad=2;
	static void descripcion(){
		System.out.println("Hay un total de " + cantidad + " Caballos por cada jugador.");
		System.out.println("Los Caballos se mueven de así: ");
		Ajedrez.main(Piezas.nombre[1]);			
	}
}

class Piezas {
	static String[] nombre = { "Peón", "Caballo", "Alfil", "Torre", "Dama", "Rey" };
	String[] color = {"Blanco","Negro","Blanca","Negra" };
	static int valor[]= {1,3,3,5,9};
}

public class Juego {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int menu;
		System.out.println("Seleccione el número de la pieza a mover (1 al 6):");
		for (int i=0;i<Piezas.nombre.length;i++){
		System.out.println(i+1 + "." + Piezas.nombre[i] + ".");
		}
		menu = entrada.nextInt();
		switch (menu){
		case 1:
			System.out.println("Ha seleccionado el Peón. Su valor es: " + Piezas.valor[menu-1] + ".");
			Peon.descripcion();
			break;
		case 2:
			System.out.println("Ha seleccionado el Caballo. Su valor es: " + Piezas.valor[menu-1] + ".");
			Caballo.descripcion();
			break;
		case 3:
			System.out.println("Ha seleccionado el Alfil. Su valor es: " + Piezas.valor[menu-1] + ".");
			Alfil.descripcion();
			break;
		case 4:
			System.out.println("Ha seleccionado la Torre. Su valor es: " + Piezas.valor[menu-1] + ".");
			Torre.descripcion();
			break;
		case 5:
			System.out.println("Ha seleccionado la Dama. Su valor es: " + Piezas.valor[menu-1] + ".");
			Dama.descripcion();
			break;
		case 6:
			System.out.println("Ha seleccionado el Rey. Su valor es incalculable.");
			Rey.descripcion();
			break;
		default:
			System.out.println("Valor no válido. Por favor introduzca un número del 1 al 6.");
		}
	}
}
