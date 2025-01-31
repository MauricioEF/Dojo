package yoking.exercise9;

import yoking.exercise9.Task;

public class TaskManager {

	int idCounter = 0;
	private Task[] taskArray = new Task[100];
	Task task = new Task();

	public String createTask(String title, String descripcion) {
		
		idCounter++;
		task.setTitle(title);
		task.setDescription(descripcion);
		task.setStatus("pendiente");
		task.setId(idCounter);
		taskArray[idCounter - 1] = task;

		

		return "Create: " + idCounter;

	}

	public Task getTask(int taskId) {
		if (taskId > 0 && taskId <= idCounter) {
		    return taskArray[taskId - 1];
		}
		return null;
	}

	public boolean completeTask(int taskId) {
		if (taskId > 0 && taskId <= idCounter) {
		    Task task = taskArray[taskId - 1];
		    if (!task.getStatus().equals("finalizado")) {
		        task.Complete();
		        return true;
		    }
		}
		return false;
	}
}
