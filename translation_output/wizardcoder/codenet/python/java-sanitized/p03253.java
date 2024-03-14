import java.util.*;

public class p03253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int MAX = 2*10**5+1;
        int MOD = 10**9+7;
        int[] fact = new int[MAX];
        int[] inv = new int[MAX];
        int[] invfact = new int[MAX];

        // build factorial and inverse factorial
        fact[0] = inv[0] = invfact[0] = 1;
        fact[1] = inv[1] = invfact[1] = 1;
        for (int i = 2; i < MAX; i++) {
            fact[i] = (fact[i-1]*i)%MOD;
            inv[i] = (inv[MOD%i]*(MOD-MOD/i+1))%MOD;
            invfact[i] = (invfact[i-1]*inv[i])%MOD;
        }

        // count combinations
        int ans = 1;
        Map<Integer, Integer> factors = primeFactorization(m);
        for (int e : factors.values()) {
            ans = (ans * nCk(e+n-1, e))%MOD;
        }
        System.out.println(ans);
    }

    // count combinations
    public static int nCk(int n, int k) {
        if (n < k || n < 0 || k < 0) {
            return 0;
        }
        return (fact[n]*invfact[k])%MOD * invfact[n-k]%MOD;
    }

    // prime factorization
    public static Map<Integer, Integer> primeFactorization(int n) {
        Map<Integer, Integer> ret = new HashMap<>();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                ret.put(i, ret.getOrDefault(i, 0) + 1);
                n /= i;
            }
        }
        if (n!= 1) {
            ret.put(n, 1);
        }
        return ret;
    }
}