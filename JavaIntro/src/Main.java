
public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world from VS Code!");
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);

        // Calls non-static variables in Triangle class
        double triangleAArea = triangleA.findArea();
        System.out.println(triangleAArea);

        double triangleBArea = triangleB.findArea();
        System.out.println(triangleBArea);


        // Calls a static variable in Triangle class
        System.out.println(Triangle.numOfSides);


        //_____________________________
        // CHALLENGE: STUDENT PROFILE
        StudentProfile studentProfile1 = new StudentProfile("Elyse", "Montano", 2004, 3.8, "Computer Science");
        StudentProfile studentProfile2 = new StudentProfile("Elsa","Arendale", 2016, 3.5, "Ice");

        System.out.println(studentProfile1.showStudentProfile());
        System.out.println(studentProfile2.showStudentProfile());
        studentProfile2.incrementGraduationYear();
        System.out.println(studentProfile2.showStudentProfile());
    }
}
