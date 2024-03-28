Here's the translated Java code with the equivalent functionality as the original Python code:

```java
import java.io.*;
import java.util.*;

public class Main {
    static final int MOD = 1_000_000_007;
    static final int MAX = 3300;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] lis = new long[MAX];
        lis[0] = 1;

        for (int i = N; i > 0; i--) {
            long[] nlis = new long[MAX];
            
            for (int j = 0; j <= K; j++) {
                for (int last = 0; last < MAX; last++) {
                    
                    if (i < j) {
                        nlis[last] += lis[last];
                        nlis[last] %= MOD;
                    } else if (last + j / i + last < MAX) {
                        nlis[last + (last + j) / i] += lis[last];
                        nlis[last + (last + j) / i] %= MOD;
                    }
                }
            }
            lis = nlis;
        }

        long ans = (long)K * (K + 1) / 2 * pow(K + 1, N - 1, MOD) * N % MOD;

        for (int i = 0; i < MAX; i++) {
            ans -= lis[i] * i;
            ans %= MOD;
            if (ans < 0) ans += MOD;
        }
        
        System.out.println(ans);
    }
    
    static long pow(long base, int exp, int mod) {
        long res = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1)
                res = res * base % mod;
            base = base * base % mod;
            exp >>= 1;
        }
        return res;
    }
}
```

Please note that when translating Python code to Java, several changes need to be made, such as defining the types used, initializing arrays, and handling modular arithmetic properly. The `MOD` constant is used to perform modular operations to prevent integer overflow. The `pow` method mimics Python's `pow` function with modular exponentiation.
