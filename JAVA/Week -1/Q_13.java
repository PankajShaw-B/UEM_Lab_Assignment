import java.util.Scanner;
public class Q_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object \
        System.out.print("Enter the percentage: "); // take user input of percentage
        double percentage = sc.nextDouble();
        char grade; // Determine the grade based on the percentage
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("Grade: " + grade); // Print the grade
        sc.close(); // Close the scanner
    }
}
