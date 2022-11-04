package chapter3programmingprojects;

public class Homework7 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        java.util.Scanner inp = new java.util.Scanner(System.in);

        while (true) {
            System.out.print("Please enter the first number:");
            int firstNumber = inp.nextInt();

            System.out.print("Please enter the last number:");
            int lastNumber = inp.nextInt();

            while (firstNumber <= lastNumber) {
                if (isAmstrong(firstNumber)) {
                    System.out.printf("%d amstrong the numbers.%n", firstNumber);
                }
                firstNumber++;
            }
        }
    }

    public static boolean isAmstrong(int number) {
        return number == powSum(number) && number > 0;
    }

    public static int digitsOfNumber(int number) {
        int count;

        for (count = 0; number != 0; count++)
            number /= 10;

        return count;
    }

    public static int pow(int number, int b) {
        int result;

        for (result = 1; b-- > 0; )
            result *= number;

        return result;
    }

    public static int powSum(int number) {

        int digits = digitsOfNumber(number);
        int total;

        for (total = 0; number != 0; number /= 10)
            total += pow(number % 10, digits);

        return total;
    }
}
