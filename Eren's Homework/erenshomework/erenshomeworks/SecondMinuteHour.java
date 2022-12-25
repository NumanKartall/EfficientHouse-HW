package erenshomeworks;

public class SecondMinuteHour {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Please enter the seconds: ");
        long seconds = input.nextLong();

        displayDuration(seconds);
    }

    public static void displayDuration(long seconds) {

        long hours = seconds / 3600;
        seconds %= 3600;

        long minutes = seconds / 60;
        seconds %= 60;

        System.out.printf("%s %s %s",hours(hours) , minutes(minutes) , seconds(seconds));
    }

    public static String seconds(long seconds) {

        return seconds == 0 ? " " : seconds + " second ";
    }

    public static String minutes(long minutes) {

        return minutes == 0 ? " " : minutes + " minute ";
    }

    public static String hours(long hours) {

        return hours == 0 ? " " : hours + " hour ";
    }
}