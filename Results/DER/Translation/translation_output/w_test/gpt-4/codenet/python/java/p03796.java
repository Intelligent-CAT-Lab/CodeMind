Here's how the above Python code can be translated into Java:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class FactorialModulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        
        BigInteger modulo = new BigInteger("1000000007");
        BigInteger result = factorial.mod(modulo);
        System.out.println(result);
    }
}
```

This Java code creates a `FactorialModulo` class with a `main` method. It reads an integer `n` from the standard input, computes the factorial of `n`, and then takes the modulus with `1000000007` using the `BigInteger` class to handle potentially large numbers resulting from the factorial operation, just like the `math.factorial()` function in Python. The result is printed to the standard output.

To run the code with the test input of `3`, compile and execute the `FactorialModulo` class. The expected output will be `6`, just like in the Python code example.
