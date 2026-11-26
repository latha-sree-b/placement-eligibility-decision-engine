// Create a class named Candidate
public class Candidate {

    // Declare a private String variable to store candidate name
    private String name;

    // Declare a private double variable to store candidate percentage
    private double percentage;

    // Declare a private integer variable to store number of backlogs
    private int backlogs;

    // Declare a private integer variable to store graduation year
    private int graduationYear;

    private String[] skills;

    // Create a parameterized constructor
    // It receives four values when a Candidate object is created
    public Candidate(
        String name,           // Parameter to receive candidate name
        double percentage,     // Parameter to receive percentage
        int backlogs,          // Parameter to receive backlog count
        int graduationYear,    // Parameter to receive graduation year
        String[] skills        // Parameter to receive skills
    ) {

        // Assign the received name to the instance variable
        this.name = name;

        // Assign the received percentage to the instance variable
        this.percentage = percentage;

        // Assign the received backlog count to the instance variable
        this.backlogs = backlogs;

        // Assign the received graduation year to the instance variable
        this.graduationYear = graduationYear;
        this.skills=skills;
    }

    // Create a getter method to return candidate name
    public String getName() {

        // Return the name variable
        return name;
    }

    // Create a getter method to return candidate percentage
    public double getPercentage() {

        // Return the percentage variable
        return percentage;
    }

    // Create a getter method to return candidate backlogs
    public int getBacklogs() {

        // Return the backlogs variable
        return backlogs;
    }

    // Create a getter method to return candidate graduation year
    public int getGraduationYear() {

        // Return the graduationYear variable
        return graduationYear;
    }
    public boolean hasSkill(String requiredSkill) {
        for (int i = 0; i < skills.length; i++) {
            if (skills[i].equalsIgnoreCase(requiredSkill)) {
                return true;
            }
        }

        return false;
    }
}