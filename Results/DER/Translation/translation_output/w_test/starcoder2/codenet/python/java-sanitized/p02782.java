import java.util.*;
import java.math.*;

public class p02782 {
    static final int mod = 1000000007;
    static final int rng = 2000100;
    static final int[] fctr = new int[rng];
    static final int[] finv = new int[rng];
    static final int[] cmb = new int[rng];

    static void init() {
        fctr[0] = 1;
        for (int i = 1; i < rng; i++) {
            fctr[i] = (int) ((long) fctr[i - 1] * i % mod);
        }
        finv[rng - 1] = BigInteger.valueOf(fctr[rng - 1]).modInverse(BigInteger.valueOf(mod)).intValue();
        for (int i = rng - 2; i >= 0; i--) {
            finv[i] = (int) ((long) finv[i + 1] * (i + 1) % mod);
        }
    }

    static int cmb(int n, int k) {
        if (n < 0 || k < 0) {
            return 0;
        } else {
            return (int) ((long) fctr[n] * finv[n - k] % mod * finv[k] % mod);
        }
    }

    public static void main(String[] args) {
        init();
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println((cmb(x2 + y2 + 2, x2 + 1) - cmb(x2 + y1 + 1, y1) - cmb(x1 + y2 + 1, x1) + cmb(x1 + y1, x1)) % mod);
    }
}

/2019-09-25/README.md
# 2019-09-25