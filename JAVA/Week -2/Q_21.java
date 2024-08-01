import java.util.Scanner;
public class Q_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number of the interval: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number of the interval: ");
        int end = sc.nextInt();
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) { // Iterate through the interval and check for prime numbers
            if (isPrime(i)) {
                System.out.print(i + " "); 
            }
        }
        sc.close();}
    public static boolean isPrime(int num) {     // Method to check if a number is prime
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; }
        }
        return true;
    }
}

