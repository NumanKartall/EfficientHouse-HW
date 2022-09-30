public class Homework10 {
    public static void main(String[] args) {

        double twelveOnsCupCola = 34 /*mg*/ , sixteenOnsCupCofee = 160; /*mg*/

        double deathWithCola = 10000 / twelveOnsCupCola;
        double deathWithCofee = 10000 / sixteenOnsCupCofee;

        System.out.printf("If you drink %.1f cans of Coke, you will die by exceeding the dose of 10 grams of caffeine.%n", deathWithCola);
        System.out.printf("If you drink %.1f cup of Cofee, you will die by exceeding the dose of 10 grams of caffeine.", deathWithCofee);

        //If you drink 294,1 cans of Coke, you will die by exceeding the dose of 10 grams of caffeine.
        //If you drink 62,5 cup of Cofee, you will die by exceeding the dose of 10 grams of caffeine.

        //one cans of Coke 12 ons = 340 gram
        //one cup of Cofee 16 ons = 453 gram
    }
}