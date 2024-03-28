import java.util.*;
import java.io.*;

public class p02012 {
    static int mod = 1000000007;
    static int[] f = new int[1000001];
    static int[] p = new int[1000001];
    static int[] lis = new int[1000001];
    static int s;

    static int sum(int a, int b) {
        return ((b + a) * (b - a + 1)) >> 1;
    }

    static void fact(int n) {
        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                lis[i] = i;
                int m = n / i;
                if (i != m) {
                    lis[m] = m;
                }
            }
            i += 1;
        }
        lis[n] = n;
    }

    static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = Integer.parseInt(br.readLine());
        if (s == 1) {
            System.out.println(1);
            return;
        }
        fact(s);
        Arrays.sort(lis);
        for (int k : lis) {
            if (k == 0) break;
            for (int a = 1; a <= k; a++) {
                int b = k - a;
                if (a <= b && p[a * 100000 + b] == 1) {
                    f[sum(a, b)] += 1;
                    p[a * 100000 + b] = 0;
                }
            }
            for (int a = 1; a <= s; a++) {
                int b = k + a - 1;
                if (p[a * 100000 + b] == 1) {
                    int s_ = sum(a, b);
                    if (s_ > s) break;
                    f[s_] += 1;
                    p[a * 100000 + b] = 0;
                }
            }
        }
        int ans = 0;
        for (int k : lis) {
            if (k == 0) break;
            ans += f[k] * f[s / k];
        }
        System.out.println(ans);
    }

    public static void main(String[] args) throws IOException {
        solve();
    }
}