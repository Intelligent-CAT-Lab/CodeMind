import java.util.*;

public class p04040 {
    private long[] fac;
    private long[] finv;
    private long[] inv;
    private int max;
    private long mod;

    public COMB_MOD(int max_n, long mod) {
        this.fac = new long[max_n];
        this.finv = new long[max_n];
        this.inv = new long[max_n];
        this.max = max_n;
        this.mod = mod;
        this.init();
    }

    private void init() {
        this.fac[0] = this.fac[1] = 1;
        this.finv[0] = this.finv[1] = 1;
        this.inv[1] = 1;
        for (int i = 2; i < this.max; i++) {
            this.fac[i] = this.fac[i - 1] * i % this.mod;
            this.inv[i] = this.mod - this.inv[this.mod % i] * (this.mod / i) % this.mod;
            this.finv[i] = this.finv[i - 1] * this.inv[i] % this.mod;
        }
    }

    public long comb(int n, int k) {
        if (n < k || n < 0 || k < 0) {
            return 0;
        }
        return this.fac[n] * (this.finv[k] * this.finv[n - k] % this.mod) % this.mod;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long mod = (long) Math.pow(10, 9) + 7;
        COMB_MOD C = new COMB_MOD(2 * (int) Math.pow(10, 5), mod);
        long ans = 0;
        for (int i = 0; i < h - a; i++) {
            ans = (ans + C.comb(b - 1 + i, i) * C.comb(h - 1 - i + w - 1 - b, h - 1 - i)) % mod;
        }
        System.out.println(ans);
    }
}