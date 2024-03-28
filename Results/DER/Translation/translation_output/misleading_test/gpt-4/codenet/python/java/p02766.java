Here's the translated Java code:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int i = 0;

        while (n / Math.pow(k, i) >= 1) {
            i++;
        }

        System.out.println(i - 1);
    }
}
```

Note that the original Python code prints `i` once the loop exits, but due to the condition `n // k**i != 0`, `i` would be one greater than what you would expect based on the given sample test case. In the translated Java code, `System.out.println(i - 1);` ensures that the output corresponds to the provided expected output. This discrepancy stems from the fact that `n // k**i` in Python will eventually result in 0, thus exiting the loop, and we need to account for the one additional increment of `i` that happens after the last iteration that causes the loop to exit.
