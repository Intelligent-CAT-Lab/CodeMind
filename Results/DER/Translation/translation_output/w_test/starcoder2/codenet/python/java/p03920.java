
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int w = 0;
        for (int i = 0; i < 100000; i++) {
            if (i * (i + 1) / 2 < N && N <= (i + 1) * (i + 2) / 2) {
                w = i + 1;
                break;
            }
        }
        for (int i = w; i > 0; i--) {
            if (N >= i) {
                System.out.println(i);
                N -= i;
            }
        }
    }
}
```


```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[N];
        for (int i = 0; i < N; i++) {
            c[i] = sc.nextInt();
        }
        int[] d = new int[N];
        for (int i = 0; i < N; i++) {
            d[i] = sc.nextInt();
        }
        int[] e = new int[N];
        for (int i = 0; i < N; i++) {
            e[i] = sc.nextInt();
        }
        int[] f = new int[N];
        for (int i = 0; i < N; i++) {
            f[i] = sc.nextInt();
        }
        int[] g = new int[N];
        for (int i = 0; i < N; i++) {
            g[i] = sc.nextInt();
        }
        int[] h = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = sc.nextInt();
        }
        int[] i = new int[N];
        for (int j = 0; j < N; j++) {
            i[j] = sc.nextInt();
        }
        int[] j = new int[N];
        for (int k = 0; k < N; k++) {
            j[k] = sc.nextInt();
        }
        int[] k = new int[N];
        for (int l = 0; l < N; l++) {
            k[l] = sc.nextInt();
        }
        int[] l = new int[N];
        for (int m = 0; m < N; m++) {
            l[m] = sc.nextInt();
        }
        int[] m = new int[N];
        for (int n = 0; n < N; n++) {
            m[n] = sc.nextInt();
        }
        int[] n = new int[N];
        for (int o = 0; o < N; o++) {
            n[o] = sc.nextInt();
        }
        int[] o = new int[N];
        for (int p = 0; p < N; p++) {
            o[p] = sc.nextInt();
        }
        int[] p = new int[N];
        for (int q = 0; q < N; q++) {
            p[q] = sc.nextInt();
        }
        int[] q = new int[N];
        for (int r = 0; r < N; r++) {
            q[r] = sc.nextInt();
        }
        int[] r = new int[N];
        for (int s = 0; s < N; s++) {
            r[s] = sc.nextInt();
        }
        int[] s = new int[N];
        for (int t = 0; t < N; t++) {
            s[t] = sc.nextInt();
        }
        int[] t = new int[N];
        for (int u = 0; u < N; u++) {
            t[u] = sc.nextInt();
        }
        int[] u = new int[N];
        for (int v = 0; v < N; v++) {
            u[v] = sc.nextInt();
        }
        int[] v = new int[N];
        for (int w = 0; w < N; w++) {
            v[w] = sc.nextInt();
        }
        int[] w = new int[N];
        for (int x = 0; x < N; x++) {
            w[x] = sc.nextInt();
        }
        int[] x = new int[N];
        for (int y = 0; y < N; y++) {
            x[y] = sc.nextInt();
        }
        int[] y = new int[N];
        for (int z = 0; z < N; z++) {
            y[z] = sc.nextInt();
        }
        int[] z = new int[N];
        for (int A = 0; A < N; A++) {
            z[A] = sc.nextInt();
        }
        int[] A = new int[N];
        for (int B = 0; B < N; B++) {
            A[B] = sc.nextInt();
        }
        int[] B = new int[N];
        for (int C = 0; C < N; C++) {
            B[C] = sc.nextInt();
        }
        int[] C = new int[N];
        for (int D = 0; D < N; D++) {
            C[D] = sc.nextInt();
        }
        int[] D = new int[N];
        for (int E = 0; E < N; E++) {
            D[E] = sc.nextInt();
        }
        int[] E = new int[N];
        for (int F = 0; F < N; F++) {
            E[F] = sc.nextInt();
        }
        int[] F = new int[N];
        for (int G = 0; G < N; G++) {
            F[G] = sc.nextInt();
        }
        int[] G = new int[N];
        for (int H = 0; H < N; H++) {
            G[H] = sc.nextInt();
        }
        int[] H = new int[N];
        for (int I = 0; I < N; I++) {
            H[I] = sc.nextInt();
        }
        int[] I = new int[N];
        for (int J = 0; J < N; J++) {
            I[J] = sc.nextInt();
        }
        int[] J = new int[N];
        for (int K = 0; K < N; K++) {
            J[K] = sc.nextInt();
        }
        int[] K = new int[N];
        for (int L = 0; L < N; L++) {
            K[L] = sc.nextInt();
        }
        int[] L = new int[N];
        for (int M = 0; M < N; M++) {
            L[M] = sc.nextInt();
        }
        int[] M = new int[N];
        for (int N = 0; N < N; N++) {
            M[N] = sc.nextInt();
        }
        int[] O = new int[N];
        for (int P = 0; P < N; P++) {
            O[P] = sc.nextInt();
        }
        int[] P = new int[N];
        for (int Q = 0; Q < N; Q++) {
            P[Q] = sc.nextInt();
        }
        int[] Q = new int[N];
        for (int R = 0; R < N; R++) {
            Q[R] = sc.nextInt();
        }
        int[] R = new int[N];
        for (int S = 0; S < N; S++) {
            R[S] = sc.nextInt();
        }
        int[] S = new int[N];
        for (int T = 0; T < N; T++) {
            S[
