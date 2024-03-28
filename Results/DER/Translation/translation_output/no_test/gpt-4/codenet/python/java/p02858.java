Certainly! Below is the equivalent Java code for the given Python script. Note that in Java, the `gcd` function isn't available in the standard library before Java 9, so we define our own. Also, Java does not support operator overloading for mathematical operations, so everything is a method call.

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    private static final BigInteger MOD = BigInteger.valueOf(1000000007);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int T = scanner.nextInt();
        scanner.close();

        int gh = gcd(H, T);
        int gw = gcd(W, T);

        int h = H / gh;
        int w = W / gw;

        BigInteger res = BigInteger.valueOf(2).modPow(BigInteger.valueOf(h), MOD)
                .add(BigInteger.valueOf(2).modPow(BigInteger.valueOf(w), MOD))
                .add(BigInteger.valueOf(2).modPow(BigInteger.valueOf(gcd(h, w)), MOD))
                .subtract(BigInteger.valueOf(3))
                .modPow(BigInteger.valueOf(gh * gw), MOD)
                .mod(MOD);

        System.out.println(res);
    }

    // Helper method to compute the greatest common divisor (GCD)
    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
```

Please note that in Java, integer division behaves just like in Python with the `//` operator, i.e., it results in an integer value without the remainder. In the `gcd` helper method, the Euclidean algorithm has been implemented for calculating the greatest common divisor of two integers.

The `Scanner` class is used for reading input from standard input. The `BigInteger` class provides methods for modular arithmetic operations (like `modPow` and `mod`) which are not readily available for integers. This code also converts the integer values to `BigInteger` when necessary for performing modular exponentiation, addition, and subtraction.
