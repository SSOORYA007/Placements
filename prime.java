import java.util.Scanner;

public class prime {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = sc.nextInt();
        int temp = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                temp = temp + 1;
            }
        }

        if (temp == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("not Prime");
        }
    }
}
