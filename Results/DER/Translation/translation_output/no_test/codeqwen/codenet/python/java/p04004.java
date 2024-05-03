Here is the Java version of your Python code:

```java
import java.util.*;
import java.io.*;

public class Main {
    static final int MOD = 1000000007;
    static final int U = 1000000;
    static final int[] power2 = makePower(2, U, MOD);
    static final int[] power2_inv = makePower(pow(2, MOD - 2, MOD), U, MOD);
    static final int[] power3 = makePower(3, U, MOD);
    static final int[] power3_inv = makePower(pow(3, MOD - 2, MOD), U, MOD);
    static final int[] fact = makeFact(U, MOD);
    static final int[] fact_inv = makeFact(U, MOD);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] x = new int[N + M];
        Arrays.fill(x, 0);
        for (int i = 1; i < N + M; i++) {
            x[i] = (-1) * power2[i - 1] * power3_inv[K + 1 + i - 1] % MOD;
        }
        for (int i = 1; i < N + M; i++) {
            x[i] = (x[i] * fact[K + 1 + i - 1] * fact_inv[K] % MOD * fact_inv[i - 1] % MOD) % MOD;
        }
        for (int i = 0; i < N + M; i++) {
            x[i] = (x[i] * power3[K + i] * power2_inv[i] % MOD) % MOD;
        }

        int[] coef = new int[N + M];

