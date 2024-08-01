import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner sc = new Scanner(System.in);
        
        // taking user input of a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Print the result
        if ((number % 7 == 0) || (number % 10 == 7)) {
            System.out.println(number + " is a Buzz number.");
        } else {
            System.out.println(number + " is not a Buzz number.");
        }        
        sc.close(); // Close the scanner
    }
}

