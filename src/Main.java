import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TaskManager taskManager = new TaskManager();
        Scanner scan = new Scanner(System.in);
        int result;
        int index = 1;
        Map<Integer, Map<String, Boolean>> list = new HashMap<>();

        while(true) {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("----------------------------TASK_MASTER----------------------------");
            System.out.println("-------------------------------------------------------------------");
            System.out.println();
            System.out.println("Choice the number");
            System.out.println("1. Add to List");
            System.out.println("2. Remove to List");
            System.out.println("3. View to list");
            System.out.println("4. Edit to List");
            System.out.println("5. Logout");
            System.out.print("Enter your choice: ");

            result = scan.nextInt();
            scan.nextLine();


            switch(result) {
                //ADDING TO LIST
                case 1:
                    Map<String, Boolean> map = new HashMap<>();

                    System.out.println("Good Choice");
                    System.out.print("Enter the task: ");
                    String task = scan.nextLine();
                    taskManager.addTask(task);

                    break;

                // REMOVE T0 LIST
                case 2:
                    System.out.println("Good Choice");
                    System.out.println("Enter the number to remove:");
                    int valueRemove = scan.nextInt();
                    scan.nextLine();
                    taskManager.removeTask(valueRemove);

                    break;

                case 3:
                    System.out.println("Good Choice");
                    System.out.println("Enter value to get (Type 0 to view all): ");
                    int valueView = scan.nextInt();
                    scan.nextLine();

                    taskManager.viewTask(valueView);

                    break;

                case 4:
                    System.out.println("Good Choice");
                    System.out.println("Enter the number of the task to edit: ");
                    int value = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter the task to replace: ");
                    var taskToEdit = scan.nextLine();

                    taskManager.editTask(value, taskToEdit);

                    break;

                case 5:
                    System.out.println("GoodBye, See you next time ;)");
                    return;

                default:
                    System.out.println("Enter valid choice");
            }
        }
    }
}