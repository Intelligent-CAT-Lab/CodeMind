import java.util.Scanner;
import java.math.BigInteger;

public class p03039 {
    private static final BigInteger INF = BigInteger.valueOf(1000000007);

    private static BigInteger factorial(int number) {
        BigInteger result = BigInteger.ONE;
        for (int factor = 2; factor <= number; factor++) {
            result = result.multiply(BigInteger.valueOf(factor)).mod(INF);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        BigInteger ans = BigInteger.ZERO;

        if (n <= m) {
            BigInteger M = BigInteger.valueOf(-((m - 1) * m * (2 * m - 1) / 3) + m * m * (m - 1)).mod(INF);
            BigInteger Ms = BigInteger.valueOf(m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6).mod(INF);
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    if (i == j) {
                        ans = ans.add(Ms);
                    } else {
                        int d = j - i;
                        ans = ans.add(M).add(BigInteger.valueOf(d).multiply(BigInteger.valueOf(m).pow(2)));
                    }
                    ans = ans.mod(INF);
                }
            }
        } else {
            int temp = n;
            n = m;
            m = temp;
            BigInteger M = BigInteger.valueOf(-((m - 1) * m * (2 * m - 1) / 3) + m * m * (m - 1)).mod(INF);
            BigInteger Ms = BigInteger.valueOf(m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6).mod(INF);
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    if (i == j) {
                        ans = ans.add(Ms);
                    } else {
                        int d = j - i;
                        ans = ans.add(M).add(BigInteger.valueOf(d).multiply(BigInteger.valueOf(m).pow(2)));
                    }
                    ans = ans.mod(INF);
                }
            }
        }

        BigInteger factorialNumerator = factorial(n * m - 2);
        BigInteger factorialDenominator = factorial(n * m - k).multiply(factorial(k - 2)).mod(INF);
        ans = ans.multiply(factorialNumerator)
                 .divide(factorialDenominator)
                 .mod(INF);

        System.out.println(ans.intValue());
        scanner.close();
    }
}