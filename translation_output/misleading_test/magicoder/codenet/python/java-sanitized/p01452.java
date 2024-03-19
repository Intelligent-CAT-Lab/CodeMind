import java.util.*;
import java.io.*;

public class p01452 {
    static final int MOD = 1000000007;
    static final int MAX = 1000000;
    static long[] cm = new long[MAX];

    static void comb_init() {
        cm[0] = 1;
        for (int i = 1; i < MAX; i++) {
            cm[i] = (cm[i-1] * i) % MOD;
        }
    }

    static long inv(long x) {
        return pow(x, MOD - 2, MOD);
    }

    static long pow(long x, long y, long p) {
        long res = 1;
        x = x % p;
        while (y > 0) {
            if ((y & 1) == 1) {
                res = (res * x) % p;
            }
            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }

    static long comb(int a, int b) {
        return (cm[a] * inv(cm[a-b]) % MOD) * inv(cm[b]) % MOD;
    }

    static long f(int n, int m, int k) {
        comb_init();
        long r = 0;
        for (int i = 0; i <= k; i++) {
            int j = k - i;
            long mt = comb(n+m+k*2, n+i*2);
            long lk = rk = 1;
            if (i > 0) {
                lk = (comb(n+i*2, i) - comb(n+i*2, i-1)) % MOD;
            }
            if (j > 0) {
                rk = (comb(m+j*2, j) - comb(m+j*2, j-1)) % MOD;
            }
            r += (mt * lk * rk) % MOD;
            r %= MOD;
        }
        return r;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        System.out.println(f(n, m, k));
    }
}