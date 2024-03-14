import java.util.*;
import java.io.*;
public class p02012 {
    static int solve() {
        int s = Integer.parseInt(br.readLine());
        if (s == 1) {
            System.out.println(1);
            return 0;
        }
        int[] lis = fact(s);
        int[] f = new int[s+1];
        int[] p = new int[s+1];
        Arrays.sort(lis);
        for (int k : lis) {
            for (int a = 1; a <= k; a++) {
                int b = k - a;
                if (a <= b) {
                    if (p[a][b] == 1) {
                        f[a + b] += 1;
                        p[a][b] = 0;
                    }
                }
            }
            for (int a = 1; a <= s; a++) {
                int b = k + a - 1;
                if (p[a][b] == 1) {
                    int s_ = a + b;
                    if (s_ > s) {
                        break;
                    }
                    f[s_] += 1;
                    p[a][b] = 0;
                }
            }
        }
        int ans = 0;
        for (int k : lis) {
            ans += f[k] * f[s / k];
        }
        System.out.println(ans);
        return 0;
    }
    static int[][] p = new int[1001][1001];
    static int[] f = new int[1001];
    static int[] fact(int n) {
        if (n < 4) {
            return new int[]{1, n};
        }
        int[] res = new int[1000];
        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                res[i] = 1;
                int m = n / i;
                if (i!= m) {
                    res[m] = 1;
                }
            }
            i++;
        }
        res[n] = 1;
        int cnt = 0;
        for (int j = 2; j <= n; j++) {
            if (res[j] == 1) {
                res[cnt++] = j;
            }
        }
        return Arrays.copyOf(res, cnt);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solve();
    }
}