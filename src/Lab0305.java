import java.util.Scanner;

public class Lab0305 {

    public static void main(String[] args) {


        System.out.println("Provide the first number: ");
        Scanner scan1 = new Scanner(System.in);
        int inputOne = scan1.nextInt();


        System.out.println("Provide the second number: ");
        Scanner scan2 = new Scanner(System.in);
        int inputTwo = scan2.nextInt();

        System.out.println("Provide the third number: ");
        Scanner scan3 = new Scanner(System.in);
        int inputThree = scan3.nextInt();


        System.out.println("Provide the fourth number: ");
        Scanner scan4 = new Scanner(System.in);
        int inputFour = scan4.nextInt();


        System.out.println("Provide the fifth number: ");
        Scanner scan5 = new Scanner(System.in);
        int inputFive = scan5.nextInt();


        for (int i = 0; i < 5; i++) ;
        System.out.println(inputOne * 3);
        System.out.println(inputTwo * 3);
        System.out.println(inputThree * 3);
        System.out.println(inputFour * 3);
        System.out.println(inputFive * 3);


    }
}