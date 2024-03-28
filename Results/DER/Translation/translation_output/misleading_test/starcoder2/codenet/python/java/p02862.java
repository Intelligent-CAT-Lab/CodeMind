

```java
import java.util.*;
import java.math.*;

public class Main {
    static final int MOD = 1000000007;
    static BigInteger[] fact;
    static BigInteger[] inv;
    static BigInteger[] invFact;

    static BigInteger modinv(BigInteger a, BigInteger m) {
        BigInteger[] xgcd = xgcd(a, m);
        if (xgcd[0].compareTo(BigInteger.ONE) != 0) {
            throw new RuntimeException("modular inverse does not exist");
        } else {
            return xgcd[1].mod(m);
        }
    }

    static BigInteger[] xgcd(BigInteger a, BigInteger b) {
        BigInteger x0 = BigInteger.ONE;
        BigInteger y0 = BigInteger.ZERO;
        BigInteger x1 = BigInteger.ZERO;
        BigInteger y1 = BigInteger.ONE;
        while (b.compareTo(BigInteger.ZERO) != 0) {
            BigInteger q = a.divide(b);
            BigInteger[] tmp = {a, b};
            a = b;
            b = tmp[0].mod(tmp[1]);
            BigInteger[] tmp2 = {x0, x1};
            x0 = x1;
            x1 = tmp2[0].subtract(q.multiply(tmp2[1]));
            BigInteger[] tmp3 = {y0, y1};
            y0 = y1;
            y1 = tmp3[0].subtract(q.multiply(tmp3[1]));
        }
        return new BigInteger[]{a, x0, y0};
    }

    static void init(int n) {
        fact = new BigInteger[n + 1];
        inv = new BigInteger[n + 1];
        invFact = new BigInteger[n + 1];
        fact[0] = BigInteger.ONE;
        fact[1] = BigInteger.ONE;
        inv[1] = BigInteger.ONE;
        invFact[0] = BigInteger.ONE;
        invFact[1] = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i));
            fact[i] = fact[i].mod(BigInteger.valueOf(MOD));
            inv[i] = BigInteger.valueOf(MOD).subtract(inv[MOD % i].multiply(BigInteger.valueOf(MOD / i)));
            invFact[i] = invFact[i - 1].multiply(inv[i]);
            invFact[i] = invFact[i].mod(BigInteger.valueOf(MOD));
        }
    }

    static BigInteger comb(int n, int r) {
        if (n < r) {
            return BigInteger.ZERO;
        }
        BigInteger ret = fact[n].multiply(invFact[r]);
        ret = ret.mod(BigInteger.valueOf(MOD));
        ret = ret.multiply(invFact[n - r]);
        ret = ret.mod(BigInteger.valueOf(MOD));
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if ((x + y) % 3 != 0 || 3 * x < x + y || 3 * y < x + y) {
            System.out.println(0);
            return;
        }
        int n = (x + y) / 3;
        x -= n;
        y -= n;
        init(n);
        System.out.println(comb(n, x));
    }
}
```

## 10. 1000000007

```java
import java.util.*;

public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        int[] e = new int[n];
        for (int i = 0; i < n; i++) {
            e[i] = sc.nextInt();
        }
        int[] f = new int[n];
        for (int i = 0; i < n; i++) {
            f[i] = sc.nextInt();
        }
        int[] g = new int[n];
        for (int i = 0; i < n; i++) {
            g[i] = sc.nextInt();
        }
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int[] i = new int[n];
        for (int j = 0; j < n; j++) {
            i[j] = sc.nextInt();
        }
        int[] j = new int[n];
        for (int k = 0; k < n; k++) {
            j[k] = sc.nextInt();
        }
        int[] k = new int[n];
        for (int l = 0; l < n; l++) {
            k[l] = sc.nextInt();
        }
        int[] l = new int[n];
        for (int m = 0; m < n; m++) {
            l[m] = sc.nextInt();
        }
        int[] m = new int[n];
        for (int o = 0; o < n; o++) {
            m[o] = sc.nextInt();
        }
        int[] o = new int[n];
        for (int p = 0; p < n; p++) {
            o[p] = sc.nextInt();
        }
        int[] p = new int[n];
        for (int q = 0; q < n; q++) {
            p[q] = sc.nextInt();
        }
        int[] q = new int[n];
        for (int r = 0; r < n; r++) {
            q[r] = sc.nextInt();
        }
        int[] r = new int[n];
        for (int s = 0; s < n; s++) {
            r[s] = sc.nextInt();
        }
        int[] s = new int[n];
        for (int t = 0; t < n; t++) {
            s[t] = sc.nextInt();
        }
        int[] t = new int[n];
        for (int u = 0; u < n; u++) {
            t[u] = sc.nextInt();
        }
        int[] u = new int[n];
        for (int v = 0; v < n; v++) {
            u[v] = sc.nextInt();
        }
        int[] v = new int[n];
        for (int w = 0; w
