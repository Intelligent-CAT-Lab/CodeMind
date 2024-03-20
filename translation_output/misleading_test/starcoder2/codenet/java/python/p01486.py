

```python
def saiki(S):
    if S == "":
        return True
    if S[0] != 'm':
        return False
    en = 1
    i = 1
    while i < len(S) and en != 0:
        if S[i] == 'm':
            en += 1
        elif S[i] == 'e':
            en -= 1
        i += 1
    if i == len(S):
        return False
    eindex = i
    mn = 1
    i += 1
    while i < len(S) and mn != 0:
        if S[i] == 'e':
            mn += 1
        elif S[i] == 'w':
            mn -= 1
        i += 1
    if i != len(S):
        return False
    return saiki(S[1:eindex - 1]) and saiki(S[eindex:len(S) - 1])

S = input()
if saiki(S):
    print("Cat")
else:
    print("Rabbit")
```

## 1487

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10

```
import java.util.*;
import java.lang.*;

class p01487 {
        public static void main(String args[]) {
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
                for (int w = 0; w < n; w++) {
                        v[w] = sc.nextInt();
                }
                int[] w = new int[n];
                for (int x = 0; x < n; x++) {
                        w[x] = sc.nextInt();
                }
                int[] x = new int[n];
                for (int y = 0; y < n; y++) {
                        x[y] = sc.nextInt();
                }
                int[] y = new int[n];
                for (int z = 0; z < n; z++) {
                        y[z] = sc.nextInt();
                }
                int[] z = new int[n];
                for (int aa = 0; aa < n; aa++) {
                        z[aa] = sc.nextInt();
                }
                int[] aa = new int[n];
                for (int bb = 0; bb < n; bb++) {
                        aa[bb] = sc.nextInt();
                }
                int[] bb = new int[n];
                for (int cc = 0; cc < n; cc++) {
                        bb[cc] = sc.nextInt();
                }
                int[] cc = new int[n];
                for (int dd = 0; dd < n; dd++) {
                        cc[dd] = sc.nextInt();
                }
                int[] dd = new int[n];
                for (int ee = 0; ee < n; ee++) {
                        dd[ee] = sc.nextInt();
                }
                int[] ee = new int[n];
                for (int ff = 0; ff < n; ff++) {
                        ee[ff] = sc.nextInt();
                }
                int[] ff = new int[n];
                for (int gg = 0; gg < n; gg++) {
                        ff[gg] = sc.nextInt();
                }
                int[] gg = new int[n];
                for (int hh = 0; hh < n; hh++) {
                        gg[hh] = sc.nextInt();
                }
                int[] hh = new int[n];
                for (int ii = 0; ii < n; ii++) {
                        hh[ii] = sc.nextInt();
                }
                int[] ii = new int[
