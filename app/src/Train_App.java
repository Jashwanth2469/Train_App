import java.util.LinkedList;

/**
 * Train_App
 *
 * UC4: Maintain Ordered Bogie IDs using LinkedList
 * Demonstrates ordered insertion, deletion, and chaining behavior.
 *
 * @author Jaswanth
 * @version 4.0
 */
public class Train_App {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=====================================");

        // Create LinkedList for train consist
        LinkedList<String> consist = new LinkedList<>();

        // Add bogies (initial sequence)
        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(consist);

        // Insert Pantry Car at position 2
        consist.add(2, "Pantry");

        System.out.println("\nAfter inserting Pantry Car at position 2:");
        System.out.println(consist);

        // Remove first and last bogie
        consist.removeFirst();
        consist.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(consist);

        System.out.println("\nFinal ordered train consist:");
        System.out.println(consist);

        System.out.println("\nProgram continues...");
    }
}