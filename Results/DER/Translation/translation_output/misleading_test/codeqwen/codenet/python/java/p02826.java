Here is the Java version of the provided Python code:

```java
import java.util.*;
import java.io.*;

public class Main {
    static final int MOD = 998244353;
    static final int U = (int) 1e5;
    static final int[] fact = new int[U + 1];
    static final int[] fact_inv = new int[U + 1];
    static final int[] inv = new int[U + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int MOD = Integer.parseInt(st.nextToken());

        make_fact(U, MOD);
        Arrays.fill(inv, 1);
        for (int i = 2; i <= U; i++) {
            inv[i] = (int) ((MOD - (long) MOD / i) * (long) inv[MOD % i] % MOD);
        }

        int[] f = new int[N + N + 10];
        for (int x = 1; x <= N / 2; x++) {
            for (int i = x; i <= N; i += x) {
                f[i] += 2 * inv[1 + (i - 1) / x];
                f[i] %= MOD;
            }
        }
        if (N % 2 == 1) {
            int x = (N + 1) / 2;
            for (int i = x; i <= N; i += x) {
                f[i] += inv[1 + (i - 1) / x];
                f[i] %= MOD;
            }
        }

        int[] g = fps_exp(f, MOD);
        int answer = 0;
        for (int i = 0; i < N; i++) {
            answer += g[i];
            answer %= MOD;
        }
        System.out.
