package Randomizador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pincipal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> receptores = new ArrayList<>();
		receptores.add("Sebas");
		receptores.add("Luis");
		receptores.add("Andrea");
		ArrayList<String> colocadoras = new ArrayList<>();
		colocadoras.add("Blanca");
		colocadoras.add("Lola");
		ArrayList<String> centrales = new ArrayList<>();
		centrales.add("Diego");
		centrales.add("Iñaki");
		centrales.add("Charly");
		ArrayList<String> liberos = new ArrayList<>();
		liberos.add("Christian");
		liberos.add("Eva");
		ArrayList<String> opuestos = new ArrayList<>();
		opuestos.add("Adri");
		opuestos.add("Chispa");
		opuestos.add("Sara");

		System.out.println("¿Salimos en R1 O R2?");
		int respuesta = sc.nextInt();

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
			central2 = centrales.get(1);
			
			System.out.println("\nAlineación de jugadores:");
	        System.out.println("1. " + central2 + " (Central)" + " -- " + libero + " (Libero)");
	        System.out.println("2. " + colocadora + " (Colocadora)");
	        System.out.println("3. " + receptor1 + " (Receptor)");
	        System.out.println("4. " + central1 + " (Central)");
	        System.out.println("5. " + opuesto1 + " (Opuesto)");
	        System.out.println("6. " + receptor2 + " (Receptor)");
			
			break;
		default:
			System.out.println("Opción no válida");
			return;
			
		}
		
		sc.close();

	}

}
