package convertingwhiletofor;

public class ForExample5 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        java.util.Scanner inp = new java.util.Scanner(System.in);

        System.out.print("Enter of the number: ");
        int val = abs(inp.nextInt());

        if (val != 0)
            System.out.printf("%d -> total digits count: %d", val, countDigits(val));

    }

    public static int countDigits(int val) {

        int count;

        for (count = 0; val > 0; count++) {
            val /= 10;
        }
        return count;
    }

    public static int abs(int val) {

        return val < 0 ? -val : val;
    }
}
