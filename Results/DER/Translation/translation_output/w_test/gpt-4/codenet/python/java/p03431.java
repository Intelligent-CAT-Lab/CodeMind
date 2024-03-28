Here's the equivalent Java code for the Python script provided. The Java code reads two integers from the console (standard input), calculates the factorial mod p for values up to k, and then sums up the particular series as described in your Python code.

```java
import java.math.BigInteger;
import java.util.Scanner;

public class FactorialSeriesCalculation {
    private static final int P = 998244353;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        BigInteger[] f = new BigInteger[k + 1];
        f[0] = BigInteger.ONE;
        for (int i = 1; i <= k; ++i) {
            // Computing factorial mod P
            f[i] = BigInteger.valueOf(i).multiply(f[i - 1]).mod(BigInteger.valueOf(P));
        }

        BigInteger sum = BigInteger.ZERO;
        for (int i = n - 1; i <= k; ++i) {
            // Computing the series using modular inverse and combination
            BigInteger term = f[k - 1].multiply(
                    f[i].modInverse(BigInteger.valueOf(P)).multiply(f[k - 1 - i].modInverse(BigInteger.valueOf(P)))
            ).mod(BigInteger.valueOf(P));

            sum = sum.add(term).mod(BigInteger.valueOf(P));
        }

        System.out.println(sum);
    }
}
```

Assuming the input is provided through standard input, for the given example test case:

```
2 4
```

The expected output would be:

```
7
```

Please ensure you have `import java.math.BigInteger;` and `import java.util.Scanner;` at the top of your code to import the necessary classes. Also, make sure to use the `Scanner` class in a try-with-resources statement or close it after usage to avoid any resource leaks.
