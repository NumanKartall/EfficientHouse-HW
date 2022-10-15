public class Homework5 {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();

        System.out.println("The word you want to change: ");
        String word = input.nextLine();

        System.out.println("Enter the new word: ");
        String newWord = input.nextLine();

        System.out.printf("The line of text to be changed is: %s %n", sentence);
        System.out.println("----------------------------------------------------");
        System.out.printf("I have rephrased that line to read: %s ", sentence.replaceAll(word, newWord));


        //        answer to the question
        //        Enter a sentence:
        //        merhabalar ben numan kartal siz kimsiniz
        //        The word you want to change:
        //        siz kimsiniz
        //        Enter the new word:
        //        sen kimsin
        //        The line of text to be changed is: merhabalar ben numan kartal siz kimsiniz
        //        ----------------------------------------------------
        //        I have rephrased that line to read: merhabalar ben numan kartal sen kimsin
    }
}
