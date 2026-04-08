import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Train_App
 *
 * UC5: Preserve Insertion Order using LinkedHashSet
 * Demonstrates uniqueness + insertion order maintenance.
 *
 * @author Jaswanth
 * @version 5.0
 */
public class Train_App {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=====================================");

        // Create LinkedHashSet for train formation
        Set<String> formation = new LinkedHashSet<>();

        // Add bogies (insertion order preserved)
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Attempt to add duplicate
        formation.add("Sleeper"); // duplicate ignored

        // Display final formation
        System.out.println("\nFinal Train Formation (No duplicates, Ordered):");
        System.out.println(formation);

        System.out.println("\nTotal bogies: " + formation.size());

        System.out.println("\nProgram continues...");
    }
}