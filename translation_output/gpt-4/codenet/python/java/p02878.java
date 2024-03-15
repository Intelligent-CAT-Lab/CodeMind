Here's the translated Java code equivalent of the Python code you provided:

```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int M = 998244353;
        int P = N + 1;
        BigInteger f = BigInteger.ONE;
        BigInteger[] F = new BigInteger[P];
        BigInteger[] I = new BigInteger[P];
        F[0] = BigInteger.ONE;
        I[0] = BigInteger.ONE;
        long z = 0;

        for (int n = 1; n < P; n++) {
            f = f.multiply(BigInteger.valueOf(n)).mod(BigInteger.valueOf(M));
            F[n] = f;
        }

        I[N] = f.modInverse(BigInteger.valueOf(M));
        BigInteger i = I[N];

        for (int n = N; n > 1; n--) {
            i = i.multiply(BigInteger.valueOf(n)).mod(BigInteger.valueOf(M));
            I[n - 1] = i;
        }

        for (int k = 0; k <= (N - B - A > 0 ? Math.min(A + 1, N - B) : A); k++) {
            int Q = N - B - k - 1;
            BigInteger comb1 = F[B + k - 1].multiply(I[B]).multiply(I[k]).mod(BigInteger.valueOf(M));
            BigInteger comb2 = F[Q + A - k].multiply(I[Q]).multiply(I[A - k]).mod(BigInteger.valueOf(M));
            z += (long)((B - k) * comb1.multiply(comb2).intValue()) % M;
        }

        System.out.println(B == 0 ? 1 : z % M);
        scanner.close();
    }
}
```

Some important things to note:

1. In Java, we don't have the luxury of multiple assignment as in Python, so we have to declare and initialize our variables separately.
2. Java doesn't handle integers larger than `2^31-1` very well, so we have to use `BigInteger` for the factorial computations and modular operations which may return results larger than `int` can handle.
3. Java's `for` loops are different from Python's. The typical Python range function has to be replaced with a standard `for` loop.
4. The modulus operator in Java is `%`, similar to Python.
5. In Java, we need to explicitly import classes like `Scanner` and `BigInteger` from the `java.util` and `java.math` packages, respectively.
6. Unlike Python, where indentation is used to show blocks of code, Java uses curly braces `{}`.
7. Java requires a class definition and a `main` method as an entry point for the program. In this case, the class is named `Main`.
8. Java uses `System.out.println` to output to the console, as opposed to `print` in Python.

Finally, in this translation, it's assumed that inputs (N, A, B) fit within `int` datatype limits, and intermediate values in the loop calculations do not exceed the range of `long`. If this is not the case, further use of `BigInteger` may be necessary.
