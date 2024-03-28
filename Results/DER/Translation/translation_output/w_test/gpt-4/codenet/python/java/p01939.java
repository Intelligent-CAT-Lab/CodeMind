Here's the translated code from Python to Java:

```java
import java.util.Scanner;

public class SumSequence {
    private static final int MOD = 1000000007;

    private static long sum(int a, int d, int n) {
        return (long) n * (2 * a + (long) (n - 1) * d) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        long s = 0;
        if (n == 1) {
            s = m + 1;
        } else {
            s = sum(m + 1, -n + 1, 1 + m / (n - 1));
            s *= 2;
            s -= (m + 1);
        }

        System.out.println(s % MOD);
    }
}
```

This Java program reads two integers from standard input and calculates the sum according to the logic provided in the Python code. The division and modulo operations also account for the long type required for large numbers. Do not forget to run the code in an environment with the necessary IO conditions or to provide the input manually.
