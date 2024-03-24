import java.util.Scanner;

public class Zadanie22 {
    public static void main(String[] args) {

        System.out.println("Provide the size of an array: ");
        Scanner scanIt = new Scanner(System.in);
        int arraySize = scanIt.nextInt();


        int[] array = new int[arraySize];
        System.out.println("Provide the elements of an array: ");
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanIt.nextInt();
        }

        for (int i = 0; i < arraySize / 2; i++) {
            int temp = array[i];
            array[i] = array[arraySize - i -1];
            array[arraySize - i -1] = temp;

        }

        System.out.println("Your reversed array: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
