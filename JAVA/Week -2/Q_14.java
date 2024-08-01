import java.util.Scanner;

public class Q_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        // taking user input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();        
        // Close the scanner
        sc.close();        
        // Check if the number is a palindrome       
        int ori = n;
        int rev = 0;        
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }        
        // Print the result
        if (ori == rev) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
    
}
