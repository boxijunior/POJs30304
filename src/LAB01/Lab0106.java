import java.util.Scanner;

public class Zadanie6 {

    //returns smallest element
    static int smallestNum(int[] array) {
        int smol = array[0];
        for (int i = 0; i < array.length; i++){
            if (smol > array[i]) {
                smol = array[i];
            }
        }
        return  smol;
    }

//returns biggest element
    static int bigNum(int[] array) {
        int biggie = array[0];
        for (int i = 0; i < array.length; i++){
            if (biggie < array[i]){
                biggie = array[i];
            }
        }
        return biggie;
    }

//returns sum of all elements
    static int elementsSum(int[] array) {
        int sum = 0;
        for (int i:array) {
            sum += i;
        }
        return sum;
    }

    //returns an average of elements
    static double elementsAverage(int[] array, int sum) {
        return (double) sum / array.length;
    }

//returns median of all elements
    static void elementsMedian(int[] array) {
        double median = array.length / 2.0;
        if (median % 1 != 0) {
            System.out.println(array[(int) median]);
        }
        else {
            System.out.println(array[(int) median - 1] + " " + array[(int) median]);
        }
    }


    public static void main(String[] args) {

        System.out.println("Provide array size: ");
        Scanner scanIt = new Scanner(System.in);
    int arraySize = scanIt.nextInt();
    int[] array = new int[arraySize];


    System.out.println("Provide the first array element: ");
    array[0] = scanIt.nextInt();

    System.out.println("Your array: ");
    int evenNumbers = array[0];
    for (int i = 0; i < arraySize; i++) {
        if (evenNumbers % 2 != 0) {
            evenNumbers++;
        }
        else {
            if (i == 1) {
                evenNumbers += 2;
            }
        }

        array[i] = evenNumbers;
        evenNumbers += 2;
    }

    for (int i:array){
        System.out.println("[" + i + "]");
    }
    System.out.println("Array stats: ");

    System.out.println("\n\nSmallest element of an array:");
    System.out.println(smallestNum(array));

    System.out.println("\n\nBiggest element of an array: ");
    System.out.println(bigNum(array));

    System.out.println("\n\nAverage of all array elements: ");
    System.out.println(elementsAverage(array, elementsSum(array)));

    System.out.println("\n\nMedian of all array elements: ");
    elementsMedian(array);


    }
}
