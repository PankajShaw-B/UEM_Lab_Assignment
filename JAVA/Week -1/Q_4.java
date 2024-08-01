import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input from user of the temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();

        // Convert Fahrenheit to Celsius
        double c = (f - 32) * 5/9;

        // Display the result
        System.out.println("Temperature in Celsius: " + c);

        sc.close();
    }
}
