import java.util.Scanner;

public class Q_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking a number from the user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check if the number is positive or negative
        if (n>0) {
            System.out.println(n + " is a positive no.");
        } else {
            System.out.println(n + " is a negative no.");
        }

        sc.close();
    }
}
