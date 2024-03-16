```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int mod = 998244353;
        int ans = 0;
        
        // Precompute factorials and factorials inverses
        int MAX_N = 1000000;
        int[] fact = new int[MAX_N+4];
        int[] fact_inv = new int[MAX_N+4];
        
        fact[0] = 1;
        fact_inv[MAX_N+3] = pow(fact[MAX_N+3], mod-2, mod);
        for (int i = MAX_N+2; i >= 0; i--) {
            fact[i] = (int)(((long)fact[i+1] * (i+1)) % mod);
            fact_inv[i] = (int)(((long)fact_inv[i+1] * (i+1)) % mod);
        }

        for (int x = 0; x <= k; x++) {
            ans += m * pow(m-1, n-1-x, mod) % mod * mod_comb_k(n-1, x, mod) % mod;
            ans %= mod;
        }
        if (ans < 0) {
            ans += mod;
        }
        System.out.println(ans);
    }

    public static int pow(int base, int exponent, int mod) {
        if (exponent == 0) return 1;
        long result = 1;
        long power = base;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * power) % mod;
            }
            power = (power * power) % mod;
            exponent /= 2;
        }
        return (int)result;
    }

    public static int mod_comb_k(int n, int k, int mod) {
        int MAX_N = 1000000;
        int[] fact = new int[MAX_N+4];
        int[] fact_inv = new int[MAX_N+4];
        
        // Assuming fact and fact_inv arrays have been precomputed

        return (int)(((long)fact[n] * fact_inv[k] % mod) * fact_inv[n-k] % mod);
    }
}
```
```
