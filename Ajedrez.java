import java.util.Scanner;

public class Ajedrez {
	public static void main(String nombre) {
		//String[][] tablero;
		//tablero = new String[8][8];
		char fila_tab;
		char columna_tab;
		String fila_arr = "";
		String columna_arr = "";
		//int numero_fila = 0;
		//int numero_columna = 0;
		Scanner posi = new Scanner(System.in);
		System.out.println("Introduzca la posición inicial de la " + nombre + ":");
		System.out.println("Columna (a,b,c,d,e,f,g,h.): ");
		columna_tab = posi.next().charAt(0);
		switch (columna_tab) {
		case 'a':
			columna_arr = "0";
			break;
		case 'b':
			columna_arr = "1";
			break;
		case 'c':
			columna_arr = "2";
			break;
		case 'd':
			columna_arr = "3";
			break;
		case 'e':
			columna_arr = "4";
			break;
		case 'f':
			columna_arr = "5";
			break;
		case 'g':
			columna_arr = "6";
			break;
		case 'h':
			columna_arr = "7";
			break;
		default:
			System.out.println("Valor incorrecto.");
		}
		System.out.println("Fila (1,2,3,4,5,6,7,8.): ");
		fila_tab = posi.next().charAt(0);
		switch (fila_tab) {
		case '1':
			fila_arr = "7";
			break;
		case '2':
			fila_arr = "6";
			break;
		case '3':
			fila_arr = "5";
			break;
		case '4':
			fila_arr = "4";
			break;
		case '5':
			fila_arr = "3";
			break;
		case '6':
			fila_arr = "2";
			break;
		case '7':
			fila_arr = "1";
			break;
		case '8':
			fila_arr = "0";
			break;
		default:
			System.out.println("Valor incorrecto.");
		}
		switch (nombre) {
		case "Peón":
			Ajedrez.moverPeon.moverP(nombre, fila_tab, columna_tab, fila_arr, columna_arr);
			break;
		case "Caballo":
			Ajedrez.moverCaballo.moverC(nombre, fila_tab, columna_tab, fila_arr, columna_arr);
			break;
		case "Alfil":
			Ajedrez.moverAlfil.moverA(nombre, fila_tab, columna_tab, fila_arr, columna_arr);
			break;
		case "Torre":
			Ajedrez.moverTorre.moverT(nombre, fila_tab, columna_tab, fila_arr, columna_arr);
			break;
		case "Dama":
			Ajedrez.moverDama.moverD(nombre, fila_tab, columna_tab, fila_arr, columna_arr);
			break;
		case "Rey":
			Ajedrez.moverRey.moverR(nombre, fila_tab, columna_tab, fila_arr, columna_arr);
			break;
		}
	}

	static class moverDama {
		private static void moverD(String nombre, char fila_tab, char columna_tab, String fila_arr,
				String columna_arr) {
			String[][] tablero;
			tablero = new String[8][8];
			int numero_fila = 0;
			int numero_columna = 0;
			System.out.println("La posicion de la " + nombre + " en el tablero es: " + columna_tab + fila_tab);
			// System.out.println("La posicion de la Dama en el arreglo es: " +
			// fila_arr + columna_arr);
			numero_fila = Integer.parseInt(fila_arr);
			numero_columna = Integer.parseInt(columna_arr);
			tablero[numero_fila][numero_columna] = "1";
			// mover filas hacia adelante
			for (int fila = numero_fila; fila <= 7; fila++) {
				tablero[fila][numero_columna] = "1";
			}
			// mover filas hacia atras
			for (int fila = numero_fila; fila >= 0; fila--) {
				tablero[fila][numero_columna] = "1";
			}
			// mover columnas hacia adelante
			for (int columna = numero_columna; columna <= 7; columna++) {
				tablero[numero_fila][columna] = "1";
			}
			// mover columnas hacia atras
			for (int columna = numero_columna; columna >= 0; columna--) {
				tablero[numero_fila][columna] = "1";
			}
			// mover filas y columnas hacia adelante
			for (int fila = numero_fila, columna = numero_columna; fila <= 7 && columna <= 7; fila++, columna++) {
				tablero[fila][columna] = "1";
			}
			// mover filas y columnas hacia atras
			for (int fila = numero_fila, columna = numero_columna; fila >= 0 && columna >= 0; fila--, columna--) {
				tablero[fila][columna] = "1";
			}
			// mover filas hacia adelante y columnas hacia atras
			for (int fila = numero_fila, columna = numero_columna; fila <= 7 && columna >= 0; fila++, columna--) {
				tablero[fila][columna] = "1";
			}
			// mover filas hacia atras y columnas hacia adelante
			for (int fila = numero_fila, columna = numero_columna; fila >= 0 && columna <= 7; fila--, columna++) {
				tablero[fila][columna] = "1";
			}
			tablero[numero_fila][numero_columna] = "D";
			System.out.println("La Dama puede moverse así:");
			for (int fila = 0; fila < tablero.length; fila++) {
				for (int columna = 0; columna < tablero[fila].length; columna++) {
					if (tablero[fila][columna] == "1") {
						System.out.print(" 0 ");
					} else if (tablero[fila][columna] == "D") {
						System.out.print(" D ");
					} else {
						System.out.print(" - ");
					}
				}
				System.out.println();
			}
		}
	}

	static class moverPeon {
		private static void moverP(String nombre, char fila_tab, char columna_tab, String fila_arr,
				String columna_arr) {
			String[][] tablero;
			tablero = new String[8][8];
			int numero_fila = 0;
			int numero_columna = 0;
			System.out.println("La posicion del " + nombre + " en el tablero es: " + columna_tab + fila_tab);
			// System.out.println("La posicion de la Dama en el arreglo es: " +
			// fila_arr + columna_arr);
			numero_fila = Integer.parseInt(fila_arr);
			numero_columna = Integer.parseInt(columna_arr);
			tablero[numero_fila][numero_columna] = "1";
			// mover filas hacia adelante
			// for (int columna = numero_columna; columna <= 7; columna++) {
			if (numero_fila > 0) {
				tablero[numero_fila - 1][numero_columna] = "1";
				System.out.println("El Peón puede moverse así:");
			} else {
				System.out.println("El peón no puede serguir avanzando.");
			}
			// }
			tablero[numero_fila][numero_columna] = "P";
			for (int fila = 0; fila < tablero.length; fila++) {
				for (int columna = 0; columna < tablero[fila].length; columna++) {
					if (tablero[fila][columna] == "1") {
						System.out.print(" 0 ");
					} else if (tablero[fila][columna] == "P") {
						System.out.print(" P ");
					} else {
						System.out.print(" - ");
					}
				}
				System.out.println();
			}
		}
	}

	static class moverRey {
		private static void moverR(String nombre, char fila_tab, char columna_tab, String fila_arr,
				String columna_arr) {
			String[][] tablero;
			tablero = new String[8][8];
			int numero_fila = 0;
			int numero_columna = 0;
			System.out.println("La posicion de la " + nombre + " en el tablero es: " + columna_tab + fila_tab);
			System.out.println("La posicion de la Dama en el arreglo es: " + fila_arr + columna_arr);
			numero_fila = Integer.parseInt(fila_arr);
			numero_columna = Integer.parseInt(columna_arr);
			tablero[numero_fila][numero_columna] = "1";
			// mover filas hacia adelante
			if (numero_fila > 0) {
				tablero[numero_fila - 1][numero_columna] = "1";
			}
			// mover filas hacia atras
			if (numero_fila < 7) {
				tablero[numero_fila + 1][numero_columna] = "1";
			}
			// mover columnas hacia adelante
			if (numero_columna < 7) {
				tablero[numero_fila][numero_columna + 1] = "1";
			}
			// mover columnas hacia atras
			if (numero_columna > 0) {
				tablero[numero_fila][numero_columna - 1] = "1";
			}
			// mover filas y columnas hacia adelante
			if (numero_columna < 7 && numero_fila > 0) {
				tablero[numero_fila - 1][numero_columna + 1] = "1";
			}
			// mover filas y columnas hacia atras
			if (numero_columna > 0 && numero_fila < 7) {
				tablero[numero_fila + 1][numero_columna - 1] = "1";
			}
			// mover filas hacia adelante y columnas hacia atras
			if (numero_columna > 0 && numero_fila > 0) {
				tablero[numero_fila - 1][numero_columna - 1] = "1";
			}
			// mover filas hacia atras y columnas hacia adelante
			if (numero_columna < 7 && numero_fila < 7) {
				tablero[numero_fila + 1][numero_columna + 1] = "1";
			}
			tablero[numero_fila][numero_columna] = "R";
			System.out.println("La Dama puede moverse así:");
			for (int fila = 0; fila < tablero.length; fila++) {
				for (int columna = 0; columna < tablero[fila].length; columna++) {
					if (tablero[fila][columna] == "1") {
						System.out.print(" 0 ");
					} else if (tablero[fila][columna] == "R") {
						System.out.print(" R ");
					} else {
						System.out.print(" - ");
					}
				}
				System.out.println();
			}
		}
	}

	static class moverTorre {
		private static void moverT(String nombre, char fila_tab, char columna_tab, String fila_arr,
				String columna_arr) {
			String[][] tablero;
			tablero = new String[8][8];
			int numero_fila = 0;
			int numero_columna = 0;
			System.out.println("La posicion de la " + nombre + " en el tablero es: " + columna_tab + fila_tab);
			// System.out.println("La posicion de la Dama en el arreglo es: " +
			// fila_arr + columna_arr);
			numero_fila = Integer.parseInt(fila_arr);
			numero_columna = Integer.parseInt(columna_arr);
			tablero[numero_fila][numero_columna] = "1";
			// mover filas hacia adelante
			for (int fila = numero_fila; fila <= 7; fila++) {
				tablero[fila][numero_columna] = "1";
			}
			// mover filas hacia atras
			for (int fila = numero_fila; fila >= 0; fila--) {
				tablero[fila][numero_columna] = "1";
			}
			// mover columnas hacia adelante
			for (int columna = numero_columna; columna <= 7; columna++) {
				tablero[numero_fila][columna] = "1";
			}
			// mover columnas hacia atras
			for (int columna = numero_columna; columna >= 0; columna--) {
				tablero[numero_fila][columna] = "1";
			}
			tablero[numero_fila][numero_columna] = "T";
			System.out.println("La Torre puede moverse así:");
			for (int fila = 0; fila < tablero.length; fila++) {
				for (int columna = 0; columna < tablero[fila].length; columna++) {
					if (tablero[fila][columna] == "1") {
						System.out.print(" 0 ");
					} else if (tablero[fila][columna] == "T") {
						System.out.print(" T ");
					} else {
						System.out.print(" - ");
					}
				}
				System.out.println();
			}
		}
	}

	static class moverAlfil {
		private static void moverA(String nombre, char fila_tab, char columna_tab, String fila_arr,
				String columna_arr) {
			String[][] tablero;
			tablero = new String[8][8];
			int numero_fila = 0;
			int numero_columna = 0;
			System.out.println("La posicion de la " + nombre + " en el tablero es: " + columna_tab + fila_tab);
			// System.out.println("La posicion de la Dama en el arreglo es: " +
			// fila_arr + columna_arr);
			numero_fila = Integer.parseInt(fila_arr);
			numero_columna = Integer.parseInt(columna_arr);
			tablero[numero_fila][numero_columna] = "1";
			// mover filas y columnas hacia adelante
			for (int fila = numero_fila, columna = numero_columna; fila <= 7 && columna <= 7; fila++, columna++) {
				tablero[fila][columna] = "1";
			}
			// mover filas y columnas hacia atras
			for (int fila = numero_fila, columna = numero_columna; fila >= 0 && columna >= 0; fila--, columna--) {
				tablero[fila][columna] = "1";
			}
			// mover filas hacia adelante y columnas hacia atras
			for (int fila = numero_fila, columna = numero_columna; fila <= 7 && columna >= 0; fila++, columna--) {
				tablero[fila][columna] = "1";
			}
			// mover filas hacia atras y columnas hacia adelante
			for (int fila = numero_fila, columna = numero_columna; fila >= 0 && columna <= 7; fila--, columna++) {
				tablero[fila][columna] = "1";
			}
			tablero[numero_fila][numero_columna] = "A";
			System.out.println("El Alfil puede moverse así:");
			for (int fila = 0; fila < tablero.length; fila++) {
				for (int columna = 0; columna < tablero[fila].length; columna++) {
					if (tablero[fila][columna] == "1") {
						System.out.print(" 0 ");
					} else if (tablero[fila][columna] == "A") {
						System.out.print(" A ");
					} else {
						System.out.print(" - ");
					}
				}
				System.out.println();
			}
		}
	}

	static class moverCaballo {
		private static void moverC(String nombre, char fila_tab, char columna_tab, String fila_arr,
				String columna_arr) {
			String[][] tablero;
			tablero = new String[8][8];
			int numero_fila = 0;
			int numero_columna = 0;
			System.out.println("La posicion de la " + nombre + " en el tablero es: " + columna_tab + fila_tab);
			// System.out.println("La posicion de la Dama en el arreglo es: " +
			// fila_arr + columna_arr);
			numero_fila = Integer.parseInt(fila_arr);
			numero_columna = Integer.parseInt(columna_arr);
			tablero[numero_fila][numero_columna] = "1";
			// mover filas hacia adelante
			// for (int fila = numero_fila; fila <= 7; fila++) {
			if (numero_fila > 1) {
				if (numero_columna < 7) {
					tablero[numero_fila - 2][numero_columna + 1] = "1";
				}
				if (numero_columna > 1) {
					tablero[numero_fila - 2][numero_columna - 1] = "1";
				}
			}
			// }
			// mover filas hacia atras
			// for (int fila = numero_fila; fila >= 0; fila--) {
			if (numero_fila < 6) {
				if (numero_columna < 7) {
					tablero[numero_fila + 2][numero_columna + 1] = "1";
				}
				if (numero_columna > 1) {
					tablero[numero_fila + 2][numero_columna - 1] = "1";
				}
			}
			// }
			// mover columnas hacia derecha
			// for (int columna = numero_columna; columna <= 7; columna++) {
			if (numero_columna < 6) {
				if (numero_fila < 6) {
					tablero[numero_fila + 1][numero_columna + 2] = "1";
				}
				if (numero_fila > 0) {
					tablero[numero_fila - 1][numero_columna + 2] = "1";
				}
			}
			// }
			// mover columnas hacia izquierda
			// for (int columna = numero_columna; columna >= 0; columna--) {
			if (numero_columna > 1) {
				if (numero_fila < 6) {
					tablero[numero_fila + 1][numero_columna - 2] = "1";
				}
				if (numero_fila > 0) {
					tablero[numero_fila - 1][numero_columna - 2] = "1";
				}
			}
			// }
			tablero[numero_fila][numero_columna] = "C";
			System.out.println("El Caballo puede moverse así:");
			for (int fila = 0; fila < tablero.length; fila++) {
				for (int columna = 0; columna < tablero[fila].length; columna++) {
					if (tablero[fila][columna] == "1") {
						System.out.print(" 0 ");
					} else if (tablero[fila][columna] == "C") {
						System.out.print(" C ");
					} else {
						System.out.print(" - ");
					}
				}
				System.out.println();
			}
		}
	}
}
