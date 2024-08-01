import java.util.Scanner;

public class Q_6 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter coefficients of the quadratic equation
        System.out.println("Enter the coefficients of the quadratic equation (a, b, c):");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        // Close the scanner
        sc.close();
        
        // Calculate discriminant
        double dis = b * b - 4 * a * c;
        
        // Check the nature of roots and calculate roots accordingly
        if (dis > 0) {
            double root1 = (-b + Math.sqrt(dis)) / (2 * a);
            double root2 = (-b - Math.sqrt(dis)) / (2 * a);
            System.out.println("Roots are real and different.");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (dis == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal.");
            System.out.println("Root = " + root);
        } else {
            double real = -b / (2 * a);
            double imag = Math.sqrt(-dis) / (2 * a);
            System.out.println("Roots are complex and different.");
            System.out.println("Root 1 = " + real + " + " + imag + "i");
            System.out.println("Root 2 = " + real + " - " + imag + "i");
        }
    }
}

