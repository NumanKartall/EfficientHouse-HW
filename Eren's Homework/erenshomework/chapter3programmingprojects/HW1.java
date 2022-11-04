package chapter3programmingprojects;

public class Homework1 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {

        java.util.Scanner inp = new java.util.Scanner(System.in);

        System.out.println("Enter the number");
        double number = inp.nextDouble();

        double guess = number / 2;

        System.out.printf("%.0f square root of: %.2f", number, giveResult(number, guess));
    }

    public static double giveResult(double number, double guess) {

        while (true) {
            double previousGuess = guess;

            double result = number / guess;
            guess = (guess + result) / 2;

            if (previousGuess - guess < guess / 100)
                break;
        }
        return guess;
    }
}
