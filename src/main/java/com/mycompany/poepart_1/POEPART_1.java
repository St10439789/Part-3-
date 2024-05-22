/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart_1;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class POEPART_1 {

    private static Object Account;
  
    public static void main(String[] args) {

// User registration and login
        String firstName = Account.getUserInput("Enter your first name");
        String lastName = Account.getUserInput("Enter your last name");
        String username = Account.getUserInput("Enter your username", "Username should contain '_' and be less than or equal to 5 characters", true);
        String password = Account.getUserInput("Enter your password (at least 8 characters with uppercase, digit, and special character)", "Password does not meet complexity requirements", false);

        JOptionPane.showMessageDialog(null, "Registered user: " + Account.registerUser(username, password));

        // For login simulation
        String storedUsername = "example_user";
        String storedPassword = "Passw0rd!";
        String enteredUsername = Account.getUserInput("Enter your username");
        String enteredPassword = Account.getUserInput("Enter your password");

        JOptionPane.showMessageDialog(null, Login.loginStatus(Login.loginUser(enteredUsername, enteredPassword, storedUsername, storedPassword)));

        // Task-related operations
        Task_class task = new Task_class();
        task.setTaskStatus();
        JOptionPane.showMessageDialog(null, task.printTaskDetails());
    }
}


    

