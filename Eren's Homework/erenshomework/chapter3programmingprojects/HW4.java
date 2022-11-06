package chapter3programmingprojects;

public class Homework4 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {

        java.util.Scanner inp = new java.util.Scanner(System.in);

        System.out.println("Enter the cost: ");
        double cost = inp.nextDouble();

        System.out.println("Enter the years: ");
        int year = inp.nextInt();

        System.out.println("Enter the inflation: ");
        double inflation = inp.nextDouble();

        System.out.printf("Update cost: %.2f", costAndInflation(cost, year, inflation));
    }

    public static double costAndInflation(double cost, int year, double inflation) {

        double total = 1;

        for (int i = 0; i < year; i++) {
            total += inflation / 100 * cost;
            cost += total;
        }
        return cost;
    }
}
