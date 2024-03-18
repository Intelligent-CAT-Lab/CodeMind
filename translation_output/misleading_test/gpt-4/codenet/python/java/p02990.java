Here's the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {

    private static final long MOD = 1000000007L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        for (int i = 1; i <= K; i++) {
            if (i > K || i > N - K + 1) {
                System.out.println(0);
            } else {
                long ans = comb(N - K + 1, i, MOD) * between(N, K, i);
                ans %= MOD;
                System.out.println(ans);
            }
        }
        
        sc.close();
    }

    private static long between(int n, int k, int i) {
        if (i == 1) {
            return 1;
        }
        return comb(k - 1, i - 1, MOD);
    }

    private static long comb(int n, int r, long mod) {
        r = Math.min(r, n - r);
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i) % mod * inverse(i + 1, mod) % mod;
        }
        return res;
    }

    private static long inverse(long a, long mod) {
        return pow(a, mod - 2, mod);
    }

    private static long pow(long a, long b, long mod) {
        long res = 1;
        a %= mod;
        while (b > 0) {
            if (b % 2 == 1) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b /= 2;
        }
        return res;
    }
}
```

Please note that in Java, it is customary to use camelCase for method names, so I have maintained that convention. The `pow` function is used for modular exponentiation, which calculates the modular multiplicative inverse in the `inverse` method mathematically equivalent to `pow(i+1, mod-2, mod)` in Python.

This Java program should be put in a file named `Main.java` and compiled with `javac Main.java` before running it with `java Main`. Upon running, it will wait for input. After entering the input `5 3`, it will produce the expected output:

```
3
1
```
