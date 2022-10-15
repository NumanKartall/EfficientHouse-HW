public class Homework2 {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter the number of coupons: ");
        int coupons = input.nextInt();

        int candyRight = coupons / 10;

        coupons = coupons - (candyRight * 10);

        int gumballRight = coupons / 3;

        coupons = coupons - (gumballRight * 3);

        System.out.printf("The number of candies you can take: %d \n", candyRight);
        System.out.printf("The number of gumball you can take: %d \n", gumballRight);
        System.out.printf("Number of extra tickets left: %d \n", coupons);


        /* Answer to the question

        Enter the number of coupons: 37
        The number of candies you can take: 3
        The number of gumball you can take: 2
        Number of extra tickets left: 1
         */
    }
}