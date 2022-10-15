public class Homework9 {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter the caffeine value in a 12ons can of Coke: ");
        double twelveOnsCupCola = input.nextDouble();

        System.out.print("Enter the caffeine value in a can of Cup Cofee: ");
        double sixteenOnsCupCofee = input.nextDouble();

        double deathWithCola = 10000 / twelveOnsCupCola;
        double deathWithCofee = 10000 / sixteenOnsCupCofee;

        System.out.printf("If you drink %.1f cans of Coke, you will die by exceeding the dose of 10 grams of caffeine.%n", deathWithCola);
        System.out.printf("If you drink %.1f cup of Cofee, you will die by exceeding the dose of 10 grams of caffeine.", deathWithCofee);


//        answer to the question
//        Enter the caffeine value in a 12 ons can of Coke:34
//        Enter the caffeine value in a can of Cup Cofee:160
//        If you drink 294, 1 cans of Coke, you will die by exceeding the dose of 10 grams of caffeine.
//        If you drink 62, 5 cup of Cofee, you will die by exceeding the dose of 10 grams of caffeine.

    }
}