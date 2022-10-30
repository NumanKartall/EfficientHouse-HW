package isamstrongfor;

public class IsAmstrong {
    public static void main(String[] args) {
        run();
    }

    public static void run() {

        int amstrong;

        for (amstrong = 0; amstrong < 999999; amstrong++)
            if (isAmstrong(amstrong))
                System.out.printf("%d amstrong sayidir.%n", amstrong);
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