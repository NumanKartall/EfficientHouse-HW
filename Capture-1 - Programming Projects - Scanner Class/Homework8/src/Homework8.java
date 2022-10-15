public class Homework8 {

    public  static  final  double DISTANCE = 180.0;

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter of the time: ");
        double time = input.nextDouble();

        double avarageSpeed = DISTANCE / time;

        System.out.println("This program calculates vehicle avarage speed given a time and distance traveled.");

        System.out.printf("Car avarage speed is %.5f miles per hour.",avarageSpeed);


//        answer to the question
//
//        Enter of the time: 20,5
//        This program calculates vehicle avarage speed given a time and distance traveled.
//        Car avarage speed is 8,78049 miles per hour.
    }
}
