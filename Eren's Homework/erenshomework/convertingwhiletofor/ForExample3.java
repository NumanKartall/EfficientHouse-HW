package convertingwhiletofor;

public class ForExample3 {
    public static void main(String[] args) {
        countPositiveAndNegative();
    }

    public static void countPositiveAndNegative() {
        java.util.Scanner inp = new java.util.Scanner(System.in);
        System.out.println("Enter numbers: ");

        int positive = 0, negative = 0;

        for (int val; (val = inp.nextInt()) != 0; ) {
            if (val > 0)
                positive += val;
            else
                negative += val;
        }
        display(positive, negative);
    }

    public static void display(int positive, int negative) {

        if (positive > 0)
            System.out.printf("Sum of Positive numbers: %d %n", positive);
        else
            System.out.println("You have not entered any Positive number");

        if (negative < 0)
            System.out.printf("Sum of Negative numbers: %d %n", negative);
        else
            System.out.println("You have not entered any Negative number");
    }
}
