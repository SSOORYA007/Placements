import java.util.Scanner;

public class registration {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible for registration");
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Enter your email: ");
            String email = sc.nextLine();
            System.out.println("Enter your phone number: ");
            String phone = sc.nextLine();
            System.out.println("Enter your password: ");
            String password = sc.nextLine();
            System.out.println("Registration successful");
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Phone number: " + phone);
            System.out.println("Password: " + password);
        } else {
            System.out.println("You are not eligible for registration");
        }

        sc.close();
    }

}
