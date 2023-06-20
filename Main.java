public class Main {
    public static void main(String[] args) {
        Calculator calculator = new LoggingCalculatorDecorator(new SimpleCalculator());

        ComplexNumber a = new ComplexNumber(1, 2);
        ComplexNumber b = new ComplexNumber(3, 4);

        ComplexNumber sum = calculator.add(a, b);
        System.out.println("Sum: " + sum);

        ComplexNumber product = calculator.multiply(a, b);
        System.out.println("Product: " + product);

        ComplexNumber quotient = calculator.divide(a, b);
        System.out.println("Quotient: " + quotient);
    }
}