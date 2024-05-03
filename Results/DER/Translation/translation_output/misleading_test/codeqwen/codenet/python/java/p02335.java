Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        BigInteger MOD = BigInteger.valueOf(1000000007);
        BigInteger result = C(k, n).mod(MOD);
        System.out.println(result);
    }

    public static BigInteger P(int n, int r) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= r; i++) {
            result = result.multiply(BigInteger.valueOf(n - r + i));
        }
        return result;
    }

    public static BigInteger C(int n, int r) {
        return P(n, r).divide(P(r, r));
    }

    public static BigInteger H(int n, int r) {
        return C(n + r - 1, r);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the standard input, calculates the result using the `C` function, and prints the result. The `C` function uses the `P` function to calculate the factorial of `n` and `r`, and then divides them to get the combination. The `P` function calculates the product of `n` and `r` from 1 to `r`. The `H` function is not used in this code, but it can be used to calculate the hypergeometric distribution.
