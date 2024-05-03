Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    static final int MOD = (int) Math.pow(10, 9) + 7;

    static int sum(int a, int d, int n) {
        return n * (2 * a + (n - 1) * d) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int s = 0;
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

This Java code does the same thing as your Python code. It reads two integers from the user, calculates the sum, and prints the result modulo `MOD`.
