package convertingwhiletofor;

public class ForExample6 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        java.util.Scanner inp = new java.util.Scanner(System.in);

        System.out.print("Number: ");
        int val = inp.nextInt();

        System.out.printf("%d -> sum of digits = %d %n", val, sumDigits(val));
    }

    public static int sumDigits(int val) {

        int sum;

        for (sum = 0; val > 0; val /= 10) {
            sum += val % 10;
        }
        return sum;
    }
}
