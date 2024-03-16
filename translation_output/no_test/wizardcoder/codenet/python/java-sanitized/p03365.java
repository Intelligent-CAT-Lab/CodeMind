import java.io.*;
import java.util.*;

public class p03365 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            int n = Integer.parseInt(br.readLine());
            int[] fact = new int[n+1];
            int[] ifact = new int[n+1];
            fact[0] = 1;
            ifact[0] = 1;
            for (int i = 1; i <= n; i++) {
                fact[i] = (fact[i-1] * i) % MOD;
                ifact[i] = pow(fact[i], MOD-2, MOD);
            }

            int ans = 0;
            int c0 = 0;
            for (int i = n/2; i < n; i++) {
                int c1 = (nCk(i-1, n-1-i)*fact[i]*fact[n-i-1] - c0 + MOD) % MOD;
                ans = (ans + c1*i) % MOD;
                c0 = (c0 + c1) % MOD;
            }

            bw.write("Case #" + t + ": " + ans + "\n");
        }

        bw.close();
    }

    static int MOD = 1000000007;

    static int pow(int a, int b, int mod) {
        int res = 1;
        while (b > 0) {
            if (b % 2 == 1) res = (res * a) % mod;
            a = (a * a) % mod;
            b /= 2;
        }
        return res;
    }

    static int nCk(int n, int k) {
        if (k < 0 || k > n) return 0;
        return (fact[n] * ifact[n-k] * ifact[k]) % MOD;
    }
}