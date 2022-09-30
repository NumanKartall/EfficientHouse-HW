public class Homework5 {
    public static void main(String[] args) {

        String str1 = "I hate you.";

        System.out.println("The line of text to be changed is:  " + str1);
        System.out.println("-------------------------------------------------");
        System.out.println("I have rephrased that line to read:  " + str1.replaceAll("hate", "love"));

        //     The line of text to be changed is:  I hate you.
        //     ------------------------------------------------
        //     I have rephrased that line to read:  I love you.
        //

    }
}
