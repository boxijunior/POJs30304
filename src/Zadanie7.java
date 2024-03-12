import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {

        int firstNum, secondNum;
        System.out.println("Podaj pierwsza liczbe: ");

        Scanner scanIt = new Scanner(System.in);
         firstNum = scanIt.nextInt();
         System.out.println("Podaj druga liczbe: ");
         secondNum = scanIt.nextInt();

         while (firstNum * secondNum != 0) {
             if (firstNum >= secondNum) {
                 firstNum %= secondNum;
             }
             else {
                 secondNum %= firstNum;
             }
         }
         int nwd = firstNum + secondNum;
         System.out.println("NWD podanych liczb to: " + nwd);
    }
}
