import java.util.*;
import java.math.*;

public class p03375 {
    static final BigInteger MOD = BigInteger.valueOf((long)1e9+7);
    static BigInteger[] fact, fact_inv;
    static int N;

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
        return fact[N].multiply(fact_inv[n]).mod(MOD).multiply(fact_inv[N-n]).mod(MOD);
    }

    static BigInteger solve() {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        fact = new BigInteger[N+1];
        fact_inv = new BigInteger[N+1];
        fact[0] = BigInteger.ONE;
        fact_inv[0] = BigInteger.ONE;
        for (int i = 1; i <= N; i++) {
            fact[i] = fact[i-1].multiply(BigInteger.valueOf(i)).mod(MOD);
            fact_inv[i] = pow(fact[i], MOD.subtract(BigInteger.TWO));
        }
        BigInteger[] B = new BigInteger[N+1];
        B[0] = BigInteger.ONE;
        for (int n = 1; n <= N; n++) {
            B[n] = B[n-1].multiply(BigInteger.valueOf(n)).mod(MOD);
            for (int i = 1; i < n; i++) {
                B[n] = B[n].add(B[n-1].multiply(BigInteger.valueOf(i)).mod(MOD)).mod(MOD);
            }
        }
        BigInteger[] A = new BigInteger[N+1];
        A[0] = BigInteger.ONE;
        for (int n = 1; n <= N; n++) {
            A[n] = BigInteger.ZERO;
            for (int i = 0; i <= n; i++) {
                A[n] = A[n].add(B[i].multiply(pow(BigInteger.valueOf(2), BigInteger.valueOf(n-i))).mod(MOD)).mod(MOD);
            }
            A[n] = A[n].multiply(pow(BigInteger.valueOf(2), MOD.subtract(BigInteger.valueOf(n)))).mod(MOD);
        }
        BigInteger res = BigInteger.ZERO;
        for (int i = 0; i <= N; i++) {
            res = res.add(A[i].multiply(comb(i)).mod(MOD)).mod(MOD);
        }
        res = pow(BigInteger.valueOf(2), pow(BigInteger.valueOf(2), BigInteger.valueOf(N).subtract(BigInteger.ONE))).subtract(res);
        return res.mod(MOD);
    }

    public static void main(String[] args) {
        System.out.println(solve());
    }
}