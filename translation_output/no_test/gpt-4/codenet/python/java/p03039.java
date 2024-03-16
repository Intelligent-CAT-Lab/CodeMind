Here is the equivalent Java code for the given Python code:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {

    private static final int INF = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        long ans = 0;
        
        if (n <= m) {
            long M = -((m - 1) * m * (2 * m - 1) / 3) + m * m * (m - 1);
            long Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
            M = M % INF;
            Ms = Ms % INF;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    if (i == j) {
                        ans += Ms;
                    } else {
                        long d = j - i;
                        ans += d * m * m + M;
                    }
                    ans %= INF;
                }
            }
        } else {
            int temp = n;
            n = m;
            m = temp;
            long M = -((m - 1) * m * (2 * m - 1) / 3) + m * m * (m - 1);
            long Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
            M = M % INF;
            Ms = Ms % INF;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    if (i == j) {
                        ans += Ms;
                    } else {
                        long d = j - i;
                        ans += d * m * m + M;
                    }
                    ans %= INF;
                }
            }
        }

        // using BigInteger for factorial calculations as they can be very large
        BigInteger factorial_n_m = factorial(n * m - 2);
        BigInteger factorial_n_m_k = factorial(n * m - k);
        BigInteger factorial_k = factorial(k - 2);
        BigInteger comb = factorial_n_m.divide(factorial_n_m_k.multiply(factorial_k));
        
        ans = (comb.multiply(BigInteger.valueOf(ans)).mod(BigInteger.valueOf(INF))).longValue();

        System.out.println(ans);
    }

    // Helper method to calculate factorial using BigInteger
    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
```

Some important points to note:
- Java doesn't support tuples, so the swapping of `n` and `m` has been done using a temporary variable.
- The division operation in Python automatically does integer division when dealing with integers, so in Java, we are also using the integer division `/`.
- Java doesn't have a built-in factorial function, and since the numbers can become very large, `BigInteger` is used for the factorial calculation.
- The modulus operation is applied as before, but we need to use `BigInteger` methods when dealing with `BigInteger` instances.
- The input and output mechanism is handled by using a `Scanner` for input and `System.out.println` for output.
