package yoking.exercise7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * Desarrollar un programa que valide una contraseña Se solicitará al usuario
		 * que cree una contraseña Luego se debe evaluar en la string resultante: 1. que
		 * la contraseña tenga una longitud por lo menos de 6 caracteres (pueden ser
		 * mas) 2. debe contener por lo menos 3 letras (pueden ser mas) 3. debe contener
		 * por lo menos 3 numeros (pueden ser mas) 4. debe contar con el caracter *
		 * Finalmente, si cumple todos los requisitos, dirá "Contraseña correcta" y
		 * deberá finalizar el programa En caso de que no cumpla con los requisitos,
		 * deberá indicar "Contraseña muy débil" y deberá PERMITIRLE ingresar la
		 * contraseña nuevamente hasta que logre colocar una lo suficientemente fuerte.
		 */

		
		
		
		// Aprendi 3 nuevas sintaxis (continue, isDigit, isLetter )
		Scanner scan = new Scanner(System.in);
		boolean correctPassword = false;
		int letterCounter = 0;
		int isNum = 0;
		int isTheCharacter = 0;
		
		while (correctPassword == false) {
			System.out.println("Ingrese la contraseña");
			String pasword = scan.nextLine();
			char[] splitedPasword = pasword.toCharArray();

			if (splitedPasword.length <= 5) {
				System.out.println("La longitud minima es de 6 caracteres");
				continue;
			}

			for (int i = 0; i < splitedPasword.length; i++) {
				System.out.println(splitedPasword[i]);

				if (Character.isDigit(splitedPasword[i])) {
					isNum++;
				}

				if (Character.isLetter(splitedPasword[i])) {
					letterCounter++;
				}

				if (splitedPasword[i] == '*') {
					isTheCharacter++;
				}
			}

			if (isNum <= 2) {
				System.out.println("Debe de Incluir como minimo 3 digitos");
				continue;
			}
			if (letterCounter <= 2) {
				System.out.println("Debe de Incluir como minimo 3 letras");
				continue;
			}
			if (isTheCharacter < 1) {
				System.out.println("Debe incluir un *");
				continue;
			}
			
			System.out.println("Contraseña correcta");
			correctPassword = true;
			
		}
	}
}
