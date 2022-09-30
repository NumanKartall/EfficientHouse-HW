import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double Bmi;

        System.out.println("What is your name ? : ");
        String name = input.nextLine();

        System.out.println("Write your weight: ");
        int weight = input.nextInt();

        System.out.println("Write your height: ");
        double height = input.nextDouble();

        Bmi = weight / (height * height);

        System.out.println("x-------------------------------x");
        System.out.printf("| Your name      : %s     %n", name);
        System.out.printf("| Your weight    : %d     %n", weight);
        System.out.printf("| Your height    : %.2f   %n", height);
        System.out.printf("| Your BMI       : %.2f   %n", Bmi);

        if (0 < Bmi && Bmi <= 18.4) {
            System.out.println("| Your BMI class : Poor");
        } else if (Bmi > 18.4 && Bmi <= 24.9) {
            System.out.println("| Your BMI class : Normal");
        } else if (24.9 < Bmi && Bmi <= 29.9) {
            System.out.println("| Your BMI class : Overweight");
        } else if (29.9 < Bmi && Bmi <= 34.9) {
            System.out.println("| Your BMI class : Obese-Class |");
        } else if (34.9 < Bmi && Bmi <= 44.9) {
            System.out.println("| Your BMI class : Obese-Class ||");
        } else if (45 < Bmi && Bmi <= 50.9) {
            System.out.println("| Your BMI class : Obese-Class |||");
        } else {
            System.out.println("WARNING !!! ");
        }
        System.out.println("x-------------------------------x");


        //        What is your name ? :
        //        Numan
        //        Write your weight:
        //        88
        //        Write your height:
        //        1,93
        //        x-------------------------------x
        //                | Your name      : Numan
        //                | Your weight    : 88
        //                | Your height    : 1,93
        //                | Your BMI       : 23,62
        //                | Your BMI class : Normal
        //        x-------------------------------x

    }
}