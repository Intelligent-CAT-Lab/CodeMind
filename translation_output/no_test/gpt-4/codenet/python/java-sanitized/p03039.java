import java.util.Scanner;
import java.math.BigInteger;

public class p03039 {

    private static final int INF = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        long ans = 0;
        
        if (n <= m) {
            long M = -((m - 1) * m * (2 * m - 1) / 3) + m * m * (m - 1);
            long Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
            M = M % INF;
            Ms = Ms % INF;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    if (i == j) {
                        ans += Ms;
                    } else {
                        long d = j - i;
                        ans += d * m * m + M;
                    }
                    ans %= INF;
                }
            }
        } else {
            int temp = n;
            n = m;
            m = temp;
            long M = -((m - 1) * m * (2 * m - 1) / 3) + m * m * (m - 1);
            long Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
            M = M % INF;
            Ms = Ms % INF;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    if (i == j) {
                        ans += Ms;
                    } else {
                        long d = j - i;
                        ans += d * m * m + M;
                    }
                    ans %= INF;
                }
            }
        }

        // using BigInteger for factorial calculations as they can be very large
        BigInteger factorial_n_m = factorial(n * m - 2);
        BigInteger factorial_n_m_k = factorial(n * m - k);
        BigInteger factorial_k = factorial(k - 2);
        BigInteger comb = factorial_n_m.divide(factorial_n_m_k.multiply(factorial_k));
        
        ans = (comb.multiply(BigInteger.valueOf(ans)).mod(BigInteger.valueOf(INF))).longValue();

        System.out.println(ans);
    }

    // Helper method to calculate factorial using BigInteger
    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}