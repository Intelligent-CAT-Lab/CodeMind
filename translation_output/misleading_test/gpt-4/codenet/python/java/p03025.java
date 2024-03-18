To achieve the equivalent functionality in Java, first you need to remember that Java is statically typed and does not support the kind of list comprehension found in Python. Also, Java does not support operator overloading, so multiplication and modulo operations should be explicitly called. Here is a Java translation of the provided Python code:

```java
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;
import java.math.BigInteger;

public class Main {
    
    private static final long P = (long) 1e9 + 7;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        sc.close();

        long[] f = fact(2 * n);
        long[] invf = invfact(2 * n, f);

        long[] powA = new long[n + 1];
        long[] powB = new long[n + 1];
        long inv100 = pow(100, P - 2);
        a = a * inv100 % P;
        b = b * inv100 % P;
        c = c * inv100 % P;

        long invAB = pow(a + b, P - 2);
        a = a * invAB % P;
        b = b * invAB % P;

        powA[0] = 1;
        powB[0] = 1;
        for (int i = 1; i <= n; i++) {
            powA[i] = powA[i - 1] * a % P;
            powB[i] = powB[i - 1] * b % P;
        }
        
        long ans = 0;
        
        for (int m = n; m < 2 * n; m++) {
            ans += comb(m - 1, n - 1, f, invf) * (powA[n] * powB[m - n] % P + powA[m - n] * powB[n] % P) % P * m % P;
            ans %= P;
        }

        ans *= pow(1 - c + P, P - 2);
        ans %= P;

        System.out.println(ans);
    }

    public static long[] fact(int n) {
        long[] f = new long[n + 1];
        f[0] = 1;
        for (int i = 1; i <= n; i++) {
            f[i] = (f[i - 1] * i) % P;
        }
        return f;
    }

    public static long[] invfact(int n, long[] f) {
        long[] inv = new long[n + 1];
        inv[n] = pow(f[n], P - 2);
        for (int i = n; i > 0; i--) {
            inv[i - 1] = (inv[i] * i) % P;
        }
        return inv;
    }

    public static long comb(int a, int b, long[] f, long[] invf) {
        if (a < b) return 0;
        if (a < 0 || b < 0) return 0;
        return f[a] * invf[b] % P * invf[a - b] % P;
    }

    public static long pow(long base, long exponent) {
        return BigInteger.valueOf(base).modPow(BigInteger.valueOf(exponent), BigInteger.valueOf(P)).longValue();
    }
}
```

Please make sure you test this Java program with the input provided to verify its functionality, as it's a manual translation and there may still be small errors that need to be corrected.
