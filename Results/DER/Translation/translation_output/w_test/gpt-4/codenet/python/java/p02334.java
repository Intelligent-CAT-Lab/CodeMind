Here is the translated Java code that performs the same operations as the given Python code:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class CombinationModulo {

    private static final long MOD = 1000000007L;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        BigInteger p = BigInteger.ONE;
        BigInteger q = BigInteger.ONE;

        for (int i = 0; i < N; i++) {
            p = p.multiply(BigInteger.valueOf(N + K - 1 - i)).mod(BigInteger.valueOf(MOD));
            q = q.multiply(BigInteger.valueOf(i + 1)).mod(BigInteger.valueOf(MOD));
        }

        BigInteger qInverse = q.modInverse(BigInteger.valueOf(MOD));
        BigInteger result = p.multiply(qInverse).mod(BigInteger.valueOf(MOD));
        System.out.println(result.longValue());
    }
}
```

In this Java version:
- We use `Scanner` for input.
- Likewise, we use `BigInteger` for arithmetic to handle large numbers and modular operations.
- The `modInverse` method of `BigInteger` is used to compute the modular inverse instead of Python's `pow` function.

You can use this code to process the given test case. If the input is provided as `5 3`, the expected output would be `21` as per the Python code.
