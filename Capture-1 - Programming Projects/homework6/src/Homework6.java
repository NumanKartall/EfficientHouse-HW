public class Homework6 {
    public static void main(String[] args) {

        int principalAmount = 1000, numberOfYears = 5;
        double interestRate = 5.0;

        double simpleInterest = (principalAmount * interestRate * numberOfYears) / 100;

        System.out.println("money you deposit: " + principalAmount + "$  " + "  annual interest rate: %" + interestRate + "    number of years: " + numberOfYears + "    money from annual interest " + simpleInterest + "$");

        //money you deposit: 1000$    annual interest rate: %5.0    number of years: 5    money from annual interest 250.0$
    }
}
