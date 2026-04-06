import java.util.Scanner;

public class passwordlogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "1234";
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter username: ");
            String inputUser = sc.nextLine();
            System.out.print("Enter password: ");
            String inputPass = sc.nextLine();

            if (inputUser.equals(username) && inputPass.equals(password)) {
                System.out.println("Login successful! Welcome " + username);
                break;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Invalid credentials! Attempts remaining: " + attempts);
                } else {
                    System.out.println("Account locked! Too many failed attempts.");
                }
            }
        }
    }
}
