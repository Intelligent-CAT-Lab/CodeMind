System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 5

Expected output:
352


```
import sys
import numpy as np

read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

MOD = 10**9 + 7

N, M = map(int, read().split())

def make_power(a, L, MOD=MOD):
    B = L.bit_length()
    x = np.empty(1 << B, np.int64)
    x[0] = 1
    for n in range(B):
        x[1 << n:1 << (n + 1)] = x[:1 << n] * a % MOD
        a *= a
        a %= MOD
    x = x[:L]
    x.flags.writeable = False
    return x

pow2 = make_power(2, M + 10)
ipow2 = make_power((1 + MOD) // 2, M + 10)

def update(dp):
    B = dp.copy()
    C = dp * np.arange(M + 1) % MOD * ipow2[:M + 1] % MOD
    dp[1:] = np.cumsum(C[:-1]) % MOD
    dp[1:] *= pow2[:M]
    dp %= MOD
    dp += np.arange(1, M + 2) * B
    dp %= MOD

dp = pow2[:M + 1].copy()
for _ in range(N - 1):
    update(dp)

print(dp[-1])
```


Answer:
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final long MOD = 100000007;

    public static void main(String[] args) {
        FastReader scanner = new FastReader();
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        long[] pow2 = new long[m + 10];
        long[] ipow2 = new long[m + 10];
        pow2[0] = 1;
        ipow2[0] = 1;
        for (int i = 1; i < m + 10; i++) {
            pow2[i] = (pow2[i - 1] * 2) % MOD;
            ipow2[i] = (ipow2[i - 1] * ((MOD + 1) / 2)) % MOD;
        }

        long[] dp = new long[m + 1];
        dp[0] = 1;
        for (int i = 1; i < m + 1; i++) {
            dp[i] = (dp[i - 1] * 2) % MOD;
        }

        for (int i = 1; i < n; i++) {
            long[] next = new long[m + 1];
            for (int j = 1; j < m + 1; j++) {
                next[j] = (dp[j - 1] * (j + 1) + next[j - 1]) % MOD;
            }
            for (int j = 1; j < m + 1; j++) {
                dp[j] = (dp[j] * pow2[j - 1] + next[j]) % MOD;
            }
        }

        System.out.println(dp[m]);
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
}
```<|endoftext|>
