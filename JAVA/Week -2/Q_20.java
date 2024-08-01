import java.util.Scanner;

public class Q_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input values
        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Check if m is a multiple of n
        if (m % n == 0) {
            System.out.println(m + " is a multiple of " + n);
        } else {
            System.out.println(m + " is not a multiple of " + n);
        }

        sc.close();
    }
}
