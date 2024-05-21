import java.util.*;
import java.io.*;
import java.math.*;

public class p02826 {
    static final int MOD = 998244353;
    static final int U = (int) 1e5;
    static final int[] fact = new int[U + 1];
    static final int[] fact_inv = new int[U + 1];
    static final int[] inv = new int[U + 1];

    static {
        fact[0] = 1;
        for (int i = 1; i <= U; i++) {
            fact[i] = (int) ((long) fact[i - 1] * i % MOD);
        }
        fact_inv[U] = BigInteger.valueOf(fact[U]).modInverse(BigInteger.valueOf(MOD)).intValue();
        for (int i = U - 1; i >= 0; i--) {
            fact_inv[i] = (int) ((long) fact_inv[i + 1] * (i + 1) % MOD);
        }
        for (int i = 1; i <= U; i++) {
            inv[i] = (int) ((long) fact_inv[i] * fact[i - 1] % MOD);
        }
    }

    static int[] cumprod(int[] A, int MOD) {
        int L = A.length;
        int Lsq = (int) Math.sqrt(L) + 1;
        A = Arrays.copyOf(A, Lsq * Lsq);
        for (int n = 1; n < Lsq; n++) {
            A[n * Lsq + n - 1] = (A[n * Lsq + n - 1] * A[n * Lsq + n - 2]) % MOD;
        }
        for (int n = 1; n < Lsq; n++) {
            A[n * Lsq + n - 1] = (A[n * Lsq + n - 1] * A[n * Lsq + n - 1]) % MOD;
        }
        return Arrays.copyOfRange(