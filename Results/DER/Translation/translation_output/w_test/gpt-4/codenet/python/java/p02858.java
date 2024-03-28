Here is the translated code in Java, which includes the calculation of the greatest common divisor (GCD), and computes the desired output in the same manner as the provided Python code:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long H = scanner.nextLong();
        long W = scanner.nextLong();
        long T = scanner.nextLong();
        
        long gh = gcd(H, T);
        long gw = gcd(W, T);
        long h = H / gh;
        long w = W / gw;

        final BigInteger MOD = BigInteger.valueOf(1000000007);
        
        // Using BigInteger for modPow and subtract methods
        BigInteger result = BigInteger.valueOf(2).modPow(BigInteger.valueOf(h), MOD)
                                .add(BigInteger.valueOf(2).modPow(BigInteger.valueOf(w), MOD))
                                .add(BigInteger.valueOf(2).modPow(BigInteger.valueOf(gcd(h, w)), MOD))
                                .subtract(BigInteger.valueOf(3))
                                .modPow(BigInteger.valueOf(gh * gw), MOD);
        
        System.out.println(result.mod(MOD).toString());
        scanner.close();
    }
    
    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
```

This Java program includes the `gcd` method to calculate the greatest common divisor, and uses `Scanner` for input. Note that in Java, the `BigInteger` class is used for large integer calculations that can exceed the bounds of primitive types like `long`. This class provides methods like `modPow` and `subtract` to perform modular exponentiation and subtraction with a modulus, mirroring the operations done in Python's `pow` function.
