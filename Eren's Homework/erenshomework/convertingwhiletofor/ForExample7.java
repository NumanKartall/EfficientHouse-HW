package convertingwhiletofor;

public class ForExample7 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        java.util.Scanner inp = new java.util.Scanner(System.in);

        System.out.println("Number:");

        for (int val; (val = inp.nextInt()) != 0;) {
            System.out.printf("%d -> reversed %d %n", val, reversed(val));
            System.out.println("Number:");
        }
    }

    public static int reversed(int val) {

        int result;

        for (result = 0; val != 0; val /= 10) {
            result = result * 10 + val % 10;
        }
        return result;
    }
}
