package isprime;

public class IsPrime {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        
        for (long i = 2; i < 99999L; i++) {
            
            if (isPrime(i))
                System.out.printf("%d This is prime number.%n", i);
            else
                System.out.printf("%d This is not prime number.%n", i);
        }
    }

    public static boolean isPrime(long number) {
        
        if (number < 2){
            return false;
        }
        for (long i = 2; i < number; i++) {
            
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
