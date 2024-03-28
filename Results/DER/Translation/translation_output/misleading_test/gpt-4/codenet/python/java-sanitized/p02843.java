public class p02843 {
    public static void main(String[] args) {
        // Get the input number from command-line arguments
        int N = Integer.parseInt(args[0]);
        
        // Compute quotient and remainder
        int q = N / 100;
        int mod = N % 100;
        
        // Output the result according to the logic provided
        System.out.println(mod <= q * 5 ? 1 : 0);
    }
}