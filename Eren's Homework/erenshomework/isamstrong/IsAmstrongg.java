package erenshomework.isamstrong;

public class IsAmstrongg {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int amstrong = 0;
        while (amstrong <= 999999) {
            if (isAmstrong(amstrong)) {
                System.out.printf("%d amstrong sayidir.%n", amstrong);
            }
            amstrong++;
        }
    }

    public static boolean isAmstrong(int number) {
        return number == powSum(number) && number > 0;
    }

    public static int digitsOfNumber(int number) {
        int count = 0;

        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int pow(int number, int a) {
        int result = 1;
        while (a-- > 0) {
            result *= number;
        }
        return result;
    }

    public static int powSum(int number) {
        int digit = digitsOfNumber(number);
        int total = 0;

        while (number != 0) {
            total += pow(number % 10, digit);
            number /= 10;
        }
        return total;
    }
}
// pow methodunu yapmaya çalıştım anlamadım önceki ders notlarıma baktım

// sonra da powSum method u içerisinde  pow methodunu kullanarak elimize
// aldığımız sayıların modunu alıp gelecek olan sayılar kaç basamaklıysa üssünü alarak hesapladım
