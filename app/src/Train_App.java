import java.util.*;
import java.util.stream.Collectors;

/**
 * Train_App
 *
 * UC8: Filter Passenger Bogies Using Streams
 * Demonstrates Stream API for filtering bogies based on capacity.
 *
 * @author Jaswanth
 * @version 8.0
 */
public class Train_App {

    // -------- Bogie Class --------
    static class Bogie {
        String name;
        int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public void display() {
            System.out.println("Bogie: " + name + " | Capacity: " + capacity);
        }
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=====================================");

        // Create list of bogies (reuse from UC7)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("\nOriginal Bogie List:");
        for (Bogie b : bogies) {
            b.display();
        }

        // -------- Stream Filtering --------
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60) // condition
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        for (Bogie b : filteredBogies) {
            b.display();
        }

        System.out.println("\nProgram continues...");
    }
}