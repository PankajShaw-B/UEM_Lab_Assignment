import java.util.Scanner;

public class Q_10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input from user
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        // Swap the numbers without using a temporary variable
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        // Display the swapped numbers
        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        sc.close();
    }
}
