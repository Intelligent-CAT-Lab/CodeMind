public class p03697 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide two numbers separated by a space.");
            return;
        }

        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int sum = a + b;

            if (sum >= 10) {
                System.out.println("error");
            } else {
                System.out.println(sum);
            }
        } catch (NumberFormatException e) {
            System.out.println("Both inputs must be valid integers.");
        }
    }
}