Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int count = 0;

        for (int i = K + 1; i <= N; i++) {
            count += ((N + 1) / i) * (i - K) + Math.max(0, (N + 1) % i - K);
        }

        if (K == 0) {
            count -= (N - K);
        }

        System.out.println(count);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, calculates the count, and prints the result. The only difference is that Java uses `/` for integer division and `%` for modulo operation, and it uses `Math.max` to get the maximum value between two numbers.
