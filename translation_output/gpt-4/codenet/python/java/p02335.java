Below is the translated Python code into Java. Please note that Java does not have a built-in factorial function, so we need to implement it ourselves. Additionally, the logic for modular division is a bit more complex, as we need to use a multiplicative inverse under the modulus.

```java
import java.math.BigInteger;
import java.util.Scanner;

public class BallAndBox5 {

    private static final int MOD = (int)(Math.pow(10,9) + 7);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println(n < k ? C(k, n).mod(BigInteger.valueOf(MOD))
                                 : (n > k ? 0 : 1));
        scanner.close();
    }

    private static BigInteger P(int n, int r) {
        return factorial(n).divide(factorial(n - r));
    }

    private static BigInteger C(int n, int r) {
        return P(n, r).divide(factorial(r));
    }

    private static BigInteger H(int n, int r) {
        return C(n + r - 1, r);
    }

    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
```

Please note that this code likely isn't the most efficient way to perform these calculations under modulo arithmetic, but it replicates the Python code's functionality. In particular, the factorial method generates very large numbers quickly, which can cause performance problems. In a production environment, you'd want to optimize the code to work with modular arithmetic more directly, and possibly use iterative methods to calculate factorials modulo `MOD`, avoiding `BigInteger`.
