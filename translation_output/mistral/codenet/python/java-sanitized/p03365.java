import java.io.*;
import java.util.*;

public class p03365 {
    static int MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n;
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            st = new StringTokenizer(line);
            n = Integer.parseInt(st.nextToken());
            sb.setLength(0);
            int fact[] = new int[n + 1];
            int ifact[] = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                fact[i] = (fact[i - 1] * i) % MOD;
                ifact[i] = (int) Math.pow(fact[i], MOD - 2, MOD);
            }
            int ans = 0;
            int c0 = 0;
            for (int i = n / 2; i >= 1; i--) {
                int c1 = (nCk(i - 1, n - 1 - i) * fact[i] * fact[n - i - 1] - c0 + MOD) % MOD;
                ans = (ans + c1 * i) % MOD;
                c0 = (c0 + c1) % MOD;
            }
            System.out.printf("Case #%d\n%s\n", n, ans);
        }
    }

    static int nCk(int n, int k) {
        if (k < 0 || k > n)
            return 0;
        return (fact[n] * ifact[n - k] * ifact[k]) % MOD;
    }

    static int fact[] = new int[100000];
    static int ifact[] = new int[100000];

    static {
        for (int i = 0; i < 100000; i++) {
            fact[i] = 1;
            ifact[i] = 1;
        }
        for (int i = 1; i < 100000; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
            ifact[i] = (int) Math.pow(fact[i], MOD - 2, MOD);
        }
    }
}