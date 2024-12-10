package weekFive;
import java.util.Scanner;

public class HotelOccupancy {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // 1. Ask the user how many floors the hotel has
        System.out.print("Enter the number of floors in the hotel: ");
        int numberOfFloors = scanner.nextInt();

        // Initialize variables to keep track of the total number of rooms and occupied rooms
        int totalRooms = 0;
        int totalOccupiedRooms = 0;

        // 2. For each floor, ask for the number of rooms and occupied rooms
        for (int floor = 1; floor <= numberOfFloors; floor++) {
            System.out.println("Floor " + floor + ":");

            // a. Ask how many rooms are on the floor
            System.out.print("Enter the number of rooms on this floor: ");
            int roomsOnFloor = scanner.nextInt();

            // Ensure the number of rooms on the floor is a positive number
            while (roomsOnFloor < 1) {
                System.out.print("Number of rooms must be greater than 0. Re-enter: ");
                roomsOnFloor = scanner.nextInt();
            }

            // b. Ask how many of the rooms are occupied
            System.out.print("Enter the number of occupied rooms on this floor: ");
            int occupiedRoomsOnFloor = scanner.nextInt();

            // Ensure the number of occupied rooms is not more than the total rooms on the floor
            while (occupiedRoomsOnFloor < 0 || occupiedRoomsOnFloor > roomsOnFloor) {
                System.out.print("Occupied rooms must be between 0 and the number of rooms. Re-enter: ");
                occupiedRoomsOnFloor = scanner.nextInt();
            }

            // Add the rooms and occupied rooms to the total count
            totalRooms += roomsOnFloor;
            totalOccupiedRooms += occupiedRoomsOnFloor;
        }

        // 3. Calculate the occupancy rate
        double occupancyRate = (double) totalOccupiedRooms / totalRooms * 100;

        // 4. Print the results
        int vacantRooms = totalRooms - totalOccupiedRooms;
        System.out.println("\nHotel Occupancy Report:");
        System.out.println("Number of floors: " + numberOfFloors);
        System.out.println("Total number of rooms: " + totalRooms);
        System.out.println("Total number of occupied rooms: " + totalOccupiedRooms);
        System.out.println("Total number of vacant rooms: " + vacantRooms);
        System.out.printf("Occupancy rate: %.2f%%\n", occupancyRate);

        // Close the scanner
        scanner.close();
    }
}
