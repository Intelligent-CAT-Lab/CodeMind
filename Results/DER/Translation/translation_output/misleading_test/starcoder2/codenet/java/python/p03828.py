
```python
MOD = 1000000007

def primeFactorize(n):
    res = []
    for a in range(2, n+1):
        if n % a != 0:
            continue
        ex = 0
        while n % a == 0:
            ex += 1
            n //= a
        res.append({a: ex})
    return res

n = int(input())
ex = [0] * 1001
for i in range(2, n+1):
    pfs = primeFactorize(i)
    for pf in pfs:
        for k, v in pf.items():
            ex[k] += v

ans = 1
for i in range(2, n+1):
    ans *= ex[i] + 1
    ans %= MOD

print(ans)
```

## 03829

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
1

```
import java.util.*;

public class p03829 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();

        final int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        final int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        final int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }

        final int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }

        final int[] e = new int[n];
        for (int i = 0; i < n; i++) {
            e[i] = sc.nextInt();
        }

        final int[] f = new int[n];
        for (int i = 0; i < n; i++) {
            f[i] = sc.nextInt();
        }

        final int[] g = new int[n];
        for (int i = 0; i < n; i++) {
            g[i] = sc.nextInt();
        }

        final int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        final int[] i = new int[n];
        for (int j = 0; j < n; j++) {
            i[j] = sc.nextInt();
        }

        final int[] j = new int[n];
        for (int k = 0; k < n; k++) {
            j[k] = sc.nextInt();
        }

        final int[] k = new int[n];
        for (int l = 0; l < n; l++) {
            k[l] = sc.nextInt();
        }

        final int[] l = new int[n];
        for (int m = 0; m < n; m++) {
            l[m] = sc.nextInt();
        }

        final int[] m = new int[n];
        for (int o = 0; o < n; o++) {
            m[o] = sc.nextInt();
        }

        final int[] o = new int[n];
        for (int p = 0; p < n; p++) {
            o[p] = sc.nextInt();
        }

        final int[] p = new int[n];
        for (int q = 0; q < n; q++) {
            p[q] = sc.nextInt();
        }

        final int[] q = new int[n];
        for (int r = 0; r < n; r++) {
            q[r] = sc.nextInt();
        }

        final int[] r = new int[n];
        for (int s = 0; s < n; s++) {
            r[s] = sc.nextInt();
        }

        final int[] s = new int[n];
        for (int t = 0; t < n; t++) {
            s[t] = sc.nextInt();
        }

        final int[] t = new int[n];
        for (int u = 0; u < n; u++) {
            t[u] = sc.nextInt();
        }

        final int[] u = new int[n];
        for (int v = 0; v < n; v++) {
            u[v] = sc.nextInt();
        }

        final int[] v = new int[n];
        for (int w = 0; w < n; w++) {
            v[w] = sc.nextInt();
        }

        final int[] w = new int[n];
        for (int x = 0; x < n; x++) {
            w[x] = sc.nextInt();
        }

        final int[] x = new int[n];
        for (int y = 0; y < n; y++) {
            x[y] = sc.nextInt();
        }

        final int[] y = new int[n];
        for (int z = 0; z < n; z++) {
            y[z] = sc.nextInt();
        }

        final int[] z = new int[n];
        for (int aa = 0; aa < n; aa++) {
            z[aa] = sc.nextInt();
        }

        final int[] aa = new int[n];
        for (int bb = 0; bb < n; bb++) {
            aa[bb] = sc.nextInt();
        }

        final int[] bb = new int[n];
        for (int cc = 0; cc < n; cc++) {
            bb[cc] = sc.nextInt();
        }

        final int[] cc = new int[n];
        for (int dd = 0; dd < n; dd++) {
            cc[dd] = sc.nextInt();
        }

        final int[] dd = new int[n];
        for (int ee = 0; ee < n; ee++) {
            dd[ee] = sc.nextInt();
        }

        final int[] ee = new int[n];
        for (int ff = 0; ff < n; ff++) {
            ee[ff] = sc.nextInt();
        }

        final int[] ff = new int[n];
        for (int gg = 0; gg < n; gg++) {
            ff[gg] = sc.nextInt();
        }

        final int[] gg = new int[n];
        for (int hh = 0; hh < n; hh++) {
            gg[hh] = sc.nextInt();
        }

        final int[] hh = new int[n];
        for (int ii = 0; ii < n; ii++) {
            hh[ii] = sc.nextInt();
        }

        final int[] ii = new int[n];
        for (int jj = 0; jj < n; jj++) {
            ii[jj] = sc.nextInt();
        }
