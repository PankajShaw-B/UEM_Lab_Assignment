import java.util.Scanner;
public class Q_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
		int ori, rem, result = 0, n = 0;
        ori = num;
        for (ori = num; ori != 0; ori /= 10) {
            ++n;
        }
        ori = num;
        while (ori != 0) {         // Calculate result
            rem = ori % 10;
            result += Math.pow(rem, n);
            ori /= 10;
        }
        if (result == num) {  // Check if the number is Armstrong
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        sc.close(); 
    }
}

