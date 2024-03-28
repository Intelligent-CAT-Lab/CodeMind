import java.math.BigInteger;
import java.util.Scanner;

public class p02335 {
    
    public static final BigInteger MOD = BigInteger.valueOf(1000000007);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println((n < k) ? C(k, n).mod(MOD) : (n > k) ? 0 : 1);
    }

    // Function to calculate P(n, r) i.e., Permutations of n items taken r at a time
    private static BigInteger P(int n, int r) {
        return factorial(n).divide(factorial(n - r));
    }

    // Function to calculate C(n, r) i.e., Combinations of n items taken r at a time
    private static BigInteger C(int n, int r) {
        return P(n, r).divide(factorial(r));
    }

    // Function to calculate factorial of a number
    private static BigInteger factorial(int number) {
        BigInteger result = BigInteger.ONE;
        for (int factor = 2; factor <= number; factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }
        return result;
    }
}