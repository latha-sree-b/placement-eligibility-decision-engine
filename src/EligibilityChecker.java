// Create a class named EligibilityChecker
public class EligibilityChecker {

    // Declare an array of EligibilityRule objects
    // This array stores all the eligibility rules
    private EligibilityRule[] rules;

    // Constructor - automatically executes when an object is created
    public EligibilityChecker() {

        // Create an array and initialize it with three rule objects
        rules = new EligibilityRule[] {

            // Create object to check candidate percentage
            new PercentageRule(),

            // Create object to check candidate backlogs
            new BacklogRule(),

            // Create object to check candidate graduation year
            new GraduationYearRule()
        };
    }

    // Define a method named evaluate
    // It accepts Candidate and Job objects as parameters
    // It returns true or false based on eligibility
    public boolean evaluate(Candidate candidate, Job job) {

        // Initially assume that the candidate is eligible
        boolean eligible = true;

        // Loop through all the eligibility rules in the array
        // rules.length gives the total number of rules
        for (int i = 0; i < rules.length; i++) {

            // Call the check() method of the current rule
            // Store the result (true or false) in passed
            boolean passed = rules[i].check(candidate, job);

            // Check whether the current eligibility rule is passed
            if (passed) {

                // Print the rule name followed by PASS
                System.out.println(rules[i].getRuleName() + " : PASS");

            } else {

                // Print the rule name followed by FAIL
                System.out.println(rules[i].getRuleName() + " : FAIL");

                // If any one rule fails, candidate becomes not eligible
                eligible = false;
            }
        }

        // Return the final eligibility result
        return eligible;
    }
}