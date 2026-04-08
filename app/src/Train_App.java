import java.util.ArrayList;
import java.util.List;

/**
 * Train_App
 *
 * UC1: Initialize Train and Display Consist Summary
 * Demonstrates application startup and dynamic list initialization.
 *
 * @author Jaswanth
 * @version 1.0
 */
public class Train_App {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=====================================");

        // Initialize empty train consist using ArrayList
        List<String> consist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + consist.size());

        System.out.println("\nProgram continues...");
    }
}