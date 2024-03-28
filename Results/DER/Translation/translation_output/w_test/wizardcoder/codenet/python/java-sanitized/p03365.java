import java.io.*;
import java.util.*;

public class p03365 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());

            long[] fact = new long[n+1];
            fact[0] = 1;
            for (int j = 1; j <= n; j++) {
                fact[j] = (fact[j-1] * j) % 1000000007;
            }

            long[] ifact = new long[n+1];
            ifact[n] = pow(fact[n], 1000000006, 1000000007);
            for (int j = n-1; j >= 0; j--) {
                ifact[j] = (ifact[j+1] * (j+1)) % 1000000007;
            }

            long ans = 0;
            long c0 = 0;
            for (int j = n/2; j < n; j++) {
                long c1 = (nCk(j-1, n-1-j)*fact[j]*fact[n-j-1] - c0 + 1000000007) % 1000000007;
                ans = (ans + c1*j) % 1000000007;
                c0 = (c0 + c1) % 1000000007;
            }

            bw.write("Case #" + i + ": " + ans + "\n");
        }

        bw.close();
    }

    public static long pow(long a, long b, long mod) {
        long res = 1;
        while (b > 0) {
            if (b % 2 == 1) res = (res * a) % mod;
            a = (a * a) % mod;
            b /= 2;
        }
        return res;
    }

    public static long nCk(long n, long k) {
        if (k < 0 || k > n) return 0;
        return (fact[n] * ifact[n-k] * ifact[k]) % 1000000007;
    }

    public static long[] fact = new long[1000001];
    public static long[] ifact = new long[1000001];
}