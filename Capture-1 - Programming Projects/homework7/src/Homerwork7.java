public class Homerwork7 {
    public static void main(String[] args) {

        int totalSeconds = 50391;

        int hours = totalSeconds / 3600;
        hours %= 60;

        int minute = totalSeconds % 3600;
        minute /= 60;

        int second = totalSeconds % 3600;
        second %= minute;

        System.out.println(hours + " hours " + minute + " minutes " + second + " seconds  " + totalSeconds + " totalseconds");

        //13 hours 59 minutes 51 seconds  50391 totalseconds
    }
}