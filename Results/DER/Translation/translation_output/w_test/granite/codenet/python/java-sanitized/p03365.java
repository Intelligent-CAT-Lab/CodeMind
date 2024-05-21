import java.io.*;
import java.util.*;

public class p03365 {
    static final int MOD = 1000000007;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());

        long[] fact = new long[n+1];
        long[] ifact = new long[n+1];
        fact[0] = 1;
        ifact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i-1] * i) % MOD;
            ifact[i] = pow(fact[i], MOD-2, MOD);
        }

        long ans = 0;
        long c0 = 0;
        for (int i = n/2; i < n; i++) {
            long c1 = (nCk(i-1, n-1-i)*fact[i]*fact[n-i-1] - c0 + MOD) % MOD;
            ans = (ans + c1*i) % MOD;
            c0 = (c0 + c1) % MOD;
        }

        System.out.println(ans);
    }

    static long nCk(int n, int k) {
        if (k < 0 || k > n) return 0;
        return (fact[n] * ifact[n-k] * ifact[k]) % MOD;
    }

    static long pow(long a, long b, long m) {
        long result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % m;
            }
            a = (a * a) % m;
            b /= 2;
        }
        return result;
    }
}