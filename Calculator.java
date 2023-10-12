import java.util.Scanner;

public class Calculator {

    private final double firstNumber;
    private final double secondNumber;

    public Calculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double add() {
        return firstNumber + secondNumber;
    }

    public double subtract() {
        return firstNumber - secondNumber;
    }

    public double multiply() {
        return firstNumber * secondNumber;
    }

    public double divide() {
        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        Calculator calculator = new Calculator(firstNumber, secondNumber);

        double result;
        switch (operator) {
            case '+':
                result = calculator.add();
                break;
            case '-':
                result = calculator.subtract();
                break;
            case '*':
                result = calculator.multiply();
                break;
            case '/':
                result = calculator.divide();
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }

        System.out.println("The result is: " + result);
    }
}
