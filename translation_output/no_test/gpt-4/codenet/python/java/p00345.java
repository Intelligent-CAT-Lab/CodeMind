Below is the Java equivalent of your provided Python code:

```java
import java.math.BigInteger;
import java.util.Scanner;

public class FractionSimplifier {
    public static BigInteger gcd(BigInteger x, BigInteger y) {
        return (y.equals(BigInteger.ZERO)) ? x : gcd(y, x.mod(y));
    }

    public static void printV(BigInteger x, BigInteger y) {
        BigInteger g = gcd(x, y);
        System.out.println(x.divide(g) + "/" + y.divide(g));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        String all = "";
        String sub = "";
        int p = -1;
        int o = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '.') {
                o = i;
            } else if (S.charAt(i) == '(') {
                p = i;
                sub = all;
            } else if (S.charAt(i) != ')') {
                all += S.charAt(i);
            }
        }

        int d = S.length() - o - 1;
        int l = (p != -1) ? p - o - 1 : 0;

        if (p == -1) {
            printV(new BigInteger(all), BigInteger.TEN.pow(d));
        } else {
            d -= 2; // for ()
            printV(new BigInteger(all).subtract(new BigInteger(sub)),
                    BigInteger.TEN.pow(d).subtract(BigInteger.TEN.pow(l)));
        }

        scanner.close();
    }
}
```

In this translation, the `gcd` and `printV` function are replaced by static methods that perform the same operation using `BigInteger` for handling arbitrary-precision integers. The Python logical expressions and string manipulations are converted into equivalent Java syntax.

Make sure to import `BigInteger` and `Scanner` to handle large numbers and user input, respectively. The main logic within the `main` method follows the same steps as the Python code, manipulating strings and performing calculations to output the reduced fraction.
