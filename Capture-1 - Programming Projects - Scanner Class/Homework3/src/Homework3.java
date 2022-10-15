public class Homework3 {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Plase enter the first word: ");
        String first = input.nextLine().trim();

        System.out.print("Plase enter the last word: ");
        String last = input.nextLine().trim();

        first = (first.substring(1, 2).toUpperCase() + first.substring(2) + first.charAt(0) + "ay");
        last = (last.substring(1, 2).toUpperCase() + last.substring(2) + last.charAt(0) + "ay");

        System.out.println("New first word: " + first + "   " + "New last word: " + last);


        /*  Answer to the question

        Plase enter the first word: walt
        Plase enter the last word: savitch

        New first word: Altway   New last word: Avitchsay
         */


    }
}
