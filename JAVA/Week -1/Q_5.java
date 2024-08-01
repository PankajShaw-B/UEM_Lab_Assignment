import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input length and width of the rectangle from user
        System.out.print("Enter the length of the rectangle: ");
        double l = sc.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double w = sc.nextDouble();

        // calculate area and perimeter
        double area = l * w;
        double peri = 2 * (l + w);

        // display the results
        System.out.printf("Area of the rectangle: " + area);
        System.out.printf("Perimeter of the rectangle: " + peri);

        sc.close();
    }
}

