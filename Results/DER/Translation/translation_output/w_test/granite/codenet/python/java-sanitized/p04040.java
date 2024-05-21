class COMB_MOD {
    // http://drken1215.hatenablog.com/entry/2018/06/08/210000
    int MAX = 510000;
    int MOD = 100000007;
    long[] fac = new long[MAX];
    long[] finv = new long[MAX];
    long[] inv = new long[MAX];

    public COMB_MOD() {
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < MAX; i++) {
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }
    }

    public long comb(int n, int k) {
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
    }
}

public class p04040 {
    public static void main(String[] args) {
        COMB_MOD C = new COMB_MOD();
        int h, w, a, b;
        h = 2;
        w = 3;
        a = 1;
        b = 1;
        long ans = 0;
        for (int i = 0; i < h - a; i++) {
            ans = (ans + C.comb(b - 1 + i, i) * C.comb(h - 1 - i + w - 1 - b, h - 1 - i)) % C.MOD;
        }
        System.out.println(ans);
    }
}