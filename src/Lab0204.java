import java.util.Scanner;

public class Lab0204 {
    public static void main(String[] args) {

        Scanner scanIt = new Scanner(System.in);

        System.out.println("Provide a phrase to check: ");

        String ifPalindrome = scanIt.nextLine();
        System.out.println("Input phrase to check: " + ifPalindrome);
        ifPalindrome = ifPalindrome.toLowerCase();
        char[] checkingArray = ifPalindrome.toCharArray();

        boolean truePalindrome = true;
        for (int i = 0; i < ifPalindrome.length() / 2; i++) {
            if (checkingArray[i] != checkingArray[checkingArray.length - i - 1]) {
                truePalindrome = false;
                break;
            }
        }

        if (truePalindrome) {
            System.out.println("Provided phrase - " + ifPalindrome + " - is a palindrome :)");
        } else {
            System.out.println("Provided phrase - " + ifPalindrome + " - is not a palindrome :(");
        }
    }
}
