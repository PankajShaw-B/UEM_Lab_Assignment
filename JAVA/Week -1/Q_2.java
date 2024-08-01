import java.util.Scanner;
public class Q_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input of 1st number from user 
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        // taking input of  2nd number from user
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Close the scanner to prevent resource leak
        sc.close();

        // Add the two numbers
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}

