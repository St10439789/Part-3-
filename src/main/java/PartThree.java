
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class PartThree {
      private String developer;
      private String taskName;
      private int taskDuration;
      private int taskID;
      private String taskStatus;
      
      //Arrays to store task data 
      private static String[] developers =  {
       "Mike Smith",
       "Edward Harrison",
       "Samatha Paulson",
       "Glenda Oberholzer"
              
      };
      
      private static String[] taskNames ={
         "Create Login",
          "Create Add Features",
          "Create Reports",
          "Add Arrays"
              
      };
      
    private static int[] taskIDs = { 1, 2, 3, 4 };
    private static int[] taskDurations = { 5, 8, 2, 11 };
    private static String[] taskStatuses = { "To Do", "Doing", "Done", "To Do" };

    public static void main(String[] args) {
      
        displayTasksWithStatusDone();
        displayLongestDurationTask();
        searchTaskByName("Create Reports");
        searchTasksByDeveloper("Mike Smith");
        deleteTaskByName("Add Arrays");
        displayAllTasks();
    }

   
    public static void displayTasksWithStatusDone() {
        System.out.println("Tasks with status 'Done':");
        for (int i = 0; i < taskStatuses.length; i++) {
            if (taskStatuses[i].equals("Done")) {
                System.out.println("Developer: " + developers[i] + ", Task Name: " + taskNames[i] + ", Task Duration: " + taskDurations[i]);
            }
        }
        System.out.println();
    }

    public static void displayLongestDurationTask() {
        int longestDuration = -1;
        int index = -1;

        for (int i = 0; i < taskDurations.length; i++) {
            if (taskDurations[i] > longestDuration) {
                longestDuration = taskDurations[i];
                index = i;
            }
        }

        if (index != -1) {
            System.out.println("Task with longest duration:");
            System.out.println("Developer: " + developers[index] + ", Task Duration: " + taskDurations[index]);
            System.out.println();
        }
    }


    public static void searchTaskByName(String name) {
        boolean found = false;

        for (int i = 0; i < taskNames.length; i++) {
            if (taskNames[i].equalsIgnoreCase(name)) {
                System.out.println("Task found:");
                System.out.println("Task Name: " + taskNames[i] + ", Developer: " + developers[i] + ", Task Status: " + taskStatuses[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Task with name '" + name + "' not found.");
        }
        System.out.println();
    }

    // Search for all tasks assigned to a specific developer and display their names and statuses
    public static void searchTasksByDeveloper(String developer) {
        System.out.println("Tasks assigned to developer '" + developer + "':");
        boolean foundTasks = false;

        for (int i = 0; i < developers.length; i++) {
            if (developers[i].equalsIgnoreCase(developer)) {
                System.out.println("Task Name: " + taskNames[i] + ", Task Status: " + taskStatuses[i]);
                foundTasks = true;
            }
        }

        if (!foundTasks) {
            System.out.println("No tasks assigned to developer '" + developer + "'.");
        }
        System.out.println();
    }

    // Delete a task by task name
    public static void deleteTaskByName(String name) {
        boolean deleted = false;

        for (int i = 0; i < taskNames.length; i++) {
            if (taskNames[i].equalsIgnoreCase(name)) {
                // Delete task by shifting remaining elements
                for (int j = i; j < taskNames.length - 1; j++) {
                    developers[j] = developers[j + 1];
                    taskNames[j] = taskNames[j + 1];
                    taskIDs[j] = taskIDs[j + 1];
                    taskDurations[j] = taskDurations[j + 1];
                    taskStatuses[j] = taskStatuses[j + 1];
                }
               
                break;
            }
        }

        if (deleted) {
            System.out.println("Task '" + name + "' deleted successfully.");
        } else {
            System.out.println("Task with name '" + name + "' not found for deletion.");
        }
        System.out.println();
    }

    // Display a report listing full details of all tasks
    public static void displayAllTasks() {
        System.out.println("All tasks:");
        for (int i = 0; i < taskNames.length; i++) {
            System.out.println("Task ID: " + taskIDs[i] + ", Developer: " + developers[i] + ", Task Name: " + taskNames[i] + ", Task Duration: " + taskDurations[i] + ", Task Status: " + taskStatuses[i]);
        }
        System.out.println();
    }
}

      
      
     
    

