import java.util.Scanner;

public class p04040 {
    private static final int MOD = (int)1e9 + 7;
    private int max;
    private long[] fac;
    private long[] finv;
    private long[] inv;

    public COMB_MOD(int max_n) {
        this.fac = new long[max_n];
        this.finv = new long[max_n];
        this.inv = new long[max_n];
        this.max = max_n;
        this.fac[0] = this.fac[1] = 1;
        this.finv[0] = this.finv[1] = 1;
        this.inv[1] = 1;
        this.preprocess();
    }

    private void preprocess() {
        for (int i = 2; i < max; i++) {
            this.fac[i] = fac[i - 1] * i % MOD;
            this.inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            this.finv[i] = finv[i - 1] * inv[i] % MOD;
        }
    }

    public long comb(int n, int k) {
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        COMB_MOD c = new COMB_MOD(200000);
        long ans = 0;
        for (int i = 0; i < h - a; i++) {
            ans = (ans + c.comb(b - 1 + i, i) * c.comb(h - 1 - i + w - 1 - b, h - 1 - i)) % MOD;
        }
        System.out.println(ans);
    }
}