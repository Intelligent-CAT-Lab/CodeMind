Here's the translated Java code: 

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int ans;

        if (2 * N <= M) {
            ans = N + (M - 2 * N) / 4;
        } else {
            ans = M / 2;
        }

        System.out.println(ans);
    }
}
```

This Java code will perform the same logic as the provided Python code. It reads two integers `N` and `M` from the standard input, then calculates and prints the result based on the provided conditions. Note that in Java, we use the `Scanner` class to read input from the standard input (typically the console). Also, in Java, integer division implicitly discards any fractional parts, so there is no need for an explicit floor operation as in Python with `//`.
