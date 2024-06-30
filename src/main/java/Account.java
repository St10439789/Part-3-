/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class Account {
  
    public static String getUserInput(String message) {
        return JOptionPane.showInputDialog(null, message);
    }

    public static String getUserInput(String message, String errorMessage, boolean isUsername) {
        String input = " ";
        do {
            input = JOptionPane.showInputDialog(null, message);
            if (isUsername && !isValidUsername(input)) {
                JOptionPane.showMessageDialog(null, errorMessage);
            } else if (!isUsername && !checkPasswordComplexity(input)) {
                JOptionPane.showMessageDialog(null, errorMessage);
            }
        } while ((isUsername && !isValidUsername(input)) || (!isUsername && !checkPasswordComplexity(input)));
        return input;
    }

    public static boolean isValidUsername(String username) {
        return username.contains("_") && username.length() < 5;
    }

    public static boolean checkPasswordComplexity(String password) {
        return password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*\\d.*") &&
                password.matches(".*[!@#$%^&*()-+=~\\[\\]{}|;:'\",.<>?/].*");
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
}




