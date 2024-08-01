public class Q_2 {
    public static void main(String[] args) {
        try {
            // Attempting to access an array element with negative index
            int[] arr = {1, 2, 3};
            int index = -1;
            int element = arr[index];
            System.out.println("Element at index " + index + ": " + element);
        } 
         catch (ArrayIndexOutOfBoundsException e) {
            // Catching ArrayIndexOutOfBoundsException for negative index
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }

        try {
            // Attempting to divide by zero
            int result = 5 / 0;;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catching ArithmeticException
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        }
    }
}
