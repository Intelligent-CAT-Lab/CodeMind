Below is the equivalent Java code for the Python code provided. Java does not have built-in functions to read space-separated integers directly, so we use a `Scanner` to split the input and parse each integer. The modulo operation is also handled manually using the `BigInteger` class for large number arithmetic.

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();

        BigInteger mod = new BigInteger("1000000007");
        BigInteger bm = BigInteger.valueOf(m);
        BigInteger result = bm.modPow(BigInteger.valueOf(n), mod);

        System.out.println(result);
    }
}
```

This Java program performs the same functionality as the provided Python code:
- It reads two integers `m` and `n`.
- It calculates `m` to the power of `n` modulus `10^9+7` using `BigInteger.modPow()` for handling the modulus of large numbers.
- It prints the result to the standard output.
