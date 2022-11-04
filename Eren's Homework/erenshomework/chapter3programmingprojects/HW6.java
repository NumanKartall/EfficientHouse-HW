package chapter3programmingprojects;

public class Homework6 {

    public static void main(String[] args) {
        givePoundAndOrganism();
    }

    public static void givePoundAndOrganism() {

        java.util.Scanner inp = new java.util.Scanner(System.in);

        int days = 5, total = 0, n1 = 0, n2 = 10, n3;

        System.out.print("Enter how many days will spawn: ");
        int period = inp.nextInt();

        System.out.print("Enter the period of the organism that will reproduce 1 in 5 days: ");
        int organism = inp.nextInt();

        for (int i = 0; i < period; i++) {
            total += days;
            System.out.printf("%d days %n", total);
        }

        System.out.println("*********");

        for (int i = 0; i < organism; ++i) {
            n3 = n1 + n2;

            System.out.printf("%d pounds %n", n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
