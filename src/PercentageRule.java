// Create PercentageRule class
// It inherits properties and methods from EligibilityRule class
public class PercentageRule extends EligibilityRule {

    // Override the getRuleName() method from parent class
    @Override
    public String getRuleName() {

        // Return the name of this eligibility rule
        return "Percentage";
    }

    // Override the check() method from parent class
    // It accepts Candidate and Job objects as parameters
    @Override
    public boolean check(Candidate candidate, Job job) {

        // Get candidate percentage
        // Get minimum required percentage from Job
        // Compare both values
        // Return true if candidate percentage is greater than or equal to minimum percentage
        // Otherwise return false
        return candidate.getPercentage() >= job.getMinimumPercentage();
    }
}