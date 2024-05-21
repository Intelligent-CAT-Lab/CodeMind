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

    static long modinv(long a) {
        return pow(a, mod - 2);
    }

    static long comb(long n, long r) {
        if (n < r)
            return 0;
        if (n < 0 || r < 0)
            return 0;
        return fact[(int) n] % mod * inv[(int) r] % mod * inv[(int) (n - r)] % mod;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        fact = new long[2 * s + 1];
        inv = new long[2 * s + 1];
        fact[0] = 1;
        inv[0] = 1;
        for (int i = 1; i <= 2 * s; i++) {
            fact[i] = fact[i - 1] * i % mod;
            inv[i] = modinv(fact[i]);
        }
        long ans = 0;
        for (int i = 1; i <= s; i++) {
            ans = (ans + comb(s - 3 * i + i - 1, i - 1)) % mod;
        }
        System.out.println(ans);
    }
}