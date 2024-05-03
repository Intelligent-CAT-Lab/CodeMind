Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    static final int MOD = 1000000007;
    static final int U = 600005;
    static int[] fact = new int[U + 1];
    static int[] fact_inv = new int[U + 1];
    static int[] comb = new int[U + 1];

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

        int U = N - M;
        for (int i = 0; i <= U; i++) {
            comb[i] = fact[U] * fact_inv[i] % MOD * fact_inv[U - i] % MOD;
        }
        for (int i = 1; i <= U; i += 2) {
            comb[i] = (comb[i] * -1) % MOD;
        }

        for (int i = M; i <= R; i++) {
            comb[i] = (comb[i] * P(i - M)) % MOD;
        }

        for (int i = M; i <= R; i++) {
            comb[i] = (comb[i] - comb[i - 1] + MOD) % MOD;
        }

        int[] Q = new int[R + 1];
        for (int i = 0; i <= R; i++) {
            Q
