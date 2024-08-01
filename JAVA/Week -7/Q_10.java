public class Q_10 {

    public static void main(String[] args) {
        try {
            // Check if 7 arguments are passed (1 for name, 6 for marks)
            if (args.length != 7) {
                throw new IllegalArgumentException("Please provide the student's name and marks for six subjects.");
            }

            String studentName = args[0];
            int totalMarks = 0;
            int marks;

            // Process the marks and calculate the total
            for (int i = 1; i <= 6; i++) {
                marks = Integer.parseInt(args[i]);
                if (marks < 0 || marks > 50) {
                    throw new RangeException("Marks for subject " + i + " are out of range.");
                }
                totalMarks += marks;
            }

            // Calculate the percentage
            double percentage = (totalMarks / 300.0) * 100;

            // Print the marksheet
            System.out.println("Mark Sheet for " + studentName);
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Percentage: " + percentage + "%");

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integer marks.");
        } catch (RangeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    // Custom exception for range checking
    static class RangeException extends Exception {
        public RangeException(String message) {
            super(message);
        }
    }
}