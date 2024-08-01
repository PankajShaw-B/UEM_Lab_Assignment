import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // taking total no of strength from user
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        
        // Create arrays to store marks of students in Mathematics, Physics, and Chemistry
        int[] math = new int[n];
        int[] phy = new int[n];
        int[] chem = new int[n];
        
        // Read marks of each student
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks of student " + (i + 1) + ":");
            System.out.print("Mathematics: ");
            math[i] = sc.nextInt();
            System.out.print("Physics: ");
            phy[i] = sc.nextInt();
            System.out.print("Chemistry: ");
            chem[i] = sc.nextInt();
        }
        
        // Close the scanner
        sc.close();
        
        // Process applications to list eligible candidates
        System.out.println("List of eligible candidates:");
        for (int i = 0; i < n; i++) {
            if (math[i] >= 60 && phy[i] >= 50 && chem[i] >= 40 &&
                (math[i] + phy[i] + chem[i] >= 200 ||
                 math[i] + phy[i] >= 150)) {
                System.out.println("Student " + (i + 1));
            }
        }
    }
}
