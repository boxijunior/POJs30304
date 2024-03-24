import java.util.Scanner;

public class Lab0205 {
    public static void bookingCinema(boolean[][] cinemaSeats) {
        Scanner scanIt = new Scanner(System.in);

        String choice = "";

        do {
            bookingCinema(cinemaSeats);
            System.out.println("Enter seat row and seat you want to make a reservation for: ");
            int inputRow = scanIt.nextInt() - 1;
            if (inputRow < 0 || inputRow >= 10) {
                System.out.println("Invalid row number, choose again: ");
                continue;
            }
            int inputSeat = scanIt.nextInt() - 1;
            if (inputSeat < 0 || inputSeat >= 10) {
                System.out.println("Invalid seat number, choose again: ");
                continue;
            }
            if (!cinemaSeats[inputRow][inputSeat]) {
                cinemaSeats[inputRow][inputSeat] = true;
            } else {
                System.out.println("Chosen seat is already taken. Choose again: ");
                continue;
            }
            System.out.println("Do you want to make another reservation? \nEnter {0} to quit \nEnter anything besides {0} to continue");
            choice = scanIt.next();
        } while (!choice.equals("0"));
    }
    public static void displayIt(boolean[][] cinemaSeats) {
        System.out.println("Cinema seats \n{X} - taken \n{0} - free");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (!cinemaSeats[i][j]) {
                    System.out.println("0 ");
                } else {
                    System.out.println("X ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        boolean[][] cinemaSeats = new boolean[10][10];

        bookingCinema(cinemaSeats);
    }
}
