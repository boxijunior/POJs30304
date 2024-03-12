import java.util.Scanner;

class Zadanie2 {
    public static void main(String[] args) {

        Scanner celsius = new Scanner(System.in);

        int input = celsius.nextInt();

        double fahrenheit;
        fahrenheit = (((9.0/ 5) * input) + 32);

        System.out.println(fahrenheit);
    }
}