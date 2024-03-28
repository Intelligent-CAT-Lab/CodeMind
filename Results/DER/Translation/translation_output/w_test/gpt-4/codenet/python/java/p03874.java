Below is the Java translation of the given Python code. The Java code reads an integer from standard input and produces the expected output as specified:

```java
import java.math.BigInteger;
import java.util.Scanner;

public class FestivalPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();

        int n = 512;
        BigInteger[] a = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            a[i] = factorial(7 + i).divide(factorial(i)).divide(factorial(7));
        }

        int cnt = 600 * 7; 
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = "FESTIVA";
        }

        for (int i = 0; i < n; i++) {
            BigInteger item = a[n - 1 - i];
            StringBuilder sb = new StringBuilder(ans[i]);
            sb.append("L".repeat(k / item.intValueExact()));
            ans[i] = sb.toString();
            k %= item.intValueExact();
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(ans[i]);
        }
        System.out.println();

        scanner.close();
    }

    private static BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
```

In this Java code, I used `BigInteger` for the factorial calculation because factorials of integers larger than 20 exceed the range of `long` in Java. Unlike Python, which can handle arbitrarily large integers automatically, Java requires this class to handle very large numbers.

The `repeat` method is used to generate repeated strings of "L". Note that `repeat` is only available in Java 11 or higher. If you are using a version lower than Java 11, a loop or alternative method to repeat strings should be used. 

Additionally, this code, like the Python code, assumes that the input number is within a range that prevents integer overflow during the `k / item.intValueExact()` calculation. It uses `intValueExact()` to safely cast from `BigInteger` to `int` only when it is safe to do so.

Make sure to import the necessary Java classes when compiling and running the code.
