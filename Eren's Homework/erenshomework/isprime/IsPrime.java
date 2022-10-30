package isprime;

public class IsPrime {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        for (int i = 2; i < 999999L; i++) {
            if (isPrime(i))
                System.out.printf("%d This is prime number.%n", i);
            else
                System.out.printf("%d This is not prime number.%n", i);
        }
    }

    public static boolean isPrime(long number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}