
public class Homework2 {
    public static void main(String[] args) {

        int cuponNumber = 26;

        int alacagincandy = cuponNumber / 10;

        cuponNumber = cuponNumber - (alacagincandy * 10);

        int alacagingumball = cuponNumber / 3;

        cuponNumber = cuponNumber - (alacagingumball * 3);

        System.out.println("Alabileceginiz sadece candy sayisi: " + alacagincandy);
        System.out.println("Alabileceginiz sadece gumball sayisi: " + alacagingumball);
        System.out.println("Artan kupon sayisi: " + cuponNumber);

        /*
        Alabileceginiz sadece candy sayisi: 2

        Alabileceginiz sadece gumball sayisi: 2

        Artan kupon sayisi: 0
         */
    }
}
