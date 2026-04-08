import java.util.*;
import java.util.stream.Collectors;

/**
 * Train_App
 *
 * UC9: Group Bogies by Type using Streams
 * Demonstrates grouping of bogies using Collectors.groupingBy().
 *
 * @author Jaswanth
 * @version 9.0
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
        bogies.add(new Bogie("Sleeper", 72)); // duplicate type
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("AC Chair", 56));

        System.out.println("\nOriginal Bogie List:");
        for (Bogie b : bogies) {
            b.display();
        }

        // -------- Grouping using Stream --------
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // Display grouped result
        System.out.println("\nGrouped Bogies by Type:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nCategory: " + entry.getKey());

            for (Bogie b : entry.getValue()) {
                b.display();
            }
        }

        System.out.println("\nProgram continues...");
    }
}