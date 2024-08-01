import java.util.Scanner;

public class Q_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //take input of radius of circle from user
        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();

        // Calculate area and perimeter
        double area = Math.PI * r * r;
        double peri = 2 * Math.PI * r;

        // Display the results
        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter of the circle: " + peri);

        sc.close();
    }
}

