import java.util.Scanner;

public class Q_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking a number from user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check if the number is odd or even
        if (n % 2 == 0) {
            System.out.println(n + " is even.");
        } else {
            System.out.println(n + " is odd.");
        }

        sc.close();
    }
}
