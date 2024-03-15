Certainly! Here is the equivalent Java code for the given Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        final int p = 998244353;
        
        long[] f = new long[k + 1];
        f[0] = 1;
        for (int i = 1; i <= k; i++) {
            f[i] = (i * f[i - 1]) % p;
        }
        
        long result = 0;
        for (int i = n - 1; i <= k; i++) {
            result = (result + (f[k - 1] * modularInverse(f[i], p) % p * modularInverse(f[k - 1 - i], p) % p)) % p;
        }
        
        System.out.println(result);
        scanner.close();
    }

    private static long modularInverse(long a, long m) {
        long m0 = m;
        long y = 0, x = 1;
        
        if (m == 1)
            return 0;
        
        while (a > 1) {
            long q = a / m;
            long t = m;
            m = a % m;
            a = t;
            t = y;
            y = x - q * y;
            x = t;
        }
        
        if (x < 0)
            x += m0;
        
        return x;
    }
}
```

Note that in Java, you need to manually compute the modular inverse since there's no built-in function for it like in Python with `pow(x, -1, p)`. Also, I added a `modularInverse` function to handle this calculation using the Extended Euclidean Algorithm. Furthermore, Java arrays are zero-based indexing, and their length is fixed after creation, so I adjusted the size of `f` and the for loops accordingly. Lastly, `~-i` in Python is equivalent to `i` in Java, since in Python this expression is used for incrementing by one with bitwise operators (`~` being bitwise NOT and `-` as a bitwise negation), which is not required in the Java translation.
