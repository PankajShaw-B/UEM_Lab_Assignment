import java.util.Scanner;
public class Q_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        double base = sc.nextDouble();
        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();
        sc.close();       
        // Calculate the exponential
        double result=1 ;
        // If exponent is negative, make it positive and divide 1 by the result
        if (exponent < 0) {
            base = 1 / base;
            exponent = -exponent;
        }      
        // Calculate the exponential using a loop
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        // Print the result
        System.out.println(base + " raised to the power " + exponent + " is: " + result);
    }  
}
