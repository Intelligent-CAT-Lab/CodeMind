Here is the equivalent Java code:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    static final long mod = 998244353;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int k = in.nextInt();
        int a = in.nextInt();
        
        long[] lst = new long[k + 1];
        lst[k - 1] = 1;

        long A = BigInteger.valueOf(a)
                .multiply(BigInteger.valueOf(100L * n).modInverse(BigInteger.valueOf(mod)))
                .mod(BigInteger.valueOf(mod))
                .longValue();

        long inv = BigInteger.valueOf(n).modInverse(BigInteger.valueOf(mod)).longValue();

        for (int i = k - 2; i >= 0; i--) {
            if (k > i + n) {
                lst[i] = A * (lst[i + 1] - lst[i + n + 1]) + lst[i + 1];
                lst[i] %= mod;
            } else {
                lst[i] = A * (lst[i + 1] - lst[k]) + (n - (k - i) + 1) * inv + lst[i + 1];
                lst[i] %= mod;
            }
        }
        
        System.out.println((lst[0] - lst[1] + mod) % mod);
        
        in.close();
    }
}
``` 

To compile and run this Java program, make sure to encapsulate it in a file with the same name as the class, `Main.java`, and use `javac Main.java` to compile it, then use `java Main` to run it. Provide the inputs directly, or through a file redirection or piping mechanism, as Java does not have an equivalent `sys.stdin` and `sys.stdout` to Python.

Note: The equivalent for the Python's `pow(x, y, mod)` in Java is `BigInteger.valueOf(x).modPow(BigInteger.valueOf(y), BigInteger.valueOf(mod)).longValue()`, which performs modular exponentiation.
