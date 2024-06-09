import java.util.ArrayList;//kalau tak buat import java compiler tal detect and akan keluar error


public class ToDoList
{
    //data members k=jangan lupa isi 'private' kat depan!!!!!
    
    private ArrayList <Task> tasks;
     
    public ToDoList()
    {
        tasks = new ArrayList<>();
    } 

    public void addTask(Task task) {
        tasks.add(task);
    }
    
    //remove task from thetasks array list 
    public void removeTask(int index)
    {
    //check if the index is within the bound
        if (index >= 0 && index < tasks.size ())
    {
        //remove the task at the spesified index
        tasks.remove(index);
    } else {
        System.out.println("Invalid task index");
    }
    }
    
    //Mark a task as completed
    public void markTaskAsCompleted(int index)
    {
        //check if the task in within the bound of ArrayList
        if (index >= 0 && index <tasks.size())
        {
            //mark the specifies as completed
            tasks.get(index).setCompleted(true);
        }else{
            //error message
            System.out.println("Invalid task index");
        }
        }
     
    //Display all the task in ArrayList
    public void displayTasks()
    {
        //iterate over the tasks in the taks of ArrayList
        for (int i = 0; i< tasks.size(); i++)
        {
            //get the task at the current index
            Task task = tasks.get(i);
            //print the task description with its cmpletioj status
            System.out.println((i+1) + ". " + task.getDescription() + (task.isCompleted()? " [X]" : ""));
        }
    }
}

