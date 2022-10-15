public class Homework4 {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("plase enter the proportion: ");
        double proportion = input.nextDouble();

        System.out.print("please enter the weight of the mouse: ");
        double mouseWeight = input.nextDouble();

        System.out.print("plase enter the start of the weight: ");
        double startingWeight = input.nextDouble();

        System.out.print("plase enter the desired of the weight: ");
        double desiredWeight = input.nextDouble();

        double limit = ((proportion / mouseWeight) * desiredWeight);

        System.out.printf("Reliable soda limit: %f %n", limit);
        System.out.print("Lost weight " + (startingWeight - desiredWeight));

        /* answe to the quesiton

        plase enter the proportion: 0,001
        please enter the weight of the mouse: 0,5
        plase enter the start of the weight: 100
        plase enter the desired of the weight: 83
        Reliable soda limit: 0,166000
        Lost weight 17.0
         */
    }
}
