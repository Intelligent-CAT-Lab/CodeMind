System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 1

Expected output:
-54

```
import sys
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

import numpy as np

N,M,K = map(int,read().split())

MOD = 10 ** 9 + 7

def cumprod(arr,MOD):
    L = len(arr); Lsq = int(L**.5+1)
    arr = np.resize(arr,Lsq**2).reshape(Lsq,Lsq)
    for n in range(1,Lsq):
        arr[:,n] *= arr[:,n-1]; arr[:,n] %= MOD
    for n in range(1,Lsq):
        arr[n] *= arr[n-1,-1]; arr[n] %= MOD
    return arr.ravel()[:L]

def make_fact(U,MOD):
    x = np.arange(U,dtype=np.int64); x[0] = 1
    fact = cumprod(x,MOD)
    x = np.arange(U,0,-1,dtype=np.int64); x[0] = pow(int(fact[-1]),MOD-2,MOD)
    fact_inv = cumprod(x,MOD)[::-1]
    return fact,fact_inv

def make_power(a,L,MOD):
    B = L.bit_length()
    x = np.empty(1 + (1<<B),np.int64)
    x[0] = 1; x[1] = a
    for n in range(B):
        x[1<<n:1<<(n+1)] = x[:1<<n] * (a * x[(1<<n)-1] % MOD) % MOD
    return x[:L]

U = 10 ** 6
power2 = make_power(2,U,MOD)
power2_inv = make_power(pow(2,MOD-2,MOD),U,MOD)
power3 = make_power(3,U,MOD)
power3_inv = make_power(pow(3,MOD-2,MOD),U,MOD)
fact,fact_inv = make_fact(U,MOD)

x = np.zeros(N+M,np.int64)
x[1:] = (-1) * power2[:N+M-1] * power3_inv[K+1:N+M+K] % MOD
x[1:] *= fact[K+1:N+M+K] * fact_inv[K] % MOD * fact_inv[1:N+M] % MOD
x %= MOD
x[0] = 3 * (1 - power3_inv[K+1]) % MOD * power2_inv[1] % MOD
np.cumsum(x, out=x); x %= MOD
x *= power3[:N+M] * power2_inv[:N+M] % MOD; x %= MOD

coef = fact[N-1:N+M] * fact_inv[:M+1] % MOD * fact_inv[N-1] % MOD
coef *= power3[K:K+M+1][::-1]; coef %= MOD
answer = (coef * x[N-1:N+M] % MOD).sum() % MOD
print(answer)
```


Answer:
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        final int MOD = 100000007;
        long[] pow2 = new long[n + m];
        long[] pow2Inv = new long[n + m];
        long[] pow3 = new long[n + m];
        long[] pow3Inv = new long[n + m];
        long[] fact = new long[n + m];
        long[] factInv = new long[n + m];

        pow2[0] = 1;
        pow2Inv[0] = 1;
        pow3[0] = 1;
        pow3Inv[0] = 1;
        fact[0] = 1;
        factInv[0] = 1;

        for (int i = 1; i < n + m; i++) {
            pow2[i] = pow2[i - 1] * 2 % MOD;
            pow2Inv[i] = pow(pow2[i], MOD - 2, MOD);
            pow3[i] = pow3[i - 1] * 3 % MOD;
            pow3Inv[i] = pow(pow3[i], MOD - 2, MOD);
            fact[i] = fact[i - 1] * i % MOD;
            factInv[i] = pow(fact[i], MOD - 2, MOD);
        }

        long[] x = new long[n + m];
        for (int i = 1; i < n + m; i++) {
            x[i] = (MOD - pow2[i - 1]) * pow3Inv[k + i] % MOD;
            x[i] = x[i] * fact[k + i] % MOD * factInv[k] % MOD * factInv[i] % MOD;
        }

        long[] coef = new long[m + 1];
        coef[0] = 1;
        for (int i = 1; i <= m; i++) {
            coef[i] = coef[i - 1] * (n - 1 + i) % MOD * factInv[i] % MOD;
        }

        long[] y = new long[n + m];
        for (int i = 0; i < m + 1; i++) {
            y[n - 1 + i] = coef[i] * pow3[k + i] % MOD * pow2Inv[n - 1 + i] % MOD;
        }

        long[] ans = new long[n + m];
        for (int i = 0; i < n + m; i++) {
            ans[i] = x[i] * y[i] % MOD;
        }

        long sum = 0;
        for (int i = 0; i < m; i++) {
            sum = (sum + ans[n - 1 + i]) % MOD;
        }

        System.out.println(sum);
    }

    private static long pow(long a, long n, int mod) {
        long res = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                res = res * a % mod;
            }
            a = a * a % mod;
            n /= 2;
        }
        return res;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null ||!st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}<|endoftext|>
