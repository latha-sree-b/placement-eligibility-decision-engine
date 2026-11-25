// Create BacklogRule class
// It inherits the methods and properties of EligibilityRule class
public class BacklogRule extends EligibilityRule {

    // Override the getRuleName() method from the parent class
    @Override
    public String getRuleName() {

        // Return the name of this eligibility rule
        return "Backlog";
    }

    // Override the check() method from the parent class
    // It accepts Candidate and Job objects as parameters
    @Override
    public boolean check(Candidate candidate, Job job) {

        // Get the candidate's number of backlogs
        // Get the maximum number of backlogs allowed by the company
        // Compare both values
        // Return true if candidate backlogs are less than or equal to allowed backlogs
        // Otherwise return false
        return candidate.getBacklogs() <= job.getMaximumBacklogs();
    }
}