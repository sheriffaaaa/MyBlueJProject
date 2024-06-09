public class Task
{
   private String description;
   private boolean completed;
   
   //initialize wth task n set sompleted to false
   public Task (String description)
   {
       this.description = description;
       this.completed= false;
   }
   
   public String getDescription ()
   {
       return description;
   }
   
   public boolean isCompleted ()
   {
       return completed;
   }
   
   
   public void setCompleted(boolean completed)
   {
       this.completed= completed;
   }
}
