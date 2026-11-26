// Create a class named Job
public class Job {

    // Declare a private String variable to store company name
    private String company;

    // Declare a private String variable to store job role
    private String role;

    // Declare a private double variable to store minimum percentage required
    private double minimumPercentage;

    // Declare a private integer variable to store maximum allowed backlogs
    private int maximumBacklogs;

    // Declare a private integer variable to store required graduation year
    private int requiredGraduationYear;
    private String[] requiredSkills;

    // Create a parameterized constructor
    // It receives five values when a Job object is created
    public Job(
        String company,                    // Parameter to receive company name
        String role,                       // Parameter to receive job role
        double minimumPercentage,          // Parameter to receive minimum percentage
        int maximumBacklogs,               // Parameter to receive maximum backlogs
        int requiredGraduationYear,         // Parameter to receive required graduation year
        String[] requiredSkills
    ) {

        // Assign the received company name to the instance variable
        this.company = company;

        // Assign the received job role to the instance variable
        this.role = role;

        // Assign the received minimum percentage to the instance variable
        this.minimumPercentage = minimumPercentage;

        // Assign the received maximum backlogs to the instance variable
        this.maximumBacklogs = maximumBacklogs;

        // Assign the received graduation year to the instance variable
        this.requiredGraduationYear = requiredGraduationYear;

        this.requiredSkills = requiredSkills;
    }

    // Create a getter method to return company name
    public String getCompany() {

        // Return the company variable
        return company;
    }

    // Create a getter method to return job role
    public String getRole() {

        // Return the role variable
        return role;
    }

    // Create a getter method to return minimum required percentage
    public double getMinimumPercentage() {

        // Return the minimumPercentage variable
        return minimumPercentage;
    }

    // Create a getter method to return maximum allowed backlogs
    public int getMaximumBacklogs() {

        // Return the maximumBacklogs variable
        return maximumBacklogs;
    }

    // Create a getter method to return required graduation year
    public int getRequiredGraduationYear() {

        // Return the requiredGraduationYear variable
        return requiredGraduationYear;
    }
    public String[] getRequiredSkills() {
        return requiredSkills;
    }
}