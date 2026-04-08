import java.util.*;
import java.util.stream.*;

/**
 * Train_App
 *
 * UC10: Count Total Seats using Stream reduce()
 * Demonstrates aggregation of bogie capacities.
 *
 * @author Jaswanth
 * @version 10.0
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

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("\nBogie List:");
        for (Bogie b : bogies) {
            b.display();
        }

        // -------- Stream Aggregation --------
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)          // extract capacity
                .reduce(0, Integer::sum);      // sum all values

        // Display result
        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        System.out.println("\nProgram continues...");
    }
}