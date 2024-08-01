import java.util.Scanner;

public class Q_16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose conversion:");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();
        switch (choice) { // Perform the conversion based on the choice
            case 1:
                binaryToDecimal();
                break;
            case 2:
                decimalToBinary();
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }
        sc.close(); // Close the scanner
    }

    public static void binaryToDecimal() { // Method to convert binary to decimal
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = sc.nextLine();
        sc.close();
        int decimal = Integer.parseInt(binaryString, 2); // Convert binary string to decimal
        System.out.println("Decimal equivalent: " + decimal); // Print the decimal equivalent
    }
    public static void decimalToBinary() { // Method to convert decimal to binary
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        sc.close();
        String binaryString = Integer.toBinaryString(decimal);// Convert decimal to binary string
        System.out.println("Binary equivalent: " + binaryString);// Print the binary equivalent
    }
}
