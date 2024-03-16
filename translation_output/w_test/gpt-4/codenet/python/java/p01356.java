Here is the provided Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static int solve(int n, int m, int a, int b, int p, int q) {
        if (a == 1 && b == 1) {
            if ((p + q) * n <= m) {
                return m - (p + q) * n;
            } else {
                int k = m / (p + q);
                return Math.min(m - k * (p + q), (k + 1) * (p + q) - m);
            }
        } else {
            int ans = m;
            for (int i = Math.min(n - 1, 40); i >= 0; i--) {
                long f = p * pow(a, i) + q * pow(b, i);
                if (m < f) {
                    ans = Math.min(ans, (int) (f - m));
                } else {
                    m -= f;
                }
                ans = Math.min(ans, m);
            }
            return ans;
        }
    }

    // Helper method to calculate the power using long to avoid integer overflow
    private static long pow(int base, int exponent) {
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        System.out.println(solve(n, m, a, b, p, q));
        scanner.close();
    }
}
```

In the Java version, I've encapsulated the calculation in the `solve` method, which takes the necessary parameters as arguments. The `main` method is responsible for taking input and printing the result. I also added a helper method `pow` to calculate the exponentiation, and used `long` to store the power result to handle potential integer overflows.
