package weekTwo;

import javax.swing.*;

public class WordGame {
    public static void main(String[] args) {
        String name;
        String city;
        String major;
        String minor;
        name = JOptionPane.showInputDialog("Enter in your name");
        city = JOptionPane.showInputDialog("Where are you from?");
        major = JOptionPane.showInputDialog("What is your Major?");
        minor = JOptionPane.showInputDialog("What is your minor? If you do not have one, type 'not applicable'");
        String message = String.format("The person %s is from %s. They are at Ball State University.\n Their major is %s, and their minor is %s.\n They wish they knew how to program if statements in Java so they could use a boolean to decide whether or not to display a minor in the message.",name,city,major,minor);
        System.out.printf("The person %s is from %s. They are at Ball State University.\n Their major is %s, and their minor is %s.\n They wish they knew how to program if statements in Java so they could use a boolean to decide whether or not to display a minor in the message.",name,city,major,minor);
        JOptionPane.showMessageDialog(null,message);


    }
}
