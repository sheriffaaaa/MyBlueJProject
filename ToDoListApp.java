import java.util.Scanner;

public class ToDoListApp
{
   public static void main (String [] args)
   {
       ToDoList toDoList = new ToDoList ();
       Scanner scanner = new Scanner (System.in);
       
       while ( true)
       {
           System.out.println("1. Add task");
           System.out.println("2. Remove task");
           System.out.println("3. Mark task as completed");
           System.out.println("4. Display Task");
           System.out.println("5. Exit");
           
           int choice = scanner.nextInt();
           
           switch (choice)
           {
               case 1:
                   System.out.print("Enter task description: ");
                    String taskDescription = scanner.next();
                    Task task = new Task(taskDescription);
                    toDoList.addTask(task);
                    break;
                case 2:
                    System.out.print("Enter task index to remove: ");
                    int removeIndex = scanner.nextInt() - 1;
                    toDoList.removeTask(removeIndex);
                    break;
                case 3:
                    System.out.print("Enter task index to mark as completed: ");
                    int completeIndex = scanner.nextInt() - 1;
                    toDoList.markTaskAsCompleted(completeIndex);
                     break;
                case 4:
                    toDoList.displayTasks();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
           }
       }
   }
}
