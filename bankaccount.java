import java.util.Scanner;

public class bankaccount {
    String name;
    int accNo;
    double balance;
    static Scanner sc = new Scanner(System.in);

    void openAccount() {
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter account number: ");
        accNo = sc.nextInt();
        System.out.print("Enter initial deposit: ");
        balance = sc.nextDouble();
        System.out.println("Account opened successfully!");
    }

    void deposit() {
        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    void withdraw() {
        System.out.print("Enter withdraw amount: ");
        double amount = sc.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        }
    }

    void checkBalance() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        bankaccount acc = new bankaccount();
        int choice;

        while (true) {
            System.out.println("\n---- Bank Account ----");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                acc.openAccount();
            } else if (choice == 2) {
                acc.deposit();
            } else if (choice == 3) {
                acc.withdraw();
            } else if (choice == 4) {
                acc.checkBalance();
            } else if (choice == 5) {
                System.out.println("Thank you!");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}