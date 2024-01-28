
import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        // CONDITIONALS:
        // System.out.println("Pick a number between 1 and 10");
        // Scanner input = new Scanner(System.in);
       
        // int inputtedNum = input.nextInt();

        // if(inputtedNum < 5) {
        //     System.out.println("Enjoy the good luck a friend brings you");
        // } else {
        //     System.out.println("Your shoe selection will make you very happy today");
        // }


        // _________________
        // WHILE LOOPS:
        // boolean currentSongOnRepeat = true;

        // while(currentSongOnRepeat) {
        //     System.out.println("Playing current song");
        //     System.out.println("Would you like to take this song off of repeat? If so, answer yes");
        //     String userInput = input.next();

        //     if(userInput.equals("yes")) {
        //         currentSongOnRepeat = false;
        //     }
        // }
        // System.out.println("Playing next song");


        // ___________________
        // CHALLENGE: MULTIPLE CHOICE:
        // String question = "What are strings in Java?";
        // String choiceOne = "Strings are single characters wrapped with single quotes.";
        // String choiceTwo = "Strings are collections or sequences of characters wrapped with double quotes.";
        // String choiceThree = "Strings are collections or sequences of characters wrapped with single quotes.";

        // int correctAnswer = 2;

        // // Write a print statement asking the question
        // System.out.println(question);

        // // Write a print statement giving the answer choices
        // System.out.println("1: " + choiceOne);
        // System.out.println("2: " + choiceTwo);
        // System.out.println("3: " + choiceThree);

        // // Have the user input an answer
        // Scanner input = new Scanner(System.in);
        // // Retrieve the user's input
        // int userInput = input.nextInt();

        // // If the user's input matches the correctAnswer...
        // // then the user is correct and we want to print out a congrats message to the user.
        // if(userInput == correctAnswer) {
        //     System.out.println("Congratulations! You are correct!");
        // } else {
        //     // If the user's input does not match the correctAnswer...
        //     // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
        //     System.out.println("Sorry, the correct answer was option 2.");
        // }

        //___________________________
        // CHALLENGE: FIND THE ERRORS
        System.out.println("Let's calculate the area of a triangle");

        Scanner input = new Scanner(System.in);

        System.out.println("Please input the base of the triangle (in inches).");
        double base = input.nextDouble();

        while (base <= 0) {
            System.out.println("That's invalid. Please input the base of the triangle (in inches).");
            base = input.nextDouble();
        }

        System.out.println("Please input the height of the triangle (in inches).");
        double height = input.nextDouble();
        while (height <= 0) {
            System.out.println("That's invalid. Please input the base of the triangle (in inches).");
            base = input.nextDouble();
        }

        double area = (base * height) / 2;
        System.out.println("The area is " + area);
    }
}
