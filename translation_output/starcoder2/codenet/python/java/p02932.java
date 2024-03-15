
```java
import java.util.*;
import java.io.*;

public class Main {
    static long MOD = 1000000007;
    static long[] fact;
    static long[] fact_inv;
    static long[] P;
    static long[] Q;
    static int N, M, L, R;

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        N = sc.nextInt();
        M = sc.nextInt();
        L = sc.nextInt();
        R = sc.nextInt();

        int U = 600000 + 100;
        fact = new long[U + 1];
        fact_inv = new long[U + 1];
        fact[0] = 1;
        for (int n = 1; n <= U; n++) {
            fact[n] = fact[n - 1] * n % MOD;
        }
        fact_inv[U] = pow(fact[U], MOD - 2, MOD);
        for (int n = U; n >= 1; n--) {
            fact_inv[n - 1] = fact_inv[n] * n % MOD;
        }

        P = new long[R + 1];
        for (int i = M; i <= U; i++) {
            P[i - M] = fact[i] * fact_inv[i - M] % MOD * fact_inv[M] % MOD;
        }
        for (int i = 1; i <= R; i++) {
            P[i] = (P[i] + P[i - 1]) % MOD;
        }

        Q = new long[R + 1];
        for (int i = 0; i <= R; i++) {
            Q[i] = fact[N + i] * fact_inv[i] % MOD * fact_inv[N] % MOD;
        }

        System.out.println(f(R) - f(L - 1));
    }

    static long f(int R) {
        long total = fact[R + N] * fact_inv[R] % MOD * fact_inv[N] % MOD;
        long x = 0;
        for (int i = 0; i <= R; i++) {
            x = (x + Q[i] * P[i] % MOD) % MOD;
        }
        long coef = fact[N] * fact_inv[M] % MOD * fact_inv[N - M] % MOD;
        return (total - x * coef % MOD + MOD) % MOD;
    }

    static long pow(long a, long b, long mod) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = res * a % mod;
            }
            a = a * a % mod;
            b >>= 1;
        }
        return res;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
```


```

java code:
```java
import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static int[] A;
    static int[] B;
    static int[] C;
    static int[] D;
    static int[] E;
    static int[] F;
    static int[] G;
    static int[] H;
    static int[] I;
    static int[] J;
    static int[] K;
    static int[] L;
    static int[] X;
    static int[] Y;
    static int[] Z;
    static int[] U;
    static int[] V;
    static int[] W;
    static int[] S;
    static int[] T;
    static int[] P;
    static int[] Q;
    static int[] R;

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        N = sc.nextInt();
        M = sc.nextInt();
        A = new int[N];
        B = new int[N];
        C = new int[N];
        D = new int[N];
        E = new int[N];
        F = new int[N];
        G = new int[N];
        H = new int[N];
        I = new int[N];
        J = new int[N];
        K = new int[N];
        L = new int[N];
        X = new int[M];
        Y = new int[M];
        Z = new int[M];
        U = new int[M];
        V = new int[M];
        W = new int[M];
        S = new int[M];
        T = new int[M];
        P = new int[M];
        Q = new int[M];
        R = new int[M];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
            D[i] = sc.nextInt();
            E[i] = sc.nextInt();
            F[i] = sc.nextInt();
            G[i] = sc.nextInt();
            H[i] = sc.nextInt();
            I[i] = sc.nextInt();
            J[i] = sc.nextInt();
            K[i] = sc.nextInt();
            L[i] = sc.nextInt();
        }
        for (int i = 0; i < M; i++) {
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
            Z[i] = sc.nextInt();
            U[i] = sc.nextInt();
            V[i] = sc.nextInt();
            W[i] = sc.nextInt();
            S[i] = sc.nextInt();
            T[i] = sc.nextInt();
            P[i] = sc.nextInt();
            Q[i] = sc.nextInt();
            R[i] = sc.
