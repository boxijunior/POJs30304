import java.util.Scanner;

public class Lab0304 {

    public static void wordInput() {

        System.out.println("Provide a word: ");
        Scanner scanWord = new Scanner(System.in);
        String word = scanWord.next();


        System.out.println("Your reversed word is: ");


        char[] resultArr = word.toCharArray();
        for (int i = resultArr.length - 1; i >= 0; i--) {
            System.out.print(resultArr[i]);
        }

    }

    public static void main(String[] args) {



        wordInput();
    }

}
