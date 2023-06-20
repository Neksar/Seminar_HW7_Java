import java.util.logging.Logger;

public class LoggingCalculatorDecorator implements Calculator {
    private static final Logger logger = Logger.getLogger(LoggingCalculatorDecorator.class.getName());
    private final Calculator calculator;

    public LoggingCalculatorDecorator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.add(a, b);
        logger.info(String.format("%s + %s = %s", a, b, result));
        return result;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.multiply(a, b);
        logger.info(String.format("%s * %s = %s", a, b, result));
        return result;
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.divide(a, b);
        logger.info(String.format("%s / %s = %s", a, b, result));
        return result;
    }
}