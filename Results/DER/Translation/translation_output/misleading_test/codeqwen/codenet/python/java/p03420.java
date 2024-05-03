Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int s = 0;
        for (int b = K + 1; b <= N; b++) {
            int an = 0;
            int j = N / b;
            an = j * (b - K);
            if (N % b > 0) {
                int x1 = j * b + K;
                if (K == 0) {
                    x1 += 1;
                }
                int x2 = Math.min(N, (j + 1) * b - 1);
                if (x2 >= x1) {
                    an += (x2 - x1 + 1);
                }
            }
            s += an;
        }
        System.out.println(s);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the sum of the values of the function `an` for all integers `b` from `K+1` to `N`, and prints the result. The function `an` is defined as the product of `j` and `(b - K)`, plus the difference between `x2` and `x1` if `x2` is greater than or equal to `x1`. The values of `j`, `x1`, and `x2` are calculated using integer division and the `Math.min` function.
