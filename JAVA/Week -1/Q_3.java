import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking user input of temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();

        // convert the Celsius to Fahrenheit
        double f = (c * 9/5) + 32;

        // display the result
        System.out.println("Temperature in Fahrenheit: " + f);

        sc.close();
    }
}

