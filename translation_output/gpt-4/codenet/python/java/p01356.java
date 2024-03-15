Below is the equivalent Java code for the given Python script. Java handles input and output differently from Python, so I've made adjustments to use a `Scanner` for input and `System.out` for printing the result.

```java
import java.util.Scanner;

public class Solver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        System.out.println(solve(n, m, a, b, p, q));
    }

    public static long solve(int n, int m, int a, int b, int p, int q) {
        if (a == 1 && b == 1) {
            if ((long)(p + q) * n <= m) {
                return m - (long)(p + q) * n;
            } else {
                long k = m / (p + q);
                return Math.min(m - k * (p + q), (k + 1) * (p + q) - m);
            }
        } else {
            long ans = m;
            for (int i = Math.min(n - 1, 40); i >= 0; i--) {
                long f = p * fastPow(a, i) + q * fastPow(b, i);
                if (m < f) {
                    ans = Math.min(ans, f - m);
                } else {
                    m -= f;
                }
                ans = Math.min(ans, m);
            }
            return ans;
        }
    }

    private static long fastPow(long base, int exponent) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result *= base;
            }
            base *= base;
            exponent /= 2;
        }
        return result;
    }
}
```

Several changes have been made:

1. The `solve` function signature is updated to accept six integer parameters.
2. Since Java doesn't have a built-in power operator for `long` types like Python's `**`, I have created a `fastPow` method that efficiently calculates the power of a number.
3. In Python, `**` automatically handles large numbers, but in Java, care should be taken with overflow; for this conversion, I've assumed that the overflow is not a concern or it will be handled by consuming code or by using a bigger type like `BigInteger`.
4. Java uses `long` to handle larger integers that can result from the arithmetic operations.
5. The `input().split()` and `map(int, ...)` equivalent in Java is using a `Scanner` to read integers using `nextInt()`.
6. I have changed `print` to `System.out.println` to display the result.

Please note that this is a simple translation, and in a real-world scenario, it might be better to break the `solve` method into smaller, more reusable components, add error handling, and consider edge cases which could lead to integer overflow.
