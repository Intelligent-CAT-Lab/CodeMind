public class p02137 {

    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                int input = Integer.parseInt(args[0]);
                int output = (input / 500) * 500;
                System.out.println(output);
            } catch (NumberFormatException e) {
                System.out.println("Please provide a valid integer input.");
            }
        } else {
            System.out.println("No input provided.");
        }
    }
}