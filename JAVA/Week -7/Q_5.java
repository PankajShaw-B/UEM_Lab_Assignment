public class Q_5 {
    private static final int MAX_SIZE = 21; // Maximum value for which we can compute factorial

    private static long[] factorialArray = new long[MAX_SIZE];

    static {
        factorialArray[0] = 1; // 0! = 1
        for (int i = 1; i < MAX_SIZE; i++) {
            factorialArray[i] = factorialArray[i - 1] * i; // Compute factorial and store in array
        }
    }

    public static long computeFactorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Value of x must be positive");
        }
        if (x >= MAX_SIZE) {
            throw new IllegalArgumentException("Result will overflow");
        }
        return factorialArray[x];
    }

    public static void main(String[] args) {
        try {
            int x = 21; // Example: compute factorial for x = 5
            long result = computeFactorial(x);
            System.out.println("Factorial of " + x + " is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
