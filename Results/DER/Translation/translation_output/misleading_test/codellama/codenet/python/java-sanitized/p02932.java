import java.util.Scanner;
import java.math.BigInteger;

public class p02932 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int L = sc.nextInt();
        int R = sc.nextInt();
        int MOD = 1000000007;

        BigInteger[] fact = new BigInteger[N + 1];
        BigInteger[] fact_inv = new BigInteger[N + 1];
        BigInteger[] comb = new BigInteger[N + 1];
        BigInteger[] P = new BigInteger[R + 1];
        BigInteger[] Q = new BigInteger[R + 1];

        fact[0] = BigInteger.ONE;
        fact_inv[0] = BigInteger.ONE;
        for (int n = 1; n <= N; n++) {
            fact[n] = fact[n - 1].multiply(BigInteger.valueOf(n));
            fact_inv[n] = fact_inv[n - 1].multiply(BigInteger.valueOf(n)).mod(MOD);
        }

        for (int n = 0; n <= N; n++) {
            comb[n] = fact[n].multiply(fact_inv[n]).mod(MOD);
        }

        for (int i = M; i <= R; i++) {
            P[i] = comb[i].multiply(fact_inv[i]).mod(MOD);
        }

        for (int i = 0; i <= R; i++) {
            Q[i] = fact[i + N].multiply(fact_inv[i]).mod(MOD);
        }

        BigInteger total = fact[R + N].multiply(fact_inv[R]).mod(MOD).multiply(fact_inv[N]).mod(MOD);
        BigInteger x = Q[R].multiply(P[R]).mod(MOD);
        BigInteger coef = fact[N].multiply(fact_inv[M]).mod(MOD).multiply(fact_inv[N - M]).mod(MOD);
        BigInteger answer = (total.subtract(x.multiply(coef))).mod(MOD);

        System.out.println(answer);
    }
}