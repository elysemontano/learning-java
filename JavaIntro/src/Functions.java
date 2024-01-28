
import java.util.Scanner;

public class Functions {
    // WRITING FUNCTIONS:
    // public static void announceCoffeeBreak() {
    //     System.out.println("Waiting for coffee break...");
    //     System.out.println("Type a random word and press Enter to start coffee break");
    //     Scanner input = new Scanner(System.in);
    //     input.next();
    //     System.out.println("It's COFFEE TIME!");
    // }

    // _________________________
    // FUNCTIONS WITH PARAMETERS:
    // public static void caluculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
    //     double tip = tipRate * listedMealPrice;
    //     double tax = taxRate * listedMealPrice;
    //     double result = listedMealPrice + tip + tax;
    //     System.out.println("Your total meal price is " + result);
    // }

    //_________________________
    // RETURN TYPES:
    public static double caluculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return result;
    }
    public static void main(String[] args) {
        // System.out.println("Welcome to your first day!");
        // announceCoffeeBreak();

        // System.out.println("Write code");
        // System.out.println("Review code");
        // announceCoffeeBreak();

        // System.out.println("Hooray! You finished your first day!");

        // caluculateTotalMealPrice(15, .2, .08);
        // caluculateTotalMealPrice(25, .15, .08);

        //_______________________
        // RETURN TYPE MANIPLATION:
        double groupTotalMealPrice = caluculateTotalMealPrice(100, .2, .08);
        System.out.println(groupTotalMealPrice);

        double individualMealPrice = groupTotalMealPrice / 5;
        System.out.println(individualMealPrice);

        double result = Math.pow(2, 5);
        System.out.println(result);
    }
}
