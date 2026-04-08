import java.util.HashSet;
import java.util.Set;

/**
 * Train_App
 *
 * UC3: Track Unique Bogie IDs using HashSet
 * Demonstrates how Set prevents duplicate entries.
 *
 * @author Jaswanth
 * @version 3.0
 */
public class Train_App {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=====================================");

        // Create HashSet for bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display unique bogie IDs
        System.out.println("\nBogie IDs after insertion (duplicates ignored):");
        System.out.println(bogieIds);

        System.out.println("\nTotal unique bogies: " + bogieIds.size());

        System.out.println("\nProgram continues...");
    }
}