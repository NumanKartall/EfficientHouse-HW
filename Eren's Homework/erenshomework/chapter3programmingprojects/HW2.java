package chapter3programmingprojects;

public class Homework2 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.print("You pattern is: " + giveColors());
    }

    public static String giveColors() {

        String previousChar;
        String colorChar = "";
        String pattern = "";

        java.util.Scanner inp = new java.util.Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            System.out.print("Enter a color code:");
            previousChar = colorChar;
            colorChar = inp.next();

            if (!(colorChar.equals("R") || colorChar.equals("G") || colorChar.equals("B"))) {

                System.out.println("Please try again");
                i--;
                break;
            }
            if (previousChar.equals(colorChar)) {
                System.out.println("Please try again");
                i--;
            } else {
                pattern += colorChar;
            }
        }
        return pattern;
    }
}
