public class Homework6 {

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter the principal amount:");
        int principalAmount = input.nextInt();

        System.out.print("Enter the number of years:");
        int numberOfYears = input.nextInt();

        System.out.print("Enter the interest of rate:");
        double interestRate = input.nextDouble();

        double simpleInterest = (principalAmount * interestRate * numberOfYears) / 100;

        System.out.printf("Money you deposit: %d $ %n", principalAmount);
        System.out.printf("Annual interest rate: %.1f %n", interestRate);
        System.out.printf("Number of years: %d %n", numberOfYears);
        System.out.printf("Money from annual interest: %.1f $ %n", simpleInterest);

//        answer to the question
//        Enter the principal amount:1000
//        Enter the number of years:5
//        Enter the interest of rate:5,0
//        Money you deposit: 1000 $
//        Annual interest rate: 5,0
//        Number of years: 5
//        Money from annual interest: 250,0 $
    }
}
