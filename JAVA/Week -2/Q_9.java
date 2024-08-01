import java.util.Scanner;

public class Q_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // enter the number for the multiplication table
        System.out.print("Enter the number for the multiplication table: ");
        int number = sc.nextInt();
        System.out.print("Enter the range for the multiplication table: ");
        int range = sc.nextInt();
        // Close the scanner
        sc.close();
        // Generate and print the multiplication table
        System.out.println("Multiplication table for " + number + " up to " + range + ":");
        for (int i = 1; i <= range; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
