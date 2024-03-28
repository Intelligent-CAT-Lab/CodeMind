import java.math.BigInteger;
import java.util.Scanner;

public class p02335 {

    private static final int MOD = (int)(Math.pow(10,9) + 7);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println(n < k ? C(k, n).mod(BigInteger.valueOf(MOD))
                                 : (n > k ? 0 : 1));
        scanner.close();
    }

    private static BigInteger P(int n, int r) {
        return factorial(n).divide(factorial(n - r));
    }

    private static BigInteger C(int n, int r) {
        return P(n, r).divide(factorial(r));
    }

    private static BigInteger H(int n, int r) {
        return C(n + r - 1, r);
    }

    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}