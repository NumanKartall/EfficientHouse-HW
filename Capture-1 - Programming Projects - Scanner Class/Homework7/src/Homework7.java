public class Homework7 {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter to the total seconds: ");
        int totalSeconds = input.nextInt();

        int hours = totalSeconds / 3600;
        hours %= 60;

        int minutes = totalSeconds % 3600;
        minutes /= 60;

        int seconds = totalSeconds % 3600;
        seconds %= minutes;

        System.out.printf("Total seconds: %d %n", totalSeconds);
        System.out.println(hours + " hours  " + minutes + " minutes  " + seconds + " seconds");

        /*
        answer to the question
        
        Enter to the total seconds: 50391
        Total seconds: 50391
        13 hours  59 minutes  51 seconds
         */

    }
}
