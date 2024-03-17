

```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int mod = 998244353;
        int[] X = new int[2 * K - 1];
        int[] frac = new int[N + K];
        frac[0] = 1;
        for (int i = 1; i < N + K; i++) {
            frac[i] = (int) ((i * frac[i - 1]) % mod);
        }
        int[] invf = new int[N + K + 1];
        for (int i = 0; i < N + K + 1; i++) {
            invf[i] = inved(frac[i], mod);
        }
        for (int k = 2; k < K + 2; k++) {
            int S = 0;
            int sign = 1;
            int l = k / 2;
            for (int m = 0; m < Math.min(l + 1, N / 2 + 1); m++) {
                int prod = (int) ((sign * (frac[l] * frac[N + K - 2 * m - 1]) % mod) % mod);
                prod = (int) ((prod * (invf[m] * invf[l - m]) % mod) % mod);
                prod = (int) ((prod * (invf[N - 2 * m] * invf[K - 1]) % mod) % mod);
                S += prod;
                S %= mod;
                sign *= -1;
            }
            X[k - 2] = S;
            X[2 * K - k] = S;
        }
        for (int i = 0; i < 2 * K - 1; i++) {
            System.out.println(X[i]);
        }
    }

    public static int inved(int a, int mod) {
        int x = 1, y = 0, u = 0, v = 1, k = a, l = mod;
        while (l != 0) {
            int temp = x - u * (k / l);
            x = u;
            u = temp;
            temp = y - v * (k / l);
            y = v;
            v = temp;
            temp = k % l;
            k = l;
            l = temp;
        }
        return x % mod;
    }
}
```

## 2.

### 2.1

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            C[i] = sc.nextInt();
        }
        int[] D = new int[N];
        for (int i = 0; i < N; i++) {
            D[i] = sc.nextInt();
        }
        int[] E = new int[N];
        for (int i = 0; i < N; i++) {
            E[i] = sc.nextInt();
        }
        int[] F = new int[N];
        for (int i = 0; i < N; i++) {
            F[i] = sc.nextInt();
        }
        int[] G = new int[N];
        for (int i = 0; i < N; i++) {
            G[i] = sc.nextInt();
        }
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }
        int[] I = new int[N];
        for (int i = 0; i < N; i++) {
            I[i] = sc.nextInt();
        }
        int[] J = new int[N];
        for (int i = 0; i < N; i++) {
            J[i] = sc.nextInt();
        }
        int[] K = new int[N];
        for (int i = 0; i < N; i++) {
            K[i] = sc.nextInt();
        }
        int[] L = new int[N];
        for (int i = 0; i < N; i++) {
            L[i] = sc.nextInt();
        }
        int[] M = new int[N];
        for (int i = 0; i < N; i++) {
            M[i] = sc.nextInt();
        }
        int[] N = new int[N];
        for (int i = 0; i < N; i++) {
            N[i] = sc.nextInt();
        }
        int[] O = new int[N];
        for (int i = 0; i < N; i++) {
            O[i] = sc.nextInt();
        }
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }
        int[] Q = new int[N];
        for (int i = 0; i < N; i++) {
            Q[i] = sc.nextInt();
        }
        int[] R = new int[N];
        for (int i = 0; i < N; i++) {
            R[i] = sc.nextInt();
        }
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextInt();
        }
        int[] T = new int[N];
        for (int i = 0; i < N; i++) {
            T[i] = sc.nextInt();
        }
        int[] U = new int[N];
        for (int i = 0; i < N; i++) {
            U[i] = sc.nextInt();
        }
        int[] V = new int[N];
        for (int i = 0; i < N; i++) {
            V[i] = sc.nextInt();
        }
        int[] W = new int[N];
        for (int i = 0; i < N; i++) {
            W[i] = sc.nextInt();
        }
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
        }
        int[] Y = new int[N];
       
