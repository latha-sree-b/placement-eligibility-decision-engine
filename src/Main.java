// Import Scanner class to take input from the user
import java.util.Scanner;

// Main class – execution of the program starts here
public class Main {

    // Main method – JVM starts program execution from here
    public static void main(String[] args) {

        // Create Scanner object to read input from keyboard
        Scanner scanner = new Scanner(System.in);

        // Read candidate name as a String
        String name = scanner.next();

        // Read candidate percentage as a double value
        double percentage = scanner.nextDouble();

        // Read number of active backlogs as an integer
        int backlogs = scanner.nextInt();

        // Read candidate's graduation year as an integer
        int graduationYear = scanner.nextInt();

        // Create Candidate object and pass candidate details
        Candidate candidate = new Candidate(
            name,              // Pass candidate name
            percentage,        // Pass candidate percentage
            backlogs,          // Pass number of backlogs
            graduationYear     // Pass graduation year
        );

        // Create Job object and pass job eligibility requirements
        Job job = new Job(
            "Infosys",         // Company name
            "Java Developer",  // Job role
            65.0,              // Minimum required percentage
            0,                 // Maximum allowed backlogs
            2026               // Required graduation year
        );

        // Create EligibilityChecker object to check eligibility
        EligibilityChecker checker = new EligibilityChecker();

        // Print a separator line
        System.out.println("================================");

        // Print the heading of the eligibility result
        System.out.println("PLACEMENT ELIGIBILITY RESULT");

        // Print another separator line
        System.out.println("================================");

        // Print an empty line for better readability
        System.out.println();

        // Display candidate name using getter method
        System.out.println("Candidate : " + candidate.getName());

        // Display company name using getter method
        System.out.println("Company   : " + job.getCompany());

        // Display job role using getter method
        System.out.println("Role      : " + job.getRole());

        // Print an empty line
        System.out.println();

        // Call evaluate method to check candidate eligibility
        // Store the returned true or false value in eligible
        boolean eligible = checker.evaluate(candidate, job);

        // Print an empty line
        System.out.println();

        // Check whether the candidate is eligible
        if (eligible) {

            // Execute this statement if eligible is true
            System.out.println("Final Result : ELIGIBLE");

        } else {

            // Execute this statement if eligible is false
            System.out.println("Final Result : NOT ELIGIBLE");
        }

        // Print the closing separator line
        System.out.println("================================");

        // Close Scanner object to release input resources
        scanner.close();
    }
}