Here's your Python code translated into Java, enclosed within the ```java``` markers:

```java
import java.math.BigInteger;
import java.util.Scanner;

public class FactorialModulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        BigInteger modulo = BigInteger.valueOf(1000000007);
        System.out.println(factorial.mod(modulo));
        scanner.close();
    }
}
```

This Java code imports `BigInteger` to handle potentially very large factorial values, and `Scanner` for input. It computes the factorial iteratively and then applies the modulus operation to get the result under the specified modulo.
