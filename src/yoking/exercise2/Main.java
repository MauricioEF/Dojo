package yoking.exercise2;

public class Main {
	public static void main(String[] args) {
		// Desarrollar un programa que tome la variable measurement (Ya declarada) y
		// definir lo siguiente:

		
		/*
		 * 1. Si measurement es menor que 2, indicar "medición muy baja". 
		 * 2. Si measurement es mayor que dos y menor o igual a 5, indicar "medición baja" 
		 * 3. Si measurement es mayor que 5 y menor o igual a 8 indicar "medicion alta" 
		 * 4. Si measurement es mayor que 8 y menor o igual a 10, indicar: "medición muy alta"
		 */
 
		float measurement = 0.0f;        // Cambiar según las pruebas

		if(measurement<2) {System.out.println("medición muy baja");
		}
		
		if(measurement>2 && measurement<=5) {System.out.println("medición baja");
		}
		
		if(measurement>5 && measurement<=8) {System.out.println("medicion alta");
		}
		
		if(measurement>8 && measurement<=10){System.out.println("medición muy alta");
		}
	}
}