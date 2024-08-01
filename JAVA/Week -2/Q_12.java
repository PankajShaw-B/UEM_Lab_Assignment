import java.util.Scanner;

public class Q_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        // Close the scanner
        sc.close();
        
        // Count the number of digits
        int count = 0;
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        // Print the number of digits
        System.out.println("Number of digits in " + number + " is: " + count);
    }
}

