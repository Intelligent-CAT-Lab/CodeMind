Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int modulo = (int) Math.pow(10, 9) + 7;
        long ans = 0;
        if (k <= n) {
            for (int i = 0; i <= k; i++) {
                if (i % 2 == 0) {
                    ans += Math.pow(k - i, n) * combination(k, i);
                } else {
                    ans -= Math.pow(k - i, n) * combination(k, i);
                }
                ans = ans % modulo;
            }
        }
        System.out.println(ans);
    }

    public static long combination(int i, int j) {
        long result = 1;
        for (int k = 1; k <= j; k++) {
            result *= (i - j + k);
            result /= k;
        }
        return result;
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the standard input, calculates the combinations, and prints the result. The `combination` method is a helper method that calculates the combinations using the formula `n! / (n-k)! / k!`. The `Math.pow` method is used to calculate the power of a number. The `%` operator is used to calculate the modulo of a number. The `long` data type is used to store the result of the combination calculation, as it can be very large.
