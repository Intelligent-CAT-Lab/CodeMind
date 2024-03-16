<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
    static int N, MOD;
    static long[] fact, fact_inv, inv;
    static long[] f, g;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        MOD = Integer.parseInt(str[1]);
        fact = new long[100000];
        fact_inv = new long[100000];
        inv = new long[100000];
        fact[0] = fact_inv[0] = inv[0] = 1;
        for (int i = 1; i < 100000; i++) {
            fact[i] = fact[i - 1] * i % MOD;
            fact_inv[i] = fact_inv[MOD % i] * pow(MOD - 2, MOD / i) % MOD;
            inv[i] = pow(fact[i], MOD - 2, MOD);
        }
        f = new long[N + N + 10];
        for (int x = 1; x <= N / 2; x++) {
            for (int i = x; i < N + N; i += x) {
                f[i] += 2 * inv[1 + (i - x) / x];
            }
        }
        if (N % 2 == 1) {
            for (int i = (N + 1) / 2; i < N + N; i += (N + 1) / 2) {
                f[i] += inv[1 + (i - (N + 1) / 2) / ((N + 1) / 2)];
            }
        }
        g = new long[N + N + 10];
        g[0] = 1;
        for (int i = 1; i < N + N; i++) {
            g[i] = g[i - 1] * fact[i - 1] % MOD;
        }
        g = fps_exp(f);
        System.out.println(g[N]);
    }
    static long pow(long a, long b, long mod) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) ==
