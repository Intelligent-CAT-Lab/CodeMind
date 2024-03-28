import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RollingHash {
    private final int mod;
    private final int[] pw;
    private final int[] h;

    public RollingHash(String s, int base, int mod) {
        this.mod = mod;
        this.pw = new int[s.length() + 1];
        this.h = new int[s.length() + 1];

        int l = s.length();
        int v = 0;
        for (int i = 0; i < l; i++) {
            h[i + 1] = v = (v * base + (int) s.charAt(i)) % mod;
        }
        v = 1;
        for (int i = 0; i < l; i++) {
            pw[i + 1] = v = v * base % mod;
        }
    }

    public int get(int l, int r) {
        return (h[r] - h[l] * pw[r - l] + mod) % mod;
    }
}

public class p01668 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int MOD = 1000000007;
        String[] input = br.readLine().trim().split(" ");
        String A = input[0];
        String B = input[1];
        String C = input[2];

        int L = Math.max(A.length(), B.length());
        int[] pw10 = new int[L + 1];
        int r = 1;
        for (int i = 1; i <= L; i++) {
            pw10[i] = r = (int) ((long) r * 10 % MOD);
        }

        String X = B;
        String Y = C;

        int N = X.length();
        int M = Y.length();

        RollingHash hx = new RollingHash(X, 37, MOD);
        RollingHash hy = new RollingHash(Y, 37, MOD);
        
        int[] hY = new int[M + 1];
        for (int i = 0; i <= M; i++) {
            hY[i] = hy.get(0, i);
        }

        long res = 0;
        long cur = 0;
        for (int i = 0; i < N; i++) {
            int v = Character.getNumericValue(X.charAt(i));
            res += cur * v * pw10[N - (i + 1)] % MOD;
            for (int j = i - M + 1; j <= i; j++) {
                if (j + M > N) break;
                int l = i - j;
                if ((0 < l && hx.get(j, j + l) != hY[l]) || v <= Character.getNumericValue(Y.charAt(i - j))) {
                    continue;
                }
                res += pw10[N - (j + M)];
            }
            if (M + (i + 1) <= N) {
                res += v * pw10[N - (M + i + 1)] * (N - (i + 1) - M + 1) % MOD;
            }
            if (i - M + 1 >= 0 && hx.get(i - M + 1, i + 1) == hY[m]) {
                cur += 1;
            }
        }

        for (int j = 0; j <= N - M; j++) {
            if (hx.get(j, j + M) != hY[M]) {
                continue;
            }
            res += 1;
        }
        
        if (Y.equals("0")) {
            for (int i = 1; i < N; i++) {
                res -= 9 * pw10[N - i - 1] * i % MOD;
            }
            res -= N - 1;
        }

        int ans = (int) (res % MOD);

        int a = Integer.parseInt(A);
        if (a > 0) {
            A = String.valueOf(a - 1);
            ans -= calc(A, C);
        }

        System.out.println(ans % MOD);
    }
}