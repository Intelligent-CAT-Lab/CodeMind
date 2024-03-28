import java.util.Scanner;

class COMB_MOD {
    private int[] fac;
    private int[] finv;
    private int[] inv;
    private int max;
    private int mod;

    public COMB_MOD(int max_n, int mod) {
        this.fac = new int[max_n];
        this.finv = new int[max_n];
        this.inv = new int[max_n];
        this.fac[0] = this.fac[1] = 1;
        this.finv[0] = this.finv[1] = 1;
        this.inv[1] = 1;
        this.max = max_n;
        this.mod = mod;
        this._maesyori();
    }

    private void _maesyori() {
        for (int i = 2; i < this.max; i++) {
            this.fac[i] = (this.fac[i - 1] * i) % this.mod;
            this.inv[i] = (this.mod - this.inv[this.mod % i] * (this.mod / i) % this.mod);
            this.finv[i] = (this.finv[i - 1] * this.inv[i]) % this.mod;
        }
    }

    public int comb(int n, int k) {
        if (n < k) {
            return 0;
        }
        if (n < 0 || k < 0) {
            return 0;
        }
        return (this.fac[n] * (this.finv[k] * this.finv[n - k] % this.mod)) % this.mod;
    }
}

public class p04040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mod = 1000000007;
        COMB_MOD C = new COMB_MOD(2 * 100000, mod);
        int ans = 0;
        for (int i = 0; i < h - a; i++) {
            ans = (ans + C.comb(b - 1 + i, i) * C.comb(h - 1 - i + w - 1 - b, h - 1 - i)) % mod;
        }
        System.out.println(ans);
    }
}