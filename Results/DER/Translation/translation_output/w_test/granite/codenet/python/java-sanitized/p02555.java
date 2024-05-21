import java.util.*;
import java.io.*;

public class p02555 {
    static long mod = (long) 1e9 + 7;
    static long[] fact, inv;

    static long pow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if (b % 2 == 1)
                res = res * a % mod;
            a = a * a % mod;
            b /= 2;
        }
        return res;
    }

    static long modInv(long a) {
        return pow(a, mod - 2);
    }

    static void precomp() {
        fact = new long[200005];
        inv = new long[200005];
        fact[0] = 1;
        inv[0] = 1;
        for (int i = 1; i < fact.length; i++) {
            fact[i] = i * fact[i - 1] % mod;
            inv[i] = modInv(fact[i]);
        }
    }

    static long nCr(int n, int r) {
        if (n < r || n < 0 || r < 0)
            return 0;
        return fact[n] * inv[r] % mod * inv[n - r] % mod;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        precomp();
        long ans = 0;
        for (int i = 1; i <= s; i++) {
            ans = (ans + nCr(s - 3 * i + i - 1, i - 1)) % mod;
        }
        System.out.println(ans);
    }
}