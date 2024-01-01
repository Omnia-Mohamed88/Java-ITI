public class InputCheck2 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide a string and an integer as command-line arguments.");
            return;
        }

        String inputString = args[0];

        try {
            int repeatCount = Integer.parseInt(args[1]);

            for (int i = 0; i < repeatCount; i++) {
                System.out.println(inputString);
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input for the second argument. Please enter a valid integer.");
        }
    }
}

