public class Zadanie3 {
    public static void main(String[] args) {
        double kilometers;
        kilometers=1.609;
        int miles=1;

        for (int i = 1; i <= 10; i++) {


            System.out.println(miles * i + "\t" + kilometers * (double)i);

        }
    }
}
