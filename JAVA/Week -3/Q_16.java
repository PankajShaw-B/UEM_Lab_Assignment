import java.util.Scanner;

public class Q_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size]; // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
               c++;
            }
        }
        System.out.println("Number of non-zero elements in the array: " + c);
        sc.close();
    }
}
