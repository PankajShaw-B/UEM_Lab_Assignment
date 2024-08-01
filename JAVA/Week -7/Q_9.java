class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

public class Q_9 {
    public static void main(String[] args) {
        try {
            // Check if the number of arguments is less than 5
            if (args.length < 5) {
                throw new CheckArgument("Insufficient arguments. Please provide at least 5 numbers.");
            }

            // Parse the first five arguments and add them
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += Integer.parseInt(args[i]);
            }

            // Print the result
            System.out.println("The sum of the first five numbers is: " + sum);

        } catch (CheckArgument e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please ensure all arguments are integers.");
        }
    }
}