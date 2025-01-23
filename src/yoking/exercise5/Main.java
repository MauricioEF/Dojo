package yoking.exercise5;

import java.util.Scanner;

import yoking.exercise5.funcion_numberMax;

public class Main {
	public static void main(String[] args) {

		/*
		 * Desarrollar una funcion que tendrá por nombre "getMaxNumber" el cual deberá
		 * recibir un arreglo de números enteros, el programa retornará el entero mayor
		 * de ese arreglo Probar función en este archivo
		 */

		System.out.println("Ingresa la longitud");
		Scanner scan = new Scanner(System.in);
		int longitud = scan.nextInt();

		int[] numbers = new int[longitud];

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Ingresa los numeros del arreglo ");
			int action = scan.nextInt();

			numbers[i] = action;

		}
		System.out.println("El numero mayor es: "+funcion_numberMax.getNumberMax(numbers));
	}
}