```java
import java.util.*;

class COMB_MOD {
    long[] fac;
    long[] finv;
    long[] inv;
    int max;
    long mod;

    COMB_MOD(int max_n, long mod) {
        fac = new long[max_n];
        finv = new long[max_n];
        inv = new long[max_n];
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        this.max = max_n;
        this.mod = mod;
        maesyori();
    }

    void maesyori() {
        for (int i = 2; i < max; i++) {
            fac[i] = fac[i-1] * i % mod;
            inv[i] = mod - inv[mod % i] * (mod / i) % mod;
            finv[i] = finv[i-1] * inv[i] % mod;
        }
    }

    long comb(int n, int k) {
        if (n < k || n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n-k] % mod) % mod;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = (int)1e9 + 7;
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        COMB_MOD C = new COMB_MOD(2*100000, mod);
        long ans = 0;
        for (int i = 0; i < h-a; i++) {
            ans = (ans + C.comb(b-1+i, i) * C.comb(h-1-i+w-1-b, h-1-i)) % mod;
        }
        System.out.println(ans);
    }
}
```

