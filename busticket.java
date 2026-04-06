import java.util.Scanner;

public class busticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalSeats = 10;
        boolean[] seats = new boolean[totalSeats];
        int choice;

        while (true) {
            System.out.println("\n---- Bus Ticket Booking ----");
            System.out.println("1. Show Available Seats");
            System.out.println("2. Book Seat");
            System.out.println("3. Show Booked Seats");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Available Seats:");
                for (int i = 0; i < totalSeats; i++) {
                    if (!seats[i]) {
                        System.out.print("Seat " + (i + 1) + "  ");
                    }
                }
                System.out.println();

            } else if (choice == 2) {
                System.out.print("Enter seat number to book (1-" + totalSeats + "): ");
                int seat = sc.nextInt();

                if (seat < 1 || seat > totalSeats) {
                    System.out.println("Invalid seat number!");
                } else if (seats[seat - 1]) {
                    System.out.println("Seat " + seat + " is already booked!");
                } else {
                    seats[seat - 1] = true;
                    System.out.println("Seat " + seat + " booked");
                }

            } else if (choice == 3) {
                System.out.println("Booked Seats:");
                boolean any = false;
                for (int i = 0; i < totalSeats; i++) {
                    if (seats[i]) {
                        System.out.print("Seat " + (i + 1) + "  ");
                        any = true;
                    }
                }
                if (!any) {
                    System.out.println("No seats booked.");
                }
                System.out.println();

            } else if (choice == 4) {
                System.out.println("Thank you");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
