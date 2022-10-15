public class Homework1 {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("What is your name ?");
        String name = input.nextLine();

        System.out.println("Write your weight: ");
        int weight = input.nextInt();

        System.out.println("Write your height: ");
        double height = input.nextDouble();

        double Bmi = weight / (height * height);

        System.out.printf("YOUR NAME: %s \n", name);
        System.out.printf("YOUR WEIGHT: %d \n", weight);
        System.out.printf("YOUR HEIGHT: %.2f \n", height);
        System.out.printf("Your BMI: %.2f \n", Bmi);


        /* Answer to the quewstion

        What is your name ?
        Numan Kartal

        Write your weight:
        88

        Write your height:
        1,94

        YOUR NAME: Numan Kartal
        YOUR WEIGHT: 88
        YOUR HEIGHT: 1,94
        Your BMI: 23,38 */
    }
}
