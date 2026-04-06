import java.util.Scanner;

public class registration1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your email: ");
        String email = sc.nextLine();
        System.out.println("Enter your phone number: ");
        String phone = sc.nextLine();
        System.out.println("Enter your password: ");
        String password = sc.nextLine();

        if (name.isEmpty()) {
            System.out.println("Name is required");
        } else if (!email.contains("@")) {
            System.out.println("Email is not valid");
        } else if (phone.isEmpty()) {
            System.out.println("Phone number is required");
        } else if (password.length() < 8) {
            System.out.println("Password is not valid");
        } else if (phone.length != 10) {
            System.out.println("Phone number is not valid");
        } else {
            System.out.println("Registration successful");
        }

    }
}
