import java.util.Scanner;

public class Q_8{
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the start of the interval: ");
        int start = sc.nextInt();
        System.out.print("Enter the end of the interval: ");
        int end = sc.nextInt();
        
        // Close the scanner
        sc.close();
        
        // Print all multiples of 10 within the given interval
        System.out.println("Multiples of 10 within the interval [" + start + ", " + end + "]:");
        for (int i = start; i <= end; i++) {
            if (i % 10 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

