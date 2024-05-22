/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class login {
    public class Login {
    public static boolean loginUser(String enteredUsername, String enteredPassword, String storedUsername, String storedPassword) {
        return enteredUsername.equals(storedUsername) && enteredPassword.equals(storedPassword);
    }

    public static String loginStatus(boolean isLoggedIn) {
        return isLoggedIn ? "Successful login!" : "Failed login. Username or password incorrect.";
    }
}



}
