class MathOperations {
    double divide(int numerator, int denominator) throws MathOperationException {
        if (denominator == 0) {
            throw new MathOperationException("Division by zero is not allowed");
        }
        return (double) numerator / denominator;
    }

    double squareRoot(int number) throws MathOperationException {
        if (number < 0) {
            throw new MathOperationException("Square root of a negative number is not allowed");
        }
        return Math.sqrt(number);
    }

    int subtract(int a, int b) throws MathOperationException {
        if (b > a) {
            throw new MathOperationException("Result of subtraction would be negative");
        }
        return a - b;
    }
}

