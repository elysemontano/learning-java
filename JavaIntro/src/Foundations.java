
import java.util.Scanner;

public class Foundations {
    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.8;
        String studentFirstName = "Elyse";
        String studentLastName = "Montano";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);
        boolean hasPerfectAttendance = true;

        // System.out.println(studentAge);
        // System.out.println(studentGPA);
        // System.out.println(studentFirstInitial);
        // System.out.println(studentLastInitial);
        // System.out.println(hasPerfectAttendance);
        // System.out.println(studentFirstName);
        // System.out.println(studentLastName);

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);

        // Update GPA based on user input:
        System.out.println("What do you want to update their GPA to?");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
    }
}
