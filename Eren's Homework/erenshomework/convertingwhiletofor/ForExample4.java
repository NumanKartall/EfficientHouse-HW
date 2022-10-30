package convertingwhiletofor;

public class ForExample4 {
    public static void main(String[] args) {
        countPositiveAndNegative();
    }

    public static void countPositiveAndNegative() {

        java.util.Scanner inp = new java.util.Scanner(System.in);
        System.out.println("Enter of the number");

        int posSum = 0, negSum = 0;
        int posCount = 0, negCount = 0;

        for (int val; (val = inp.nextInt()) != 0; ) {
            if (val > 0) {
                posSum += val;
                ++posCount;
            } else {
                negSum += val;
                ++negCount;
            }
        }
        display(posSum, posCount, negSum, negCount);
    }

    public static void display(int posSum, int posCount, int negSum, int negCount) {
        if (posCount > 0) {
            System.out.printf("%d numbers of positive sum: %d %n", posCount, posSum);
        } else {
            System.out.println("You have not entered any Positive number");
        }

        if (negCount > 0) {
            System.out.printf("%d numbers of positive sum: %d %n", negCount, negSum);
        } else {
            System.out.println("You have not entered any Negative number");
        }
    }
}