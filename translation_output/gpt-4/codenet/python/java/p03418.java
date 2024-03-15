Here is the translation of the given Python code into Java:

```java
import java.util.Scanner;

public class Main {
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

Please note the following changes:
1. The `Scanner` class is used for input in Java.
2. Java does not support tuple assignment like Python, so `N` and `K` are assigned separately.
3. Java uses `Math.max()` instead of Python's `max()` to find the maximum of two numbers.
4. The variable `count` is declared as a `long` to handle cases where counting integers could exceed the `int` range.
5. Division and modulo operations are similar between Java and Python when dealing with integers.
6. The `print` function is replaced by `System.out.println`.
7. Instead of `len(range(K + 1, N + 1))` to calculate the count decrement when `K == 0`, I've simply used `(N - K)` as the range from `K + 1` to `N` contains `N - K` elements.
8. Finally, it is good practice to close the `Scanner` after it's no longer needed.
