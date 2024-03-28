import java.util.*;
import java.math.BigInteger;

public class p02932 {
    static final BigInteger MOD = BigInteger.valueOf(1_000_000_007);
    static final int U = 6*1000*1000 + 100;
    static BigInteger[] fact = new BigInteger[U+1];
    static BigInteger[] fact_inv = new BigInteger[U+1];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int L = in.nextInt();
        int R = in.nextInt();

        fact[0] = BigInteger.ONE;
        for (int n = 1; n <= U; ++n) {
            fact[n] = fact[n-1].multiply(BigInteger.valueOf(n)).mod(MOD);
        }

        fact_inv[U] = fact[U].modInverse(MOD);
        for (int n = U; n > 0; --n) {
            fact_inv[n-1] = fact_inv[n].multiply(BigInteger.valueOf(n)).mod(MOD);
        }

        BigInteger[] comb = new BigInteger[U+1];
        for (int i = 0; i <= U; ++i) {
            comb[i] = fact[i].multiply(fact_inv[i]).mod(MOD);
        }

        for (int i = 1; i <= U; i += 2) {
            comb[i] = comb[i].multiply(BigInteger.valueOf(-1)).mod(MOD);
        }

        BigInteger[] P = new BigInteger[R+1];
        for (int i = M, x = 0; i <= U; ++i) {
            P[x++ % (R+1)] = P[x++ % (R+1)].add(comb[i]).mod(MOD);
        }

        BigInteger[] Q = new BigInteger[R+1];
        Q[0] = fact[N].mod(MOD);
        for (int i = 1; i <= R; ++i) {
            Q[i] = Q[i-1].multiply(BigInteger.valueOf(N+i)).mod(MOD).multiply(fact_inv[i]).mod(MOD);
        }

        System.out.println(f(R).subtract(f(L-1)).mod(MOD));
    }

    static BigInteger f(int R) {
        BigInteger total = fact[R+N].multiply(fact_inv[R]).mod(MOD).multiply(fact_inv[N]).mod(MOD);
        BigInteger x = BigInteger.ZERO;
        for (int i = 0; i < R; ++i) {
            x = x.add(Q[i].multiply(P[i]).mod(MOD));
        }
        BigInteger coef = fact[N].mod(MOD);
        return total.subtract(x.multiply(coef)).mod(MOD);
    }
}