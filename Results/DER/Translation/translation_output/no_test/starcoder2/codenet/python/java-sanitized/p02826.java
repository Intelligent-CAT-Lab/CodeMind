import java.io.*;
import java.util.*;

public class p02826 {
    static int MOD = 998244353;
    static int U = 100000;
    static int[] fact = new int[U];
    static int[] fact_inv = new int[U];
    static int[] inv = new int[U];

    static void make_fact() {
        fact[0] = 1;
        for (int i = 1; i < U; i++) {
            fact[i] = (int) ((long) fact[i - 1] * i % MOD);
        }
        fact_inv[U - 1] = pow(fact[U - 1], MOD - 2);
        for (int i = U - 2; i >= 0; i--) {
            fact_inv[i] = (int) ((long) fact_inv[i + 1] * (i + 1) % MOD);
        }
        for (int i = 1; i < U; i++) {
            inv[i] = (int) ((long) fact[i - 1] * fact_inv[i] % MOD);
        }
    }

    static int pow(int x, int n) {
        int res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = (int) ((long) res * x % MOD);
            }
            x = (int) ((long) x * x % MOD);
            n >>= 1;
        }
        return res;
    }

    static int[] fft_convolve(int[] f, int[] g) {
        int Lf = f.length;
        int Lg = g.length;
        int L = Lf + Lg - 1;
        int fft_len = 1 << L >>> 31;
        int[] fl = new int[fft_len];
        int[] fh = new int[fft_len];
        int[] gl = new int[fft_len];
        int[] gh = new int[fft_len];
        for (int i = 0; i < Lf; i++) {
            fl[i] = f[i] & 0x7FFF;
            fh[i] = f[i] >>> 15;
        }
        for (int i = 0; i < Lg; i++) {
            gl[i] = g[i] & 0x7