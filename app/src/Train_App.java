import java.util.ArrayList;
import java.util.List;

/**
 * Train_App
 *
 * UC2: Add Passenger Bogies to Train
 * Demonstrates ArrayList operations like add, remove, and contains.
 *
 * @author Jaswanth
 * @version 2.0
 */
public class Train_App {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=====================================");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies (CREATE)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies (READ)
        System.out.println("\nBogies after addition:");
        System.out.println(passengerBogies);

        // Remove a bogie (DELETE)
        passengerBogies.remove("AC Chair");

        System.out.println("\nBogies after removal of AC Chair:");
        System.out.println(passengerBogies);

        // Check existence (SEARCH)
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("\nIs 'Sleeper' present? " + exists);

        // Final state
        System.out.println("\nFinal bogie list:");
        System.out.println(passengerBogies);

        System.out.println("\nProgram continues...");
    }
}