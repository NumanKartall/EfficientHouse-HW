package convertingwhiletofor;

public class ForExample2 {
    public static void main(String[] args) {

        java.util.Scanner inp = new java.util.Scanner(System.in);

        System.out.print("How many times you want to loop through: ");
        int value = inp.nextInt();

        System.out.println("---------------");

        int i;
        for (i = 0; i < value; value--) {
            System.out.println(value);
        }

        System.out.printf("value = %d", value);
    }
}
