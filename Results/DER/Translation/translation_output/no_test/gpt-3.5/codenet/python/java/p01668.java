```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class RollingHash {

    static class RollingHash {
        int mod;
        int[] pw, h;

        public RollingHash(String s, int base, int mod) {
            this.mod = mod;
            pw = new int[s.length() + 1];
            h = new int[s.length() + 1];

            int l = s.length();
            h = new int[l + 1];

            int v = 0;
            for (int i = 0; i < l; i++) {
                h[i + 1] = v = (v * base + s.charAt(i)) % mod;
            }
            v = 1;
            for (int i = 0; i < l; i++) {
                pw[i + 1] = v = (v * base) % mod;
            }
        }

        public int get(int l, int r) {
            return (h[r] - h[l] * pw[r - l]) % mod;
        }
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        try {
            int MOD = 1000000007;
            StringTokenizer st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();
            String C = st.nextToken();

            int L = Math.max(A.length(), B.length());
            int[] pw10 = new int[L + 1];
            int r = 1;
            for (int i = 1; i <= L; i++) {
                pw10[i] = r = (r * 10) % MOD;
            }

            int ans = calc(B, C, MOD, pw10);
            int a = Integer.parseInt(A);
            if (a > 0) {
                A = String.valueOf(a - 1);
                ans -= calc(A, C, MOD, pw10);
            }

            pw.printf("%d\n", (ans % MOD));
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int calc(String X, String Y, int MOD, int[] pw10) {
        int mod = 1000000009;
        int N = X.length();
        int M = Y.length();

        if (N < M) {
            return 0;
        }

        RollingHash hx = new RollingHash(X, 37, mod);
        RollingHash hy = new RollingHash(Y, 37, mod);
        int[] hY = new int[M + 1];
        for (int i = 0; i <= M; i++) {
            hY[i] = hy.get(0, i);
        }

        long res = 0, cur = 0;
        for (int i = 0; i < N; i++) {
            int v = Character.getNumericValue(X.charAt(i));
            res += cur * v * pw10[N - (i + 1)] % MOD;
            for (int j = i - M + 1; j <= i; j++) {
                if (j + M > N) {
                    break;
                }
                int l = i - j;
                if ((0 < l && hx.get(j, j + l) != hY[l]) || v <= Character.getNumericValue(Y.charAt(i - j))) {
                    continue;
                }
                res += pw10[N - (j + M)];
            }
            if (M + (i + 1) <= N) {
                res += v * pw10[N - (M + i + 1)] * (N - (i + 1) - M + 1) % MOD;
            }
            if (i - M + 1 >= 0 && hx.get(i - M + 1, i + 1) == hY[M]) {
                cur++;
            }
        }

        for (int j = 0; j < N - M + 1; j++) {
            if (hx.get(j, j + M) == hY[M]) {
                res++;
            }
        }

        if (Y.equals("0")) {
            for (int i = 1; i < N; i++) {
                res -= 9 * pw10[N - i - 1] * i % MOD;
            }
            res -= N - 1;
        }

        return (int) (res % MOD);
    }
}
```  
