public class Homework4 {
    public static void main(String[] args) {

        double proportion = 0.001;
        double mouseWeight = 0.3;
        double startingWeight = 100;
        double desiredWeight = 80;

        double limit = ((proportion / mouseWeight) * desiredWeight);

        System.out.println("Reliable soda limit: " + limit);
        System.out.println("Lost weight: " + (startingWeight - desiredWeight));

        // Reliable soda limit: 0.26666666666666666
        // Lost weight: 20.0
    }
}
