import java.util.Scanner;

public class Zadanie5 {

    public static void main(String[] args) {

        System.out.println("Podaj rozmiar tablicy: ");

        Scanner skaner = new Scanner(System.in);

        int size = skaner.nextInt();
        int[] array = new int[size];


            System.out.println("Podaj liczby do tablicy: ");
            for (int i = 0; i < size; i++) {
            array[i] = skaner.nextInt();
        }
        System.out.println("Twoja tablica: ");
            for (int i:array) {
                System.out.println(i);
        }
    }
}
