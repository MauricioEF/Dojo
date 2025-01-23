package yoking.exercise6;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		/*
		 * Desarrollar el juego "Adivina el numero", la computadora elegira un numero
		 * aleatorio entre 1 y 10
		 * 
		 * Luego se pedirá al usuario elegir un número. Si es correcto, le indicará en
		 * cuántos intentos atinó Si es incorrecto, le tendrá que decir "menos" en caso
		 * de que el numero secreto sea menor, o bien "más" si el número secreto es
		 * mayor que el seleccionado.
		 */
		int intentos = 1;
		boolean isTrue = false;
		Random rand = new Random();
		int number = rand.nextInt(1, 10);
		Scanner scan = new Scanner(System.in);

		System.out.println("Bienvenido a Adivina el numero");
		while (isTrue == false) {
			System.out.println("Adivina el numero del 1 al 10");
			int isTheNumber = scan.nextInt();

			if (isTheNumber == number) {
				System.out.println("Felicidades has acertado ");
				System.out.println("Numero de intentos:" + intentos);
				isTrue = true;
			} else {
				if (number > isTheNumber) {
					System.out.println("Más");
				}
				if (number < isTheNumber) {
					System.out.println("Menos");
				}
				System.out.println("intenta de nuevo\n");
				intentos++;
			}
		}

	}
}
