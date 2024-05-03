import java.util.Arrays;

public class p04040 {
    // http://drken1215.hatenablog.com/entry/2018/06/08/210000
    private int[] fac;
    private int[] finv;
    private int[] inv;
    private int max;
    private int mod;

    public COMB_MOD(int max_n, int mod) {
        this.fac = new int[max_n];
        this.finv = new int[max_n];
        this.inv = new int[max_n];
        this.max = max_n;
        this.mod = mod;
        this._maesyori();
    }

    private void _maesyori() {
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < this.max; i++) {
            fac[i] = (fac[i-1] * i) % this.mod;
            inv[i] = this.mod - inv[this.mod % i] * (this.mod / i) % this.mod;
            finv[i] = (finv[i-1] * inv[i]) % this.mod;
        }
    }

    public int comb(int n, int k) {
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return (fac[n] * (finv[k] * finv[n-k] % this.mod)) % this.mod;
    }

    public static void main(String[] args) {
        int mod = 1000000007;
        int h = Integer.parseInt(args[0]);
        int w = Integer.parseInt(args[1]);
        int a = Integer.parseInt(args[2]);
        int b = Integer.parseInt(args[3]);
        COMB_MOD C = new COMB_MOD(200000