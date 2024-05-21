import java.util.*;
import java.io.*;

class Main {
    static long mod = 100000007;
    static long[] fctr;
    static long rng = 2000100;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int x1 = Integer.parseInt(input[0]);
        int y1 = Integer.parseInt(input[1]);
        int x2 = Integer.parseInt(input[2]);
        int y2 = Integer.parseInt(input[3]);
        fctr = new long[(int) rng];
        fctr[0] = 1;
        for (int i = 1; i < rng; i++) {
            fctr[i] = (fctr[i - 1] * i) % mod;
        }
        long ans = (comb(x2 + y2 + 2, x2 + 1) - comb(x2 + y1 + 1, y1) - comb(x1 + y2 + 1, x1) + comb(x1 + y1, x1) + mod) % mod;
        System.out.println(ans);
    }

    static long finv(long x) {
        return pow(fctr[(int) x], mod - 2, mod);
    }

    static long cmb(long n, long k) {
        if (n < 0 || k < 0) {
            return 0;
        } else {
            return (fctr[(int) n] * finv(n - k) % mod * finv(k) % mod) % mod;
        }
    }

    static long pow(long a, long b, long m) {
        long ans = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                ans = (ans * a) % m;
            }
            a = (a * a) % m;
            b /= 2;
        }
        return ans;
    }
}