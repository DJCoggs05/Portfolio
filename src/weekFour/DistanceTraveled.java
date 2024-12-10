package weekFour;

import javax.swing.JOptionPane;

public class DistanceTraveled {
    public static void main(String[] args) {

        String speedInput = JOptionPane.showInputDialog("Enter the speed in mph:");
        int speed = Integer.parseInt(speedInput);


        String hoursInput = JOptionPane.showInputDialog("Enter the number of hours spent traveling:");
        int hours = Integer.parseInt(hoursInput);

        // Initialize output string for display with proper formatting
        String output = String.format("%-10s %-10s\n", "Hour", "Distance Traveled");
        output += "-----------------------------------\n";

        // Loop to calculate and display the distance for each hour
        for (int hour = 1; hour <= hours; hour++) {
            int distance = speed * hour;
            output += String.format("%-15d %-3d miles\n", hour, distance); // Format each line to align the columns
        }


        JOptionPane.showMessageDialog(null, output, "Distance Traveled", JOptionPane.INFORMATION_MESSAGE);
    }
}
