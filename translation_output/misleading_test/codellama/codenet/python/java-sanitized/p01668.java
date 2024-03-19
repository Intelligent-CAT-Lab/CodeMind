import java.util.Scanner;

class RollingHash {
    private int mod;
    private int[] pw;
    private int[] h;

    public RollingHash(String s, int base, int mod) {
        this.mod = mod;
        this.pw = new int[s.length() + 1];
        this.h = new int[s.length() + 1];

        int l = s.length();
        int v = 0;
        for (int i = 0; i < l; i++) {
            h[i + 1] = v = (v * base + s.charAt(i)) % mod;
        }
        v = 1;
        for (int i = 0; i < l; i++) {
            pw[i + 1] = v = v * base % mod;
        }
    }

    public int get(int l, int r) {
        return (h[r] - h[l] * pw[r - l]) % mod;
    }
}

public class p01668 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        String C = scanner.nextLine();
        int MOD = 1000000007;
        int L = Math.max(A.length(), B.length());
        int[] pw10 = new int[L + 1];
        int r = 1;
        for (int i = 1; i < L + 1; i++) {
            pw10[i] = r = r * 10 % MOD;
        }
        int calc(String X, String Y) {
            int mod = 1000000009;
            int N = X.length();
            int M = Y.length();
            if (N < M) {
                return 0;
            }
            RollingHash hx = new RollingHash(X, 37, mod);
            RollingHash hy = new RollingHash(Y, 37, mod);
            int[] hY = new int[M + 1];
            for (int i = 0; i < M + 1; i++) {
                hY[i] = hy.get(0, i);
            }
            int res = 0;
            int cur = 0;
            for (int i = 0; i < N; i++) {
                int v = X.charAt(i) - '0';
                res += cur * v * pw10[N - (i + 1)] % MOD;
                for (int j = i - M + 1; j < i + 1; j++) {
                    if (j + M > N) {
                        break;
                    }
                    int l = i - j;
                    if ((0 < l && hx.get(j, j + l) != hY[l]) || v <= Y.charAt(i - j) - '0') {
                        continue;
                    }
                    res += pw10[N - (j + M)] % MOD;
                }
                if (M + (i + 1) <= N) {
                    res += v * pw10[N - (M + i + 1)] * (N - (i + 1) - M + 1) % MOD;
                }
                if (i - M + 1 >= 0 && hx.get(i - M + 1, i + 1) == hY[M]) {
                    cur += 1;
                }
            }
            for (int j = 0; j < N - M + 1; j++) {
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
            return res % MOD;
        }
        int ans = calc(B, C);
        int a = Integer.parseInt(A);
        if (a > 0) {
            A = String.valueOf(a - 1);
            ans -= calc(A, C);
        }
        System.out.println(ans % MOD);
    }
}