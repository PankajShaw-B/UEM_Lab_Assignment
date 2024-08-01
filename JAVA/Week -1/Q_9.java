import java.util.Scanner;

public class Q_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input of three numbers from user
        System.out.println("Enter three numbers:");
        System.out.print("1st number: ");
        double num1 = sc.nextDouble();
        System.out.print("2nd number: ");
        double num2 = sc.nextDouble();
        System.out.print("3rd number: ");
        double num3 = sc.nextDouble();

        // find the maximum of the three numbers
        double max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
		
        // display the maximum number
        System.out.println("The maximum of the three numbers is: " + max);
        sc.close();
    }
}
