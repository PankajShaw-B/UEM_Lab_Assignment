import java.util.Scanner;
public class Q_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close(); // Close the scanner
        boolean isPrime = checkPrime(num);// Check if the number is prime
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
    public static boolean checkPrime(int num) { // Method to check if a number is prime
        if (num <= 1) { // 0 and 1 are not prime numbers
            return false;
        }   
        for (int i = 2; i <= Math.sqrt(num); i++) { 
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
