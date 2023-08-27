package sg.edu.nus.iss.epat.tdd.workshop;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class ToDoListTest extends TestCase {
   // Define Test Fixtures

   public ToDoListTest() {
      super();
   }
   Task task1;
   Task task2;
   Task task3;
   ToDoList todo;
   @Before
   public void setUp() throws Exception {
      // Initialise Test Fixtures
	  task1=new Task("desc1", false);
	  task2=new Task("desc2", false);
	  task3=new Task("desc2", true);
	  todo=new ToDoList();
	    
   }

   @After
   public void tearDown() throws Exception {
      // Uninitialise test Fixtures
	   
   }

   @Test
   public void testAddTask() {
	   todo.addTask(task1);
	   assertEquals(1, todo.getAllTasks().size());
	   assertEquals(task1, todo.getTask("desc1"));
     // fail("Not implemented yet");
   }

   @Test
   public void testGetStatus() {
	   todo.addTask(task2);
	  assertEquals(false, todo.getStatus("desc2")); 
	   
     // fail("Not implemented yet");
   }

   @Test
   public void testRemoveTask() {
	   todo.addTask(task1);
	   todo.addTask(task2);
	   todo.removeTask("desc1");
	   assertEquals(1, todo.getAllTasks().size());
	   assertEquals(false, todo.getAllTasks().contains(task1));
	   
    //  fail("Not implemented yet");
   }

   @Test
   public void testGetCompletedTasks() {
     // fail("Not implemented yet");
	   todo.addTask(task1);
	   todo.addTask(task3);
	   todo.getCompletedTasks();
	   assertEquals(1, todo.getCompletedTasks().size());
	  // assertEquals(true, todo.getCompletedTasks().contains(task3));
	   
      
   }
}
