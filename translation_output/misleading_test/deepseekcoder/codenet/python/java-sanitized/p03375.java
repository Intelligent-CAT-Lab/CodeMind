import java.util.*;
import java.math.*;

public class p03375 {
    static final BigInteger MOD = BigInteger.valueOf(1000000007);
    static BigInteger[] fact, fact_inv;

    static BigInteger pow(BigInteger a, BigInteger b) {
        BigInteger res = BigInteger.ONE;
        while (!b.equals(BigInteger.ZERO)) {
            if (b.testBit(0)) {
                res = res.multiply(a).mod(MOD);
            }
            a = a.multiply(a).mod(MOD);
            b = b.shiftRight(1);
        }
        return res;
    }

    static BigInteger comb(int n) {
        return fact[n].multiply(fact_inv[n]).mod(MOD);
    }

    static BigInteger solve(int N) {
        BigInteger[] B = new BigInteger[N+1];
        B[0] = BigInteger.ONE;
        for (int n = 1; n <= N; ++n) {
            B[n] = B[n-1].shiftLeft(1).mod(MOD);
            for (int l = 1; l <= n; ++l) {
                B[n] = B[n].add(B[n-1].multiply(BigInteger.valueOf(l))).mod(MOD);
            }
        }

        BigInteger[] pow_2 = new BigInteger[N+1];
        pow_2[0] = BigInteger.ONE;
        for (int n = 1; n <= N; ++n) {
            pow_2[n] = pow_2[n-1].shiftLeft(1).mod(MOD);
        }

        BigInteger[] A = new BigInteger[N+1];
        for (int n = 1; n <= N; ++n) {
            A[n] = BigInteger.ZERO;
            for (int l = 1; l <= n; ++l) {
                A[n] = A[n].add(B[n-1].multiply(pow_2[l-1].add(pow_2[n-l].multiply(BigInteger.valueOf(l))).mod(MOD))).mod(MOD);
            }
            A[n] = A[n].multiply(pow(BigInteger.valueOf(2),MOD.subtract(BigInteger.valueOf(n)))).mod(MOD);
        }

        fact = new BigInteger[N+1];
        fact_inv = new BigInteger[N+1];
        fact[0] = BigInteger.ONE;
        fact_inv[0] = BigInteger.ONE;
        for (int n = 1; n <= N; ++n) {
            fact[n] = fact[n-1].multiply(BigInteger.valueOf(n)).mod(MOD);
            fact_inv[n] = fact_inv[n-1].multiply(BigInteger.valueOf(n)).mod(MOD);
        }
        fact_inv[N] = pow(fact[N],MOD.subtract(BigInteger.valueOf(2)));
        for (int n = N; n > 0; --n) {
            fact_inv[n-1] = fact_inv[n-1].multiply(BigInteger.valueOf(n)).mod(MOD);
        }

        BigInteger answer = BigInteger.ONE.shiftLeft(N).subtract(A[N].multiply(comb(N))).mod(MOD);
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);