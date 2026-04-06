import java.util.Scanner;

public class Automorphicnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sq = n * n;
        int temp = n;
        int count = 0;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        int divisor = (int) Math.pow(10, count);
        if (sq % divisor == n) {
            System.out.println(n + " is an Automorphic number");
        } else {
            System.out.println(n + " is not an Automorphic number");
        }
        sc.close();
    }
}