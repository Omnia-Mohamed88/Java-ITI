public class InputCheck {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide an integer as a command-line argument.");
            return;
        }

        try {
            int value = Integer.parseInt(args[0]);

            if (value < 0) {
                System.out.println("You entered negative: " + value);
            } else if (value > 0) {
                System.out.println("You entered: " + value);
            } else {
                System.out.println("You entered zero.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}


