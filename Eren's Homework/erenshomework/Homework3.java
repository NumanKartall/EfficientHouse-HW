package erenshomework;
public class Homework3 {
    public static void main(String[] args) {
        sayiAl();
    }
    public static void sayiAl() {

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int number = input.nextInt();

        if (number > 0)
            System.out.printf("%d Bu sayi 0 dan buyuktur. (%d) doner", number, signum(number));
        else if (number < 0)
            System.out.printf("%d Bu sayi 0 dan kucuktur. (%d) doner", number, signum(number));
        else
            System.out.printf("%d Bu sayi 0 a esittir. (%d) doner", number, signum(number));
    }
    public static int signum(int number) {

        /*if (number > 0)
            return 1;
        else if (number < 0)
            return -1;
        ---------------------------OR----------------
        */
        return number == 0 ? 0 : number > 0 ? 1 : -1;
    }
}
