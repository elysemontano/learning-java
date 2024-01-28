
public class StudentProfile {
    String firstName;
    String lastName;
    int graduationYear;
    double gpa;
    String major;

    public StudentProfile(String firstName, String lastName, int graduationYear, double gpa, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.graduationYear = graduationYear;
        this.gpa = gpa;
        this.major = major;
    }

    public int incrementGraduationYear() {
        return this.graduationYear++;
    }

    public String showStudentProfile() {
        return this.firstName + " " + this.lastName + " majoring in " + this.major + " has a GPA of " + this.gpa + " and will graduate in " + this.graduationYear;
    }

}
