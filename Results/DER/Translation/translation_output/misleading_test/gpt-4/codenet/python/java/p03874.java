Below is the translated Java code for the given Python script:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class FestivalPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();

        int n = 512;
        BigInteger[] a = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            BigInteger val = factorial(7 + i).divide(factorial(i)).divide(factorial(7));
            a[n - 1 - i] = val;  // Reversing while storing
        }

        int cnt = 600 * 7;
        StringBuilder[] ans = new StringBuilder[n];
        for (int i = 0; i < n; i++) {
            ans[i] = new StringBuilder("FESTIVA");  // Use StringBuilder for efficiency
        }
        for (int i = 0; i < n; i++) {
            BigInteger item = a[i];
            BigInteger[] divmod = bigIntegerDivMod(BigInteger.valueOf(k), item);
            k = divmod[1].intValue();
            while (divmod[0].signum() == 1) {  // Equivalent to (k // item)
                ans[n - 1 - i].append("L");
                divmod[0] = divmod[0].subtract(BigInteger.ONE);
            }
        }
        for (StringBuilder part : ans) {
            System.out.print(part);
        }
    }

    private static BigInteger factorial(int number) {
        BigInteger result = BigInteger.ONE;
        for (int factor = 2; factor <= number; factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }
        return result;
    }

    private static BigInteger[] bigIntegerDivMod(BigInteger a, BigInteger b) {
        BigInteger[] result = new BigInteger[2];
        result[0] = a.divide(b);  // Division
        result[1] = a.mod(b);     // Modulus
        return result;
    }
}
```

To run a test with the input `7` you would need to execute this program and feed `7` as the input from standard input when prompted.

It's important to note that, in comparison to Python, which supports big integers naturally with its `int` type, Java requires use of the `BigInteger` class from the `java.math` package for calculations that exceed the range of primitive integer types (`int`, `long`). Additionally, Java does not have a built-in factorial function, so a method to calculate the factorial is included. The division and modulo operations are also adjusted to work with BigIntegers. 

Also, since Java does not allow operator overloading for its classes, we can't directly use operators like `//` for division and `%` for modulo. Instead, explicit method calls to `.divide()` and `.mod()` are necessary. The `bigIntegerDivMod` method is created to handle both division and modulo to emulate the `divmod` behavior available in Python.
