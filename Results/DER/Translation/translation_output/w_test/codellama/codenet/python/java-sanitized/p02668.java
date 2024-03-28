import java.util.Scanner;
import java.math.BigInteger;

public class p02668 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        BigInteger[] pow2 = new BigInteger[M + 10];
        BigInteger[] ipow2 = new BigInteger[M + 10];
        BigInteger[] dp = new BigInteger[M + 1];
        BigInteger[] B = new BigInteger[M + 1];
        BigInteger[] C = new BigInteger[M + 1];
        BigInteger MOD = new BigInteger("1000000007");

        pow2[0] = BigInteger.ONE;
        ipow2[0] = BigInteger.ONE;
        for (int i = 1; i <= M; i++) {
            pow2[i] = pow2[i - 1].multiply(BigInteger.valueOf(2)).mod(MOD);
            ipow2[i] = ipow2[i - 1].multiply(BigInteger.valueOf((1 + MOD) / 2)).mod(MOD);
        }

        dp[0] = pow2[0];
        for (int i = 1; i <= M; i++) {
            B[i] = dp[i - 1];
            C[i] = dp[i - 1].multiply(BigInteger.valueOf(i)).mod(MOD).multiply(ipow2[i]).mod(MOD);
            dp[i] = dp[i - 1].add(C[i]).mod(MOD);
        }

        for (int i = 0; i < N - 1; i++) {
            update(dp);
        }

        System.out.println(dp[M]);
    }

    public static void update(BigInteger[] dp) {
        BigInteger[] B = new BigInteger[dp.length];
        BigInteger[] C = new BigInteger[dp.length];
        for (int i = 1; i < dp.length; i++) {
            B[i] = dp[i - 1];
            C[i] = dp[i - 1].multiply(BigInteger.valueOf(i)).mod(MOD).multiply(ipow2[i]).mod(MOD);
            dp[i] = dp[i - 1].add(C[i]).mod(MOD);
        }
    }
}