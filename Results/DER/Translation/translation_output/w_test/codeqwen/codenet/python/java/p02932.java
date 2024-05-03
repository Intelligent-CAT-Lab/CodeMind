Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    static final int MOD = 1000000007;
    static final int U = 600005;
    static int[] fact = new int[U + 1];
    static int[] fact_inv = new int[U + 1];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int L = scanner.nextInt();
        int R = scanner.nextInt();

        fact[0] = 1;
        for (int n = 1; n <= U; n++) {
            fact[n] = (fact[n - 1] * n) % MOD;
        }

        fact_inv[U] = pow(fact[U], MOD - 2, MOD);
        for (int n = U; n > 0; n--) {
            fact_inv[n - 1] = (fact_inv[n] * n) % MOD;
        }

        int[] comb = new int[U + 1];
        int U_ = N - M;
        comb[U_] = fact[U_] * fact_inv[U_] % MOD * fact_inv[U_] % MOD;
        for (int i = U_ - 1; i >= 0; i--) {
            comb[i] = (comb[i + 1] * (M + i + 1)) % MOD;
        }

        int[] P = new int[R + 1];
        for (int i = M; i <= R; i++) {
            P[i - M] = comb[i];
        }

        for (int i = M; i < R; i++) {
            P[i + 1] = (P[i + 1] - P[i]) % MOD;
        }

        int[] Q = new int[R + 1];
        for (int i = 0; i <= R; i++) {
            Q[i
