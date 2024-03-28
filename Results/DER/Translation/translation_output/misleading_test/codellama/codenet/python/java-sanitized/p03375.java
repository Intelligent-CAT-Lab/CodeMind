import java.util.Scanner;
import java.math.BigInteger;

public class p03375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int MOD = sc.nextInt();

        BigInteger[] B = new BigInteger[N + 1];
        B[0] = BigInteger.ONE;
        for (int n = 1; n <= N; n++) {
            B[n] = B[n - 1].multiply(BigInteger.valueOf(n)).mod(BigInteger.valueOf(MOD));
        }

        BigInteger[] pow_2 = new BigInteger[N + 1];
        pow_2[0] = BigInteger.ONE;
        for (int n = 1; n <= N; n++) {
            pow_2[n] = pow_2[n - 1].multiply(BigInteger.valueOf(2)).mod(BigInteger.valueOf(MOD));
        }

        BigInteger[] pow_pow = new BigInteger[N + 1];
        pow_pow[0] = BigInteger.ONE;
        for (int n = 1; n <= N; n++) {
            pow_pow[n] = pow_pow[n - 1].multiply(BigInteger.valueOf(2)).mod(BigInteger.valueOf(MOD));
        }

        BigInteger[] A = new BigInteger[N + 1];
        for (int n = 0; n <= N; n++) {
            A[n] = B[n].multiply(pow_2[n]).mod(BigInteger.valueOf(MOD));
        }

        BigInteger[] fact = new BigInteger[N + 1];
        fact[0] = BigInteger.ONE;
        for (int n = 1; n <= N; n++) {
            fact[n] = fact[n - 1].multiply(BigInteger.valueOf(n)).mod(BigInteger.valueOf(MOD));
        }

        BigInteger[] fact_inv = new BigInteger[N + 1];
        fact_inv[N] = BigInteger.valueOf(pow(fact[N], MOD - 2, MOD));
        for (int n = N - 1; n >= 0; n--) {
            fact_inv[n] = fact_inv[n + 1].multiply(BigInteger.valueOf(n + 1)).mod(BigInteger.valueOf(MOD));
        }

        BigInteger comb = fact_inv[0].multiply(fact_inv[N]).mod(BigInteger.valueOf(MOD));

        for (int n = 0; n <= N; n++) {
            A[n] = A[n].multiply(comb).mod(BigInteger.valueOf(MOD));
        }

        BigInteger answer = BigInteger.valueOf(2).modPow(BigInteger.valueOf(pow(2, N, MOD - 1)), BigInteger.valueOf(MOD)).subtract(A.sum()).mod(BigInteger.valueOf(MOD));

        System.out.println(answer);
    }
}