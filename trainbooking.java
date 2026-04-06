import java.util.Scanner;

class Train {
    int trainNo;
    String trainName;
    int ticketPrice;
    int ticketCount;

    void bookTicket(Scanner sc) {
        System.out.print("Enter train number: ");
        trainNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter train name: ");
        trainName = sc.nextLine();
        System.out.print("Enter ticket price: ");
        ticketPrice = sc.nextInt();
        System.out.print("Enter ticket count: ");
        ticketCount = sc.nextInt();
        System.out.println("Ticket booked!");
    }

    void cancelTicket() {
        if (ticketCount > 0) {
            ticketCount--;
            System.out.println("Ticket cancelled. Remaining: " + ticketCount);
        } else {
            System.out.println("No tickets to cancel!");
        }
    }

    void displayTicketInfo() {
        System.out.println("Train Number: " + trainNo);
        System.out.println("Train Name: " + trainName);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Ticket Count: " + ticketCount);
        System.out.println("Total Cost: " + (ticketPrice * ticketCount));
    }
}

public class trainbooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Train t = new Train();
        int choice;

        while (true) {
            System.out.println("\n---- Train Booking System ----");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Display Ticket Info");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                t.bookTicket(sc);
            } else if (choice == 2) {
                t.cancelTicket();
            } else if (choice == 3) {
                t.displayTicketInfo();
            } else if (choice == 4) {
                System.out.println("Thank you!");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
