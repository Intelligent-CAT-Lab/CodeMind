import java.util.*;
import java.io.*;

public class p02170 {
    static final long mod = 998244353;
    static long[] lst;
    static long n, k, a;

    static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Long.parseLong(st.nextToken());
        k = Long.parseLong(st.nextToken());
        a = Long.parseLong(st.nextToken());
        lst = new long[(int) (k + 1)];
        lst[(int) (k - 1)] = 1;
        long A = a * pow(100 * n, mod - 2, mod);
        long inv = pow(n, mod - 2, mod);

        for (int i = (int) (k - 1); i >= 0; i--) {
            if (k > i + n) {
                lst[i] = A * (lst[i + 1] - lst[i + (int) (n + 1)]) + lst[i + 1];
                lst[i] %= mod;
            } else {
                lst[i] = A * (lst[i + 1] - lst[(int) k]) + (n - (k - i) + 1) * inv + lst[i + 1];
                lst[i] %= mod;
            }
        }
        System.out.println((lst[0] - lst[1] + mod) % mod);
    }

    static long pow(long a, long b, long m) {
        a %= m;
        long res = 1;
        while (b > 0) {
            if ((b & 1) != 0)
                res = res * a % m;
            a = a * a % m;
            b >>= 1;
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        solve();
    }
}