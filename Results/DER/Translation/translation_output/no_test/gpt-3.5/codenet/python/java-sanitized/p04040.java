public class p04040 {
    private int max;
    private int mod;
    private long[] fac;
    private long[] finv;
    private long[] inv;

    public COMB_MOD() {
        this.fac = new long[510000];
        this.finv = new long[510000];
        this.inv = new long[510000];
        this.fac[0] = 1;
        this.fac[1] = 1;
        this.finv[0] = 1;
        this.finv[1] = 1;
        this.inv[1] = 1;
        this.max = 510000;
        this.mod = (int)1e9 + 7;
        this._maesyori();
    }

    private void _maesyori() {
        for (int i = 2; i < this.max; i++) {
            fac[i] = fac[i - 1] * i % mod;
            inv[i] = mod - inv[mod % i] * (mod / i) % mod;
            finv[i] = finv[i - 1] * inv[i] % mod;
        }
    }

    public long comb(int n, int k) {
        if (n < k || n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n - k] % mod) % mod;
    }

    public static void main(String[] args) {
        int mod = (int)1e9 + 7;
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        COMB_MOD C = new COMB_MOD();
        long ans = 0;
        for (int i = 0; i < h - a; i++) {
            ans = (ans + C.comb(b - 1 + i, i) * C.comb(h - 1 - i + w - 1 - b, h - 1 - i)) % mod;
        }
        System.out.println(ans);
    }
}