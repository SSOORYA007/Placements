import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Secretnumber = 10;
        int guess;

        System.out.println(" Welcome to the Guessing Game");
        while (true) {
            System.out.println("Guess the number");
            guess = sc.nextInt();

            if (guess == Secretnumber) {
                System.out.println("Correct");
                break;
            } else if (guess < Secretnumber) {
                System.out.println("Too low");
            } else {
                System.out.println("Too high");
            }
        }

    }

}
