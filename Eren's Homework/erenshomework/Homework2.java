package erenshomework;
public class Homework2 {
    public static void main(String[] args) {
        sayial();
    }
    public static void sayial() {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("birinci sayiyi giriniz: ");
        int num1 = input.nextInt();

        System.out.print("ikinci sayiyi giriniz: ");
        int num2 = input.nextInt();

        System.out.print("ucuncu sayiyi giriniz: ");
        int num3 = input.nextInt();

        System.out.printf("%d sayisi ortanca sayidir", mid(num1, num2, num3));
    }
    public static int mid(int num1, int num2, int num3) {
        if ((num1 >= num2) && (num2 >= num3) || (num3 >= num2) && (num2 >= num1))
            return num2;
        else if ((num2 >= num1) && (num1 >= num3) || (num3 >= num1) && (num1 >= num2))
            return num1;
        else
            return num3;
    }
}