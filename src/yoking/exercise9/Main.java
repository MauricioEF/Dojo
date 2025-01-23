package yoking.exercise9;

public class Main {
	/*
	 * Desarrollar un Sistema de TODOs (Tareas por hacer). Para ello, se deberá hacer lo siguiente
	 * Se necesita:
	 * 1 clase TaskManager (Para manejar los tasks)
	 * 1 clase Task (La entidad Task en si)
	 * 
	 * Estructura:
	 * 
	 * Clase Task
	 * Atributos:
	 * id:number
	 * title:string
	 * description:string
	 * status:string (posibles estatus:  "pendiente","en proceso", "finalizado"
	 * 
	 * Metodos:
	 *  complete: (recibe: nada, devuelve: nada) debera cambiar el  estatus del task a "finalizado" (Solo si no 
	 *  esta finalizado ya)
	 * Todos los atributos DEBEN tener sus getter y setter
	 *
	 * 
	 * Clase  TaskManager
	 * Atributos:
	 * idCounter:number  (Servira para asignar ids a las tasks)
	 * tasks: Arreglo de tipo Task  -> Task[]
	 * 
	 * Metodos:
	 * createTask: (recibe: title:string, description:string, devuelve: el id del Task creado)
	 * funcionamiento: createTask debera crear una instancia de Task con 
	 * el id actualizado, insertarlo en el arreglo de Tasks y devolver el id del
	 * Task creado.
	 * 
	 * getTask: (recibe: taskId:number, devuelve: objeto tipo Task o null) 
	 * funcionamiento: una vez  recibido el taskId, debera localizar el task cuyo 
	 * id (no index) coincida con el buscado.
	 * En caso de que el Task con ese id no exista, deberá devolver null
	 * 
	 * completeTask: (recibe:taskId:number,  devuelve: true si se pudo completar, false si no)
	 * funcionamiento:  una vez recibido  el  TaskId,  debera  localizar el  task
	 * cuyo id (no index) coincida con  el buscado. En caso de existir, ejecutara
	 * sobre este Task su funcion complete (interna del  Task)
	 * 
	 * 
	 * 
	 * Sobre el archivo main
	 * para hacer las pruebas, pueden hacerse con un loop y un escaner, o bien
	 * generando las instancias y variables a crear sin necesidad  de un loop
	 * y un escaner.
	 */
}
