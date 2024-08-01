import java.util.Scanner;

public class Q_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check if the number is odd or even
        if (n % 5 == 0) {
            System.out.println(n + " is divisible by 5.");
        } else {
            System.out.println(n + " is not divisible by 5.");
        }

        sc.close();
    }
}
