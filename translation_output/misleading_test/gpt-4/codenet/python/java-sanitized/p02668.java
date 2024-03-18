import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class p02668 {
    static final int MOD = (int) 1e9 + 7;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        BigInteger[] pow2 = makePower(BigInteger.valueOf(2), M + 10);
        BigInteger[] ipow2 = makePower(BigInteger.valueOf((1 + MOD) / 2), M + 10);

        BigInteger[] dp = Arrays.copyOfRange(pow2, 0, M + 1);

        for (int i = 0; i < N - 1; i++) {
            update(dp, M, pow2, ipow2);
        }

        System.out.println(dp[M]);
    }
    
    static BigInteger[] makePower(BigInteger a, int L) {
        int B = Integer.SIZE - Integer.numberOfLeadingZeros(L);
        BigInteger[] x = new BigInteger[1 << B];
        x[0] = BigInteger.ONE;
        for (int n = 0; n < B; n++) {
            BigInteger b = a.pow(1 << n).mod(BigInteger.valueOf(MOD));
            int limit = 1 << (n + 1);
            for (int j = 1 << n; j < limit; j++) {
                x[j] = x[j - (1 << n)].multiply(b).mod(BigInteger.valueOf(MOD));
            }
            a = a.multiply(a).mod(BigInteger.valueOf(MOD));
        }
        return Arrays.copyOf(x, L);
    }

    static void update(BigInteger[] dp, int M, BigInteger[] pow2, BigInteger[] ipow2) {
        BigInteger[] B = dp.clone();
        for (int i = 0; i <= M; i++) {
            dp[i] = dp[i].multiply(BigInteger.valueOf(i)).multiply(ipow2[i]).mod(BigInteger.valueOf(MOD));
        }
        for (int i = 1; i <= M; i++) {
            dp[i] = dp[i].add(dp[i - 1]).mod(BigInteger.valueOf(MOD));
        }
        for (int i = 1; i <= M; i++) {
            dp[i] = dp[i].multiply(pow2[i]).mod(BigInteger.valueOf(MOD));
        }
        for (int i = 1; i <= M + 1; i++) {
            dp[i] = dp[i].add(BigInteger.valueOf(i).multiply(B[i - 1])).mod(BigInteger.valueOf(MOD));
        }
    }
}