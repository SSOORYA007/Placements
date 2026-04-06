import java.util.Scanner;

public class game1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userchoice;
        int computerchoice;

        System.out.println("------Rock paper sisccor game------");
        System.out.println("1.Rock");
        System.out.println("2.Paper");
        System.out.println("3.Sisccor");
        System.out.println("Enter your choice");
        userchoice = sc.nextInt();
        computerchoice = (int) (Math.random() * 3) + 1;
        if (userchoice == computerchoice) {
            System.out.println("Draw");
        } else if (userchoice == 1 && computerchoice == 3) {
            System.out.println("User wins");
        } else if (userchoice == 2 && computerchoice == 1) {
            System.out.println("User wins");
        } else if (userchoice == 3 && computerchoice == 2) {
            System.out.println("User wins");
        } else {
            System.out.println("Computer wins");
        }

    }
}
