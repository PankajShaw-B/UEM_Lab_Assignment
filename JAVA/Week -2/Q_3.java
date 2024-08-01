import java.util.Scanner;

public class Q_3{
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner sc = new Scanner(System.in);
        
        // taking range from user
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int num = sc.nextInt();
        
        // Generate Fibonacci series
        int prev = 0, curr = 1;
        System.out.println("Fibonacci series:");
        for (int i = 1; i <= num; ++i) {
            System.out.print(prev + " ");
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        sc.close();	        // Close the scanner
    }
}
