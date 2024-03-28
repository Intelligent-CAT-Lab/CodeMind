public class p02612 {
    public static void main(String[] args) {
        // Assuming the input is provided as a command-line argument.
        int n = Integer.parseInt(args[0]);
        int result = 1000 - n % 1000;
        if (n % 1000 == 0) result = 0;
        System.out.println(result);
    }
}