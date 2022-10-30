package convertingwhiletofor;

public class ForExample {
    public static void main(String[] args) {

        java.util.Scanner inp = new java.util.Scanner(System.in);

        System.out.print("How many times you want to loop through: ");
        int value = inp.nextInt();

        System.out.println("--------------------");

        //step-1:inislassion step-2:boolean experssion step-3:update
        int i;
        for (i = 0; i < value; i++) {
            System.out.println(i);
            //i=i+1;
        }
        System.out.printf("i = %d %n", i);

        System.out.print("How many times you want to loop through: ");
        int value2 = inp.nextInt();

        System.out.println("--------------------");

        int j;

        for (j = 0; j < value2; j++) {
            System.out.println(j);
        }

        System.out.printf("j = %d", j);
    }
}