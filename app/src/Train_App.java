import java.util.*;
import java.util.stream.*;

/**
 * Train_App
 *
 * UC12: Safety Compliance Check using Streams
 * Demonstrates validation of goods bogies using allMatch().
 *
 * @author Jaswanth
 * @version 12.0
 */
public class Train_App {

    // -------- Goods Bogie Class --------
    static class GoodsBogie {
        String type;
        String cargo;

        public GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        public void display() {
            System.out.println("Type: " + type + " | Cargo: " + cargo);
        }
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=====================================");

        // Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));
        // Try invalid case:
        // bogies.add(new GoodsBogie("Cylindrical", "Coal"));

        System.out.println("\nGoods Bogies:");
        for (GoodsBogie b : bogies) {
            b.display();
        }

        // -------- Safety Validation --------
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );

        // Display result
        if (isSafe) {
            System.out.println("\nTrain is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("\nTrain is NOT SAFE ❌");
        }

        System.out.println("\nProgram continues...");
    }
}