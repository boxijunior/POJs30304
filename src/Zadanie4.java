import java.util.Scanner;
public class Zadanie4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();

        switch (liczba) {

            case 1: {
                System.out.println("It's Monday");
                break;
            }
            case 2: {
                System.out.println("It's Tuesday");
                break;
            }
            case 3: {
                System.out.println("It's Wednesday");
                break;
            }
            case 4: {
                System.out.println("It's Thursday");
                break;
            }
            case 5: {
                System.out.println("It's Friday :D");
                break;
            }
            case 6: {
                System.out.println("It's Saturday catJAM :D:D:D:D");
                break;
            }
            case 7: {
                System.out.println("It's Sunday :(((");
                break;
        }
            default: {
                System.out.println("Nie ma tylu dni tygodnia!!!!!!!!!! >:(");
            }
        }


    }
}
