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
        int skillCount = scanner.nextInt();
        String[] skills = new String[skillCount];

        for (int i = 0; i < skillCount; i++) {
            skills[i] = scanner.next();
        }

        // Create Candidate object and pass candidate details
        Candidate candidate = new Candidate(
            name,              // Pass candidate name
            percentage,        // Pass candidate percentage
            backlogs,          // Pass number of backlogs
            graduationYear,     // Pass graduation year
            skills
        );
        int jobCount = scanner.nextInt();
        Job[] jobs = new Job[jobCount];

        for (int i = 0; i < jobCount; i++) {
            String company = scanner.next();
            String role = scanner.next();
            double minimumPercentage = scanner.nextDouble();
            int maximumBacklogs = scanner.nextInt();
            int requiredGraduationYear = scanner.nextInt();

            int requiredSkillCount = scanner.nextInt();
            String[] requiredSkills = new String[requiredSkillCount];

            for (int j = 0; j < requiredSkillCount; j++) {
                requiredSkills[j] = scanner.next();
            }

            jobs[i] = new Job(
                company,
                role,
                minimumPercentage,
                maximumBacklogs,
                requiredGraduationYear,
                requiredSkills
            );
        }
        // displays all available jobs
        System.out.println();
        System.out.println("AVAILABLE JOBS");
        // loops through all the jobs and prints them
        for (int i = 0; i < jobs.length; i++) {
        System.out.println((i + 1) + ". " +jobs[i].getCompany() +" - " +jobs[i].getRole());
}
        // takes user input for the job they want to apply for
        int selectedJobNumber = scanner.nextInt();
        // stores the selected job in selectedJob variable    
        Job selectedJob = jobs[selectedJobNumber - 1];

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
        System.out.println("Company   : " + selectedJob.getCompany());

        // Display job role using getter method
        System.out.println("Role      : " + selectedJob.getRole());
        

        // Print an empty line
        System.out.println();

        // Call evaluate method to check candidate eligibility
        // Store the returned true or false value in eligible
        boolean eligible = checker.evaluate(candidate, selectedJob);

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