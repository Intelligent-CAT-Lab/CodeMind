Below is the translated Java code for the given Python code. Pay attention to proper type conversions and the use of BigInteger for large integer arithmetic in Java for mod inverse operations.

```java
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static final int MOD = 998244353;
    
    // Function to calculate nCr % MOD
    static BigInteger modnCr(int n, int r, BigInteger[] fac, BigInteger[] inv) {
        return fac[n].multiply(inv[n-r]).multiply(inv[r]).mod(BigInteger.valueOf(MOD));
    }
    
    // Function to calculate factorials and their modular inverses
    static BigInteger[] modfac(int n) {
        BigInteger[] fac = new BigInteger[n + 1];
        BigInteger[] inv = new BigInteger[n + 1];
        BigInteger f = BigInteger.ONE;

        fac[0] = BigInteger.ONE;
        for (int m = 1; m <= n; m++) {
            f = f.multiply(BigInteger.valueOf(m)).mod(BigInteger.valueOf(MOD));
            fac[m] = f;
        }
        inv[n] = f.modInverse(BigInteger.valueOf(MOD));
        for (int m = n; m > 0; m--) {
            inv[m - 1] = inv[m].multiply(BigInteger.valueOf(m)).mod(BigInteger.valueOf(MOD));
        }
        
        return fac;
    }
    
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();

        BigInteger[] fac = modfac(N + 10);
        BigInteger[] inv = new BigInteger[N + 11];
        System.arraycopy(fac, 0, inv, 0, fac.length);
        
        BigInteger ans = BigInteger.ZERO;
        
        for (int two = 0; two <= N; two++) {
            for (int one = 0; one <= N; one++) {
                if (one + two > N) break;
                
                int dist = one + two * 2;
                BigInteger zero = modnCr(N, one + two, fac, inv);
                BigInteger now = BigInteger.ZERO;
                
                if (dist < X) {
                    now = modnCr(one + two, one, fac, inv).multiply(zero);
                } else if (dist == X) {
                    continue;
                } else if (dist < 2 * X) {
                    if ((dist - X) % 2 == 0) {
                        continue;
                    }
                    int dtwo = two - (dist - X + 1);
                    if (dtwo >= 0) {
                        now = modnCr(one + dtwo, one, fac, inv).multiply(zero);
                    }
                } else if (X % 2 == 1 && one == 0) {
                    now = zero;
                }
                
                ans = ans.add(now).mod(BigInteger.valueOf(MOD));
            }
        }
        
        System.out.println(ans);
        scanner.close();
    }
}
```

Keep in mind that while translating Python code to Java, some aspects such as generating a Scanner instance for input and handling exceptions are needed for robust code execution. BigInteger is required for the modular arithmetic due to potentially large numbers that can exceed the typical numerical limits of primitive types in Java.
