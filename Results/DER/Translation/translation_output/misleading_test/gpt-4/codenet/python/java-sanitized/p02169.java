import java.util.Scanner;
import java.math.BigInteger;

public class p02169 {
    private static final int mod = 998244353;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        System.out.println(solve(m, n, k));
    }

    private static int solve(int m, int n, int k) {
        if (n < k || m < k) {
            return 0;
        }

        BigInteger ans = BigInteger.valueOf(m).modPow(BigInteger.valueOf(n), BigInteger.valueOf(mod));
        BigInteger[] p = new BigInteger[k + 1];
        for (int i = 0; i <= k; i++) {
            p[i] = BigInteger.valueOf(i).modPow(BigInteger.valueOf(n), BigInteger.valueOf(mod));
        }

        BigInteger c = BigInteger.valueOf(m);
        BigInteger[][] comb = new BigInteger[k + 1][];
        for (int i = 0; i <= k; i++) {
            comb[i] = new BigInteger[i + 1];
            for (int j = 0; j <= i; j++) {
                comb[i][j] = BigInteger.ZERO;
            }
        }

        comb[0][0] = BigInteger.ONE;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j <= i; j++) {
                comb[i + 1][j] = comb[i + 1][j].add(comb[i][j]);
                if (j + 1 <= i) {
                    comb[i + 1][j + 1] = comb[i + 1][j + 1].add(comb[i][j]);
                }
            }
        }

        for (int i = 1; i < k; i++) {
            BigInteger innerSum = BigInteger.ZERO;
            for (int j = i; j >= 1; j--) {
                BigInteger sign = (i + j) % 2 == 0 ? BigInteger.ONE : BigInteger.valueOf(-1);
                innerSum = innerSum.add(sign.multiply(comb[i][j]).multiply(p[j]));
            }

            innerSum = innerSum.multiply(c).mod(BigInteger.valueOf(mod));
            c = c.multiply(BigInteger.valueOf(m - i)).multiply(inverse(BigInteger.valueOf(i + 1)))
                    .mod(BigInteger.valueOf(mod));

            ans = ans.subtract(innerSum).add(BigInteger.valueOf(mod)).mod(BigInteger.valueOf(mod));
        }

        return ans.intValue();
    }

    private static BigInteger inverse(BigInteger x) {
        return x.modPow(BigInteger.valueOf(mod - 2), BigInteger.valueOf(mod));
    }
}