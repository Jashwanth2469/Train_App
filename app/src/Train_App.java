import java.util.HashMap;
import java.util.Map;

/**
 * Train_App
 *
 * UC6: Map Bogie to Capacity using HashMap
 * Demonstrates key-value mapping of bogies to their capacities.
 *
 * @author Jaswanth
 * @version 6.0
 */
public class Train_App {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=====================================");

        // Create HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Insert values using put()
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // Display mapping using entrySet()
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        System.out.println("\nProgram continues...");
    }
}