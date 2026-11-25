// Declare an abstract class named EligibilityRule
public abstract class EligibilityRule {

    // Declare an abstract method named getRuleName()
    // It returns a String value
    // No method body is provided here
    // Child classes must implement this method
    public abstract String getRuleName();

    // Declare another abstract method named check()
    // It accepts Candidate and Job objects as parameters
    // It returns a boolean value (true or false)
    // Child classes must provide the implementation
    public abstract boolean check(Candidate candidate, Job job);
}