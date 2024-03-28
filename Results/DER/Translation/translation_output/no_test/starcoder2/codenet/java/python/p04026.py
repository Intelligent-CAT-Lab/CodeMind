
```
import sys

s = sys.stdin.readline().strip()
last = [-1] * 26
for i in range(len(s)):
    ch = ord(s[i]) - ord('a')
    if last[ch] >= 0 and i - last[ch] < 3:
        print(last[ch] + 1, i + 1)
        break
    last[ch] = i
else:
    print(-1, -1)
```

## 04027

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p04027 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
    }

    int[] b = new int[n];
    for (int i = 0; i < n; i++) {
      b[i] = scanner.nextInt();
    }

    int[] c = new int[n];
    for (int i = 0; i < n; i++) {
      c[i] = scanner.nextInt();
    }

    int[] d = new int[n];
    for (int i = 0; i < n; i++) {
      d[i] = scanner.nextInt();
    }

    int[] e = new int[n];
    for (int i = 0; i < n; i++) {
      e[i] = scanner.nextInt();
    }

    int[] f = new int[n];
    for (int i = 0; i < n; i++) {
      f[i] = scanner.nextInt();
    }

    int[] g = new int[n];
    for (int i = 0; i < n; i++) {
      g[i] = scanner.nextInt();
    }

    int[] h = new int[n];
    for (int i = 0; i < n; i++) {
      h[i] = scanner.nextInt();
    }

    int[] i = new int[n];
    for (int j = 0; j < n; j++) {
      i[j] = scanner.nextInt();
    }

    int[] j = new int[n];
    for (int k = 0; k < n; k++) {
      j[k] = scanner.nextInt();
    }

    int[] k = new int[n];
    for (int l = 0; l < n; l++) {
      k[l] = scanner.nextInt();
    }

    int[] l = new int[n];
    for (int m = 0; m < n; m++) {
      l[m] = scanner.nextInt();
    }

    int[] m = new int[n];
    for (int o = 0; o < n; o++) {
      m[o] = scanner.nextInt();
    }

    int[] o = new int[n];
    for (int p = 0; p < n; p++) {
      o[p] = scanner.nextInt();
    }

    int[] p = new int[n];
    for (int q = 0; q < n; q++) {
      p[q] = scanner.nextInt();
    }

    int[] q = new int[n];
    for (int r = 0; r < n; r++) {
      q[r] = scanner.nextInt();
    }

    int[] r = new int[n];
    for (int s = 0; s < n; s++) {
      r[s] = scanner.nextInt();
    }

    int[] s = new int[n];
    for (int t = 0; t < n; t++) {
      s[t] = scanner.nextInt();
    }

    int[] t = new int[n];
    for (int u = 0; u < n; u++) {
      t[u] = scanner.nextInt();
    }

    int[] u = new int[n];
    for (int v = 0; v < n; v++) {
      u[v] = scanner.nextInt();
    }

    int[] v = new int[n];
    for (int w = 0; w < n; w++) {
      v[w] = scanner.nextInt();
    }

    int[] w = new int[n];
    for (int x = 0; x < n; x++) {
      w[x] = scanner.nextInt();
    }

    int[] x = new int[n];
    for (int y = 0; y < n; y++) {
      x[y] = scanner.nextInt();
    }

    int[] y = new int[n];
    for (int z = 0; z < n; z++) {
      y[z] = scanner.nextInt();
    }

    int[] z = new int[n];
    for (int aa = 0; aa < n; aa++) {
      z[aa] = scanner.nextInt();
    }

    int[] aa = new int[n];
    for (int ab = 0; ab < n; ab++) {
      aa[ab] = scanner.nextInt();
    }

    int[] ab = new int[n];
    for (int ac = 0; ac < n; ac++) {
      ab[ac] = scanner.nextInt();
    }

    int[] ac = new int[n];
    for (int ad = 0; ad < n; ad++) {
      ac[ad] = scanner.nextInt();
    }

    int[] ad = new int[n];
    for (int ae = 0; ae < n; ae++) {
      ad[ae] = scanner.nextInt();
    }

    int[] ae = new int[n];
    for (int af = 0; af < n; af++) {
      ae[af] = scanner.nextInt();
    }

    int[] af = new int[n];
    for (int ag = 0; ag < n; ag++) {
      af[ag] = scanner.nextInt();
    }

    int[] ag = new int[n];
    for (int ah = 0; ah < n; ah++) {
      ag[ah] = scanner.nextInt();
    }

    int[] ah = new int[n];
    for (int ai = 0; ai < n; ai++) {
      ah[ai] = scanner.nextInt();
    }

    int[] ai = new int[n];
    for (int aj = 0; aj < n; aj++) {
      ai[aj] = scanner.nextInt();
    }

    int[] aj = new int[n];
    for (int ak = 0; ak < n; ak++) {
      aj[ak] = scanner.nextInt();
    }

    int[] ak = new int[n];
    for (int al = 0; al < n; al++) {
      ak[al] = scanner.nextInt();
    }

    int[] al = new int[n];
    for (int am = 0; am < n; am++) {
      al[am] = scanner.nextInt();
    }

    int[] am = new int[n];
    for (int an = 0; an < n; an++) {
      am[an] = scanner.nextInt();
    }

    int[] an = new int[n];
    for (int ao = 0; ao < n; ao++) {
      an[ao] = scanner.nextInt();
    }

    int[] ao = new int[n];
    for (int ap = 0; ap < n; ap++) {
      ao[ap] = scanner.nextInt();
    }

    int[] ap = new int[n];
    for (int aq = 0; aq < n; aq++) {
      ap[aq] = scanner.nextInt();
    }

    int[] aq = new int[n];
    for (int ar = 0; ar < n; ar++) {
      aq[ar] = scanner.nextInt();
    }

    int[] ar = new int[n];
    for (int as = 0; as < n; as++) {
      ar[as] = scanner.nextInt();
    }

    int
