package sg.edu.nus.iss.epat.tdd.workshop;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class ToDoList {
   private HashMap<String, Task> tasks = new HashMap<String, Task>();
  // Task first=new Task("Description of first task",false);
   public void addTask(Task task) {
      // Add code here
	  
	   tasks.put(task.getDescription(), task);
	   
   }

   public void completeTask(String description) {
      // Add code here
	   
	  Task task;
	  task = tasks.get(description);
	  task.setComplete(true);
   }

   public boolean getStatus(String description) {
      // Add code here
	  Task task = null;
	  if((task = tasks.get(description))!=null) {
		  return task.isComplete();
	  }
	  return false;
   }

   public Task getTask(String description) {
      // Add code here
	   Task task = null;
		  if((task = tasks.get(description))!=null) {
			  return  task;
		  }
		  return null;
   }

   public Task removeTask(String description) {
      // Add code here
	   Task task = null;
		  if((task = tasks.get(description))!=null) {
			  tasks.remove(description, task);
		  }
      return task;
   }

   public Collection<Task> getAllTasks() {
	   if(tasks!=null) {
		  for(String t:tasks.keySet()) {
			    System.out.println(t+"="+tasks.get(t));
			}
	   }
	   
      return tasks.values();
   }

   public Collection<Task> getCompletedTasks() {
      // Add code here
	   Collection<Task> c=new ArrayList<Task>();
	   Task task = null;
	   List<String> des=new ArrayList<String>();
	  
	   for(String t:tasks.keySet()) {
		  
		    des.add(t);
		}

	   for(String description:des) {
	   if((task = tasks.get(description))!=null) {
			if(task.isComplete()) {
				c.add(task);
			}
			
		
		  }}
	  return c;
	   
  }}
