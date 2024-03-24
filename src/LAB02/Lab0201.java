import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {


        System.out.println("Podaj promien kola: ");
        Scanner scanIt = new Scanner(System.in);
        int promien = scanIt.nextInt();


        double obwod = (2.00 * Math.PI * promien);
        System.out.println("Obwod kola o promieniu " + promien + "to: " + obwod);

        double pole = ((Math.PI) * Math.pow(promien, 2));
        System.out.println("Pole kola o promieniu " + promien + "to: " + pole);





    }
}
