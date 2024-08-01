import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        // Create a Scanner 
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Reverse the number
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        
        // Print the reversed number
        System.out.println("Reversed number: " + reverse);
		sc.close(); // Close the scanner
    }
}

