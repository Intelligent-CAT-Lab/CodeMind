import java.util.*;
import java.math.*;

public class p02932 {
    static final int MOD = (int)1e9 + 7;
    static final int U = 6*100000 + 100;
    static BigInteger[] fact = new BigInteger[U+1];
    static BigInteger[] fact_inv = new BigInteger[U+1];
    static BigInteger[] comb = new BigInteger[U+1];
    static BigInteger[] P = new BigInteger[U+1];
    static BigInteger[] Q = new BigInteger[U+1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int L = sc.nextInt();
        int R = sc.nextInt();

        fact[0] = BigInteger.ONE;
        for (int n = 1; n <= U; n++) {
            fact[n] = fact[n-1].multiply(BigInteger.valueOf(n));
            fact[n] = fact[n].mod(BigInteger.valueOf(MOD));
        }

        fact_inv[U] = fact[U].modInverse(BigInteger.valueOf(MOD));
        for (int n = U; n > 0; n--) {
            fact_inv[n-1] = fact_inv[n].multiply(BigInteger.valueOf(n));
            fact_inv[n-1] = fact_inv[n-1].mod(BigInteger.valueOf(MOD));
        }

        int U_ = N - M;
        comb[0] = BigInteger.ONE;
        for (int n = 1; n <= U_; n++) {
            comb[n] = fact[U_].multiply(fact_inv[n].multiply(fact_inv[U_ - n]));
            comb[n] = comb[n].mod(BigInteger.valueOf(MOD));
        }

        for (int i = 0; i <= U_; i++) {
            P[i] = BigInteger.ZERO;
            for (int j = i; j <= U_; j += i + 1) {
                P[i] = P[i].add(comb[j]);
                P[i] = P[i].mod(BigInteger.valueOf(MOD));
            }
        }

        for (int i = 0; i <= U_; i++) {
            P[i] = P[i].subtract(P[i - M]);
            P[i] = P[i].mod(BigInteger.valueOf(MOD));
        }

        Q[0] = fact[N].multiply(fact_inv[N - M]).multiply(fact_inv[M]);
        Q[0] = Q[0].mod(BigInteger.valueOf(MOD));
        for (int r = 1; r <= R; r++) {
            Q[r] = Q[r-1].multiply(BigInteger.valueOf(N + r)).multiply(fact_inv[r]);
            Q[r] = Q[r].mod(BigInteger.valueOf(MOD));
        }

        BigInteger answer = f(R).subtract(f(L - 1));
        answer = answer.mod(BigInteger.valueOf(MOD));
        System.out.println(answer);
    }

    static BigInteger f(int R) {
        BigInteger total = fact[R + N].multiply(fact_inv[R]).multiply(fact_inv[N]);
        total = total.mod(BigInteger.valueOf(MOD));
        BigInteger x = BigInteger.ZERO;
        for (int i = 0; i <= R; i++) {
            x = x.add(Q[R - i].multiply(P[i]));
            x = x.mod(BigInteger.valueOf(MOD));
        }
        BigInteger coef = fact[N].multiply(fact_inv[M]).multiply(fact_inv[N - M]);
        coef = coef.mod(BigInteger.valueOf(MOD));
        BigInteger answer = total.subtract(x.multiply(coef));
        answer = answer.mod(BigInteger.valueOf(MOD));
        return answer;
    }
}