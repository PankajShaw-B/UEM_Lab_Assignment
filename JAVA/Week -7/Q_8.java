public class Q_8{

    public static void main(String[] args) {
        try {
            // Check if an argument is provided
            if (args.length == 0) {
                throw new ArrayIndexOutOfBoundsException("No argument provided. Please enter an integer.");
            }

            // Convert the string argument to an integer
            int number = Integer.parseInt(args[0]);

            // Check if the number is 0 and throw IllegalArgumentException
            if (number == 0) {
                throw new IllegalArgumentException("Factorial of 0 is not allowed.");
            }

            // Calculate the factorial
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Print the result
            System.out.println("Factorial of " + number + " is: " + factorial);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid integer.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}