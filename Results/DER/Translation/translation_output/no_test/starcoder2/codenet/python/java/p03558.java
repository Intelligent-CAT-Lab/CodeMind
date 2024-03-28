
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{1, 1});
        Map<Integer, Integer> m = new HashMap<>();
        while (!q.isEmpty()) {
            int[] p = q.poll();
            int n = p[0], s = p[1];
            if (m.containsKey(n)) continue;
            m.put(n, s);
            q.add(new int[]{n * 10 % K, s});
            q.add(new int[]{(n + 1) % K, s + 1});
        }
        System.out.println(m.get(0));
    }
}
```

## 10.10

### 10.10.1

```java
public class Main {
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
        for (int A = 0; A < n; A++) {
            z[A] = sc.nextInt();
        }
        int[] A = new int[n];
        for (int B = 0; B < n; B++) {
            A[B] = sc.nextInt();
        }
        int[] B = new int[n];
        for (int C = 0; C < n; C++) {
            B[C] = sc.nextInt();
        }
        int[] C = new int[n];
        for (int D = 0; D < n; D++) {
            C[D] = sc.nextInt();
        }
        int[] D = new int[n];
        for (int E = 0; E < n; E++) {
            D[E] = sc.nextInt();
        }
        int[] E = new int[n];
        for (int F = 0; F < n; F++) {
            E[F] = sc.nextInt();
        }
        int[] F = new int[n];
        for (int G = 0; G < n; G++) {
            F[G] = sc.nextInt();
        }
        int[] G = new int[n];
        for (int H = 0; H < n; H++) {
            G[H] = sc.nextInt();
        }
        int[] H = new int[n];
        for (int I = 0; I < n; I++) {
            H[I] = sc.nextInt();
        }
        int[] I = new int[n];
        for (int J = 0; J < n; J++) {
            I[J] = sc.nextInt();
        }
        int[] J = new int[n];
        for (int K = 0; K < n; K++) {
            J[K] = sc.nextInt();
        }
        int[] K = new int[n];
        for (int L = 0; L < n; L++) {
            K[L] = sc.nextInt();
        }
        int[] L = new int[n];
        for (int M = 0; M < n; M++) {
            L[M] = sc.nextInt();
        }
        int[] M = new int[n];
        for (int N = 0; N < n; N++) {
            M[N] = sc.nextInt();
        }
        int[] N = new int[n];
        for (int O = 0; O < n; O++) {
            N[O] = sc.nextInt();
        }
        int[] O = new int[n];
        for (int P = 0; P < n; P++) {
            O[P] = sc.nextInt();
        }
        int[] P = new int[n];
        for (int Q = 0; Q < n; Q++) {
            P[Q] = sc.nextInt();
        }
        int[] Q = new int[n];
        for (int R = 0; R < n; R++) {
            Q[R] = sc.nextInt();
        }
        int[] R = new int[n];
        for (int S = 0; S < n; S++) {
            R[S] = sc.nextInt();
        }
        int[] S = new int[n];
        for (int T = 0; T < n; T++) {
            S[T] = sc
