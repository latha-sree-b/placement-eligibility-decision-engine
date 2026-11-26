// Create GraduationYearRule class
// It inherits the abstract methods from EligibilityRule class
public class GraduationYearRule extends EligibilityRule {

    // Override the getRuleName() method from the parent class
    @Override
    public String getRuleName() {

        // Return the name of this eligibility rule
        return "Graduation Year";
    }

    // Override the check() method from the parent class
    // It accepts Candidate and Job objects as parameters
    @Override
    public boolean check(Candidate candidate, Job job) {

        // Get the candidate's graduation year
        // Get the graduation year required by the company
        // Compare both years using == operator
        // Return true if both years are equal
        // Otherwise return false
        return candidate.getGraduationYear() == job.getRequiredGraduationYear();
    }
}