import java.util.Scanner;
import java.math.BigInteger;

public class p02668 {
    private static final int MOD = (int) (1e9 + 7);
    private static int N;
    private static int M;
    private static BigInteger[] pow2;
    private static BigInteger[] ipow2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        // Precompute power and inverse power arrays.
        pow2 = makePower(2, M + 10);
        ipow2 = makePower((1 + MOD) / 2, M + 10);

        BigInteger[] dp = new BigInteger[M + 1];
        for (int i = 0; i <= M; i++) {
            dp[i] = pow2[i];
        }

        for (int i = 0; i < N - 1; i++) {
            update(dp);
        }

        System.out.println(dp[M]);
        scanner.close();
    }

    private static BigInteger[] makePower(int a, int L) {
        int B = Integer.toBinaryString(L).length();
        BigInteger[] x = new BigInteger[1 << B];
        BigInteger biA = BigInteger.valueOf(a);
        x[0] = BigInteger.ONE;
        for (int n = 0; n < B; n++) {
            int pow2n = 1 << n;
            for (int i = pow2n; i < 1 << (n + 1); i++) {
                x[i] = x[i - pow2n].multiply(biA).mod(BigInteger.valueOf(MOD));
            }
            biA = biA.multiply(biA).mod(BigInteger.valueOf(MOD));
        }

        BigInteger[] result = new BigInteger[L];
        System.arraycopy(x, 0, result, 0, L);
        return result;
    }

    private static void update(BigInteger[] dp) {
        BigInteger[] B = dp.clone();
        BigInteger[] C = new BigInteger[M + 1];
        
        for (int i = 0; i <= M; i++) {
            C[i] = B[i].multiply(BigInteger.valueOf(i)).multiply(ipow2[i]).mod(BigInteger.valueOf(MOD));
        }
        
        for (int i = 1; i <= M; i++) {
            dp[i] = C[i - 1];
            if (i > 1) {
                dp[i] = dp[i].add(dp[i - 1]);
            }
            dp[i] = dp[i].mod(BigInteger.valueOf(MOD));
        }
        
        for (int i = 1; i <= M; i++) {
            dp[i] = dp[i].multiply(pow2[i]).mod(BigInteger.valueOf(MOD));
        }
        
        for (int i = 1; i <= M; i++) {
            dp[i] = dp[i].add(BigInteger.valueOf(i).multiply(B[i])).mod(BigInteger.valueOf(MOD));
        }
    }

    private static BigInteger modInverse(BigInteger a, BigInteger m) {
        return a.modInverse(m);
    }
}