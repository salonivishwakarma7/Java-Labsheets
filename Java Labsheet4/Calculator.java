public class Calculator {
    static int operationsCount = 0;

    void add(double a, double b) {
        double result = a + b;
        operationsCount++;
        System.out.println("Addition: " + result);
    }

    void subtract(double a, double b) {
        double result = a - b;
        operationsCount++;
        System.out.println("Subtraction: " + result);
    }

    void multiply(double a, double b) {
        double result = a * b;
        operationsCount++;
        System.out.println("Multiplication: " + result);
    }

    void divide(double a, double b) {
        if (b != 0) {
            double result = a / b;
            operationsCount++;
            System.out.println("Division: " + result);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        double num1 = 20;
        double num2 = 5;

        Calculator calculator = new Calculator();

        calculator.add(num1, num2);
        calculator.subtract(num1, num2);
        calculator.multiply(num1, num2);
        calculator.divide(num1, num2);

        System.out.println("Total Operations: " + operationsCount);
    }
}