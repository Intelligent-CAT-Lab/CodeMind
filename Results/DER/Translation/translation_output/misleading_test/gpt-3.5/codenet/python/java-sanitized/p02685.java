import java.util.Scanner;

public class p02685 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int mod = 998244353;
        long ans = 0;
        
        int MAX_N = 1000000;
        long[] fact = new long[MAX_N + 4];
        long[] fact_inv = new long[MAX_N + 4];
        
        fact[0] = 1;
        for (int i = 1; i < MAX_N + 3; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
        }
        
        fact_inv[MAX_N + 3] = pow(fact[MAX_N + 3], mod - 2, mod);
        for (int i = MAX_N + 2; i >= 0; i--) {
            fact_inv[i] = (fact_inv[i + 1] * (i + 1)) % mod;
        }
        
        for (int x = 0; x <= k; x++) {
            ans += m * pow(m - 1, n - 1 - x, mod) * mod_comb_k(n - 1, x, mod) % mod;
            ans %= mod;
        }
        
        if (ans < 0) {
            ans += mod;
        }
        
        System.out.println(ans);
    }
    
    public static long pow(long base, long exp, long mod) {
        long result = 1;
        base = base % mod;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            exp = exp >> 1;
            base = (base * base) % mod;
        }
        return result;
    }
    
    public static long mod_comb_k(int n, int k, int mod, long[] fact, long[] fact_inv) {
        return fact[n] * fact_inv[k] % mod * fact_inv[n - k] % mod;
    }
}