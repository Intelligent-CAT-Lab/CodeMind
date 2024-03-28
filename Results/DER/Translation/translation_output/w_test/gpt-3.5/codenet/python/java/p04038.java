```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int N = sc.nextInt();
        int K = sc.nextInt();

        if (K == 1) {
            System.out.println(1);
            return;
        }

        int MOD = 1000000007;

        long[] fact = new long[(N + 10) * (K + 10)];
        long[] factInv = new long[(N + 10) * (K + 10)];
        fact[0] = 1;
        factInv[0] = 1;
        for (int i = 1; i < fact.length; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
            factInv[i] = pow(fact[i], MOD - 2, MOD);
        }

        long[] dp = new long[N + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int n = 2; n <= N; n++) {
            long[] prev = dp.clone();
            dp = new long[n + 1];

            long S = 0;
            for (long val : prev) {
                S = (S + val) % MOD;
            }

            long[] cumsum = new long[n + 1];
            cumsum[0] = prev[0];
            for (int i = 1; i < prev.length; i++) {
                cumsum[i] = (cumsum[i - 1] + prev[i]) % MOD;
            }

            dp[1] = S;
            for (int i = 2; i < dp.length; i++) {
                dp[i] = (S - cumsum[i - 1] + MOD) % MOD;
            }

            long[] coef = new long[K + 1];
            for (int i = 1; i <= K; i++) {
                coef[i] = profit(n, K, i, fact, factInv, MOD);
            }

            for (int i = 0; i < dp.length; i++) {
                dp[i] = (dp[i] * coef[i]) % MOD;
            }
        }

        long answer = 0;
        for (long val : dp) {
            answer = (answer + val) % MOD;
        }
        answer = (answer * fact[N]) % MOD;

        System.out.println(answer);
    }

    static long pow(long base, long exp, long MOD) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp /= 2;
        }
        return result;
    }

    static long profit(int n, int k, int i, long[] fact, long[] factInv, int MOD) {
        long res = (fact[n * (k - 1) + i - 1] % MOD) * factInv[k - 2];
        res %= MOD;
        res *= factInv[(n - 1) * (k - 1) + i];
        res %= MOD;
        return res;
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
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
    }
}
```
```
