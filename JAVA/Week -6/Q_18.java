import java.util.Scanner;

interface Payable {
    double calculateBasicSalary();
}

interface Taxable {
    double calculateTax();
}

class Employee implements Payable, Taxable {
    private double basicSalary;
    private double taxRate;

    public Employee(double basicSalary, double taxRate) {
        this.basicSalary = basicSalary;
        this.taxRate = taxRate;
    }

    @Override
    public double calculateBasicSalary() {
        return basicSalary;
    }

    @Override
    public double calculateTax() {
        return basicSalary * (taxRate / 100);
    }
}

public class Q_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for basic salary
        System.out.print("Enter the employee's basic salary: ");
        double basicSalary = scanner.nextDouble();

        // Prompt user for tax rate
        System.out.print("Enter the tax rate (in percentage): ");
        double taxRate = scanner.nextDouble();

        // Create an employee with the provided inputs
        Employee employee = new Employee(basicSalary, taxRate);

        // Calculate and display the results
        System.out.println("Basic Salary: $" + employee.calculateBasicSalary());
        System.out.println("Tax Amount: $" + employee.calculateTax());
        scanner.close();
    }
}
