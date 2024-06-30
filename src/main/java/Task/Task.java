/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class Task {
     
       private static int taskCount = 0;

    private String taskName;
    private int taskNumber;
    private String taskDescription;
    private String developerDetails;
    private int taskDuration;
    private String taskID;
    private String taskStatus;
    private int count;
    private int taskstaus;
    private Object scanner;

    public boolean checkTaskDescription() {
        return taskDescription.length() <= 50;
    }

    public String getTaskID() {
        return taskID;
    }

    private String createTaskID(String taskName, String developerDetails) {
        return taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + developerDetails.substring(developerDetails.length() - 3).toUpperCase();
    }

    public String printTaskDetails() {
        return "Task Status: " + taskStatus + "\nDeveloper Details: " + developerDetails +
                "\nTask Number: " + taskNumber + "\nTask Name: " + taskName +
                "\nTask Description: " + taskDescription + "\nTask ID: " + taskID +
                "\nTask Duration: " + taskDuration + "hrs";
    }

    public int returnTotalHours(int taskduration) {
        int total = 0;
        if (count == 0) {
            total = taskduration;
        } else if (count >= 1) {
            total = total + taskduration;
        }
        return total;
    }
   
    public void setTaskStatus() {
        
        int option = 0;
        
        while(option !=3){
            
         option = Integer.parseInt(JOptionPane.showInputDialog("please state by selecting one of the options below\n" + "Option 1) add tasks\n" + "Option 2) Show Results\n" + "Option 3) Quit" ));
        }
            
         
        
}
     }



       

    



    

