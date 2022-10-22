package erenshomework;
public class Homework1 {
    public static void main(String[] args) {
        sayilariAl();
    }
    public static void sayilariAl() {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Birinci sayiyi giriniz: ");
        int a = input.nextInt();

        System.out.println("Ikinci sayiyi giriniz: ");
        int b = input.nextInt();

        System.out.println("Ucuncu sayiyi giriniz:");
        int c = input.nextInt();
        sayilariKarsilastir(a, b, c);
    }
    public static void sayilariKarsilastir(int a, int b, int c) {

        if ((a == b) && (a == c))
            System.out.printf("%d = %d = %d", a, b, c);
        if ((a == b) & (a > c)) {
            System.out.printf("%d = %d > %d", a, b, c);
        } else if ((a == b) & (a < c)) {
            System.out.printf("%d = %d < %d", a, b, c);
        } else if ((c == a) & (c > b)) {
            System.out.printf("%d = %d > %d", c, a, b);
        } else if (c == a & (c < b)) {
            System.out.printf("%d = %d < %d", c, a, b);
        } else if ((b == c) & (c > a)) {
            System.out.printf("%d = %d > %d", b, c, a);
        } else if ((b == c) & (c < a)) {
            System.out.printf("%d = %d < %d", b, c, a);
        } else if (b < c) {
            if (a < b) {
                System.out.printf("%d < %d < %d", a, b, c);
            } else {
                System.out.printf("%d < %d < %d", b, a, c);
            }
        } else if (a < b) {
            if (a < c) {
                System.out.printf("%d < %d < %d", a, c, b);
            } else {
                System.out.printf("%d < %d < %d", c, a, b);
            }
        } else if (b < a) {
            System.out.printf("%d < %d < %d", c, b, a);
        } else {
            System.out.printf("%d < %d < %d", b, c, a);
        }
        //BENDE BÖYLE İSTEMEZDİM :( EMİN OL AMA O KADAR KAFA YORDUĞUM HALDE Bİ YERDE PATLADI AMA METHOD KULLANILARAK YAPILACAĞINI BİLİYORUM
        // 3 DEĞİŞKEN TUTULARAK ALGORİTMAYA FARKLI AÇIDAN BAKMAK LAZIM
    }
}