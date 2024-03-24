import java.util.Scanner;

public class Lab0303 {
        public static int compare() {

            int firstNum;
        System.out.println("Enter the first number: ");
        Scanner scanFirst = new Scanner(System.in);
        firstNum = scanFirst.nextInt();


        int secondNum;
        System.out.println("Enter the second number: ");
        Scanner scanSecond = new Scanner(System.in);
        secondNum = scanSecond.nextInt();

        if (secondNum > firstNum) {
            return 1;
        } else if (firstNum == secondNum) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        compare();

    }
}