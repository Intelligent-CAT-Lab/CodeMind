

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static int MOD = 998244353;
    static int U = 100000;
    static int[] fact, fact_inv, inv;
    static int[] fft_convolve(int[] f, int[] g) {
        int Lf = f.length, Lg = g.length, L = Lf + Lg - 1;
        int fft_len = 1 << L.bitLength();
        int[] fl = new int[fft_len], fh = new int[fft_len];
        int[] gl = new int[fft_len], gh = new int[fft_len];
        for (int i = 0; i < Lf; i++) {
            fl[i] = f[i] & ((1 << 15) - 1);
            fh[i] = f[i] >> 15;
        }
        for (int i = 0; i < Lg; i++) {
            gl[i] = g[i] & ((1 << 15) - 1);
            gh[i] = g[i] >> 15;
        }
        int[] x = conv(fl, gl);
        int[] y = conv(add(fl, fh), add(gl, gh));
        int[] z = conv(fh, gh);
        int[] a = new int[L], b = new int[L], c = new int[L];
        for (int i = 0; i < L; i++) {
            a[i] = (x[i] + 0.5) % MOD;
            b[i] = (y[i] + 0.5) % MOD;
            c[i] = (z[i] + 0.5) % MOD;
        }
        int[] ret = new int[L];
        for (int i = 0; i < L; i++) {
            ret[i] = (a[i] + ((b[i] - a[i] - c[i]) << 15) + (c[i] << 30)) % MOD;
        }
        return ret;
    }
    static int[] conv(int[] f, int[] g) {
