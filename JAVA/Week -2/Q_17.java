import java.util.Scanner;

public class Q_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking range from the user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array to store the elements
        int[] numbers = new int[n];

        // taking elements from the user
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sort the array in ascending order
        sort(numbers);

        // Find the median
        double median;
        if (n % 2 == 0) {
            median = (double) (numbers[n / 2 - 1] + numbers[n / 2]) / 2;
        } else {
            median = numbers[n / 2];
        }

        // Print the median
        System.out.println("Median: " + median);
		scanner.close();// Close the scanner
    }

    // Method to perform selection sort
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
