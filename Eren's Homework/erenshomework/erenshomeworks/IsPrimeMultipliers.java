package erenshomeworks;

public class IsPrimeMultipliers {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter of the numbers:");
        int number = input.nextInt();

        System.out.printf("Dividing number: %d ", isPrimeMultipliers(number));
    }

    public static int isPrimeMultipliers(int number) {

        int dividing = number;
        int divisive = 2;
        int count=0;
        while (divisive < number) {
            if (dividing % divisive == 0) {
                dividing /= divisive;
                count++;
                System.out.printf("%d. Prime factors: %d %n",count,divisive);
            } else {
                divisive++;
            }
        }
        return divisive;
    }
}