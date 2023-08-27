package sg.edu.nus.iss.epat.tdd.workshop;

import java.util.HashMap;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  HashMap<String, Task> tasks = new HashMap<String, Task>();
		  
		  Task first=new Task("Description of first task",false);
		  tasks.put(first.getDescription(), first);
		  if(tasks!=null) {
			  for(String t:tasks.keySet()) {
				  System.out.println(t+"="+tasks.get(t));
				}
		   }

	}

}
