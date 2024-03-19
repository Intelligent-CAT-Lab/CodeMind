import java.util.Scanner;
import java.math.BigInteger;

public class p02668 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        BigInteger pow2 = BigInteger.ONE;
        BigInteger ipow2 = BigInteger.ONE;
        BigInteger[] dp = new BigInteger[M + 1];
        for (int i = 0; i <= M; i++) {
            dp[i] = pow2.multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(1000000007));
        }
        for (int i = 0; i < N - 1; i++) {
            update(dp);
        }
        System.out.println(dp[M]);
    }

    public static void update(BigInteger[] dp) {
        BigInteger[] B = new BigInteger[dp.length];
        BigInteger[] C = new BigInteger[dp.length];
        for (int i = 0; i < dp.length; i++) {
            B[i] = dp[i].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(1000000007));
            C[i] = dp[i].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(1000000007));
        }
        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp[i].add(B[i - 1]).mod(BigInteger.valueOf(1000000007));
        }
        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp[i].multiply(pow2[i]).mod(BigInteger.valueOf(1000000007));
        }
    }
}