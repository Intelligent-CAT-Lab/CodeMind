Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);
        BigInteger MOD = BigInteger.valueOf(10).pow(9).add(BigInteger.valueOf(7));

        BigInteger p = BigInteger.ONE;
        BigInteger q = BigInteger.ONE;
        for (int i = 0; i < N; i++) {
            p = p.multiply(BigInteger.valueOf(N + K - 1 - i)).mod(MOD);
            q = q.multiply(BigInteger.valueOf(i + 1)).mod(MOD);
        }

        System.out.println(p.multiply(q.modInverse(MOD)).mod(MOD));
    }
}
```

This Java code does the same thing as your Python code. It reads two integers N and K from the standard input, calculates the factorial of N and K, and then calculates the result of the given expression. The `BigInteger` class is used to handle large numbers. The `modInverse` method is used to calculate the modular multiplicative inverse of `q` with respect to `MOD`.
