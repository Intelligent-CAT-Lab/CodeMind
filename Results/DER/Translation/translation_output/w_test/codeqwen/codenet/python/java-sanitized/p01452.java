import java.util.*;
import java.lang.*;

class Main {
    static final int cms = 1000000;
    static final int mod = 1000000007;
    static final int[][] dd = {{-1,0},{0,1},{1,0},{0,-1}};
    static final int[][] ddn = {{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1}};

    static int[] cm = new int[cms];

    static void comb_init() {
        cm[0] = 1;
        for (int i = 1; i < cms; i++) {
            cm[i] = (int) ((long) cm[i-1] * i % mod);
        }
    }

    static int comb(int a, int b) {
        return (cm[a] * inv(cm[a-b]) % mod) * inv(cm[b]) % mod;
    }

    static int inv(int x) {
        return pow(x, mod - 2, mod);
    }

    static int pow(int x, int y, int m) {
        if (y == 0) return 1;
        int p = pow(x, y / 2, m);
        p = (int) ((long) p * p % m);
        return y % 2 == 0 ? p : (int) ((long) p * x % m);
    }

    static int f(int n, int m, int k) {
        comb_init();
        int r = 0;
        for (int i = 0; i <= k; i++) {
            int j = k - i;
            int mt = comb(n+m+k*2, n+i*2);
            int lk = rk = 1;
            if (i > 0) {
                lk = (comb(n+i*2, i) - comb(n+i*2, i-1)) % mod;
            }
            if