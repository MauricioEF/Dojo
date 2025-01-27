package yoking.exercise8;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		/*
		 * Desarrollar un programa que permita registrar un usuario
		 * 
		 * Al iniciar el programa, deberá intentar leer un archivo con el usuario,
		 * 
		 * En caso de que no lo encuentre: Se le indicará al usuario que coloque su
		 * nombre, su edad y su correo electrónico Luego, se ejecutará una función (debe
		 * ser creada aparte) llamada "registerUser" la cual escribirá en un archivo las
		 * características que ingresó el usuario
		 * 
		 * En caso de que sí lo encuentre, se le dará la bienvenida al usuario indicando
		 * los datos que había metido anteriormente.
		 */

		String name ="";
		int age = 0;
		String mail = "";
		Scanner scan = new Scanner(System.in);
		
		try{
			File data = new File("File.data");
		boolean fileExists = data.createNewFile();
		
		if (!fileExists) {
		Scanner existing = new Scanner(data);
		while (existing.hasNextLine()) {
			
			String currentLine = existing.nextLine();
			int SeparationIndex = currentLine.lastIndexOf(":");
			
			String variable = currentLine.substring(0,SeparationIndex);
			String value = currentLine.substring (SeparationIndex+1);
			switch(variable){
			case "name":{ 
				name = value;
				break;
			}
			case "age" :{
				age = Integer.parseUnsignedInt(value);
				break;
				}
			case "mail" :{
				mail = value;
				break;
			}
			}
		}
			System.out.println("Cargando datos anteriores... ");
			System.out.println("Bienvenido:" + name);
			System.out.println("Tu edad es:" + age);
			System.out.println("Tu mail es:" + mail);
			return;
		}
		
		}catch(IOException e) {
			System.out.println("Ocurrio un error" );
			
		}
		
		
		
		// En caso de no encontrar:
		System.out.println("Ingrese su Nombre: ");
		name = scan.nextLine();

		System.out.println("Ingrese su edad: ");
		age = scan.nextInt();
		scan.nextLine(); 

		System.out.println("Ingrese su Correo electronico: ");
		mail = scan.nextLine();
		
		registerUser.registerUser(name, age, mail);

		
	}
}