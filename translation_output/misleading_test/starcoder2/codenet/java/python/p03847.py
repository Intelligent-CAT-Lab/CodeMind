
```python
MOD = 1000000007
N = int(input())
n = [0] * 61
for i in range(61):
    n[i] = N % 2
    N //= 2
dp = [[0] * 3 for _ in range(61)]
if n[60] == 0:
    dp[60][0] = 1
else:
    dp[60][0] = 1
    dp[60][1] = 1
for i in range(59, -1, -1):
    dp[i][2] = (3 * dp[i + 1][2]) % MOD
    for j in range(3):
        c = 2 + n[i] - j
        if c >= 2:
            dp[i][2] = (dp[i][2] + dp[i + 1][1]) % MOD
        else:
            dp[i][c] = (dp[i][c] + dp[i + 1][1]) % MOD
    for j in range(3):
        c = n[i] - j
        if c < 0:
            pass
        else:
            dp[i][c] = (dp[i][c] + dp[i + 1][0]) % MOD
ans = dp[0][0]
ans = (ans + dp[0][1]) % MOD
ans = (ans + dp[0][2]) % MOD
print(ans)
```

## 03848

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
1

```
import java.util.*;

public class p03848 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    for(int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }
    int[] b = new int[N];
    for(int i = 0; i < N; i++) {
      b[i] = sc.nextInt();
    }
    int[] c = new int[N];
    for(int i = 0; i < N; i++) {
      c[i] = sc.nextInt();
    }
    int[] d = new int[N];
    for(int i = 0; i < N; i++) {
      d[i] = sc.nextInt();
    }
    int[] e = new int[N];
    for(int i = 0; i < N; i++) {
      e[i] = sc.nextInt();
    }
    int[] f = new int[N];
    for(int i = 0; i < N; i++) {
      f[i] = sc.nextInt();
    }
    int[] g = new int[N];
    for(int i = 0; i < N; i++) {
      g[i] = sc.nextInt();
    }
    int[] h = new int[N];
    for(int i = 0; i < N; i++) {
      h[i] = sc.nextInt();
    }
    int[] i = new int[N];
    for(int j = 0; j < N; j++) {
      i[j] = sc.nextInt();
    }
    int[] j = new int[N];
    for(int k = 0; k < N; k++) {
      j[k] = sc.nextInt();
    }
    int[] k = new int[N];
    for(int l = 0; l < N; l++) {
      k[l] = sc.nextInt();
    }
    int[] l = new int[N];
    for(int m = 0; m < N; m++) {
      l[m] = sc.nextInt();
    }
    int[] m = new int[N];
    for(int n = 0; n < N; n++) {
      m[n] = sc.nextInt();
    }
    int[] o = new int[N];
    for(int p = 0; p < N; p++) {
      o[p] = sc.nextInt();
    }
    int[] p = new int[N];
    for(int q = 0; q < N; q++) {
      p[q] = sc.nextInt();
    }
    int[] q = new int[N];
    for(int r = 0; r < N; r++) {
      q[r] = sc.nextInt();
    }
    int[] r = new int[N];
    for(int s = 0; s < N; s++) {
      r[s] = sc.nextInt();
    }
    int[] s = new int[N];
    for(int t = 0; t < N; t++) {
      s[t] = sc.nextInt();
    }
    int[] t = new int[N];
    for(int u = 0; u < N; u++) {
      t[u] = sc.nextInt();
    }
    int[] u = new int[N];
    for(int v = 0; v < N; v++) {
      u[v] = sc.nextInt();
    }
    int[] v = new int[N];
    for(int w = 0; w < N; w++) {
      v[w] = sc.nextInt();
    }
    int[] w = new int[N];
    for(int x = 0; x < N; x++) {
      w[x] = sc.nextInt();
    }
    int[] x = new int[N];
    for(int y = 0; y < N; y++) {
      x[y] = sc.nextInt();
    }
    int[] y = new int[N];
    for(int z = 0; z < N; z++) {
      y[z] = sc.nextInt();
    }
    int[] z = new int[N];
    for(int A = 0; A < N; A++) {
      z[A] = sc.nextInt();
    }
    int[] B = new int[N];
    for(int C = 0; C < N; C++) {
      B[C] = sc.nextInt();
    }
    int[] C = new int[N];
    for(int D = 0; D < N; D++) {
      C[D] = sc.nextInt();
    }
    int[] D = new int[N];
    for(int E = 0; E < N; E++) {
      D[E] = sc.nextInt();
    }
    int[] F = new int[N];
    for(int G = 0; G < N;
