import java.util.*;

/**
 * Train_App
 *
 * UC7: Sort Bogies by Capacity using Comparator
 * Demonstrates custom sorting using Comparator and objects.
 *
 * @author Jaswanth
 * @version 7.0
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

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("\nBefore Sorting:");
        for (Bogie b : bogies) {
            b.display();
        }

        // Sort using Comparator (ascending order of capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting by Capacity:");
        for (Bogie b : bogies) {
            b.display();
        }

        System.out.println("\nProgram continues...");
    }
}