package yoking.exercise3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Desarrollar un programa que tome del usuario una palabra y un numero de salto
		// Segun esto, colocar una x cada vez que llegue dicho salto entre la palabra

		/*
		 * Ejemplos:
		 * 
		 * ejemplo1: palabra: "perro" salto: 2 resultado: pexrrxo
		 * 
		 * ejemplo2: palabra: "palabra" salto: 3 resultado: palxabrxa
		 * 
		 * ejemplo3: palabra: "sol" salto: 4 resultado: sol (Nota como la palabra es muy
		 * corta como para poner un salto)
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("Ingresa tu palabra");
		String action = scan.nextLine();
		int counter = 0;

		System.out.println("Ingresa el numero de saltos que deseas poner: ");
		int jumps = scan.nextInt();

		for (char Letter : action.toCharArray()) {
			System.out.println(Letter);
			counter++;
			if (counter == jumps) {
				System.out.println("x");
				counter -= jumps;
			}

		}

	}
}