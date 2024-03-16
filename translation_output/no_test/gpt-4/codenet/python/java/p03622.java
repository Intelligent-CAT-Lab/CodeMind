Here's the equivalent Java code for the provided Python code:

```java
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int M = (int) Math.pow(8, 7);
        int m = M * 476 + 1;
        BigInteger[] f = new BigInteger[M + 1];
        BigInteger[] g = new BigInteger[M + 1];
        f[0] = BigInteger.ONE;
        g[0] = BigInteger.ONE;
        
        for (int i = 1; i < M; i++) {
            f[i] = f[i - 1].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(m));
        }
        
        g[M - 1] = f[M - 1].modInverse(BigInteger.valueOf(m));
        for (int i = M - 1; i > 0; i--) {
            g[i - 1] = g[i].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(m));
        }
        
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        if (A < B) {
            int temp = A;
            A = B;
            B = temp;
        }
        
        BigInteger i = BigInteger.ZERO;
        BigInteger k = BigInteger.ONE;
        for (int j = 1; j <= B; j++) {
            i = i.add(k.multiply(f[A + B - j]).multiply(g[B - j])).mod(BigInteger.valueOf(m));
            k = k.shiftLeft(1).mod(BigInteger.valueOf(m)); // k = k * 2 % m;
        }
        
        BigInteger result = i.multiply(f[B]).multiply(g[A + B]).add(BigInteger.valueOf(A)).mod(BigInteger.valueOf(m));
        System.out.println(result);
    }
}
```

Please ensure to import `java.util.Scanner` and `java.math.BigInteger` at the beginning of the Java program as these are needed for handling input and big number calculations. Remember to use `System.in` to read from standard input in Java and use `modInverse()` method from `BigInteger` to calculate the modular multiplicative inverses.
