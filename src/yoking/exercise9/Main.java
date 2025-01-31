package yoking.exercise9;

import java.util.Scanner;
import yoking.exercise9.TaskManager;

public class Main {
	public static void main(String[] args) {
		/*
		 * Desarrollar un Sistema de TODOs (Tareas por hacer). Para ello, se deberá
		 * hacer lo siguiente Se necesita: 1 clase TaskManager (Para manejar los tasks)
		 * 1 clase Task (La entidad Task en si)
		 * 
		 * Estructura:
		 * 
		 * Clase Task Atributos: id:number title:string description:string status:string
		 * (posibles estatus: "pendiente","en proceso", "finalizado"
		 * 
		 * Metodos: complete: (recibe: nada, devuelve: nada) debera cambiar el estatus
		 * del task a "finalizado" (Solo si no esta finalizado ya) Todos los atributos
		 * DEBEN tener sus getter y setter
		 *
		 * 
		 * Clase TaskManager Atributos: idCounter:number (Servira para asignar ids a las
		 * tasks) tasks: Arreglo de tipo Task -> Task[]
		 * 
		 * Metodos: createTask: (recibe: title:string, description:string, devuelve: el
		 * id del Task creado) funcionamiento: createTask debera crear una instancia de
		 * Task con el id actualizado, insertarlo en el arreglo de Tasks y devolver el
		 * id del Task creado.
		 * 
		 * 
		 * getTask: (recibe: taskId:number, devuelve: objeto tipo Task o null)
		 * funcionamiento: una vez recibido el taskId, debera localizar el task cuyo id
		 * (no index) coincida con el buscado. En caso de que el Task con ese id no
		 * exista, deberá devolver null
		 * 
		 * completeTask: (recibe:taskId:number, devuelve: true si se pudo completar,
		 * false si no) funcionamiento: una vez recibido el TaskId, debera localizar el
		 * task cuyo id (no index) coincida con el buscado. En caso de existir,
		 * ejecutara sobre este Task su funcion complete (interna del Task)
		 * 
		 * 
		 * 
		 * Sobre el archivo main para hacer las pruebas, pueden hacerse con un loop y un
		 * escaner, o bien generando las instancias y variables a crear sin necesidad de
		 * un loop y un escaner.
		 */

		Scanner scan = new Scanner(System.in);
		TaskManager taskManager = new TaskManager();
		int count = 0;

		// chatGPT >:3
		while (true) {
			System.out.println("Seleccione una opción:");
			System.out.println("1. Crear tarea");
			System.out.println("2. Ver tarea por ID");
			System.out.println("3. Completar tarea");
			System.out.println("4. Salir");
			int choice = scan.nextInt();
			scan.nextLine();

			switch (choice) {
			case 1:

				if (count < 100) {
					System.out.print("Ingrese el título de la tarea: ");
					String title = scan.nextLine();
					System.out.print("Ingrese la descripción de la tarea: ");
					String description = scan.nextLine();
					System.out.println(taskManager.createTask(title, description));
					count++;
				} else {
					System.out.println("Ya has creado el máximo de tareas (10).");
				}
				break;

			case 2:

				System.out.print("Ingrese el ID de la tarea a ver: ");
				int taskId = scan.nextInt();
				scan.nextLine();
				Task task = taskManager.getTask(taskId);
				if (task != null) {
					System.out.println("ID: " + task.getId());
					System.out.println("Título: " + task.getTitle());
					System.out.println("Descripción: " + task.getDescription());
					System.out.println("Estado: " + task.getStatus());
				} else {
					System.out.println("Tarea no encontrada.");
				}
				break;

			case 3:
				System.out.print("Ingrese el ID de la tarea a completar: ");
				int completeTaskId = scan.nextInt();
				scan.nextLine();
				boolean isComplete = taskManager.completeTask(completeTaskId);
				break;

			case 4:

				System.out.println("Saliendo...");
				scan.close();
				return;

			default:
				System.out.println("Opción no válida, intente nuevamente.");
			}
		}

	}
}
