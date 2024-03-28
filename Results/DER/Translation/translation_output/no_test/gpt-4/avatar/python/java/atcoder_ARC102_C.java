Here's the Python code translated into Java. Note that in Java, we typically follow the camelCase naming convention, and we must handle user input and array initialization differently than in Python:

```java
import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;

public class Main {

    private static final int mod = 998244353;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        
        long[] invf = new long[N + K + 1];
        long[] frac = new long[N + K];
        invf[0] = 1;
        frac[0] = 1;
        for (int i = 1; i < N + K; i++) {
            frac[i] = (frac[i - 1] * i) % mod;
        }
        for (int i = 0; i < N + K + 1; i++) {
            invf[i] = inverseMod(frac[i], mod);
        }
        
        long[] X = new long[2 * K - 1];
        for (int k = 2; k < K + 2; k++) {
            long S = 0;
            long sign = 1;
            int l = k / 2;
            for(int m = 0; m < Math.min(l + 1, N / 2 + 1); m++) {
                long prod = ((frac[l] * frac[N + K - 2 * m - 1]) % mod * invf[m]) % mod;
                prod = (prod * invf[l - m]) % mod;
                prod = (prod * invf[N - 2 * m]) % mod;
                prod = (prod * invf[K - 1]) % mod;
                S += sign * prod;
                S %= mod;
                sign *= -1;
            }
            X[k - 2] = S;
            X[2 * K - k] = S;
        }
        
        for (long x : X) {
            System.out.println(x);
        }

        scanner.close();
    }
    
    private static long inverseMod(long a, int mod) {
        BigInteger inv = BigInteger.valueOf(a).modInverse(BigInteger.valueOf(mod));
        return inv.longValue();
    }
}
```

In this Java code, I implemented the `inverseMod` function to compute the modular multiplicative inverse using `BigInteger`'s `modInverse` method because it greatly simplifies the process compared to manually implementing the extended Euclidean algorithm. Everything is wrapped inside a `Main` class, which is customary in Java applications, and I make use of `Scanner` for input handling. Additionally, Java arrays are initialized to their default values; in the case of `long` arrays, this is 0, so I skipped the initial explicit initialization that is present in the Python example.
