import java.util.Scanner; public class q6 {
    public static void main(String[] args) { Scanner scanner = new Scanner(System.in); System.out.println("Enter a string:");
    String inputString = scanner.nextLine(); System.out.println("Enter the index:"); int index = scanner.nextInt();
    System.out.println("Enter the character to compare:"); char targetChar = scanner.next().charAt(0);
    boolean isCharAtIndex = isCharAtIndex(inputString, index, targetChar); if (isCharAtIndex) {
    System.out.println("The character at index " + index + " matches the given character.");
    } else {
    System.out.println("The character at index " + index + " does not match the given character.");
    }
    }
    public static boolean isCharAtIndex(String str, int index, char targetChar) { if (index < 0 || index >= str.length()) {
    return false; // Index out of bounds
    }
    char charAtIndex = str.charAt(index); return charAtIndex == targetChar;
    }}
    