import java.util.Scanner;

public class Q_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input from user of distance (in miles)
        System.out.print("Enter distance in miles: ");
        double m = sc.nextDouble();

        // Convert miles to kilometers
        double km = m * 1.60934;

        // Display the result
        System.out.println(m + " miles is equal to " + km + " kilometers.");

        sc.close();
    }
}

