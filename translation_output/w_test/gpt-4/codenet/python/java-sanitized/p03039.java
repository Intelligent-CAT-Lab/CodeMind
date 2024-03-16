import java.util.Scanner;
import java.math.BigInteger;

public class p03039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int ans = 0;
        final int INF = 1000000007;

        if (n <= m) {
            int M = -((m - 1) * m * (2 * m - 1) / 3) + m * m * (m - 1);
            int Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
            M = M % INF;
            Ms = Ms % INF;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    if (i == j) {
                        ans = ans + Ms;
                    } else {
                        int d = j - i;
                        ans = ans + d * m * m + M;
                    }
                    ans = ans % INF;
                }
            }
        } else {
            int temp = n;
            n = m;
            m = temp;
            int M = -((m - 1) * m * (2 * m - 1) / 3) + m * m * (m - 1);
            int Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
            M = M % INF;
            Ms = Ms % INF;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    if (i == j) {
                        ans = ans + Ms;
                    } else {
                        int d = j - i;
                        ans = ans + d * m * m + M;
                    }
                    ans = ans % INF;
                }
            }
        }

        BigInteger factorialNMinusTwo = factorial(n * m - 2);
        BigInteger factorialNMMinusK = factorial(n * m - k);
        BigInteger factorialKMinusTwo = factorial(k - 2);
        ans = factorialNMinusTwo.divide(factorialNMMinusK.multiply(factorialKMinusTwo)).intValue() * ans;
        ans = ans % INF;

        System.out.println(ans);
    }

    private static BigInteger factorial(int number) {
        BigInteger result = BigInteger.ONE;
        for (int factor = 2; factor <= number; factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }
        return result;
    }
}