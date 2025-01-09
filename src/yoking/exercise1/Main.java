package yoking.exercise1;

import java.util.Scanner;
import java.util.ArrayDeque;

public class Main {
	public static void main(String[] args) {
		//Desarrollar un programa que permita tomar del usuario una palabra e invertirla.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la palabra: ");
		String action = scan.nextLine();
		
		
		ArrayDeque <Character> word = new ArrayDeque<Character>();
		
		for(char letter:action.toCharArray()) {
			word.push(letter);
		}
		
		while(word.size()>0) {
			System.out.println(word.pop());
		}
		
	}
}
