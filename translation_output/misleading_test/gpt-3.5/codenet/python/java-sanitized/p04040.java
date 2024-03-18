import java.util.*;

public class p04040 {
    private int max_n;
    private int mod;
    private long[] fac;
    private long[] finv;
    private long[] inv;

    public COMB_MOD(int max_n, int mod) {
        this.max_n = max_n;
        this.mod = mod;
        fac = new long[max_n];
        finv = new long[max_n];
        inv = new long[max_n];
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        maesyori();
    }

    private void maesyori() {
        for (int i = 2; i < max_n; i++) {
            fac[i] = fac[i - 1] * i % mod;
            inv[i] = mod - inv[mod % i] * (mod / i) % mod;
            finv[i] = finv[i - 1] * inv[i] % mod;
        }
    }

    public long comb(int n, int k) {
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n - k] % mod) % mod;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mod = (int) 1e9 + 7;
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        COMB_MOD C = new COMB_MOD(2 * (int) 1e5, mod);
        long ans = 0;
        for (int i = 0; i < h - a; i++) {
            ans = (ans + C.comb(b - 1 + i, i) * C.comb((h - 1 - i) + (w - 1 - b), (h - 1 - i))) % mod;
        }
        System.out.println(ans);
    }
}