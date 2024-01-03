public class Main {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();

        try {
            double result1 = mathOperations.divide(10, 2);
            System.out.println("Result of division: " + result1);
        } catch (MathOperationException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block for division");
        }

        try {
            double result2 = mathOperations.squareRoot(25);
            System.out.println("Result of square root: " + result2);
        } catch (MathOperationException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block for square root");
        }

        try {
            int result3 = mathOperations.subtract(8, 3);
            System.out.println("Result of subtraction: " + result3);
        } catch (MathOperationException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block for subtraction");
        }
    }
}