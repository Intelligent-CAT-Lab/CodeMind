Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        // mod = 998244353
        int mod = 998244353;
        int ans = 0;

        //-------------------------------------------------------------------
        int MAX_N = (int) Math.pow(10, 6);

        int[] fact = new int[MAX_N + 4];
        fact[0] = 1;
        for (int i = 1; i <= MAX_N + 3; i++) {
            fact[i] = (fact[i - 1] * (i + 1)) % mod;
        }

        int[] fact_inv = new int[MAX_N + 4];
        fact_inv[MAX_N + 3] = pow(fact[MAX_N + 3], mod - 2, mod);
        for (int i = MAX_N + 2; i >= 0; i--) {
            fact_inv[i] = (fact_inv[i + 1] * (i + 1)) % mod;
        }

        int mod_comb_k(int n, int k, int mod) {
            return fact[n] * fact_inv[k] % mod * fact_inv[n - k] % mod;
        }
        //-------------------------------------------------------------------

        for (int x = 0; x <= k; x++) {
            ans += m * pow(m - 1, n - 1 - x, mod) * mod_comb_k(n - 1, x, mod);
            ans %= mod;
        }
        if (ans < 0) {
            ans += mod;
        }
        System.out.println(ans);
    }

    public static int pow(int base, int exponent, int mod) {
        int result = 1;
        base = base % mod;
