import java.util.Scanner;

public class Q_7{
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the range
        System.out.print("Enter the range (up to which natural numbers to sum): ");
        int range = sc.nextInt();
        
        // Close the scanner
        sc.close();
        
        // Calculate the sum of natural numbers up to the specified range
        int sum = 0;
        for (int i = 1; i <= range; i++) {
            sum += i;
        }
        
        // Print the sum
        System.out.println("Sum of natural numbers up to " + range + " is: " + sum);
    }
}
