public class Q_1 {

    public static void main(String[] args) {
      try {
        // Code that might throw an exception
        int result = divide(10, 0);  // This will cause ArithmeticException
        System.out.println("Result: " + result);
      } catch (ArithmeticException e) {
        // Handle the exception
        System.out.println("Exception occurred: Division by zero");
      } finally {
        // Code that always executes, regardless of exceptions
        System.out.println("This block always executes.");
      }
  
      throwExample(); // Example of throwing an exception manually
    }
  
    public static int divide(int a, int b) throws ArithmeticException {
      // This method throws an exception if b is zero
      if (b == 0) {
        throw new ArithmeticException("Division by zero");
      }
      return a / b;
    }
  
    public static void throwExample() {
      // Example of throwing an exception manually
      throw new NullPointerException("This exception is thrown intentionally.");
    }
  }
  