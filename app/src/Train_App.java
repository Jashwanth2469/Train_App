import java.util.regex.*;

/**
 * Train_App
 *
 * UC11: Validate Train ID & Cargo Codes using Regex
 * Demonstrates Pattern and Matcher for input validation.
 *
 * @author Jaswanth
 * @version 11.0
 */
public class Train_App {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=====================================");

        // Sample inputs
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Define regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern p1 = Pattern.compile(trainPattern);
        Pattern p2 = Pattern.compile(cargoPattern);

        // Create matchers
        Matcher m1 = p1.matcher(trainId);
        Matcher m2 = p2.matcher(cargoCode);

        // Validate inputs
        if (m1.matches()) {
            System.out.println("\nValid Train ID: " + trainId);
        } else {
            System.out.println("\nInvalid Train ID: " + trainId);
        }

        if (m2.matches()) {
            System.out.println("Valid Cargo Code: " + cargoCode);
        } else {
            System.out.println("Invalid Cargo Code: " + cargoCode);
        }

        System.out.println("\nProgram continues...");
    }
}