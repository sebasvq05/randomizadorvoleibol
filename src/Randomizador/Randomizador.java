package Randomizador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Randomizador {

	public static void agregarJugadores(Scanner sc, String posicion, ArrayList<String> lista) {
		System.out.print("¿Cuántos " + posicion + " deseas añadir? ");
		int cantidad = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < cantidad; i++) {
			System.out.print("Nombre del/la " + posicion + " " + (i + 1) + ": ");
			String nombre = sc.nextLine();
			lista.add(nombre);
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> receptores = new ArrayList<>();
		ArrayList<String> colocadoras = new ArrayList<>();
		ArrayList<String> centrales = new ArrayList<>();
		ArrayList<String> liberos = new ArrayList<>();
		ArrayList<String> opuestos = new ArrayList<>();

		agregarJugadores(sc, "receptores", receptores);
		agregarJugadores(sc, "colocadoras", colocadoras);
		agregarJugadores(sc, "centrales", centrales);
		agregarJugadores(sc, "liberos", liberos);
		agregarJugadores(sc, "opuestos", opuestos);

		int respuesta;
		Thread.sleep(1000);
		System.out.println();
		System.out.println("\t¡Va a empezar el partido!\n");
		do {

			System.out.println("Posición de la colocadora: ");
			respuesta = sc.nextInt();

			if (respuesta == 0) {
				System.out.println("Saliendo del programa...");
				break;
			}

			Collections.shuffle(receptores);
			Collections.shuffle(colocadoras);
			Collections.shuffle(centrales);
			Collections.shuffle(liberos);
			Collections.shuffle(opuestos);

			String colocadora, opuesto1, central1, libero, receptor1, receptor2, central2;

			switch (respuesta) {
			case 1:

				colocadora = colocadoras.get(0);
				receptor1 = receptores.get(0);
				central1 = centrales.get(0);
				opuesto1 = opuestos.get(0);
				receptor2 = receptores.get(1);
				libero = liberos.get(0);
				central2 = centrales.get(1);

				System.out.println("\nAlineación de jugadores:");
				System.out.println("1. " + colocadora + " (Colocadora)");
				System.out.println("2. " + receptor1 + " (Receptor)");
				System.out.println("3. " + central1 + " (Central)");
				System.out.println("4. " + opuesto1 + " (Opuesto)");
				System.out.println("5. " + receptor2 + " (Receptor)");
				System.out.println("6. " + central2 + " (Central)" + " -- " + libero + " (Líbero)");

				break;
			case 2:

				colocadora = colocadoras.get(0);
				receptor1 = receptores.get(0);
				central1 = centrales.get(1);
				opuesto1 = opuestos.get(0);
				receptor2 = receptores.get(1);
				libero = liberos.get(0);
				central2 = centrales.get(2);

				System.out.println("\nAlineación de jugadores:");
				System.out.println("1. " + central2 + " (Central)" + " -- " + libero + " (Libero)");
				System.out.println("2. " + colocadora + " (Colocadora)");
				System.out.println("3. " + receptor1 + " (Receptor)");
				System.out.println("4. " + central1 + " (Central)");
				System.out.println("5. " + opuesto1 + " (Opuesto)");
				System.out.println("6. " + receptor2 + " (Receptor)");

				break;

			case 3:
				colocadora = colocadoras.get(0);
				receptor1 = receptores.get(0);
				central1 = centrales.get(1);
				opuesto1 = opuestos.get(0);
				receptor2 = receptores.get(1);
				libero = liberos.get(0);
				central2 = centrales.get(2);

				System.out.println("\nAlineación de jugadores:");
				System.out.println("1. " + receptor2 + " (Receptor)");
				System.out.println("2. " + central1 + " (Central)");
				System.out.println("3. " + colocadora + " (Colocadora)");
				System.out.println("4. " + receptor1 + " (Receptor)");
				System.out.println("5. " + central2 + " (Central)" + " -- " + libero + " (Libero)");
				System.out.println("6. " + opuesto1 + " (Opuesto)");
				break;
			case 4:

				colocadora = colocadoras.get(0);
				receptor1 = receptores.get(0);
				central1 = centrales.get(1);
				opuesto1 = opuestos.get(0);
				receptor2 = receptores.get(1);
				libero = liberos.get(0);
				central2 = centrales.get(2);

				System.out.println("\nAlineación de jugadores:");
				System.out.println("1. " + opuesto1 + " (Opuesto)");
				System.out.println("2. " + receptor1 + " (Receptor)");
				System.out.println("3. " + central1 + " (Central)");
				System.out.println("4. " + colocadora + " (Colocadora)");
				System.out.println("5. " + receptor2 + " (Receptor)");
				System.out.println("6. " + central2 + " (Central)" + " -- " + libero + " (Libero)");
				break;
			case 5:
				colocadora = colocadoras.get(0);
				receptor1 = receptores.get(0);
				central1 = centrales.get(1);
				opuesto1 = opuestos.get(0);
				receptor2 = receptores.get(1);
				libero = liberos.get(0);
				central2 = centrales.get(2);

				System.out.println("\nAlineación de jugadores:");
				System.out.println("1. " + central2 + " (Central)" + " -- " + libero + " (Libero)");
				System.out.println("2. " + opuesto1 + " (Opuesto)");
				System.out.println("3. " + receptor1 + " (Receptor)");
				System.out.println("4. " + central1 + " (Central)");
				System.out.println("5. " + colocadora + " (Colocadora)");
				System.out.println("6. " + receptor2 + " (Receptor)");
				break;
			case 6:
				colocadora = colocadoras.get(0);
				receptor1 = receptores.get(0);
				central1 = centrales.get(1);
				opuesto1 = opuestos.get(0);
				receptor2 = receptores.get(1);
				libero = liberos.get(0);
				central2 = centrales.get(2);

				System.out.println("\nAlineación de jugadores:");
				System.out.println("1. " + receptor2 + " (Receptor)");
				System.out.println("2. " + central1 + " (Central)");
				System.out.println("3. " + opuesto1 + " (Receptor)");
				System.out.println("4. " + receptor1 + " (Opuesto)");
				System.out.println("5. " + central2 + " (Opuesto)" + " -- " + libero + " (Libero)");
				System.out.println("6. " + colocadora + " (Colocadora)");
				break;

			default:
				System.out.println("Opción no válida");
				return;

			}

		} while (true);

		sc.close();

	}
}
