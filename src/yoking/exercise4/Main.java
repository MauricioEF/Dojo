package yoking.exercise4;

import java.util.Scanner;
import isVowel.funcion;

public class Main {
	public static void main(String[] args) {

		// Desarrollar una funcion llamada isVowel, la cual recibirá un char
		// La funcion devolvera true si la letra es una vocal, y false si no lo es
		// Probar la funcion en este archivo

		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la vocal: ");
		char vowel = scan.next().charAt(0);

		if (isVowel.funcion.isVowel(vowel)) {
			System.out.println("Es una vocal");
			return;
		} else {
			System.out.println("No es una vocal");
		}
	}
}