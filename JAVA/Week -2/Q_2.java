import java.util.Scanner;

public class Q_2{
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner sc = new Scanner(System.in);
        
        // taking user input 
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Calculate the factorial of the number
        long factorial = 1;
        
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        
        // Print the factorial
        System.out.println("Factorial of " + number + " is: " + factorial);
        sc.close();  // Close the scanner
    }
}
