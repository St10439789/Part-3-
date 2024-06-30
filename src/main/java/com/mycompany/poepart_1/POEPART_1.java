/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart_1;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class POEPART_1 {

    private static Object Account;
  
    public static void main(String[] args) {

// User registration and login
    Scanner scanner = new Scanner(System.in);

        String firstName = getUserInput(scanner, "Enter your first name");
        String lastName = getUserInput(scanner, "Enter your last name");
        String username = getUserInput(scanner, "Enter your username", "Username should contain '_' and be less than or equal to 5 characters");
        String password = getUserInput(scanner, "Enter your password (at least 8 characters with uppercase, digit, and special character)", "Password does not meet complexity requirements");

        System.out.println("Registered user: " + registerUser(username, password));

        // For login simulation
        String storedUsername = "example_user";
        String storedPassword = "Passw0rd!";
        String enteredUsername = getUserInput(scanner, "Enter your username");
        String enteredPassword = getUserInput(scanner, "Enter your password");

        System.out.println(loginStatus(loginUser(enteredUsername, enteredPassword, storedUsername, storedPassword)));
    }

    public static String getUserInput(Scanner scanner, String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    public static String getUserInput(Scanner scanner, String message, String errorMessage) {
        String input;
        do {
            System.out.println(message);
            input = scanner.nextLine();
            if (errorMessage != null && !isValidUsername(input)) {
                System.out.println(errorMessage);
            }
        } while (errorMessage != null && !isValidUsername(input));
        return input;
    }

    public static boolean isValidUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public static boolean checkPasswordComplexity(String password) {
        return password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*\\d.*") &&
                password.matches(".*[!@#$%^&()-+=~\\[\\]{}|;:'\",.<>?/].*");
    }

    public static String registerUser(String username, String password) {
        if (!isValidUsername(username)) {
            return "Username is incorrectly formatted.";
        } else if (!checkPasswordComplexity(password)) {
            return "Password does not meet the complexity requirements.";
        } else {
            return "User registered successfully.";
        }
    }

    public static boolean loginUser(String enteredUsername, String enteredPassword, String storedUsername, String storedPassword) {
        return enteredUsername.equals(storedUsername) && enteredPassword.equals(storedPassword);
    }

    public static String loginStatus(boolean isLoggedIn) {
        return isLoggedIn ? "Successful login!" : "Failed login. Username or password incorrect.";
    }
}
