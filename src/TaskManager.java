import java.util.*;

public class TaskManager {
    private int index = 1;
    private Map<Integer, Task> taskList;
    private final Scanner scan = new Scanner(System.in);

    public TaskManager(){
        taskList = new HashMap<>();
    }

    public void addTask(String task){
        Task tasksI = new Task(task, false);
        var tasks = taskList.put(index, tasksI);
        System.out.println("Task added at " + index + " : " + task);
        index++;
    }

    public void removeTask(int index){
        if(taskList.remove(index) !=null){
            System.out.println("Successfully removed " + index);
        } else {
            System.out.println("Task not found at " + taskList);
        }
    }

    public void viewTask(int index){
        if(index != 0){
            Task task = taskList.get(index);
            if(task != null){
                System.out.println("The task " + task.getTheTask() + " : " + task.isCompleted());
            }
        } else {
            for(Map.Entry<Integer, Task> entry : taskList.entrySet()) {
                System.out.println("The task " + entry.getKey() + " : " + entry.getValue().getTheTask());
            }
        }
    }

    public void editTask(int index, String task){
        var taskToEdit = taskList.get(index);
        if(taskToEdit != null) {
            String currentTask = taskToEdit.getTheTask();

            if (!task.isEmpty()) {
                taskToEdit.setDescription(task);
                System.out.println("Task updated successfully: " + task);
            }

            System.out.println("Do you want to mark this task as completed? (yes/no): ");
            String completedResponse = scan.nextLine();

            if(completedResponse.equalsIgnoreCase("yes")){
                taskToEdit.setCompleted(true);
                System.out.println("The task " + taskToEdit.getTheTask() + " : " + taskToEdit.isCompleted());
            }

        }
    }
}
