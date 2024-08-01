import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        // Close the scanner
        sc.close();
        
        // Find the HCF using the Euclidean algorithm
        int hcf = findHCF(num1, num2); 
        // Print the HCF
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }
    // Method to find HCF using the Euclidean algorithm
    public static int findHCF(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
