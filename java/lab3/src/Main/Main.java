package Main;

import equation.formela;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the formela interface using a lambda expression
        formela eq = (int a, int b, int c) -> {
            double discriminant = b * b - 4 * a * c;

            if (discriminant >= 0 && a != 0) {
                double firstRoot = (-b + Math.sqrt(discriminant)) / (2.0 * a);
                double secondRoot = (-b - Math.sqrt(discriminant)) / (2.0 * a);
                System.out.println("First Root: " + firstRoot);
                System.out.println("Second Root: " + secondRoot);
            } else {
                System.out.println("No real roots.");
            }
        };

        eq.calculateRoots(1, -3, 2);
    }
}
