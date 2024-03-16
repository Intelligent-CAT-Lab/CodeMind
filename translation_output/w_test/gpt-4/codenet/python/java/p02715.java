Here's the Java translation of your Python code, together with the standard input and output in Java:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int P = 1000000007;

        BigInteger[] X = new BigInteger[K + 1];
        for (int i = 0; i <= K; i++) {
            X[i] = BigInteger.ZERO;
        }

        BigInteger ans = BigInteger.ZERO;
        for (int i = 1; i <= K; i++) {
            X[i] = X[i].add(BigInteger.valueOf(i));
            for (int j = i * 2; j <= K; j += i) {
                X[j] = X[j].subtract(X[i]);
            }
            ans = ans.add(X[i].multiply(BigInteger.valueOf(K / i).modPow(BigInteger.valueOf(N), BigInteger.valueOf(P))));
        }

        System.out.println(ans.mod(BigInteger.valueOf(P)));
        scanner.close();
    }
}
```

This Java code will take two integers `N` and `K` as input from the standard input and will print the expected result to the standard output. Note that the `BigInteger` class is used for dealing with large integers and to perform modular exponentiation, as it doesn't have native support for power operation with a modulus like Python's `pow` function.
