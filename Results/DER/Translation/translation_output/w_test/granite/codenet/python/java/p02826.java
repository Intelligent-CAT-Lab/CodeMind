System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 998244353

Expected output:
3


```
import sys
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

import numpy as np

N,MOD = map(int,read().split())

def cumprod(A, MOD = MOD):
    L = len(A); Lsq = int(L**.5+1)
    A = np.resize(A, Lsq**2).reshape(Lsq,Lsq)
    for n in range(1,Lsq):
        A[:,n] *= A[:,n-1]; A[:,n] %= MOD
    for n in range(1,Lsq):
        A[n] *= A[n-1,-1]; A[n] %= MOD
    return A.ravel()[:L]
def make_fact(U, MOD = MOD):
    x = np.arange(U, dtype = np.int64); x[0] = 1
    fact = cumprod(x, MOD)
    x = np.arange(U, 0, -1, dtype=np.int64); x[0] = pow(int(fact[-1]), MOD-2, MOD)
    fact_inv = cumprod(x, MOD)[::-1]
    return fact,fact_inv

U = 10 ** 5
fact, fact_inv = make_fact(U)
inv = np.zeros(U,np.int64)
inv[1:] = fact[:-1] * fact_inv[1:] % MOD

def fft_convolve(f, g, MOD = MOD):
    """
    æ°å (å¤é å¼) f, g ã®ç³ã¿è¾¼ã¿ã®è¨ç®ï¼ä¸ä¸ 15 bitãã¤åãã¦è¨ç®ãããã¨ã§ï¼
    30 bitä»¥ä¸ã®æ´æ°ï¼é·ã 250000 ç¨åº¦ã®æ°åã§ã®è¨ç®ãæ­£ç¢ºã«è¡ããï¼
    """
    fft = np.fft.rfft; ifft = np.fft.irfft
    Lf = len(f); Lg = len(g); L = Lf + Lg - 1
    fft_len = 1 << L.bit_length()
    fl = f & (1 << 15) - 1; fh = f >> 15
    gl = g & (1 << 15) - 1; gh = g >> 15
    conv = lambda f,g: ifft(fft(f,fft_len) * fft(g,fft_len))[:L]
    x = conv(fl, gl) % MOD
    y = conv(fl+fh, gl+gh) % MOD
    z = conv(fh, gh) % MOD
    a, b, c = map(lambda x: (x +.5).astype(np.int64), [x,y,z])
    return (a + ((b - a - c) << 15) + (c << 30)) % MOD

def fps_exp(h,MOD=MOD):
    # é¢åãªã®ã§2ã¹ãã«
    L = len(h)
    i = (L-1).bit_length()
    N = (1 << i)
    h = np.resize(h,N)
    dh = np.empty_like(h)
    dh[0:N-1] = h[1:N] * np.arange(1,N,dtype=np.int64) % MOD
    f = np.zeros_like(h); g = np.zeros_like(h)
    f[:2] = np.array([1,h[1]],np.int64); g[0] = 1; m = 2
    while m <= N//2:
        fg = fft_convolve(f[:m],g[:m],MOD)[:m]
        fgg = fft_convolve(fg,g[:m],MOD)[:m]
        g[:m] *= 2; g[:m] -= fgg; g %= MOD
        q = dh[:m-1]
        s = np.zeros(m+m,np.int64); s[1:m] = f[1:m] * np.arange(1,m,dtype=np.int64) % MOD
        r = fft_convolve(f[:m],q,MOD)
        s[1:1+len(r)] -= r
        s[0:m] += s[m:m+m]
        s = s[:m] % MOD
        t = fft_convolve(g[:m],s,MOD)[:m]
        t *= inv[m:m+m]; t %= MOD
        u = h[m:m+m] - t; u %= MOD
        v = fft_convolve(f,u,MOD)[:m]
        f[m:m+m] += v
        m *= 2
    return f[:L]

f = np.zeros((N+N+10),np.int64)
for x in range(1,N//2+1):
    f[x::x] += 2 * inv[1:(len(f)-1) // x + 1]
if N & 1:
    x = (N+1)//2
    f[x::x] += inv[1:(len(f)-1) // x + 1]

g = fps_exp(f)
answer = g[:N].sum() % MOD
print(answer)
```


Answer:
```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int mod = Integer.parseInt(in[1]);
        long[] fact = new long[n + 1];
        long[] inv = new long[n + 1];
        fact[0] = 1;
        inv[1] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i % mod;
        }
        for (int i = 2; i <= n; i++) {
            inv[i] = mod - inv[mod % i] * (mod / i) % mod;
        }
        long[] f = new long[n + 1];
        for (int i = 1; i <= n / 2; i++) {
            for (int j = i; j <= n; j += i) {
                f[j] += inv[i] * 2;
                f[j] %= mod;
            }
        }
        if (n % 2 == 1) {
            for (int i = 1; i <= n; i += i) {
                f[i] += inv[i];
                f[i] %= mod;
            }
        }
        long[] g = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            g[i] = inv[i];
        }
        long[] h = multiply(f, g, mod);
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += h[i];
            ans %= mod;
        }
        System.out.println(ans);
    }

    static long[] multiply(long[] a, long[] b, int mod) {
        int n = 1;
        while (n < a.length + b.length - 1) {
            n *= 2;
        }
        long[] fa = new long[n];
        long[] fb = new long[n];
        for (int i = 0; i < a.length; i++) {
            fa[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            fb[i] = b[i];
        }
        fft(fa, false, mod);
        fft(fb, false, mod);
        for (int i = 0; i < n; i++) {
            fa[i] = fa[i] * fb[i] % mod;
        }
        fft(fa, true, mod);
        long[] ret = new long[a.length + b.length - 1];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = fa[i];
        }
        return ret;
    }

    static void fft(long[] a, boolean inverse, int mod) {
        int n = a.length;
        int m = Integer.numberOfTrailingZeros(n);
        for (int i = 0; i < n; i++) {
            int j = Integer.reverse(i) >>> (32 - m);
            if (i < j) {
                long temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        for (int len = 2; len <= n; len *= 2) {
            long w = inverse? pow(3, mod - 1 - (mod - 1) / len, mod) : pow(3, (mod - 1) / len, mod);
            for (int i = 0; i < n; i += len) {
                long wn = 1;
                for (int j = 0; j < len / 2; j++) {
                    long u = a[i + j];
                    long v = a[i + j + len / 2] * wn % mod;
                    a[i + j] = u + v;
                    a[i + j] %= mod;
                    a[i + j + len / 2] = u - v;
                    a[i + j + len / 2] += mod;
                    a[i + j + len / 2] %= mod;
                    wn = wn * w % mod;
                }
            }
        }
        if (inverse) {
            long invn = pow(n, mod - 2, mod);
            for (int i = 0; i < n; i++) {
                a[i] = a[i] * invn % mod;
            }
        }
    }

    static long pow(long a, long b, int mod) {
        long ret = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                ret = ret * a % mod;
            }
            a = a * a % mod;
            b /= 2;
        }
        return ret;
    }
}
```<|endoftext|>
