import java.util.Scanner;

public class Q_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        // Close the scanner
        sc.close();
        
        // Find the LCM using the formula: LCM = (num1 * num2) / HCF
        int lcm = (num1 * num2) / findHCF(num1, num2);
        // Print the LCM
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
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
