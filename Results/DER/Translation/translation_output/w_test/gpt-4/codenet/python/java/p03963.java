Here is the equivalent Java code for the provided Python code with the inclusion of necessary imports, and a main method that reads from standard input:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        BigInteger kBigInt = BigInteger.valueOf(k);
        BigInteger result = kBigInt.multiply(kBigInt.subtract(BigInteger.ONE).pow(n - 1));
        System.out.println(result);
    }
}
```

The above Java code uses the `BigInteger` class to handle the calculations to ensure it can deal with large integer values correctly, just like Python's arbitrary-precision integer arithmetic. You can compile and run this code to compute the expression provided in the Python code for the given `n` and `k` values.
