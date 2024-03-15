```java
import java.util.*;

class Main {
    
    static long modfac(int n, int MOD) {
        long f = 1;
        List<Long> factorials = new ArrayList<>();
        factorials.add(1L);
        for (int m = 1; m <= n; m++) {
            f *= m;
            f %= MOD;
            factorials.add(f);
        }
        long inv = pow(f, MOD - 2, MOD);
        List<Long> invs = new ArrayList<>(Collections.nCopies(n + 1, 1L));
        invs.set(n, inv);
        for (int m = n; m > 1; m--) {
            inv *= m;
            inv %= MOD;
            invs.set(m - 1, inv);
        }
        return factorials.get(n) * invs.get(n - r) * invs.get(r) % MOD;
    }
    
    static long pow(long base, int exp, int MOD) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp /= 2;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int mod = 998244353;
        
        long[] fac = new long[N + 10];
        long[] inv = new long[N + 10];
        
        for (int m = 1; m <= N + 10; m++) {
            fac[m] = fac[m - 1] * m % mod;
        }
        
        inv[N + 10] = pow(fac[N + 10], mod - 2, mod);
        for (int m = N + 10; m > 1; m--) {
            inv[m - 1] = inv[m] * m % mod;
        }
        
        long ans = 0;
        
        for (int two = 0; two <= N; two++) {
            for (int one = 0; one <= N; one++) {
                if (one + two > N) {
                    break;
                }
                
                int dist = one + two * 2;
                long zero = modnCr(N, one + two, mod, fac, inv);
                long now = 0;

                if (dist < X) {
                    now = modnCr(one + two, one, mod, fac, inv) * zero;
                } else if (dist == X) {
                    continue;
                } else if (dist < 2 * X) {
                    if ((dist - X) % 2 == 0) {
                        continue;
                    }
                    int dtwo = two - (dist - X + 1);
                    if (dtwo >= 0) {
                        now = modnCr(one + dtwo, one, mod, fac, inv) * zero;
                    }
                } else if (X % 2 == 1 && one == 0) {
                    now = zero;
                }
                
                ans += now;
                ans %= mod;
            }
        }
        
        System.out.println(ans);
        scanner.close();
    }
}
```

