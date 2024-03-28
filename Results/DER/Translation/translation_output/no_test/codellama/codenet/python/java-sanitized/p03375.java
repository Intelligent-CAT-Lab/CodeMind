import java.util.Scanner;
import java.math.BigInteger;

public class p03375 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int MOD = sc.nextInt();

        BigInteger[][] B = new BigInteger[N + 1][N + 1];
        BigInteger[] pow_2 = new BigInteger[N + 1];
        BigInteger[] pow_pow = new BigInteger[N + 1];
        BigInteger[] fact = new BigInteger[N + 1];
        BigInteger[] fact_inv = new BigInteger[N + 1];
        BigInteger[] comb = new BigInteger[N + 1];

        B[0][0] = BigInteger.ONE;
        for (int n = 1; n <= N; n++) {
            B[n][1] = B[n - 1][0];
            B[n][1] = B[n - 1][1] * BigInteger.valueOf(n) % MOD;
            B[n][1] = B[n - 1][1] * BigInteger.valueOf(n) % MOD;
        }

        pow_2[0] = BigInteger.ONE;
        for (int n = 1; n <= N; n++) {
            pow_2[n] = pow_2[n - 1] * BigInteger.valueOf(2) % MOD;
        }

        pow_pow[0] = BigInteger.ONE;
        for (int n = 1; n <= N; n++) {
            pow_pow[n] = pow_pow[n - 1] * pow_pow[n - 1] % MOD;
        }

        fact[0] = BigInteger.ONE;
        for (int n = 1; n <= N; n++) {
            fact[n] = fact[n - 1] * BigInteger.valueOf(n) % MOD;
        }

        fact_inv[N] = BigInteger.valueOf(fact[N]).modInverse(MOD);
        for (int n = N; n >= 1; n--) {
            fact_inv[n - 1] = fact_inv[n] * BigInteger.valueOf(n) % MOD;
        }

        comb[0] = BigInteger.ONE;
        for (int n = 1; n <= N; n++) {
            comb[n] = fact_inv[n] * fact_inv[n - 1] % MOD;
        }

        BigInteger[] A = new BigInteger[N + 1];
        for (int n = 0; n <= N; n++) {
            A[n] = B[n][1] * (pow_2[n] + pow_2[n - 1] * BigInteger.valueOf(n) % MOD) % MOD;
        }

        for (int n = 0; n <= N; n++) {
            A[n] = A[n] * comb[n] % MOD;
        }

        BigInteger answer = BigInteger.valueOf(2).modPow(BigInteger.valueOf(N).modPow(MOD - 1, MOD), MOD);
        for (int n = 0; n <= N; n++) {
            answer = answer.subtract(A[n]);
        }
        answer = answer.mod(MOD);

        System.out.println(answer);
    }
}