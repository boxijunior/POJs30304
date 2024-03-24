import java.util.Scanner;

public class Lab0301 {
    public static void main(String[] args) {

        System.out.println("Enter the dividend: ");
        Scanner scanIt = new Scanner(System.in);
        int dividend = scanIt.nextInt();

        System.out.println("Enter the divisor: ");
        Scanner scanDivisor = new Scanner(System.in);
        int divisor = scanDivisor.nextInt();


        if (divisor == 0) {
            System.out.println("You can't divide by 0 :( Choose another number; ");
        }
        double result = dividend/divisor;

        System.out.println("Your division result is: " + result);

    }

}
