Below is the Java translation of the provided Python code. Please note that Java takes input and outputs data in different ways compared to Python. The Java equivalent uses a `Scanner` object for input and `System.out.println()` for output.

```java
import java.util.Scanner;

public class SummationProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        long count = 0;

        for (int i = K + 1; i <= N; i++) {
            count += ((N + 1) / i) * (i - K) + Math.max(0, (N + 1) % i - K);
        }

        if (K == 0) {
            count -= (N - K);
        }

        System.out.println(count);
        scanner.close();
    }
}
```

To compile and run this Java code, you would use a Java compiler such as `javac`. After compiling, you would run it using `java SummationProblem`, input `5 2`, and the program should output `7`, which is the expected output for this test case.
