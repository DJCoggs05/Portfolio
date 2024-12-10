package weekNine;

import java.util.Scanner;

public class BAMS_Test {
    public static void main(String[] args) {
        boolean VIP;

        // Prompt the user to check if they are VIP
        try {
            System.out.println("Do you have a VIP account? Answer true or false:");
            Scanner scn = new Scanner(System.in);
            VIP = Boolean.parseBoolean(scn.nextLine());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Invalid input. Defaulting to non-VIP.");
            VIP = false;  // Default to non-VIP if there's an error in input
        }

        // Based on the input, create the appropriate BAMS object
        if (VIP) {
            System.out.println("Creating VIP accounts...");
            // Create two VIP accounts (no age or deposit required)
            BAMS vipAccount1 = new BAMS(true); // VIP Constructor
            vipAccount1.printMethod();

            BAMS vipAccount2 = new BAMS(true); // Another VIP Constructor
            vipAccount2.printMethod();
        } else {
            System.out.println("Creating regular accounts...");
            // Create two regular accounts (with age and initial deposit)
            BAMS regularAccount1 = new BAMS(); // Regular Constructor
            regularAccount1.printMethod();

            BAMS regularAccount2 = new BAMS(); // Another Regular Constructor
            regularAccount2.printMethod();
        }
    }
}
