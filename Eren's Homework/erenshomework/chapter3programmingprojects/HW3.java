package chapter3programmingprojects;

public class Homework2 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {

        java.util.Scanner inp = new java.util.Scanner(System.in);

        int select = 0;

        while (select != 2) {

            System.out.println("1.Find out the value of newtons on the earth and moon\n" + "2.Exit");
            select = inp.nextInt();

            if (select == 1) {
                System.out.println("Please enter kilograms:");
                int kilogram = inp.nextInt();

                System.out.printf("Car is the normal weight: %d KG %n Newton weight on Earth: %.2f N %n Newton weight on Moon: %.2f N %n", kilogram, earthNewton(kilogram), moonNewton(kilogram));

            } else if (select == 2) {
                System.out.println("Good bye !");
            }
        }
    }

    public static double earthNewton(int kilogram) {

        double newton = 9.81;
        return kilogram * newton;
    }

    public static double moonNewton(int kilogram) {

        double newton = 1.635;
        return kilogram * newton;
    }
}
