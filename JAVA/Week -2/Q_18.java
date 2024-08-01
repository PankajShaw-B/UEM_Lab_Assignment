public class Q_18 {
    public static void main(String[] args) {
        int n = 10; // You can change the value of n to adjust the accuracy
        double e = 1.0;
        double factorial = 1.0;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            e += 1.0 / factorial;
        }
        System.out.println("The value of Euler's number (e) is: " + e);
    }
    
}

