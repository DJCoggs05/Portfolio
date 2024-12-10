package weekThree;

import javax.swing.*;

public class Login {
    public static void main(String[] args) {
        String userName, password;
        userName = JOptionPane.showInputDialog("What do you want your username to be?");
        password = JOptionPane.showInputDialog("What do you want your password to be?");
        String userNameIn;
        String passwordIn;
        userNameIn = JOptionPane.showInputDialog("Enter your username: ");
        while (!userName.equals(userNameIn)) {
            JOptionPane.showMessageDialog(null, "Incorrect. Please enter a valid username.");
            userNameIn = JOptionPane.showInputDialog("Enter your username: ");
        }
        passwordIn = JOptionPane.showInputDialog("Enter your password: ");
        while (!password.equals(passwordIn)) {
            JOptionPane.showMessageDialog(null,"Incorrect Password, Try Again.");
            passwordIn = JOptionPane.showInputDialog("Enter your password: ");


        }
        JOptionPane.showMessageDialog(null, "Correct, transferring to home page... ");
        }
    }
